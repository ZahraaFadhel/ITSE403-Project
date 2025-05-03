/* 
The presentationLayer class is part of the Cinema Management System and serves as the user interface for staff members to manage movies. 
It interacts with the businessLayer to perform operations such as adding, updating, deleting, and displaying movies. 
The class provides a text-based menu-driven interface that allows users to select and execute these operations.
 */ //.

package src.primaryUseCases.manageMovies; //.

import java.util.Scanner; //.
import src.helpers.consoleColors; //.
import src.helpers.validation; //.

public class manageMoviesPresentationLayer { //.
    private manageMoviesBusinessLayer businessLayer; //.
    private Scanner scanner; //.

    // Constructor to initialize the presentation layer with a Scanner //.
    public manageMoviesPresentationLayer(manageMoviesBusinessLayer businessLayer, Scanner scanner) { //.
        this.businessLayer = businessLayer; //.
        this.scanner = scanner; // Use the provided scanner //.
    } //.

    // Method to start the application and display the menu //.
    public void start() { //.
        while (true) { //.
            System.out.println(consoleColors.BLUE_BOLD + "\n--- Manage Movies ---" + consoleColors.RESET); //.
            System.out.println(consoleColors.GREEN_BOLD + "1. Add Movie" + consoleColors.RESET); //.
            System.out.println(consoleColors.GREEN_BOLD + "2. Update Movie" + consoleColors.RESET); //.
            System.out.println(consoleColors.GREEN_BOLD + "3. Delete Movie" + consoleColors.RESET); //.
            System.out.println(consoleColors.RED_BOLD + "4. Return to Main Menu" + consoleColors.RESET); //.
            System.out.println(); //.

            // Read the user's choice //.
            int choice = validation.getValidIntegerInput("Enter your choice: ", scanner); //.

            // Validate and perform the selected operation based on the user's choice //.
            handleChoice(choice); //.
        } //.
    } //.

    // New method to handle choices //.
    public void handleChoice(int choice) { //.
        if (choice > 4 || choice < 1) { //.
            System.out.print(consoleColors.RED_BOLD + "Invalid input. Please enter a valid number.\n" + consoleColors.RESET); //.
            return; //.
        } //.

        switch (choice) { //.
            case 1: //.
                businessLayer.addMovie(); // Call the business layer to add a movie //.
                break; //.
            case 2: //.
                businessLayer.updateMovie(); // Call the business layer to update a movie //.
                break; //.
            case 3: //.
                businessLayer.deleteMovie(); // Call the business layer to delete a movie //.
                break; //.
            case 4: //.
                System.out.println(consoleColors.YELLOW_BOLD + "\nReturning to main menu >>>" + consoleColors.RESET); //.
                return; // Exit the application //.
        } //.
    } //.
} //.
