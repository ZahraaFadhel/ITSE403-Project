/**
 * This class represents the presentation layer for the movie booking system.
 * It provides a user interface via the console for booking operations, 
 * allowing users to book a movie, view bookings, and cancel a booking.
 */
package src.primaryUseCases.bookingMovies;

import java.util.Scanner;
import src.helpers.consoleColors;
import src.helpers.validation;

public class bookingPresentationLayer {
    private bookingBusinessLayer businessLayer;  // Reference to the business logic layer 
    private Scanner scanner;  // Scanner object for reading user input

    // Constructor
    public bookingPresentationLayer(bookingBusinessLayer businessLayer) {
        this.businessLayer = businessLayer;  
        this.scanner = new Scanner(System.in); 
    }

    // Method to start the application and display the menu
    public void start() {
        scanner = new Scanner(System.in);

        while (true) {

            // Display the main menu for booking operations
            System.out.println(consoleColors.BLUE_BOLD + "\n--- Movie Booking --- " + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "1. Book a Movie " + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "2. View All Bookings " + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "3. Cancel a Booking " + consoleColors.RESET);
            System.out.println(consoleColors.RED_BOLD + "4. Return to Main Menu " + consoleColors.RESET);
            System.out.println();

            // Read the user's choice
            int choice = validation.getValidIntegerInput("Enter your choice: ", scanner);

            if (choice > 4 || choice < 1) {
                System.out.print(consoleColors.RED_BOLD + "Invalid input. Please enter a valid number. \n" + consoleColors.RESET);
                continue;
            }

            // Perform the selected operation based on the user's choice
            switch (choice) {
                
                case 1:
                    businessLayer.bookMovie(this.scanner);  // Call business layer to book
                    return;
                case 2:
                    businessLayer.viewBookings();  // Call business layer to view bookings
                    return;
                case 3:
                    businessLayer.cancelBooking(this.scanner);  // Call business layer to cancel 
                    return;
                case 4:
                    System.out.println(consoleColors.YELLOW_BOLD + "\nReturning to main menu >>>" + consoleColors.RESET);
                    return;
                default:
                    System.out.println(consoleColors.RED_BOLD + "Invalid choice. Please try again." + consoleColors.RESET);

            }

            // Ask user if they want to return to the Main Menu or Exit
            returnToMainMenu();
        }
    }

    // Method to prompt the user to return to the main menu
    private void returnToMainMenu() {

        System.out.println(consoleColors.YELLOW_BOLD + "Go Back? (y/n)" + consoleColors.RESET);
        System.out.print(consoleColors.YELLOW_BOLD + "Enter your choice: " + consoleColors.RESET);
        
        int choice = scanner.next().charAt(0);
        scanner.nextLine();

        if (choice == 'y' || choice == 'Y') {
            System.out.println(consoleColors.YELLOW_BOLD + "\nReturning to booking menu >>> " + consoleColors.RESET);
        } else if (choice == 'n' || choice == 'N') {
            System.out.println(consoleColors.RED_BOLD + "Exiting the system. Goodbye! " + consoleColors.RESET);
            System.exit(0);
        } else {
            System.out.println(consoleColors.RED_BOLD + "Invalid Choice. Returning to main menu. " + consoleColors.RESET);
        }
    }
}
