package tests.browseMoviesTesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.primaryUseCases.browseMovies.BrowseMovies;
import src.dataStore;
import src.dataStore.Movie;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;

/**
 * Test suite for Browse Movies functionality
 */
public class testBrowsing {

    private BrowseMovies browseMovies;
    private dataStore sampleDataStore;

    @Before
    public void setUp() {
        sampleDataStore = new dataStore();
        browseMovies = new BrowseMovies(sampleDataStore);
    }

    // Search by title
    @Test
    public void test_SearchExistingMovieByTitle() {
        List<Movie> results = browseMovies.searchMoviesByTitle("Inception");
        Assert.assertTrue("Movie 'Inception' should be found",
                results.stream().anyMatch(m -> m.getTitle().equals("Inception")));
    }

    @Test
    public void test_SearchNonexistentMovieByTitle() {
        List<Movie> results = browseMovies.searchMoviesByTitle("Nonexistent Movie");
        Assert.assertTrue("Search should return empty list for nonexistent movie", results.isEmpty());
    }

    @Test
    public void test_SearchMoviesByMultiWordPartialTitle() {
        List<Movie> results = browseMovies.searchMoviesByTitle("the dark");
        Assert.assertTrue("Should find 'The Dark Knight' with multi-word partial match",
                results.stream().anyMatch(m -> m.getTitle().equals("The Dark Knight")));
    }

    @Test
    public void test_SearchMoviesByTitleCaseInsensitive() {
        List<Movie> results = browseMovies.searchMoviesByTitle("THE GODFATHER");
        Assert.assertTrue("Case insensitive search should find movies",
                results.stream().anyMatch(m -> m.getTitle().equals("The Godfather")));
    }

    @Test
    public void test_searchTitleWithManyResults() {
        List<Movie> results = browseMovies.searchMoviesByTitle("The");
        Assert.assertEquals("Should find all movies with 'The' in title",
                results.size(), 3); // There are 3 movies with 'The' in sample data
    }

    @Test
    public void test_SearchMoviesByEmptyTitle() {
        List<Movie> results = browseMovies.searchMoviesByTitle("");
        Assert.assertTrue("Empty string should return empty list", results.isEmpty());
    }

    @Test
    public void test_SearchMoviesByWhitespaceTitle() {
        List<Movie> results = browseMovies.searchMoviesByTitle("   ");
        Assert.assertTrue("Whitespace should not match any movies", results.isEmpty());
    }

    @Test
    public void test_SearchMoviesByTitleWithBothSpaces() {
        List<Movie> results = browseMovies.searchMoviesByTitle("   Inception   ");
        Assert.assertTrue("Should find movie even with leading spaces",
                results.stream().anyMatch(m -> m.getTitle().equals("Inception")));
    }

    @Test
    public void test_SearchMoviesByTitleWithInternalSpaces() {
        List<Movie> results = browseMovies.searchMoviesByTitle("  The  Dark   KniGHt   ");
        Assert.assertTrue("Should handle extra internal spaces (within the title)",
                results.stream().anyMatch(m -> m.getTitle().equals("The Dark Knight")));
    }

    @Test
    public void test_SearchMoviesByTitleWithExtraSpacesBetweenLetters() {
        List<Movie> results = browseMovies.searchMoviesByTitle("In    ception"); // will be "In ception" (not a valid title in sample data)                                                             
        Assert.assertTrue(results.isEmpty());
    }

    @Test
    public void test_SearchMoviesBySpecialCharacterTitle() {
        List<Movie> results = browseMovies.searchMoviesByTitle("Amélie");
        Assert.assertTrue("Should find movie with special characters",
                results.stream().anyMatch(m -> m.getTitle().equals("Amélie")));
    }

    // Search by language
    @Test
    public void test_SearchMoviesByExistingLanguage() {
        List<Movie> results = browseMovies.searchMoviesByLanguage("English");
        Assert.assertTrue("At least one English movie should be found",
                !results.isEmpty() && results.stream().allMatch(m -> m.getLanguage().equals("English")));
    }

    @Test
    public void test_SearchMoviesByNonexistentLanguage() {
        List<Movie> results = browseMovies.searchMoviesByLanguage("NonexistentLanguage");
        Assert.assertTrue("Search should return empty list for nonexistent language", results.isEmpty());
    }

    @Test
    public void test_SearchMoviesByLanguageCaseInsensitive() {
        List<Movie> results = browseMovies.searchMoviesByLanguage("engLIsh");
        Assert.assertTrue("Case insensitive search should find English movies",
                !results.isEmpty() &&
                        results.stream().allMatch(m -> m.getLanguage().equals("English")));
    }

