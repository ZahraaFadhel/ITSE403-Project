/**
 * Browse Movies Use Case
 * Single class containing all functionality for browsing and searching movies.
 */

package src.primaryUseCases.browseMovies;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import src.dataStore;
import src.dataStore.Movie;
import src.helpers.consoleColors;
import src.helpers.validation;

public class BrowseMovies {

    private dataStore dataStore;
    private Scanner scanner;

    public BrowseMovies(dataStore ds) {
        this.dataStore = ds;
        this.scanner = new Scanner(System.in);
    }

    public BrowseMovies(dataStore ds, Scanner scanner) {
        this.dataStore = ds;
        this.scanner = scanner;
    }

    public List<Movie> getMovies() {
        return dataStore.getMovies();
    }

    public int browseMovies() {
        List<Movie> movies = dataStore.getMovies();

        if (movies == null || movies.isEmpty()) {
            System.out.println("No movies available.");
            return 0;
        }

        int counter = 0;
        if (movies.isEmpty()) {
            System.out.println(consoleColors.RED_BOLD + "No movies available." + consoleColors.RESET);
            return 0;
        }

        for (Movie movie : getMovies()) {
            System.out.println(movie);
            counter++;
        }
        System.out.println();
        return counter;
    }

    public List<Movie> searchMoviesByTitle(String title) {
        title = title.toLowerCase().trim();
        title = title.replaceAll("\\s+", " "); // convert multiple spaces to single space
        if (title.isEmpty()) {
            System.out.println(consoleColors.RED_BOLD + "Search title cannot be empty." + consoleColors.RESET);
            return new java.util.ArrayList<>();
        }

        List<Movie> results = new java.util.ArrayList<>();
        if (getMovies().isEmpty()) {
            System.out.println(consoleColors.RED_BOLD + "No movies available." + consoleColors.RESET);
            return results;
        }

        for (Movie movie : getMovies()) {
            if (movie.getTitle().toLowerCase().contains(title)) {
                System.out.println(movie);
                results.add(movie);
            }
        }
        if (results.isEmpty()) {
            System.out
                    .println(consoleColors.RED_BOLD + "No movies found with the title: " + title + consoleColors.RESET);
        }
        return results;
    }

    public List<Movie> searchMoviesByLanguage(String language) {
        language = language.toLowerCase().trim();

        if (language.isEmpty()) {
            System.out.println(consoleColors.RED_BOLD + "Search language cannot be empty." + consoleColors.RESET);
            return new java.util.ArrayList<>();
        }

        // Check for numbers or special characters
        if (!language.matches("[a-zA-Z\\s]+")) {
            throw new IllegalArgumentException("Language cannot contain numbers or special characters");
        }

        List<Movie> results = new java.util.ArrayList<>();
        if (getMovies().isEmpty()) {
            System.out.println(consoleColors.RED_BOLD + "No movies available." + consoleColors.RESET);
            return results;
        }

        for (Movie movie : getMovies()) {
            if (movie.getLanguage().toLowerCase().contains(language)) {
                System.out.println(movie);
                results.add(movie);
            }
        }
        System.out.println();
        return results;
    }

    public List<Movie> searchMoviesByRating(String minInput, String maxInput) {
        double minRating = Double.parseDouble(minInput);
        double maxRating = Double.parseDouble(maxInput);

        if (minRating < 0 || maxRating > 10 || minRating > maxRating || Double.isNaN(minRating)
                || Double.isNaN(maxRating)) {
            System.out.println(consoleColors.RED_BOLD + "Invalid rating range. Please enter ratings between 0 and 10."
                    + consoleColors.RESET);
            throw new IllegalArgumentException("Invalid rating range");
        }
        List<Movie> results = new java.util.ArrayList<>();
        if (getMovies().isEmpty()) {
            System.out.println(consoleColors.RED_BOLD + "No movies available." + consoleColors.RESET);
            return results;
        }

        for (Movie movie : getMovies()) {
            if (movie.getImdbRating() >= minRating && movie.getImdbRating() <= maxRating) {
                System.out.println(movie);
                results.add(movie);
            }
        }
        System.out.println();
        return results;
    }

