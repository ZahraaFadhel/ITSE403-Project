package tests.manageMoviesTesting;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import src.dataStore;
import src.dataStore.Movie;
import src.primaryUseCases.manageMovies.*;

public class testManageDL {
    private manageMoviesDataLayer dataLayer;
    private dataStore store;

    @Before
    public void setUp() {
        store = new dataStore();
        dataLayer = new manageMoviesDataLayer(store);
    }

    @Test
    public void testAddMovieValid() {
        Movie movie = new Movie("New Movie", new String[]{"Actor 1", "Actor 2", "Actor 3"}, "Summary", 
                                13, 8.0, "English", 120, new String[]{"10:00 AM"}, "Standard");
        assertTrue(dataLayer.addMovie(movie));
        assertEquals(5, dataLayer.getMovies().size());
    }

    @Test
    public void testAddMovieInvalidRating() {
        Movie movie = new Movie("Invalid Movie", new String[]{"Actor 1", "Actor 2", "Actor 3"}, "Summary", 
                                13, 11.0, "English", 120, new String[]{"10:00 AM"}, "Standard");
        assertFalse(dataLayer.addMovie(movie));
    }

    @Test
    public void testDeleteMovie() {
        assertTrue(dataLayer.deleteMovie("Avatar"));
        assertEquals(3, dataLayer.getMovies().size());
    }

    @Test
    public void testGetMovie() {
        Movie movie = dataLayer.getMovie("Inception");
        assertNotNull(movie);
        assertEquals("Inception", movie.getTitle());
    }

    @Test
    public void testDisplayMovies() {
        try {
            dataLayer.displayMovies(1);
        } catch (Exception e) {
            fail("displayMovies() threw an exception: " + e.getMessage());
        }
    }
}