    @Test
    public void test_SearchMoviesByArabicLanguage() {
        List<Movie> results = browseMovies.searchMoviesByLanguage("  Arabic ");
        Assert.assertTrue("Should find Arabic movie if exists",
                !results.isEmpty() &&
                        results.stream().allMatch(m -> m.getLanguage().equals("Arabic")));
    }

    @Test
    public void test_SearchMoviesByLanguageWithNumbers() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            browseMovies.searchMoviesByLanguage("1Arabic23");
        });
    }

    @Test
    public void test_SearchMoviesByLanguageWithSpecialCharacters() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            browseMovies.searchMoviesByLanguage("English!");
        });
    }

    // Search by rating
    @Test
    public void test_SearchMoviesByValidRatingRange() {
        List<Movie> results = browseMovies.searchMoviesByRating(8.5, 9.0);
        Assert.assertTrue("Movies should be found within rating range 8.5 - 9.0",
                !results.isEmpty()
                        && results.stream().allMatch(m -> m.getImdbRating() >= 8.5 && m.getImdbRating() <= 9.0));
    }

    @Test
    public void test_SearchMoviesByRatingNoMatches() {
        List<Movie> results = browseMovies.searchMoviesByRating(0.1, 0.2); // valid range but no matches
        Assert.assertTrue("Valid range with no movies should return empty list", results.isEmpty());
    }

    @Test
    public void test_SearchMoviesByInvalidMinRatingRange() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            browseMovies.searchMoviesByRating(-1.0, 10);
        });
    }

    @Test
    public void test_SearchMoviesByInvalidMaxRatingRange() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            browseMovies.searchMoviesByRating(0, 11.0);
        });
    }

    @Test
    public void test_SearchMoviesByInvertedRatingRange() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            browseMovies.searchMoviesByRating(9.0, 8.0);
        });
    }

    // Edge Cases (Rating 0 and 10)
    // min = max => exact match
    @Test
    public void test_SearchMoviesByEqualsMinMax0() {
        List<Movie> results = browseMovies.searchMoviesByRating(0, 0);
        Assert.assertTrue("Should find movies with exact rating 0",
                results.stream().anyMatch(m -> m.getImdbRating() == 0));
    }

    @Test
    public void test_SearchMoviesByEqualsMinMax10() {
        List<Movie> results = browseMovies.searchMoviesByRating(10, 10);
        Assert.assertTrue("Should find movies with exact rating 10",
                results.stream().anyMatch(m -> m.getImdbRating() == 10));
    }

    @Test
    public void test_SearchMoviesByMaximumRating() {
        List<Movie> results = browseMovies.searchMoviesByRating(0.0, 10.0);
        Assert.assertTrue("Should give all available movies",
                !results.isEmpty() &&
                        results.size() == browseMovies.getMovies().size());
    }

    @Test
    public void test_SearchMoviesByEmptyMinRating() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            browseMovies.searchMoviesByRating(Double.NaN, 5.0);
        });
    }

    @Test
    public void test_SearchMoviesByEmptyMaxRating() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            browseMovies.searchMoviesByRating(5.0, Double.NaN);
        });
    }

    // Presentation Layer Tests
    @Test
    public void testPL_InvalidMenuChoiceOutOfRange() {

        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            // Mock user input
            String input = "99\n5\n";
            System.setIn(new ByteArrayInputStream(input.getBytes()));

            // Capture output
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            // Run program
            browseMovies.start();

            String output = outContent.toString();

            Assert.assertTrue(
                    "Should display invalid input message",
                    output.contains("Invalid input. Please enter a valid number."));

        } finally {
            // restore
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testPL_InvalidMenuChoiceZero() {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            // Mock user input
            String input = "0\n5\n"; // Invalid choice 0, then exit with 5
            System.setIn(new ByteArrayInputStream(input.getBytes()));

            // Capture output
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            // Run program
            browseMovies.start();

            String output = outContent.toString();

            Assert.assertTrue(
                    "Should display invalid input message",
                    output.contains("Invalid input. Please enter a valid number."));

        } finally {
            // restore
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testPL_InvalidMenuChoiceNegative() {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            // Mock user input
            String input = "-1\n5\n"; // Invalid choice -1, then exit with 5
            System.setIn(new ByteArrayInputStream(input.getBytes()));

            // Capture output
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            // Run program
            browseMovies.start();

            String output = outContent.toString();

            Assert.assertTrue(
                    "Should display invalid input message",
                    output.contains("Invalid input. Please enter a valid number."));

        } finally {
            // restore
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

}