    public int displayMovies() {
        System.out.println("Here are the movies available:");
        return browseMovies();
    }

    public void searchMoviesByTitlePrompt() {
        System.out.print("Enter the title to search for: ");
        String title = scanner.nextLine();
        searchMoviesByTitle(title);
    }

    public void searchMoviesByLanguagePrompt() {
        System.out.print("Enter the language to search for: ");
        String language = scanner.nextLine();
        searchMoviesByLanguage(language);
    }

    public void searchMoviesByRatingPrompt() {
        try {
            System.out.print("Enter the minimum IMDb rating: ");
            String minInput = scanner.nextLine().trim();

            System.out.print("Enter the maximum IMDb rating: ");
            String maxInput = scanner.nextLine().trim();

            searchMoviesByRating(maxInput, maxInput);

        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println(consoleColors.RED_BOLD +
                    "Invalid input." +
                    consoleColors.RESET);
        }
    }

    public void displayMenu() {
        System.out.println(consoleColors.BLUE_BOLD + "\n--- Browse & Search Movies ---" + consoleColors.RESET);
        System.out.println(consoleColors.GREEN_BOLD + "1. Browse Movies" + consoleColors.RESET);
        System.out.println(consoleColors.GREEN_BOLD + "2. Search Movie by title" + consoleColors.RESET);
        System.out.println(consoleColors.GREEN_BOLD + "3. Search Movie by language" + consoleColors.RESET);
        System.out.println(consoleColors.GREEN_BOLD + "4. Search Movie by rating" + consoleColors.RESET);
        System.out.println(consoleColors.RED_BOLD + "5. Return to Main Menu" + consoleColors.RESET);
        System.out.println();
    }

    public void start() {
        scanner = new Scanner(System.in);
        while (true) {
            displayMenu();

            int choice = validation.getValidIntegerInput("Enter your choice: ", scanner);
            scanner.nextLine();

            if (choice > 5 || choice < 1) {
                System.out.print(
                        consoleColors.RED_BOLD + "Invalid input. Please enter a valid number.\n" + consoleColors.RESET);
                continue;
            }

            switch (choice) {
                case 1:
                    displayMovies();
                    returnToMainMenu();
                    return;
                case 2:
                    searchMoviesByTitlePrompt();
                    returnToMainMenu();
                    return;
                case 3:
                    searchMoviesByLanguagePrompt();
                    returnToMainMenu();
                    return;
                case 4:
                    searchMoviesByRatingPrompt();
                    returnToMainMenu();
                    return;
                case 5:
                    System.out
                            .println(consoleColors.YELLOW_BOLD + "\nReturning to main menu >>>" + consoleColors.RESET);
                    return;
                default:
                    System.out.println(
                            consoleColors.RED_BOLD + "Invalid choice. Please try again." + consoleColors.RESET);
            }
        }
    }

    public void returnToMainMenu() {
        System.out.println(consoleColors.YELLOW_BOLD + "Go Back? (y/n)" + consoleColors.RESET);
        System.out.print(consoleColors.YELLOW_BOLD + "Enter your choice: " + consoleColors.RESET);

        if (scanner.hasNext()) {
            int choice = scanner.next().charAt(0);
            scanner.nextLine();

            if (choice == 'y' || choice == 'Y') {
                System.out
                        .println(consoleColors.YELLOW_BOLD + "\nReturning to browsing menu >>>" + consoleColors.RESET);
                return;
            } else if (choice == 'n' || choice == 'N') {
                System.out.println(consoleColors.RED_BOLD + "Exiting the system. Goodbye!" + consoleColors.RESET);
                validation.closeScanner(scanner);
                System.exit(0);
            } else {
                System.out.println(
                        consoleColors.RED_BOLD + "Invalid choice. Returning to main menu." + consoleColors.RESET);
                return;
            }
        }
    }
}