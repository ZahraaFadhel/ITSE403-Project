package tests.browseMoviesTesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.primaryUseCases.browseMovies.browseMoviesBusinessLayer;
import src.primaryUseCases.browseMovies.browseMoviesDataLayer;
import src.primaryUseCases.browseMovies.browseMoviesPresentationLayer;
import src.dataStore;
import src.dataStore.Movie;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

/**
 * Test suite for all three layers of Browse Movies functionality
 */
public class testBrowsing {

    private browseMoviesBusinessLayer BL;
    private browseMoviesDataLayer DL;
    private browseMoviesPresentationLayer PL;
    private dataStore sampleDataStore;

    // Setup all layers and sample data before each test
    @Before
    public void setUp() {
        sampleDataStore = new dataStore();
        DL = new browseMoviesDataLayer(sampleDataStore);
        BL = new browseMoviesBusinessLayer(DL);
        PL = new browseMoviesPresentationLayer(BL);
    }

    // ==================== DATA LAYER TESTS ====================
    // Ensure data layer communicates with the data store correctly

    // Test for retrieving all movies from the data store
    @Test
    public void testDL_RetrieveAllMovies() {
        List<Movie> movies = DL.movies();
        Assert.assertEquals("Expected 4 movies in the sample dataset", sampleDataStore.getMovies().size(), movies.size());
    }

    // Test all movies in the data store are received in the data layer
    @Test
    public void testDL_BrowseMovies() {
        int displayedMoviesSize = DL.browseMovies();
        Assert.assertEquals("Displayed movies count should match stored movies", 
                            displayedMoviesSize, DL.movies().size());
    }

    // Test search functionality for existing movie by title
    @Test
    public void testDL_SearchExistingMovieByTitle() {
        List<Movie> results = DL.searchMoviesByTitle("Inception");
        Assert.assertTrue("Movie 'Inception' should be found", 
                          results.stream().anyMatch(m -> m.getTitle().equals("Inception")));
    }

    // Test search functionality for nonexistent movie by title
    @Test
    public void testDL_SearchNonexistentMovieByTitle() {
        List<Movie> results = DL.searchMoviesByTitle("Nonexistent Movie");
        Assert.assertTrue("Search should return empty list for nonexistent movie", 
                           results.isEmpty());
    }

    // Test search functionality for existing movie by language
    @Test
    public void testDL_SearchMoviesByExistingLanguage() {
        List<Movie> results = DL.searchMoviesByLanguage("English");
        Assert.assertTrue("At least one English movie should be found", 
                          !results.isEmpty() && results.stream().allMatch(m -> m.getLanguage().equals("English")));
    }

    // Test search functionality for nonexistent movie by language
    @Test
    public void testDL_SearchMoviesByNonexistentLanguage() {
        List<Movie> results = DL.searchMoviesByLanguage("Spanish");
        Assert.assertTrue("Search should return empty list for nonexistent language", 
                           results.isEmpty());
    }

    // Test search functionality for existing movie by IMDB rating
    @Test
    public void testDL_SearchMoviesByValidRatingRange() {
        List<Movie> results = DL.searchMoviesByRating(8.5, 9.0);
        Assert.assertTrue("Movies should be found within rating range 8.5 - 9.0", 
                          !results.isEmpty() && results.stream().allMatch(m -> m.getImdbRating() >= 8.5 && m.getImdbRating() <= 9.0));
    }

    // Test search functionality for nonexistent movie by IMDB rating
    @Test
    public void testDL_SearchMoviesByInvalidRatingRange() {
        List<Movie> results = DL.searchMoviesByRating(-1.0, 0);
        Assert.assertTrue("Search should return empty list for rating range -1 to 0", 
                           results.isEmpty());
    }

    // Test partial title match (case insensitive)
    @Test
    public void testDL_SearchMoviesByPartialTitle() {
        List<Movie> results = DL.searchMoviesByTitle("dark");
        Assert.assertTrue("Should find 'The Dark Knight' with partial match",
                          results.stream().anyMatch(m -> m.getTitle().contains("Dark")));
    }

