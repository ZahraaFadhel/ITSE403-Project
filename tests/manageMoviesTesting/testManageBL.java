package tests.manageMoviesTesting;

/**
 * This class contains unit tests for the manageMoviesBusinessLayer class.
 * It verifies the functionality of adding, updating, and deleting movies
 * while ensuring proper interaction with the data layer.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import src.dataStore;
import src.dataStore.Movie;
import src.primaryUseCases.manageMovies.*;

public class testManageBL {
    private manageMoviesDataLayer dataLayer;
    private manageMoviesBusinessLayer businessLayer;
    private dataStore store;

    /**
     * Sets up the test environment before each test case.
     * Initializes the data store, data layer, and business layer.
     * Pre-loads the data layer with sample movies for testing.
     */
    @Before
    public void setUp() {
        store = new dataStore();
        store.getMovies().clear(); // Ensure data store starts empty
        dataLayer = new manageMoviesDataLayer(store);
        businessLayer = new manageMoviesBusinessLayer(dataLayer);

        // Initialize with some movies for testing
        dataLayer.addMovie(new Movie("Inception", new String[]{"Actor 1", "Actor 2", "Actor 3"},
                "Summary", 13, 8.0, "English", 120, new String[]{"10:00 AM"}, "Standard"));
        dataLayer.addMovie(new Movie("Avatar", new String[]{"Actor A", "Actor B", "Actor C"},
                "Summary A", 13, 7.5, "English", 150, new String[]{"11:00 AM"}, "IMAX"));
        dataLayer.addMovie(new Movie("Titanic", new String[]{"Actor X", "Actor Y", "Actor Z"},
                "Summary B", 13, 9.0, "English", 180, new String[]{"12:00 PM"}, "Standard"));
        dataLayer.addMovie(new Movie("The Matrix", new String[]{"Actor M", "Actor N", "Actor O"},
                "Summary C", 13, 8.5, "English", 130, new String[]{"01:00 PM"}, "3D"));

        // Verify that only 4 movies exist at the start
        assertEquals(4, dataLayer.getMovies().size());
    }

    /**
     * Tests if a new movie can be added successfully.
     * Ensures the movie list size increases after addition.
     */
    @Test
    public void testAddMovie() {
        Movie movie = new Movie("New Movie", new String[]{"Actor 1", "Actor 2", "Actor 3"},
                "Summary", 13, 8.0, "English", 120, new String[]{"10:00 AM"}, "Standard");
        assertTrue(dataLayer.addMovie(movie));
        assertEquals(5, dataLayer.getMovies().size()); // Initially 4 movies, should be 5 now
    }

    /**
     * Tests if adding an already existing movie fails.
     * Ensures that duplicate movies cannot be added.
     */
    @Test
    public void testAddExistingMovie() {
        Movie movie = new Movie("Inception", new String[]{"Actor 1", "Actor 2", "Actor 3"},
                "Summary", 13, 8.0, "English", 120, new String[]{"10:00 AM"}, "Standard");
        assertFalse(dataLayer.addMovie(movie)); // Should fail as "Inception" already exists
        assertEquals(4, dataLayer.getMovies().size()); // The movie count should remain 4
    }

    /**
     * Tests if an existing movie can be updated successfully.
     * Ensures that changes made to a movie reflect correctly in the data layer.
     */
    @Test
    public void testUpdateMovie() {
        Movie movie = dataLayer.getMovie("Inception");
        assertNotNull(movie);

        // Update movie details
        movie.setSummary("Updated Summary");
        assertEquals("Updated Summary", movie.getSummary());

        // Verify that the updated summary is reflected in the data layer
        assertEquals("Updated Summary", dataLayer.getMovie("Inception").getSummary());
    }

    /**
     * Tests if an existing movie can be deleted successfully.
     * Ensures that the movie is removed and no longer retrievable.
     */
    @Test
    public void testDeleteMovie() {
        assertTrue(dataLayer.deleteMovie("Avatar"));
        assertNull(dataLayer.getMovie("Avatar")); // Should return null after deletion
        assertEquals(3, dataLayer.getMovies().size()); // Now there should be 3 movies left
    }
}
