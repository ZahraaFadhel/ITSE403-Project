/* 
* This class acts as a data manager for a cinema booking system.
It stores information about available movies, bookings, cinema halls, and discount codes.
The class provides methods to add and retrieve data related to these entities, ensuring
the smooth functioning of the booking system.
*/

package src;

import java.util.ArrayList;
import java.util.List;
import src.helpers.consoleColors;

public class dataStore {

    private static List<Movie> movies; // List to store all movies
    private static List<Booking> bookings; // List to store all bookings
    private static List<HallType> halls; // List to store all hall types
    private static List<ValidDiscountCode> validDiscountCodes; // List to store valid discount codes
    private static SavedPaymentMethod savedPaymentMethod; // Single saved payment method

    // The constructor initializes the lists and adds sample data
    public dataStore() {
        movies = new ArrayList<>();
        bookings = new ArrayList<>();
        halls = new ArrayList<>();
        validDiscountCodes = new ArrayList<>();

        // Initialize the saved payment method
        savedPaymentMethod = new SavedPaymentMethod("MasterCard", "Manar Alshaikh", "8765 4321 8765 4321", "09/26", "456");

        // Adding 5 sample movies for demonstration
        movies.add(new Movie("Inception", new String[]{"Leonardo DiCaprio", "Joseph Gordon-Levitt", "Ellen Page"},
                "A thief who enters the dreams of others.", 13, 8.8, "English", 148,
                new String[]{"10:00 AM", "1:00 PM", "4:00 PM", "7:00 PM", "10:00 PM"}, "IMAX"));

        movies.add(new Movie("The Godfather", new String[]{"Marlon Brando", "Al Pacino", "James Caan"},
                "The rise of a mafia family.", 18, 10, "English", 175,
                new String[]{"12:00 PM", "3:00 PM", "6:00 PM", "9:00 PM", "11:00 AM"}, "Standard"));

        movies.add(new Movie("Amélie", new String[]{"Audrey Tautou", "Mathieu Kassovitz"},
                "A whimsical tale of a Parisian woman.", 13, 5.3, "French", 122,
                new String[]{"12:00 PM", "5:00 PM", "8:00 PM"}, "Standard"));

        movies.add(new Movie("Bab Alharra", new String[]{"Ahmed Al-Fahad", "Sara Al-Mansoor"},
                "Life in a Damascus neighborhood in the 1920s and 1930s", 16, 2.5, "Arabic", 132,
                new String[]{"4:00 PM", "6:00 PM", "9:00 PM"}, "VIP"));

        movies.add(new Movie("The Dark Knight", new String[]{"Christian Bale", "Heath Ledger"},
                "Batman fights the Joker.", 13, 9.0, "English", 152,
                new String[]{"11:00 AM", "2:00 PM", "5:00 PM", "8:00 PM"}, "IMAX"));

        halls.add(new HallType("3D", 6.0));
        halls.add(new HallType("VIP", 7.0));
        halls.add(new HallType("IMAX", 7.0));
        halls.add(new HallType("Standard", 3.5));

        // Adding 4 sample bookings
        bookings.add(new Booking(movies.get(0), "1:00 PM"));
        bookings.add(new Booking(movies.get(1), "11:00 AM"));
        bookings.add(new Booking(movies.get(2), "12:00 PM"));
        bookings.add(new Booking(movies.get(3), "4:00 PM"));

        // Adding 3 sample valid discount codes        
        validDiscountCodes.add(new ValidDiscountCode("NEWYEAR25", 25, "Celebrate 2025 with 25% off on all tickets!"));
        validDiscountCodes.add(new ValidDiscountCode("EIDMUBARAK15", 15, "Enjoy Eid with a special 15% discount!"));
        validDiscountCodes.add(new ValidDiscountCode("BAHRAINSPIRIT30", 30, "Celebrate Bahrain's heritage with 30% off!"));
    }

    // Getters and setters for movies
    public static List<Movie> getMovies() {
        return movies;
    }

    // Method to set the list of movies
    public static void setMovies(List<Movie> m) {
        movies = m;
    }