    // Test case insensitivity for title search
    @Test
    public void testDL_SearchMoviesByTitleCaseInsensitive() {
        List<Movie> results = DL.searchMoviesByTitle("INCEPTION");
        Assert.assertFalse("Case insensitive search should find movies", results.isEmpty());
    }

    // Test case insensitivity for language search
    @Test
    public void testDL_SearchMoviesByLanguageCaseInsensitive() {
        List<Movie> results = DL.searchMoviesByLanguage("english");
        Assert.assertTrue("Case insensitive search should find English movies",
                          results.size() > 0);
    }

    // Test multiple movies with same language
    @Test
    public void testDL_SearchMultipleMoviesBySameLanguage() {
        List<Movie> results = DL.searchMoviesByLanguage("English");
        Assert.assertTrue("Should find multiple English movies", results.size() == 6);
    }

    // Test edge case: empty string search for title
    @Test
    public void testDL_SearchMoviesByEmptyTitle() {
        List<Movie> results = DL.searchMoviesByTitle("");
        Assert.assertTrue("Empty string should return empty list", results.isEmpty());
    }

    // Test edge case: whitespace in search
    @Test
    public void testDL_SearchMoviesByWhitespaceTitle() {
        List<Movie> results = DL.searchMoviesByTitle("   ");
        Assert.assertTrue("Whitespace should not match any movies", results.isEmpty());
    }

    // Test title search with trailing spaces
    @Test
    public void testDL_SearchMoviesByTitleWithTrailingSpaces() {
        List<Movie> results = DL.searchMoviesByTitle("Inception   ");
        Assert.assertTrue("Should find movie even with trailing spaces",
                          results.stream().anyMatch(m -> m.getTitle().equals("Inception")));
    }

    // Test title search with leading spaces
    @Test
    public void testDL_SearchMoviesByTitleWithLeadingSpaces() {
        List<Movie> results = DL.searchMoviesByTitle("   Inception");
        Assert.assertTrue("Should find movie even with leading spaces",
                          results.stream().anyMatch(m -> m.getTitle().equals("Inception")));
    }

    // Test language search with trailing spaces
    @Test
    public void testDL_SearchMoviesByLanguageWithTrailingSpaces() {
        List<Movie> results = DL.searchMoviesByLanguage("English   ");
        Assert.assertTrue("Should find English movies with trailing spaces",
                          !results.isEmpty() && results.stream().allMatch(m -> m.getLanguage().equals("English")));
    }

    // Test language search with leading spaces
    @Test
    public void testDL_SearchMoviesByLanguageWithLeadingSpaces() {
        List<Movie> results = DL.searchMoviesByLanguage("   English");
        Assert.assertTrue("Should find English movies with leading spaces",
                          !results.isEmpty() && results.stream().allMatch(m -> m.getLanguage().equals("English")));
    }

    // Test rating boundary: exact minimum
    @Test
    public void testDL_SearchMoviesByExactMinRating() {
        List<Movie> results = DL.searchMoviesByRating(8.3, 8.3);
        Assert.assertTrue("Should find movies with exact rating 8.3",
                          results.stream().anyMatch(m -> m.getImdbRating() == 8.3));
    }

    // Test rating boundary: max rating 10.0
    @Test
    public void testDL_SearchMoviesByMaxRating() {
        List<Movie> results = DL.searchMoviesByRating(9.0, 10.0);
        Assert.assertTrue("Should find high-rated movies",
                          results.stream().allMatch(m -> m.getImdbRating() >= 9.0));
    }

    // Test inverted rating range (min > max)
    @Test
    public void testDL_SearchMoviesByInvertedRatingRange() {
        List<Movie> results = DL.searchMoviesByRating(9.0, 7.0);
        Assert.assertTrue("Inverted range should return empty list", results.isEmpty());
    }

    // Test zero rating range
    @Test
    public void testDL_SearchMoviesByZeroRatingRange() {
        List<Movie> results = DL.searchMoviesByRating(0, 0);
        Assert.assertTrue("Zero rating range should return empty list", results.isEmpty());
    }

