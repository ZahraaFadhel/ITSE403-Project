package src.cmd;

/*
 * This is the main entry point for a cinema management system.
 * It provides users (customers & admins) with a menu to browse movies, book tickets, proceed to checkout,
 * and manage movie listings. The system takes user input and navigates to the 
 * appropriate use case based on their selection.
 * 
 * Features:
 * - Browse and search for movies.
 * - Book tickets for movies.
 * - Checkout and complete booking.
 * - Manage movies by adding, deleting and updating.
 * - Exit the system.
 * 
 * The system uses the consoleColors class for colored terminal output.
 */
import src.dataStore;
import src.helpers.consoleColors;
import src.helpers.validation;
import src.primaryUseCases.bookingMovies.bookingBusinessLayer;
import src.primaryUseCases.bookingMovies.bookingDataLayer;
import src.primaryUseCases.bookingMovies.bookingPresentationLayer;
import src.primaryUseCases.browseMovies.BrowseMovies;
import src.primaryUseCases.checkout.checkoutBusinessLayer;
import src.primaryUseCases.checkout.checkoutDataLayer;
import src.primaryUseCases.checkout.checkoutPresentationLayer;
import src.primaryUseCases.manageMovies.manageMoviesBusinessLayer;
import src.primaryUseCases.manageMovies.manageMoviesDataLayer;
import src.primaryUseCases.manageMovies.manageMoviesPresentationLayer;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        dataStore globalDataStore = new dataStore();

        // Initialize Booking Use Case
        bookingDataLayer bookingDL = new bookingDataLayer(globalDataStore);
        bookingBusinessLayer bookingBL = new bookingBusinessLayer(bookingDL);
        bookingPresentationLayer bookingMovies = new bookingPresentationLayer(bookingBL);

        // Initialize Browsing Use Case
        BrowseMovies browseMovies = new BrowseMovies(globalDataStore);

        // Initialize Checkout Use Case
        checkoutDataLayer checkoutDL = new checkoutDataLayer();
        checkoutBusinessLayer checkoutBL = new checkoutBusinessLayer(checkoutDL);
        checkoutPresentationLayer checkout = new checkoutPresentationLayer(checkoutBL);

        // Initialize Movie Management Use Case
        manageMoviesDataLayer manageDL = new manageMoviesDataLayer(globalDataStore);
        manageMoviesBusinessLayer manageBL = new manageMoviesBusinessLayer(manageDL);
        Scanner sc = new Scanner(System.in);
        manageMoviesPresentationLayer manageMovies = new manageMoviesPresentationLayer(manageBL, sc);

        while (true) {
            // Display the main menu options with colors
            System.out.println("\n" + consoleColors.CYAN_BOLD + "--- Cinema Management System ---" + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "1. Browse Movies & Search" + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "2. Booking Movies" + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "3. Checkout" + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "4. Manage Movies" + consoleColors.RESET);
            System.out.println(consoleColors.RED_BOLD + "5. Exit" + consoleColors.RESET);
            System.out.println();

            int choice = validation.getValidIntegerInput("Enter your choice: ", sc);

            if (choice < 1 || choice > 5) {
                System.out.println(consoleColors.RED_BOLD + "Invalid input. Please enter a valid number." + consoleColors.RESET);
                continue;
            }

            // Process user input based on menu selection
            switch (choice) {
                case 1:
                    browseMovies.start();
                    break;
                case 2:
                    bookingMovies.start();
                    break;
                case 3:
                    checkout.start();
                    break;
                case 4:
                    manageMovies.start();
                    break;
                case 5:
                    System.out.println(consoleColors.RED_BOLD + "Exiting the system. Goodbye!" + consoleColors.RESET);
                    validation.closeScanner(sc);
                    return;
            }
        }
    }
}
