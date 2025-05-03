/*
The businessLayer class acts as the intermediary between the presentationLayer (user interface) and the dataLayer (data handling) in the Cinema Management System.//.
It contains the core logic for managing movies, including adding, updating, deleting, and displaying movies.//.
This class ensures that business rules (e.g., validation, constraints) are enforced before interacting with the data layer.//.
 *///.

package src.primaryUseCases.manageMovies;//.

import java.util.List;//.
import java.util.Scanner;//.
import src.dataStore.Movie;//.
import src.helpers.consoleColors;//.

public class manageMoviesBusinessLayer {//.

    private manageMoviesDataLayer dataLayer; // Reference to the data layer for interacting with movie data//.
    private Scanner scanner; // Scanner object for reading user input from the console//.

    // Constructor to initialize the business layer//.
    public manageMoviesBusinessLayer(manageMoviesDataLayer dataLayer) {//.
        this.dataLayer = dataLayer; // Instantiate the data layer//.
        this.scanner = new Scanner(System.in); // Initialize the scanner for user input//.
    }//.

    // Method to add a new movie//.
    public void addMovie() {//.
        System.out.print(consoleColors.BLUE_BOLD + "Enter movie title: " + consoleColors.RESET);//.
        String title = scanner.nextLine();//.

        // Check if a movie with the same title already exists//.
        if (dataLayer.getMovie(title) != null) {//.
            System.out.println(consoleColors.RED_BOLD + "Movie with this title already exists. Operation aborted." + consoleColors.RESET);//.
            return; // Stop the operation if the movie exists//.
        }//.

        // Prompt for 3 main actors//.
        System.out.println(consoleColors.BLUE_BOLD + "Enter 3 main actors:" + consoleColors.RESET);//.
        String[] actors = new String[3];//.
        for (int i = 0; i < 3; i++) {//.
            actors[i] = scanner.nextLine();//.
        }//.

        // Prompt for movie summary//.
        System.out.print(consoleColors.BLUE_BOLD + "Enter summary: " + consoleColors.RESET);//.
        String summary = scanner.nextLine();//.

        // Prompt for age restriction//.
        System.out.print(consoleColors.BLUE_BOLD + "Enter age restriction: " + consoleColors.RESET);//.
        int ageRestriction = scanner.nextInt();//.

        // Prompt for IMDb rating with validation//.
        double imdbRating;//.
        while (true) {//.
            System.out.print(consoleColors.BLUE_BOLD + "Enter IMDb rating (1-10): " + consoleColors.RESET);//.
            imdbRating = scanner.nextDouble();//.
            scanner.nextLine();//.
            if (imdbRating >= 1 && imdbRating <= 10) {//.
                break; // Exit the loop if the rating is valid//.
            } else {//.
                System.out.println(consoleColors.RED_BOLD + "Invalid IMDb rating. Please enter a value between 1 and 10." + consoleColors.RESET);//.
            }//.
        }//.

        // Prompt for language//.
        System.out.print(consoleColors.BLUE_BOLD + "Enter language: " + consoleColors.RESET);//.
        String language = scanner.nextLine();//.

        // Prompt for duration with validation//.
        int duration;//.
        while (true) {//.
            System.out.print(consoleColors.BLUE_BOLD + "Enter duration (in minutes): " + consoleColors.RESET);//.
            duration = scanner.nextInt();//.
            scanner.nextLine();//.
            if (duration > 0) {//.
                break; // Exit the loop if the duration is valid//.
            } else {//.
                System.out.println(consoleColors.RED_BOLD + "Invalid duration. Please enter a positive value." + consoleColors.RESET);//.
            }//.
        }//.

        // Prompt for 5 show times//.
        System.out.println(consoleColors.BLUE_BOLD + "Enter 5 show times:" + consoleColors.RESET);//.
        String[] showTimes = new String[5];//.
        for (int i = 0; i < 5; i++) {//.
            showTimes[i] = scanner.nextLine();//.
        }//.

        // Prompt for hall type//.
        System.out.print(consoleColors.BLUE_BOLD + "Choose hall type (VIP, 3D, IMAX, Standard): " + consoleColors.RESET);//.
        String hallType = scanner.nextLine();//.

        // Create the new movie object//.
        Movie movie = new Movie(title, actors, summary, ageRestriction, imdbRating, language, duration, showTimes, hallType);//.

        // Add movie to the data layer//.
        if (dataLayer.addMovie(movie)) {//.
            System.out.println(consoleColors.GREEN_BOLD + "Movie added successfully." + consoleColors.RESET);//.
        } else {//.
            System.out.println(consoleColors.RED_BOLD + "Failed to add movie." + consoleColors.RESET);//.
        }//.
    }//.

