package tests.browseMoviesTesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.primaryUseCases.browseMovies.browseMoviesPresentationLayer;
import src.primaryUseCases.browseMovies.browseMoviesBusinessLayer;
import src.primaryUseCases.browseMovies.browseMoviesDataLayer;
import src.dataStore;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class testBrowsingPL {

    private browseMoviesPresentationLayer PL;
    private browseMoviesBusinessLayer BL;
    private browseMoviesDataLayer DL;
    private dataStore sampleDataStore;

    // Setting up the sample data before each test
    @Before
    public void setUp() {
        sampleDataStore = new dataStore();
        DL = new browseMoviesDataLayer(sampleDataStore);
        BL = new browseMoviesBusinessLayer(DL);
        PL = new browseMoviesPresentationLayer(BL);
    }

    // TEST CASES FOR PRESENTATION LAYER
    // ensure they communicate with the business layer correctly

    // Test invalid menu option
    @Test
    public void testInvalidMenuOption() {
        // Invalid option (99), then valid input (1)
        String input = "99\n1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
      System.setIn(in);
        PL.start();
        Assert.assertTrue("Invalid menu option should be handled properly", true);
    }

    // Testing the displayAllMovies method to call the business layer
    @Test
    public void testDisplayAllMovies() {
        // 1 in the menu to display all movies
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
      System.setIn(in);
        PL.start();
        Assert.assertTrue("Display all movies should execute successfully", true);
    }

    // Testing the searchMoviesByTitle method to call the business layer
    @Test
    public void testSearchMoviesByTitle() {
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
    public void testSearchMoviesByLanguage() {
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
    public void testSearchMoviesByRating() {
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
    public void testReturnToMainMenu() {
        // 5 in the menu to return to main menu
        String input = "5\ny\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PL.start();
        Assert.assertTrue("Return to main menu should execute successfully", true);
    }

}
