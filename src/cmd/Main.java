package src.cmd;

import src.dataStore;
import src.helpers.consoleColors;
import src.helpers.validation;
import src.primaryUseCases.bookingMovies.BookingMovies;
import src.primaryUseCases.browseMovies.BrowseMovies;
import src.primaryUseCases.checkout.checkoutBusinessLayer;
import src.primaryUseCases.checkout.checkoutDataLayer;
import src.primaryUseCases.checkout.checkoutPresentationLayer;
import src.primaryUseCases.manageMovies.AddMovie;
import src.primaryUseCases.manageMovies.manageMoviesPresentationLayer;

import java.util.Scanner;

<<<<<<< HEAD

=======
>>>>>>> 03da1bce66075e4e58227c9fe5b9d94a87c654b4
public class Main {

    public static void main(String[] args) {

<<<<<<< HEAD
        // Initialize Booking Use Case
       BookingMovies bookingMovie= new BookingMovies(globalDataStore);
        // Initialize Browsing Use Case
       BrowseMovies browseMovies = new BrowseMovies(globalDataStore);
=======
        dataStore globalDataStore = new dataStore();
        Scanner sc = new Scanner(System.in);

        // ---------------- BOOKING -----------------
        bookingDataLayer bookingDL = new bookingDataLayer(globalDataStore);
        bookingBusinessLayer bookingBL = new bookingBusinessLayer(bookingDL);
        bookingPresentationLayer bookingMovies = new bookingPresentationLayer(bookingBL);

        // ---------------- BROWSING ----------------
        BrowseMovies browseMovies = new BrowseMovies(globalDataStore);
>>>>>>> 03da1bce66075e4e58227c9fe5b9d94a87c654b4

        // ---------------- CHECKOUT ----------------
        checkoutDataLayer checkoutDL = new checkoutDataLayer();
        checkoutBusinessLayer checkoutBL = new checkoutBusinessLayer(checkoutDL);
        checkoutPresentationLayer checkout = new checkoutPresentationLayer(checkoutBL);

        // ---------------- MANAGE MOVIES -----------
        AddMovie manageBL = new AddMovie(sc);
        manageMoviesPresentationLayer manageMovies =
                new manageMoviesPresentationLayer(manageBL, globalDataStore, sc);

        // ---------------- MAIN MENU LOOP ----------
        while (true) {

            System.out.println("\n" + consoleColors.CYAN_BOLD +
                    "--- Cinema Management System ---" + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "1. Browse Movies & Search" + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "2. Booking Movies" + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "3. Checkout" + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "4. Manage Movies" + consoleColors.RESET);
            System.out.println(consoleColors.RED_BOLD + "5. Exit" + consoleColors.RESET);

            int choice = validation.getValidIntegerInput("Enter your choice: ", sc);

            if (choice < 1 || choice > 5) {
                System.out.println(consoleColors.RED_BOLD +
                        "Invalid input. Please enter a valid number." +
                        consoleColors.RESET);
                continue;
            }

            switch (choice) {
<<<<<<< HEAD
                case 1:
                   browseMovies.start();
                    break;
                case 2:
                    bookingMovie.start();
                    break;
                case 3:
                    checkout.start();
                    break;
                case 4:
                    manageMovies.start();
                    break;
=======
                case 1: browseMovies.start(); break;
                case 2: bookingMovies.start(); break;
                case 3: checkout.start(); break;
                case 4: manageMovies.start(); break;
>>>>>>> 03da1bce66075e4e58227c9fe5b9d94a87c654b4
                case 5:
                    System.out.println(consoleColors.RED_BOLD +
                            "Exiting the system. Goodbye!" +
                            consoleColors.RESET);
                    validation.closeScanner(sc);
                    return;
            }
        }
    }
}
