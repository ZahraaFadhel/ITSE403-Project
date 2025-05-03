/**
 * This class represents the data layer for browsing movies in the system.
 * It interacts with the dataStore to retrieve and search for movies based on criteria: title, language and rating.
 */

 package src.primaryUseCases.browseMovies;

 import java.util.List;
 import src.dataStore;
 import src.dataStore.Movie;
 import src.helpers.consoleColors;
 
 public class browseMoviesDataLayer {
 
     private dataStore dataStore;
 
     // Constructor to initialize with the existing dataLayer
     public browseMoviesDataLayer(dataStore ds) {
         this.dataStore = ds;
     }
 
     // Retrieve all movies from dataStore
     public List<Movie> movies() {
         return dataStore.getMovies();
     }
 
     // Method to browse all movies
     public int browseMovies() {
         int counter = 0;
         if (movies().isEmpty()) {
             System.out.println(consoleColors.RED_BOLD + "No movies available." + consoleColors.RESET);
             return 0;
         }
 
         // Display all movies
         for (Movie movie : movies()) {
             System.out.println(movie);
             counter++;
         }
         System.out.println();
         return counter;
     }
 
     // Method to search movies by title
     public void searchMoviesByTitle(String title) {
         if (movies().isEmpty()) {
             System.out.println(consoleColors.RED_BOLD + "No movies available." + consoleColors.RESET);
             return;
         }
 
         boolean found = false;
 
         // Display movies contaning entred input
         for (Movie movie : movies()) {
             if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                 System.out.println(movie);
                 found = true;
             }
         }
         if (!found) {
             System.out.println(consoleColors.RED_BOLD + "No movies found with the title: " + title + consoleColors.RESET);
         }
     }
 
     // Method to search movies by language
     public void searchMoviesByLanguage(String language) {
         if (movies().isEmpty()) {
             System.out.println(consoleColors.RED_BOLD + "No movies available." + consoleColors.RESET);
             return;
         }
 
         // Display movies with matching language
         for (Movie movie : movies()) {
             if (movie.getLanguage().toLowerCase().contains(language.toLowerCase())) {
                 System.out.println(movie);
             }
         }
         System.out.println();
     }
 
     // Method to search movies by IMDb rating range
     public void searchMoviesByRating(double minRating, double maxRating) {
         if (movies().isEmpty()) {
             System.out.println(consoleColors.RED_BOLD + "No movies available." + consoleColors.RESET);
             return;
         }
 
         // Display movies within the rating range
         for (Movie movie : movies()) {
             if (movie.getImdbRating() >= minRating && movie.getImdbRating() <= maxRating) {
                 System.out.println(movie);
             }
         }
         System.out.println();
     }
 
 }
 