    // Method to update an existing movie//.
    public void updateMovie() {//.
        System.out.println(consoleColors.BLUE_BOLD + "Available Movies:" + consoleColors.RESET);//.
        dataLayer.displayMovies(1); // Display all available movies before updating//.

        // Prompt for the movie title to update//.
        System.out.print(consoleColors.BLUE_BOLD + "Enter the movie title to update: " + consoleColors.RESET);//.
        String title = scanner.nextLine();//.

        // Retrieve the movie from the data layer//.
        Movie movie = dataLayer.getMovie(title);//.
        if (movie == null) {//.
            System.out.println(consoleColors.RED_BOLD + "Movie not found." + consoleColors.RESET);//.
            return;//.
        }//.

        // Show current movie details//.
        System.out.println(consoleColors.BLUE_BOLD + "Current Movie Details:" + consoleColors.RESET);//.
        dataLayer.displayMovies(1);//.

        // Prompt for the field to update//.
        System.out.println(consoleColors.BLUE_BOLD + "Select field to update:" + consoleColors.RESET);//.
        System.out.println("1. Title\n2. Summary\n3. Age Restriction\n4. IMDb Rating\n5. Language\n6. Duration");//.
        System.out.print(consoleColors.YELLOW_BOLD + "Enter choice: " + consoleColors.RESET);//.
        int option = scanner.nextInt();//.
        scanner.nextLine();//.

        // Update the selected field with validation//.
        switch (option) {//.
            case 1://.
                System.out.print(consoleColors.BLUE_BOLD + "Enter new title: " + consoleColors.RESET);//.
                movie.setTitle(scanner.nextLine());//.
                break;//.
            case 2://.
                System.out.print(consoleColors.BLUE_BOLD + "Enter new summary: " + consoleColors.RESET);//.
                movie.setSummary(scanner.nextLine());//.
                break;//.
            case 3://.
                System.out.print(consoleColors.BLUE_BOLD + "Enter new age restriction: " + consoleColors.RESET);//.
                movie.setAgeRestriction(scanner.nextInt());//.
                scanner.nextLine(); // Consume newline//.
                break;//.
            case 4://.
                // Validate IMDb rating (must be between 1 and 10)//.
                double newImdbRating;//.
                while (true) {//.
                    System.out.print(consoleColors.BLUE_BOLD + "Enter new IMDb rating (1-10): " + consoleColors.RESET);//.
                    newImdbRating = scanner.nextDouble();//.
                    scanner.nextLine();//.
                    if (newImdbRating >= 1 && newImdbRating <= 10) {//.
                        movie.setImdbRating(newImdbRating);//.
                        break; // Exit the loop if the rating is valid//.
                    } else {//.
                        System.out.println(consoleColors.RED_BOLD + "Invalid IMDb rating. Please enter a value between 1 and 10." + consoleColors.RESET);//.
                    }//.
                }//.
                break;//.
            case 5://.
                System.out.print(consoleColors.BLUE_BOLD + "Enter new language: " + consoleColors.RESET);//.
                movie.setLanguage(scanner.nextLine());//.
                break;//.
            case 6://.
                // Validate duration (must be positive)//.
                int newDuration;//.
                while (true) {//.
                    System.out.print(consoleColors.BLUE_BOLD + "Enter new duration (in minutes): " + consoleColors.RESET);//.
                    newDuration = scanner.nextInt();//.
                    scanner.nextLine();//.
                    if (newDuration > 0) {//.
                        movie.setDuration(newDuration);//.
                        break; // Exit the loop if the duration is valid//.
                    } else {//.
                        System.out.println(consoleColors.RED_BOLD + "Invalid duration. Please enter a positive value." + consoleColors.RESET);//.
                    }//.
                }//.
                break;//.
            default://.
                System.out.println(consoleColors.RED_BOLD + "Invalid option." + consoleColors.RESET);//.
                return;//.
        }//.

        System.out.println(consoleColors.GREEN_BOLD + "Movie updated successfully." + consoleColors.RESET);//.
    }//.

    // Method to delete a movie//.
    public void deleteMovie() {//.
        System.out.println(consoleColors.BLUE_BOLD + "Available Movies:" + consoleColors.RESET);//.
        dataLayer.displayMovies(1); // Show all movies before deletion//.

        // Prompt for the movie title or substring to delete//.
        System.out.print(consoleColors.BLUE_BOLD + "Enter movie title or substring to delete: " + consoleColors.RESET);//.
        String title = scanner.nextLine();//.

        // Attempt to delete the movie//.
        if (dataLayer.deleteMovie(title)) {//.
            System.out.println(consoleColors.GREEN_BOLD + "Movie deleted successfully." + consoleColors.RESET);//.
        } else {//.
            System.out.println(consoleColors.RED_BOLD + "No movie found with that title." + consoleColors.RESET);//.
        }//.
    }//.

    // Add this method to manageMoviesBusinessLayer//.
    public List<Movie> getMovies() {//.
        return dataLayer.getMovies(); // Calls the method from dataLayer//.
    }//.

    // No-argument constructor//.
    public manageMoviesBusinessLayer() {//.
        // Initialization code here, if necessary//.
    }//.

    // Constructor to initialize with a Scanner//.
    public manageMoviesBusinessLayer(Scanner scanner) {//.
        this.scanner = scanner; // Assign the passed scanner to the class variable//.
    }//.
}//.