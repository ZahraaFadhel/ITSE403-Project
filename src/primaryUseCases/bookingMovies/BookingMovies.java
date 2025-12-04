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

 

    public static boolean testMode = false; 

 

    public BookingMovies(dataStore ds) { 

        this.dataStore = ds; 

        this.scanner = new Scanner(System.in); 

    } 

 

    public BookingMovies(dataStore ds, Scanner scanner) { 

        this.dataStore = ds; 

        this.scanner = scanner; 

    } 

    // ------------------------- HELPER METHODS ---------------------------- // 

    /** 

     * Normalize text: trim spaces, unify internal spacing, lowercase. 

     */ 

    private String normalize(String text) { 

        if (text == null) return null; 

        return text.trim().replaceAll("\\s+", " ").toLowerCase(); 

    } 

    /** 

     * Returns a movie by title after normalizing both user input and stored title. 

     */ 

    public Movie getMovieByTitle(String movieTitle) { 

        if (movieTitle == null) return null; 

         // Reject if contains emoji 
         if (movieTitle.matches(".*[\\p{So}\\p{Cn}].*")) { 
    return null; 
} 
 
// Reject if title does not contain any letters 
if (!movieTitle.matches(".*[\\p{L}].*")) { 
    return null; 
} 

String normalizedInput = normalize(movieTitle) 

        .replaceAll("[^\\p{L}\\p{N}\\s]+", "");  // remove symbols only in comparison 

  

for (Movie m : dataStore.getMovies()) { 

    String normalizedTitle = normalize(m.getTitle()) 

            .replaceAll("[^\\p{L}\\p{N}\\s]+", ""); // remove symbols only in comparison 

  

    if (normalizedTitle.equals(normalizedInput)) { 

        return m; 

    } 

} 

        return null; 

    } 

    /** 

     * Validates showtime with trimming and case-insensitive match. 

     */ 

    public boolean validateShowtime(Movie movie, String showTime) { 

        if (movie == null || showTime == null) return false; 

        String userTime = showTime.trim().toLowerCase(); 

        for (String t : movie.getShowTimes()) { 

            if (t.trim().toLowerCase().equals(userTime)) { 

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

        Booking newBooking = new Booking(movie, showTime.trim()); 

        List<Booking> bookings = dataStore.getBookings(); 

        bookings.add(newBooking); 

        dataStore.setBookings(bookings); 

        System.out.println(consoleColors.GREEN_BOLD + "Booking Successful!" + consoleColors.RESET); 

        return newBooking.getBookingId(); 

    } 


    // --------------------- PROMPTS ---------------------------- // 

 

    public void bookMoviePrompt() { 

        System.out.print("Enter movie title: "); 

        String title = scanner.nextLine(); 

        System.out.print("Enter showtime: "); 

        String showTime = scanner.nextLine(); 

        bookMovie(title, showTime); 

    } 

    // --------------------- MENU & TEST MODE ---------------------------- // 

    public void displayMenu() { 

        System.out.println(consoleColors.BLUE_BOLD + "\n--- Movie Booking ---" + consoleColors.RESET); 

        System.out.println(consoleColors.GREEN_BOLD + "1. Book a Movie" + consoleColors.RESET); 

        System.out.println(consoleColors.RED_BOLD + "4. Return to Main Menu" + consoleColors.RESET); 

    } 

    public void start() { 

        if (!testMode) { 

            scanner = new Scanner(System.in); 

        } 

        while (true) { 

            displayMenu(); 

 

            int choice = validation.getValidIntegerInput("Enter your choice: ", scanner); 

            scanner.nextLine(); // clear buffer 

            if (choice < 1 || choice > 4) { 

                System.out.println("Invalid choice."); 

                if (testMode) return; 

                continue; 

            } 

            switch (choice) { 

                case 1: 

                    bookMoviePrompt(); 

                    if (testMode) return; 

                    break; 

                case 4: 

                    System.out.println("Returning to main menu..."); 

                    return; 

            } 

        } 

    } 

} 