/**
 * This class represents the presentation layer for browsing and searching movies.
 * It provides a console interface for accessing movies data, including browsing all movies,
 * searching movies by title, language, and rating.
 */

package src.primaryUseCases.browseMovies;

import java.util.Scanner;
import src.helpers.consoleColors;
import src.helpers.validation;

public class browseMoviesPresentationLayer {

    private browseMoviesBusinessLayer businessLayer; // Reference to the business logic layer 
    private Scanner scanner; // Scanner object for reading user input from the console

    public browseMoviesPresentationLayer(browseMoviesBusinessLayer businessLayer) {
        this.businessLayer = businessLayer; 
        this.scanner = new Scanner(System.in); 
    }

    // Constructor to initialize the presentation layer
    public browseMoviesPresentationLayer(browseMoviesBusinessLayer businessLayer, Scanner scanner) {
        this.businessLayer = businessLayer; // Instantiate the business layer
        this.scanner = scanner; // Initialize the scanner object
    }

    // Method to display the main menu
    private void displayMenu() {
        System.out.println(consoleColors.BLUE_BOLD + "\n--- Browse & Search Movies --- " + consoleColors.RESET);
        System.out.println(consoleColors.GREEN_BOLD + "1. Browse Movies " + consoleColors.RESET);
        System.out.println(consoleColors.GREEN_BOLD + "2. Search Movie by title " + consoleColors.RESET);
        System.out.println(consoleColors.GREEN_BOLD + "3. Search Movie by language " + consoleColors.RESET);
        System.out.println(consoleColors.GREEN_BOLD + "4. Search Movie by rating " + consoleColors.RESET);
        System.out.println(consoleColors.RED_BOLD + "5. Return to Main Menu " + consoleColors.RESET);
        System.out.println();
    }

    // Method to start the application and display the menu
    public void start() {
        scanner = new Scanner(System.in); // Initialize the scanner object

        while (true) {
            // Display the main menu with colored text for better readability
            displayMenu();

            // Read the user's choice and validate it
            int choice = validation.getValidIntegerInput("Enter your choice: ", scanner);

            scanner.nextLine();

            if (choice > 5 || choice < 1) {
                System.out.print(consoleColors.RED_BOLD + "Invalid input. Please enter a valid number.\n" + consoleColors.RESET);
                continue;
            }

            // Perform the selected operation based on the user's choice
            switch (choice) {
                case 1:
                    businessLayer.displayMovies(); // Call the business layer to display Movies
                    return;
                case 2:
                    businessLayer.searchMoviesByTitle(this.scanner); // Call the business layer
                    returnToMainMenu(); // Prompt the user to return to the main menu
                    return;
                case 3:
                    businessLayer.searchMoviesByLanguage(this.scanner); // Call the business layer to search by language
                    returnToMainMenu();
                    return;
                case 4:
                    businessLayer.searchMoviesByRating(this.scanner); // Call the business layer to search by rating
                    returnToMainMenu();
                    return;
                case 5:
                    System.out
                            .println(consoleColors.YELLOW_BOLD + "\nReturning to main menu >>>>" + consoleColors.RESET);
                        return;
                default:
                    System.out.println(
                            consoleColors.RED_BOLD + "Invalid choice. Please try again. " + consoleColors.RESET);
            }

        }
    }

    // Method to prompt the user to return to the main menu
    private void returnToMainMenu() {
        System.out.println(consoleColors.YELLOW_BOLD + "Go Back? (y/n)" + consoleColors.RESET);
        System.out.print(consoleColors.YELLOW_BOLD + "Enter your choice: " + consoleColors.RESET);

        // Read the user's choice and validate it
        if (scanner.hasNext()) {
            int choice = scanner.next().charAt(0);
            scanner.nextLine();

            if (choice == 'y' || choice == 'Y') {
                System.out
                        .println(consoleColors.YELLOW_BOLD + "\nReturning to browsing menu >>>" + consoleColors.RESET);
                return;
            } else if (choice == 'n' || choice == 'N') {
                // Exit the system
                System.out.println(consoleColors.RED_BOLD + "Exiting the system. Goodbye!" + consoleColors.RESET);
                validation.closeScanner(scanner); // Close the scanner
                System.exit(0);
            } else {
                System.out.println(consoleColors.RED_BOLD + "Invalid choice. Returning to main menu." + consoleColors.RESET);
                return; 
            }
        }

    }
}