    // Getters and setters for bookings
    public static List<Booking> getBookings() {
        return bookings;
    }

    public static void setBookings(List<Booking> b) {
        bookings = b;
    }

    // Getters and setters for discount codes
    public static List<ValidDiscountCode> getValidDiscountCodes() {
        return validDiscountCodes;
    }

    public static void setValidDiscountCodes(List<ValidDiscountCode> d) {
        validDiscountCodes = d;
    }

    // Getter for saved payment method (only one allowed)
    public static SavedPaymentMethod getSavedPaymentMethod() {
        return savedPaymentMethod;
    }

    // Method to update the saved payment method
    public static void updatePaymentMethod(SavedPaymentMethod updatedPaymentMethod) {
        savedPaymentMethod = updatedPaymentMethod; // Update the saved payment method
        System.out.println(consoleColors.GREEN_BOLD + "Payment method updated successfully!" + consoleColors.RESET);
    }

    public static class Movie {

        private String title, summary, language, hallType;
        private String[] actors, showTimes;
        private int ageRestriction, duration;
        private double imdbRating;

        // Constructor to initialize a movie object
        public Movie(String title, String[] actors, String summary, int ageRestriction, double imdbRating,
                String language, int duration, String[] showTimes, String hallType) {
            this.title = title;
            this.actors = actors;
            this.summary = summary;
            this.ageRestriction = ageRestriction;
            this.imdbRating = imdbRating;
            this.language = language;
            this.duration = duration;
            this.showTimes = showTimes;
            this.hallType = hallType;
        }

        // Getters and setters for movie attributes
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public int getAgeRestriction() {
            return ageRestriction;
        }

        public void setAgeRestriction(int ageRestriction) {
            this.ageRestriction = ageRestriction;
        }

        public double getImdbRating() {
            return imdbRating;
        }

        public void setImdbRating(double imdbRating) {
            this.imdbRating = imdbRating;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public String[] getShowTimes() {
            return showTimes;
        }

        public String getHallType() {
            return hallType;
        }

        // Override toString() to display movie details
        @Override
        public String toString() {
            return (consoleColors.GREEN_BOLD + "Title: " + consoleColors.RESET + title
                    + consoleColors.BLUE_BOLD + ", Language: " + consoleColors.RESET + language
                    + consoleColors.BLUE_BOLD + ", IMDb: " + consoleColors.RESET + imdbRating)
                    + consoleColors.BLUE_BOLD + ", Showtimes: " + consoleColors.RESET + String.join(", ", showTimes);
        }
    }

    public static class Booking {

        private String bookingId;
        private Movie movie;
        private String hallType;
        private String showTime;
        private double price; // Price is now initialized in the constructor
    
        // Static variable to generate a unique booking ID
        private static int idCounter = 1;  // Starts with "B001", increments with each new booking
    
        // Constructor to initialize a booking object 
        public Booking(Movie movie, String showTime) {
            this.bookingId = generateBookingId();  // Automatically generate the ID
            this.movie = movie;
            this.hallType = movie.getHallType();
            this.showTime = showTime;
    
            // Calculate and set the price based on the hall type
            for (HallType h : halls) {
                if (movie.getHallType().equalsIgnoreCase(h.hallName)) {
                    this.price = h.price;
                    break; // Exit the loop once the correct hall type is found
                }
            }
        }
    
        // Method to generate booking IDs ("B001", "B002", "B003", etc.)
        private String generateBookingId() {
            return "B" + String.format("%03d", idCounter++);  // Increment the counter and return the formatted ID
        }
    
        // Getter for bookingId
        public String getBookingId() {
            return bookingId;
        }
    
        // Getter for movie title
        public String getMovieTitle() {
            return movie.getTitle();
        }
    
        // Override toString() to display booking details
        @Override
        public String toString() {
            return (consoleColors.GREEN_BOLD + "Booking ID: " + consoleColors.RESET + bookingId
                    + consoleColors.BLUE_BOLD + ", Movie Title: " + consoleColors.RESET + movie.getTitle()
                    + consoleColors.BLUE_BOLD + ", Show time: " + consoleColors.RESET + showTime
                    + consoleColors.BLUE_BOLD + ", Hall Type: " + consoleColors.RESET + movie.hallType
                    + consoleColors.BLUE_BOLD + ", Hall Seat Price: " + consoleColors.RESET + price);
        }

