package tests.browseMoviesTesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.primaryUseCases.browseMovies.browseMoviesDataLayer;
import src.dataStore;
import src.dataStore.Movie;
import java.util.List;

public class testBrowsingDL {

    private dataStore sampleDataStore;
    private browseMoviesDataLayer DL;

    // Setup the data layer and sample data store before each test
    @Before
    public void setUp() {
        sampleDataStore = new dataStore();
        DL = new browseMoviesDataLayer(sampleDataStore);
    }

    // TEST CASES FOR DATA LAYER
    // Ensure they communicate with the data store correctly
    
    // Test for retrieving all movies from the data store
    @Test
    public void testRetrieveAllMovies() {
        List<Movie> movies = DL.movies();
        Assert.assertEquals("Expected 4 movies in the sample dataset", 4, movies.size());
    }

    // Test to ensure all movies in the data store are receieved in the data layer
    @Test
    public void testBrowseMovies() {
        int displayedMoviesSize = DL.browseMovies();
        Assert.assertEquals("Displayed movies count should match stored movies", 
                            displayedMoviesSize, DL.movies().size());
    }

    // Test search functionality for existing movie by title
    @Test
    public void testSearchExistingMovieByTitle() {
        DL.searchMoviesByTitle("Inception");
        Assert.assertTrue("Movie 'Inception' should be found", 
                          DL.movies().stream().anyMatch(m -> m.getTitle().equalsIgnoreCase("Inception")));
    }

    // Test search functionality for nonexistent movie by title
    @Test
    public void testSearchNonexistentMovieByTitle() {
        DL.searchMoviesByTitle("Nonexistent Movie");
        Assert.assertFalse("Movie 'Nonexistent Movie' should not be found", 
                           DL.movies().stream().anyMatch(m -> m.getTitle().equalsIgnoreCase("Nonexistent Movie")));
    }

    // Test search functionality for existing movie by language
    @Test
    public void testSearchMoviesByExistingLanguage() {
        DL.searchMoviesByLanguage("English");
        Assert.assertTrue("At least one English movie should exist", 
                          DL.movies().stream().anyMatch(m -> m.getLanguage().equalsIgnoreCase("English")));
    }

    // Test search functionality for nonexistent movie by language
    @Test
    public void testSearchMoviesByNonexistentLanguage() {
        DL.searchMoviesByLanguage("Spanish");
        Assert.assertFalse("No Spanish movies should exist", 
                           DL.movies().stream().anyMatch(m -> m.getLanguage().equalsIgnoreCase("Spanish")));
    }

    // Test search functionality for existing movie by IMDB rating
    @Test
    public void testSearchMoviesByValidRatingRange() {
        DL.searchMoviesByRating(8.5, 9.0);
        Assert.assertTrue("Movies should exist within rating range 8.5 - 9.0", 
                          DL.movies().stream().anyMatch(m -> m.getImdbRating() >= 8.5 && m.getImdbRating() <= 9.0));
    }

    // Test search functionality for nonexistent movie by IMDB rating
    @Test
    public void testSearchMoviesByInvalidRatingRange() {
        DL.searchMoviesByRating(-1.0, 0);
        Assert.assertFalse("No movies should exist within rating range 5.0 - 6.0", 
                           DL.movies().stream().anyMatch(m -> m.getImdbRating() >= 5.0 && m.getImdbRating() <= 6.0));
    }
}

