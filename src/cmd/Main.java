package src.cmd;

import src.dataStore;
import src.helpers.consoleColors;
import src.helpers.validation;
import src.primaryUseCases.bookingMovies.BookingMovies;
import src.primaryUseCases.browseMovies.BrowseMovies;
import src.primaryUseCases.checkout.CheckoutMovies;
import src.primaryUseCases.manageMovies.AddMovie;
import src.primaryUseCases.manageMovies.manageMoviesPresentationLayer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        dataStore globalDataStore = new dataStore();
        Scanner sc = new Scanner(System.in);

        // ---------------- BOOKING -----------------
        BookingMovies bookingMovies = new BookingMovies(globalDataStore);

        // ---------------- BROWSING ----------------
        BrowseMovies browseMovies = new BrowseMovies(globalDataStore);

        // ---------------- CHECKOUT ----------------
        CheckoutMovies checkoutMovies = new CheckoutMovies();

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
                case 1: browseMovies.start(); break;
                case 2: bookingMovies.start(); break;
                case 3: checkoutMovies.start(); break;
                case 4: manageMovies.start(); break;
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
