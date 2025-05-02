/**
 * This class serves as the data layer for handling movie bookings.
 * It interacts with the dataStore to retrieve available movies and 
 * manage booking operations such as creating, viewing, and canceling bookings.
 */

package src.primaryUseCases.bookingMovies;

import java.util.List;
import src.dataStore;
import src.dataStore.Booking;
import src.dataStore.Movie;
import src.helpers.consoleColors;

public class bookingDataLayer {

    private dataStore dataStore;
    private static List<Booking> bookings; // List to store bookings

    // Constructor to initialize with the existing dataStore
    public bookingDataLayer(dataStore ds) {
        this.dataStore = ds;
        bookings = dataStore.getBookings();
    }

    // Retrieve all movies from dataStore
    public List<Movie> movies() {
        return dataStore.getMovies();
    }

    // Retrieve all bookings from dataStore
    public List<Booking> bookings() {
        return dataStore.getBookings();
    }

    // Method to book a movie
    public String bookMovie(Movie movie, String showTime) {

        if (movie == null) {
            System.out.println(consoleColors.RED_BOLD + "Movie not found: " + movie.getTitle() + consoleColors.RESET);
            return "";
        }

        // Generate a booking ID (e.g., "B001")
        // Create a new booking
        Booking newBooking = new Booking(movie, showTime);// Create a new booking
        bookings.add(newBooking);
        dataStore.setBookings(bookings);

        System.out.println(consoleColors.GREEN_BOLD + "Booking successful!" + consoleColors.RESET);
        System.out.println(consoleColors.BLUE_BOLD + "Movie: " + consoleColors.RESET + movie.getTitle());
        System.out.println(consoleColors.BLUE_BOLD + "Showtime: " + consoleColors.RESET + showTime);
        System.out.println(consoleColors.BLUE_BOLD + "Hall Type:: " + consoleColors.RESET + movie.getHallType());
        return newBooking.getBookingId();
    }

    // Method to view all bookings
    public int viewBookings() {
        int counter = 0;
        if (bookings.isEmpty()) {
            System.out.println(consoleColors.RED_BOLD + "No bookings available." + consoleColors.RESET);
            return 0;
        }

        for (Booking booking : bookings) {
            System.out.println(booking);
            counter++;
        }
        return counter;
    }

    // Method to cancel a booking
    public void cancelBooking(String bookingId) {
        boolean found = false;

        for (Booking booking : bookings) {
            if (booking.getBookingId().equalsIgnoreCase(bookingId)) {
                bookings.remove(booking);
                dataStore.setBookings(bookings);
                System.out.println(consoleColors.GREEN_BOLD + "Booking canceled successfully." + consoleColors.RESET);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(consoleColors.RED_BOLD + "Booking ID not found: " + bookingId + consoleColors.RESET);
        }
    }
}
