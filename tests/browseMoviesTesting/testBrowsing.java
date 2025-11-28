package tests.browseMoviesTesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.primaryUseCases.browseMovies.BrowseMovies;
import src.dataStore;
import src.dataStore.Movie;

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

    @Test
    public void test_RetrieveAllMovies() {
        List<Movie> movies = browseMovies.getMovies();
        Assert.assertEquals("Expected 10 movies in the sample dataset", 10, movies.size());
    }

    @Test
    public void test_BrowseMovies() {
        int displayedMoviesSize = browseMovies.browseMovies();
        Assert.assertEquals("Displayed movies count should match stored movies", 
                            displayedMoviesSize, browseMovies.getMovies().size());
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
    public void test_SearchMoviesByPartialTitle() {
        List<Movie> results = browseMovies.searchMoviesByTitle("dark");
        Assert.assertTrue("Should find 'The Dark Knight' with partial match",
                          results.stream().anyMatch(m -> m.getTitle().contains("Dark")));
    }

    @Test
    public void test_SearchMoviesByMultiWordPartialTitle() {
        List<Movie> results = browseMovies.searchMoviesByTitle("The Dark");
        Assert.assertTrue("Should find 'The Dark Knight' with multi-word partial match",
                          results.stream().anyMatch(m -> m.getTitle().contains("The Dark")));
    }

    @Test
    public void test_SearchMoviesByTitleCaseInsensitive() {
        List<Movie> results = browseMovies.searchMoviesByTitle("THE GODFATHER");
        Assert.assertTrue("Case insensitive search should find movies", 
                            results.stream().anyMatch(m -> m.getTitle().equals("The Godfather"))
        );
    }

    @Test
    public void test_SearchMoviesByTitleMixCaseInsensitive() {
        List<Movie> results = browseMovies.searchMoviesByTitle("The GoDfAtHeR");
        Assert.assertTrue("Case insensitive search should find movies", 
                            results.stream().anyMatch(m -> m.getTitle().equals("The Godfather"))
        );
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
    public void test_SearchMoviesByTitleWithTrailingSpaces() {
        List<Movie> results = browseMovies.searchMoviesByTitle("Inception   ");
        Assert.assertTrue("Should find movie even with trailing spaces",
                          results.stream().anyMatch(m -> m.getTitle().equals("Inception")));
    }

    @Test
    public void test_SearchMoviesByTitleWithLeadingSpaces() {
        List<Movie> results = browseMovies.searchMoviesByTitle("   Inception");
        Assert.assertTrue("Should find movie even with leading spaces",
                          results.stream().anyMatch(m -> m.getTitle().equals("Inception")));
    }

    @Test
    public void test_SearchMoviesByTitleWithBothSpaces() {
        List<Movie> results = browseMovies.searchMoviesByTitle("   Inception   ");
        Assert.assertTrue("Should find movie even with leading spaces",
                          results.stream().anyMatch(m -> m.getTitle().equals("Inception")));
    }

    @Test
    public void test_SearchMoviesByTitleWithExtraSpaces() {
        List<Movie> results = browseMovies.searchMoviesByTitle("  The  Dark   KniGHt   ");
        Assert.assertTrue("Should handle extra spaces in search term",
                          results.stream().anyMatch(m -> m.getTitle().contains("The Dark Knight")));
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
        results.stream().allMatch(m -> m.getLanguage().equals("English"))
        );
    }

    @Test
    public void test_SearchMultipleMoviesBySameLanguage() {
        List<Movie> results = browseMovies.searchMoviesByLanguage("English");
        Assert.assertTrue("Should find all available English movies", results.size() == browseMovies.getMovies().stream()
                .filter(m -> m.getLanguage().equals("English")).count());
    }

    @Test
    public void test_SearchMoviesByFrenchLanguage() {
        List<Movie> results = browseMovies.searchMoviesByLanguage("French");
        Assert.assertTrue("Should find French movie",
                          results.stream().anyMatch(m -> m.getLanguage().equals("French")));
    }

    @Test
    public void test_SearchMoviesByLanguageWithTrailingSpaces() {
        List<Movie> results = browseMovies.searchMoviesByLanguage("English   ");
        Assert.assertTrue("Should find English movies with trailing spaces",
                          !results.isEmpty() && results.stream().allMatch(m -> m.getLanguage().equals("English")));
    }

    @Test
    public void test_SearchMoviesByLanguageWithLeadingSpaces() {
        List<Movie> results = browseMovies.searchMoviesByLanguage("   English");
        Assert.assertTrue("Should find English movies with leading spaces",
                          !results.isEmpty() && results.stream().allMatch(m -> m.getLanguage().equals("English")));
    }

    @Test
    public void test_SearchMoviesByArabicLanguage() {
        List<Movie> results = browseMovies.searchMoviesByLanguage("  Arabic ");
        Assert.assertTrue("Should find Arabic movie if exists", 
                          results.stream().allMatch(m -> m.getLanguage().equals("Arabic")));
    }

    // Search by rating
    @Test
    public void test_SearchMoviesByValidRatingRange() {
        List<Movie> results = browseMovies.searchMoviesByRating(8.5, 9.0);
        Assert.assertTrue("Movies should be found within rating range 8.5 - 9.0", 
                          !results.isEmpty() && results.stream().allMatch(m -> m.getImdbRating() >= 8.5 && m.getImdbRating() <= 9.0));
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

    @Test
    public void test_SearchMoviesByNegativeRatingRange() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            browseMovies.searchMoviesByRating(-5.0, -1.0);
        });
    }

    @Test
    public void test_SearchMoviesByZeroRatingRange() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            browseMovies.searchMoviesByRating(0.0, 0.0);
        });
    }

    @Test
    public void test_SearchTopRatedMovies() {
        List<Movie> results = browseMovies.searchMoviesByRating(9.0, 10.0);
        Assert.assertTrue("Should find movies with rating >= 9", results.stream().allMatch(m -> m.getImdbRating() >= 9.0));
    }

    @Test
    public void test_SearchMoviesByEqualsMinMax() {
        List<Movie> results = browseMovies.searchMoviesByRating(8.8, 8.8);
        Assert.assertTrue("Should find movies with exact rating 8.3",
                          results.stream().anyMatch(m -> m.getImdbRating() == 8.8));
    }

    @Test
    public void test_SearchMoviesByMinimumRating() {
        List<Movie> results = browseMovies.searchMoviesByRating(0.0, 5.0);
        Assert.assertTrue("Should handle minimum rating 0.0", 
                          results.stream().allMatch(m -> m.getImdbRating() >= 0.0 && m.getImdbRating() <= 5.0));
    }

    @Test
    public void test_SearchMoviesByMaximumRating() {
        List<Movie> results = browseMovies.searchMoviesByRating(9.0, 10.0);
        Assert.assertTrue("Should handle maximum rating 10.0", 
                          results.stream().allMatch(m -> m.getImdbRating() <= 10.0 && m.getImdbRating() >= 9.0));
    }
}
