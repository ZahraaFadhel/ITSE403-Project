/**
 * Booking Movies Use Case
 * Single class containing all functionality for booking, viewing, and canceling movies.
 */

package src.primaryUseCases.bookingMovies;

import java.util.List;
import java.util.Scanner;

import src.dataStore;
import src.dataStore.Movie;
import src.dataStore.Booking;
import src.helpers.consoleColors;
import src.helpers.validation;

public class BookingMovies {

    private dataStore dataStore;
    private Scanner scanner;

    public BookingMovies(dataStore ds) {
        this.dataStore = ds;
        this.scanner = new Scanner(System.in);
    }

    public BookingMovies(dataStore ds, Scanner scanner) {
        this.dataStore = ds;
        this.scanner = scanner;
    }

    // ------------------------- HELPER METHODS ---------------------------- //

    public Movie getMovieByTitle(String movieTitle) {
        if (movieTitle == null) return null;

        movieTitle = movieTitle.toLowerCase().trim();
        for (Movie m : dataStore.getMovies()) {
            if (m.getTitle().toLowerCase().equals(movieTitle)) {
                return m;
            }
        }
        return null;
    }

    public boolean validateShowtime(Movie movie, String showTime) {
        if (movie == null || showTime == null) return false;

        for (String time : movie.getShowTimes()) {
            if (time.equalsIgnoreCase(showTime)) {
                return true;
            }
        }
        return false;
    }

    // --------------------- CORE FUNCTIONS ------------------------- //

    public String bookMovie(String movieTitle, String showTime) {

        Movie movie = getMovieByTitle(movieTitle);
        if (movie == null) {
            System.out.println(consoleColors.RED_BOLD + "Movie not found!" + consoleColors.RESET);
            return "";
        }

        if (!validateShowtime(movie, showTime)) {
            System.out.println(consoleColors.RED_BOLD + "Invalid showtime!" + consoleColors.RESET);
            return "";
        }

        Booking newBooking = new Booking(movie, showTime);
        List<Booking> bookings = dataStore.getBookings();
        bookings.add(newBooking);
        dataStore.setBookings(bookings);

        System.out.println(consoleColors.GREEN_BOLD + "Booking Successful!" + consoleColors.RESET);
        return newBooking.getBookingId();
    }

    public int viewBookings() {
        List<Booking> bookings = dataStore.getBookings();

        if (bookings.isEmpty()) {
            System.out.println(consoleColors.RED_BOLD + "No Bookings Available." + consoleColors.RESET);
            return 0;
        }

        int counter = 0;
        for (Booking b : bookings) {
            System.out.println(b);
            counter++;
        }
        return counter;
    }

    public boolean cancelBooking(String bookingId) {
        List<Booking> bookings = dataStore.getBookings();

        for (Booking b : bookings) {
            if (b.getBookingId().equalsIgnoreCase(bookingId)) {
                bookings.remove(b);
                dataStore.setBookings(bookings);

                System.out.println(consoleColors.GREEN_BOLD + "Booking canceled successfully." + consoleColors.RESET);
                return true;
            }
        }

        System.out.println(consoleColors.RED_BOLD + "Booking ID Not Found." + consoleColors.RESET);
        return false;
    }

    // --------------------- PROMPTS ---------------------------- //

    public void bookMoviePrompt() {
        System.out.print("Enter movie title: ");
        String title = scanner.nextLine();

        System.out.print("Enter showtime: ");
        String showTime = scanner.nextLine();

        bookMovie(title, showTime);
    }

    public void viewBookingsPrompt() {
        viewBookings();
    }

    public void cancelBookingPrompt() {
        System.out.print("Enter booking ID to cancel: ");
        String id = scanner.nextLine();

        cancelBooking(id);
    }

    // --------------------- MENU + START ---------------------------- //

    public void displayMenu() {
        System.out.println(consoleColors.BLUE_BOLD + "\n--- Movie Booking ---" + consoleColors.RESET);
        System.out.println(consoleColors.GREEN_BOLD + "1. Book a Movie" + consoleColors.RESET);
        System.out.println(consoleColors.GREEN_BOLD + "2. View All Bookings" + consoleColors.RESET);
        System.out.println(consoleColors.GREEN_BOLD + "3. Cancel a Booking" + consoleColors.RESET);
        System.out.println(consoleColors.RED_BOLD + "4. Return to Main Menu" + consoleColors.RESET);
    }

    public void start() {
    scanner = new Scanner(System.in);

    while (true) {
        displayMenu();

        int choice = validation.getValidIntegerInput("Enter your choice: ", scanner);
        scanner.nextLine(); // clear input buffer

        if (choice < 1 || choice > 4) {
            System.out.println("Invalid choice.");
            continue;
        }

        switch (choice) {
            case 1:
                bookMoviePrompt();
                returnToMainMenu();
                return;

            case 2:
                viewBookingsPrompt();
                returnToMainMenu();
                return;

            case 3:
                cancelBookingPrompt();
                returnToMainMenu();
                return;

            case 4:
                System.out.println("Returning to main menu...");
                return;
        }
    }
}
    

    public void returnToMainMenu() {
        System.out.println(consoleColors.YELLOW_BOLD + "Go Back? (y/n)" + consoleColors.RESET);
        System.out.print("Enter your choice: ");

        char choice = scanner.next().charAt(0);
        scanner.nextLine();

        if (choice == 'y' || choice == 'Y') {
            System.out.println(consoleColors.YELLOW_BOLD + "Returning..." + consoleColors.RESET);
            return;
        } else if (choice == 'n' || choice == 'N') {
            System.out.println(consoleColors.RED_BOLD + "Exiting system..." + consoleColors.RESET);
            System.exit(0);
        } else {
            System.out.println(consoleColors.RED_BOLD + "Invalid choice." + consoleColors.RESET);
        }
    }
}