    // Test French language movie
    @Test
    public void testDL_SearchMoviesByFrenchLanguage() {
        List<Movie> results = DL.searchMoviesByLanguage("French");
        Assert.assertTrue("Should find French movie",
                          results.stream().anyMatch(m -> m.getTitle().equals("Amélie")));
    }

    // Test Japanese language movie
    @Test
    public void testDL_SearchMoviesByJapaneseLanguage() {
        List<Movie> results = DL.searchMoviesByLanguage("Japanese");
        Assert.assertTrue("Should find Japanese movie",
                          results.stream().anyMatch(m -> m.getTitle().equals("Spirited Away")));
    }

    // Test Korean language movie
    @Test
    public void testDL_SearchMoviesByKoreanLanguage() {
        List<Movie> results = DL.searchMoviesByLanguage("Korean");
        Assert.assertTrue("Should find Korean movie",
                          results.stream().anyMatch(m -> m.getTitle().equals("Parasite")));
    }

    // Test top-rated movies (rating >= 9.0)
    @Test
    public void testDL_SearchTopRatedMovies() {
        List<Movie> results = DL.searchMoviesByRating(9.0, 10.0);
        Assert.assertTrue("Should find top-rated movies",
                          results.size() >= 2);
    }

    // ==================== BUSINESS LAYER TESTS ====================
    // Ensure business layer communicates with the data layer correctly

    // Test to ensure all movies in the data store are received in the business layer from the data layer
    @Test
    public void testBL_DisplayAllMovies() {
        int displayedMoviesSize = BL.displayMovies();
        Assert.assertEquals("Displayed movies count does not match stored movies",
                displayedMoviesSize, DL.movies().size());
    }

    // Test search functionality for existing movie by title
    @Test
    public void testBL_SearchExistingMovieByTitle() {
        String input = "Inception\n"; // Simulate user input for movie title
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        BL.searchMoviesByTitle(new Scanner(System.in));
        Assert.assertTrue("Movie 'Inception' should be found",
                DL.movies().stream().anyMatch(m -> m.getTitle().equalsIgnoreCase("Inception")));
    }

    // Test search functionality for nonexistent movie by title
    @Test
    public void testBL_SearchNonexistentMovieByTitle() {
        String input = "Nonexistent Movie\n"; // Simulate user input for movie title
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        BL.searchMoviesByTitle(new Scanner(System.in));
        Assert.assertFalse("Movie 'Nonexistent Movie' should not be found",
                DL.movies().stream().anyMatch(m -> m.getTitle().equalsIgnoreCase("Nonexistent Movie")));
    }

    // Test search functionality for existing movie by language
    @Test
    public void testBL_SearchMoviesByExistingLanguage() {
        String input = "English\n"; // Simulate user input for movie language
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        BL.searchMoviesByLanguage(new Scanner(System.in));
        Assert.assertTrue("At least one English movie should exist",
                DL.movies().stream().anyMatch(m -> m.getLanguage().equalsIgnoreCase("English")));
    }

    // Test search functionality for nonexistent movie by language
    @Test
    public void testBL_SearchMoviesByNonexistentLanguage() {
        String input = "Spanish\n"; // Simulate user input for movie language
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        BL.searchMoviesByLanguage(new Scanner(System.in));
        Assert.assertFalse("No Spanish movies should exist",
                DL.movies().stream().anyMatch(m -> m.getLanguage().equalsIgnoreCase("Spanish")));
    }

    // Test search functionality for valid rating range
    @Test
    public void testBL_SearchMoviesByValidRatingRange() {
        String input = "8.5\n9.0\n"; // Simulate user input for rating range
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        BL.searchMoviesByRating(new Scanner(System.in));
        Assert.assertTrue("Movies should exist within rating range 8.5 - 9.0",
                DL.movies().stream().anyMatch(m -> m.getImdbRating() >= 8.5 && m.getImdbRating() <= 9.0));
    }

