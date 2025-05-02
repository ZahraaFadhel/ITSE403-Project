/*
* The businessLayer class acts as the intermediary between the presentationLayer and the dataLayer in the Cinema Management System.
* It contains the core logic for booking movies, including booking a movie, view bookings and cancel a booking.
* This class ensures that business rules (e.g., validation, constraints) are enforced before interacting with the data layer.
*/

package src.primaryUseCases.bookingMovies;
import java.util.List;
import java.util.Scanner;
import src.dataStore;
import src.dataStore.Movie;
import src.helpers.consoleColors;

public class bookingBusinessLayer {

    private bookingDataLayer dataLayer;
    

    // Constructor 
    public bookingBusinessLayer(bookingDataLayer dataLayer) {
        this.dataLayer = dataLayer;  // Instance of the BookingdataLayer
    }

    // Book a movie
    public String bookMovie(Scanner sc) {
        System.out.print("Enter the movie title to book: ");
        String movieTitle = sc.nextLine().toLowerCase().trim();
        List<Movie> movies = dataStore.getMovies();
        Movie selectedMovie = null;

        for (Movie m : movies) {
            if (m.getTitle().equalsIgnoreCase(movieTitle)) {  
                selectedMovie = m;
                break;  // Exit loop 
            }
        }
        if (selectedMovie == null) {
            System.out.println("Invalid movie title.");
            return "";
        }
        System.out.print("Enter the showtime: ");
        String showTime = sc.nextLine();

        // Does the selected showtime exist?
        boolean validShowtime = false;
        for (String time : selectedMovie.getShowTimes()) {
            if (time.equalsIgnoreCase(showTime)) {
                validShowtime = true;
                break;
            }
        }

        if (!validShowtime) {
            System.out.println(consoleColors.RED_BOLD + "Invalid showtime selected! " + consoleColors.RESET);
            return "";
        }

        // Check if a valid hall type was found 
        // before booking
        return dataLayer.bookMovie(selectedMovie, showTime);
    }

    // View all bookings
    public int viewBookings() {
        System.out.println("Here are the current bookings: ");
        return dataLayer.viewBookings();
    }

    // Cancel a booking by booking ID
    public void cancelBooking(Scanner sc) {
        System.out.print("Enter the booking ID to cancel: ");
        String bookingId = sc.nextLine();
        dataLayer.cancelBooking(bookingId);  //call data layer
    }
}
