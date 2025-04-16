package tests.manageMoviesTesting;

/**
 * This class contains unit tests for the manageMoviesPresentationLayer class.
 * It ensures that the presentation layer correctly handles user choices
 * and interacts with the business layer without throwing exceptions.
 */

import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import java.util.Scanner;
import src.primaryUseCases.manageMovies.*;

public class testManagePL {
    private manageMoviesPresentationLayer presentationLayer;
    private manageMoviesBusinessLayer businessLayer;

    // Sets up the test environment before each test case
    // Initializes a mock business layer and creates an instance of the presentation layer
    @Before
    public void setUp() {
        businessLayer = new manageMoviesBusinessLayer() {
            @Override
            public void addMovie() {
                System.out.println("Test: addMovie() executed.");
            }

            @Override
            public void updateMovie() {
                System.out.println("Test: updateMovie() executed.");
            }

            @Override
            public void deleteMovie() {
                System.out.println("Test: deleteMovie() executed.");
            }
        };

        Scanner scanner = new Scanner(System.in);
        presentationLayer = new manageMoviesPresentationLayer(businessLayer, scanner);
    }

    @Test
    public void testHandleChoice_AddMovie() {
        try {
            presentationLayer.handleChoice(1);
        } catch (Exception e) {
            fail("Exception thrown in testHandleChoice_AddMovie: " + e.getMessage());
        }
    }

    @Test
    public void testHandleChoice_UpdateMovie() {
        try {
            presentationLayer.handleChoice(2);
        } catch (Exception e) {
            fail("Exception thrown in testHandleChoice_UpdateMovie: " + e.getMessage());
        }
    }

    @Test
    public void testHandleChoice_DeleteMovie() {
        try {
            presentationLayer.handleChoice(3);
        } catch (Exception e) {
            fail("Exception thrown in testHandleChoice_DeleteMovie: " + e.getMessage());
        }
    }

    @Test
    public void testHandleChoice_InvalidChoice() {
        try {
            presentationLayer.handleChoice(5);
        } catch (Exception e) {
            fail("Exception thrown in testHandleChoice_InvalidChoice: " + e.getMessage());
        }
    }

    @Test
    public void testHandleChoice_ReturnToMainMenu() {
        try {
            presentationLayer.handleChoice(4);
        } catch (Exception e) {
            fail("Exception thrown in testHandleChoice_ReturnToMainMenu: " + e.getMessage());
        }
    }
}