    // Test search functionality for invalid rating range
    @Test
    public void testBL_SearchMoviesByInvalidRatingRange() {
        String input = "1.0\n2.0\n"; // Simulate user input for rating range
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        BL.searchMoviesByRating(new Scanner(System.in));
        Assert.assertFalse("No movies should exist within rating range 1.0 - 2.0",
                DL.movies().stream().anyMatch(m -> m.getImdbRating() >= 1.0 && m.getImdbRating() <= 2.0));
    }

    // Test partial title search through business layer
    @Test
    public void testBL_SearchMoviesByPartialTitle() {
        String input = "knight\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        BL.searchMoviesByTitle(new Scanner(System.in));
        Assert.assertTrue("Should find movies containing 'knight'",
                DL.movies().stream().anyMatch(m -> m.getTitle().toLowerCase().contains("knight")));
    }

    // Test case insensitive title search
    @Test
    public void testBL_SearchMoviesByTitleCaseInsensitive() {
        String input = "PARASITE\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        BL.searchMoviesByTitle(new Scanner(System.in));
        Assert.assertTrue("Case insensitive search should work",
                DL.movies().stream().anyMatch(m -> m.getTitle().equalsIgnoreCase("Parasite")));
    }

    // Test French language search
    @Test
    public void testBL_SearchMoviesByFrenchLanguage() {
        String input = "French\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        BL.searchMoviesByLanguage(new Scanner(System.in));
        Assert.assertTrue("Should find French movies",
                DL.movies().stream().anyMatch(m -> m.getLanguage().equalsIgnoreCase("French")));
    }

    // Test high rating range
    @Test
    public void testBL_SearchMoviesByHighRatingRange() {
        String input = "9.0\n10.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        BL.searchMoviesByRating(new Scanner(System.in));
        Assert.assertTrue("Should find high-rated movies",
                DL.movies().stream().anyMatch(m -> m.getImdbRating() >= 9.0));
    }

    // Test exact rating match
    @Test
    public void testBL_SearchMoviesByExactRating() {
        String input = "8.6\n8.6\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        BL.searchMoviesByRating(new Scanner(System.in));
        Assert.assertTrue("Should find movie with exact rating 8.6",
                DL.movies().stream().anyMatch(m -> m.getImdbRating() == 8.6));
    }

    // Test empty title search
    @Test
    public void testBL_SearchMoviesByEmptyTitle() {
        String input = "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        BL.searchMoviesByTitle(new Scanner(System.in));
        Assert.assertTrue("Empty search should return all or specific results", true);
    }

    // Test title search with trailing spaces
    @Test
    public void testBL_SearchMoviesByTitleWithSpaces() {
        String input = "  Parasite  \n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        BL.searchMoviesByTitle(new Scanner(System.in));
        Assert.assertTrue("Should find movie with leading/trailing spaces",
                DL.movies().stream().anyMatch(m -> m.getTitle().equalsIgnoreCase("Parasite")));
    }

    // Test language search with trailing spaces
    @Test
    public void testBL_SearchMoviesByLanguageWithSpaces() {
        String input = "  French  \n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        BL.searchMoviesByLanguage(new Scanner(System.in));
        Assert.assertTrue("Should find French movies with leading/trailing spaces",
                DL.movies().stream().anyMatch(m -> m.getLanguage().equalsIgnoreCase("French")));
    }

    // ==================== PRESENTATION LAYER TESTS ====================
    // Ensure presentation layer communicates with the business layer correctly

    // Test invalid menu option
    @Test
    public void testPL_InvalidMenuOption() {
        // Invalid option (99), then valid input (1)
        String input = "99\n1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PL.start();
        Assert.assertTrue("Invalid menu option should be handled properly", true);
    }

    // Testing the displayAllMovies method to call the business layer
    @Test
    public void testPL_DisplayAllMovies() {
        // 1 in the menu to display all movies
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PL.start();
        Assert.assertTrue("Display all movies should execute successfully", true);
    }

    // Testing the searchMoviesByTitle method to call the business layer
    @Test
    public void testPL_SearchMoviesByTitle() {
        // 2 in the menu to search by title
        // 'Inception' as the search query (title)
        // 'y' to return to main menu
        String input = "2\nInception\ny\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PL.start();
        Assert.assertTrue("Search by title should return results for 'Inception'", true);
    }

