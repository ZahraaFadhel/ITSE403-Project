/*
The dataLayer class is responsible for managing the data of movies in the Cinema Management System.
It stores a list of Movie objects and provides methods to add, retrieve, delete, and display movies.
The class ensures data integrity by validating movie attributes (e.g., IMDb rating and duration) before adding them to the list.
It also provides functionality to filter and display movies based on specific criteria, such as language.
*/ 

package src.primaryUseCases.manageMovies; 

import java.util.List; 
import src.dataStore; 
import src.dataStore.Movie; 
import src.helpers.consoleColors; 

public class manageMoviesDataLayer { 

    private dataStore dataStore; 

    // Constructor to initialize the data layer with sample movies 
    public manageMoviesDataLayer(dataStore dataStore) { 
        this.dataStore = dataStore; 
    } 

    // Method to retrieve all movies 
    public List<Movie> getMovies() { 
        return src.dataStore.getMovies(); // Return the list of movies from dataStore 
    } 

    // Method to add a movie to the list 
    public boolean addMovie(Movie movie) { 
        // Validate IMDb rating and duration before adding the movie 
        if (movie.getImdbRating() < 1 || movie.getImdbRating() > 10) { 
            System.out.println(consoleColors.RED_BOLD + "Invalid IMDb rating. Must be between 1 and 10." + consoleColors.RESET); 
            return false; 
        } 
        if (movie.getDuration() <= 0) { 
            System.out.println(consoleColors.RED_BOLD + "Invalid duration. Must be a positive value." + consoleColors.RESET); 
            return false; 
        } 

        // Check if a movie with the same title already exists 
        for (Movie m : getMovies()) { 
            if (m.getTitle().equalsIgnoreCase(movie.getTitle())) { 
                System.out.println(consoleColors.RED_BOLD + "Movie with this title already exists." + consoleColors.RESET); 
                return false; // Movie already exists 
            } 
        } 

        // Add the movie to the list 
        getMovies().add(movie); 
        return true; 
    } 

    // Method to retrieve a movie by title 
    public Movie getMovie(String title) { 
        for (Movie movie : getMovies()) { 
            if (movie.getTitle().equalsIgnoreCase(title)) { 
                return movie; // Return the movie if found 
            } 
        } 
        return null; // Movie not found 
    } 

    // Method to delete a movie by title or substring 
    public boolean deleteMovie(String title) { 
        // Remove movies whose titles contain the given substring (case-insensitive) 
        return getMovies().removeIf(movie -> movie.getTitle().toLowerCase().contains(title.toLowerCase())); 
    } 

    // Method to display all movies or filter by language 
    public void displayMovies(int option) { 
        if (getMovies().isEmpty()) { 
            System.out.println(consoleColors.RED_BOLD + "No movies available." + consoleColors.RESET); 
            return; 
        } 

        // Display all movies 
        for (Movie movie : getMovies()) { 
            System.out.println(movie); 
        } 
        System.out.println(); 
    } 
} 