        // Getter for booking price
        public double getBookingPrice() {
            return price;
        }

    }

    // Inner class representing different hall types in the cinema
    public static class HallType {

        public String hallName;
        private double price;

        // Constructor to initialize hall details
        public HallType(String hallName, double price) {
            this.hallName = hallName;
            this.price = price;
        }

        // Method to display hall details
        public void displayHallDetails() {
            System.out.println("Hall Type: " + hallName);
            System.out.println("Hall Price: " + price);
            System.out.println("--------------------------------------");
        }

        public String getHallName() {
            return hallName;
        }
    }

    // Getter method to retrieve the list of halls
    public static List<HallType> getHalls() {
        return halls;
    }

    // Method to display all hall details
    public static void displayAllHalls() {
        for (HallType hall : halls) {
            hall.displayHallDetails();
        }
    }

    // Inner class for ValidDiscountCode
    public static class ValidDiscountCode {

        private String code;
        private int percentage;
        private String description;

        // Constructor
        public ValidDiscountCode(String code, int percentage, String description) {
            this.code = code;
            this.percentage = percentage;
            this.description = description;
        }

        // Getters and setters
        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public int getPercentage() {
            return percentage;
        }

        public void setPercentage(int percentage) {
            this.percentage = percentage;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        // Override toString() to display discount code details
        @Override
        public String toString() {
            return (consoleColors.GREEN_BOLD + "Code: " + consoleColors.RESET + code
                    + consoleColors.BLUE_BOLD + ", Discount: " + consoleColors.RESET + percentage + "%"
                    + consoleColors.BLUE_BOLD + ", Description: " + consoleColors.RESET + description);
        }
    }

    // Inner class for SavedPaymentMethod
    public static class SavedPaymentMethod {

        private String cardType;
        private String cardholderName;
        private String cardNumber;
        private String expiryDate;
        private String cvv;

        // Constructor
        public SavedPaymentMethod(String cardType, String cardholderName, String cardNumber, String expiryDate, String cvv) {
            this.cardType = cardType;
            this.cardholderName = cardholderName;
            this.cardNumber = cardNumber;
            this.expiryDate = expiryDate;
            this.cvv = cvv;
        }

        // Getter and setter methods
        public String getCardType() {
            return cardType;
        }

        public void setCardType(String cardType) {
            this.cardType = cardType;
        }

        public String getCardholderName() {
            return cardholderName;
        }

        public void setCardholderName(String cardholderName) {
            this.cardholderName = cardholderName;
        }

        public String getCardNumber() {
            return cardNumber;
        }

        public void setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
        }

        public String getExpiryDate() {
            return expiryDate;
        }

        public void setExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
        }

        public String getCvv() {
            return cvv;
        }

        public void setCvv(String cvv) {
            this.cvv = cvv;
        }

        // Override toString() to display payment details
        @Override
        public String toString() {
            return (consoleColors.GREEN_BOLD + "Card Type: " + consoleColors.RESET + cardType
                    + consoleColors.GREEN_BOLD + ", Cardholder Name: " + consoleColors.RESET + cardholderName
                    + consoleColors.GREEN_BOLD + ", Card Number: " + consoleColors.RESET + cardNumber
                    + consoleColors.GREEN_BOLD + ", Expiry Date: " + consoleColors.RESET + expiryDate);
        }
    }

    // Method to display the saved payment method
    public static void displayPaymentMethod() {
        if (savedPaymentMethod != null) {
            System.out.println("Saved Payment Method: ");
            System.out.println(savedPaymentMethod.toString());
        } else {
            System.out.println(consoleColors.RED_BOLD + "No payment method saved." + consoleColors.RESET);
        }
    }

    // Method to clear all bookings
    public static void clearAllBookings() {
        bookings.clear(); // Remove all objects from the list
    }
}