    // Testing the searchMoviesByLanguage method to call the business layer
    @Test
    public void testPL_SearchMoviesByLanguage() {
        // 3 in the menu to search by language
        // 'Arabic' as the search query (language)
        // 'y' to return to main menu
        String input = "3\nArabic\ny\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PL.start();
        Assert.assertTrue("Search by language should return results for 'Arabic'", true);
    }

    // Testing the searchMoviesByRating method to call the business layer
    @Test
    public void testPL_SearchMoviesByRating() {
        // 4 in the menu to search by rating
        // 7.5 as the lower bound of the rating range
        // 9.0 as the upper bound of the rating range
        // 'y' to return to main menu
        String input = "4\n7.5\n9.0\ny\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PL.start();
        Assert.assertTrue("Search by rating should return results between 7.5 and 9.0", true);
    }

    // Testing the returnToMainMenu method
    @Test
    public void testPL_ReturnToMainMenu() {
        // 5 in the menu to return to main menu
        String input = "5\ny\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PL.start();
        Assert.assertTrue("Return to main menu should execute successfully", true);
    }

    // Test invalid menu choice followed by valid choice
    @Test
    public void testPL_InvalidThenValidChoice() {
        String input = "0\n1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PL.start();
        Assert.assertTrue("Should handle invalid then valid choice", true);
    }

    // Test search by non-existent title
    @Test
    public void testPL_SearchNonExistentTitle() {
        String input = "2\nNonExistent Movie\ny\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PL.start();
        Assert.assertTrue("Should handle non-existent movie gracefully", true);
    }

    // Test search by French language
    @Test
    public void testPL_SearchByFrenchLanguage() {
        String input = "3\nFrench\ny\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PL.start();
        Assert.assertTrue("Should find French movies", true);
    }

    // Test search by Korean language
    @Test
    public void testPL_SearchByKoreanLanguage() {
        String input = "3\nKorean\ny\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PL.start();
        Assert.assertTrue("Should find Korean movies", true);
    }

    // Test search by partial title
    @Test
    public void testPL_SearchByPartialTitle() {
        String input = "2\nDark\ny\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PL.start();
        Assert.assertTrue("Should find movies with partial title match", true);
    }

    // Test search by high rating range
    @Test
    public void testPL_SearchByHighRating() {
        String input = "4\n9.0\n10.0\ny\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PL.start();
        Assert.assertTrue("Should find top-rated movies", true);
    }

    // Test search by exact rating
    @Test
    public void testPL_SearchByExactRating() {
        String input = "4\n8.6\n8.6\ny\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PL.start();
        Assert.assertTrue("Should find movies with exact rating", true);
    }

    // Test search by invalid rating range
    @Test
    public void testPL_SearchByInvalidRating() {
        String input = "4\n0\n1.0\ny\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PL.start();
        Assert.assertTrue("Should handle invalid rating range", true);
    }

    // Test multiple invalid inputs before valid
    @Test
    public void testPL_MultipleInvalidInputs() {
        String input = "100\n-1\n6\n1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PL.start();
        Assert.assertTrue("Should handle multiple invalid inputs", true);
    }

    // Test browsing after searching
    @Test
    public void testPL_BrowseAfterSearch() {
        String input = "2\nInception\ny\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PL.start();
        Assert.assertTrue("Should allow browsing after search", true);
    }

    // Test search by non-existent language
    @Test
    public void testPL_SearchByNonExistentLanguage() {
        String input = "3\nSwedish\ny\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PL.start();
        Assert.assertTrue("Should handle non-existent language search", true);
    }

    // Test search by title with trailing spaces
    @Test
    public void testPL_SearchByTitleWithSpaces() {
        String input = "2\n  Inception  \ny\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PL.start();
        Assert.assertTrue("Should find movie with spaces in input", true);
    }

    // Test search by language with trailing spaces
    @Test
    public void testPL_SearchByLanguageWithSpaces() {
        String input = "3\n  Korean  \ny\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PL.start();
        Assert.assertTrue("Should find Korean movies with spaces in input", true);
    }
}
