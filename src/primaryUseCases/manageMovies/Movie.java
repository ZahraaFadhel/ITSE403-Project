/*
The dataLayer class is responsible for managing the data of movies in the Cinema Management System.
It stores a list of Movie objects and provides methods to add, retrieve, delete, and display movies.
The class ensures data integrity by validating movie attributes (e.g., IMDb rating and duration) before adding them to the list.
It also provides functionality to filter and display movies based on specific criteria, such as language.
*/ 

package src.primaryUseCases.manageMovies; 

import java.util.Arrays;

public class Movie { 

    private String title;
    private String[] actors;
    private String summary;
    private int ageRestriction;
    private double imdbRating;
    private String language;
    private int duration;
    private String[] showTimes;
    private String hallType;

    public Movie(String title, String[] actors, String summary, int ageRestriction,
                 double imdbRating, String language, int duration, String[] showTimes,
                 String hallType) {
        this.title = title;
        this.actors = Arrays.copyOf(actors, actors.length);
        this.summary = summary;
        this.ageRestriction = ageRestriction;
        this.imdbRating = imdbRating;
        this.language = language;
        this.duration = duration;
        this.showTimes = Arrays.copyOf(showTimes, showTimes.length);
        this.hallType = hallType;
    }

    // Getters
    public String getTitle() { return title; }
    public String[] getActors() { return Arrays.copyOf(actors, actors.length); }
    public String getSummary() { return summary; }
    public int getAgeRestriction() { return ageRestriction; }
    public double getImdbRating() { return imdbRating; }
    public String getLanguage() { return language; }
    public int getDuration() { return duration; }
    public String[] getShowTimes() { return Arrays.copyOf(showTimes, showTimes.length); }
    public String getHallType() { return hallType; }

    @Override
    public String toString() {
        return "Movie: " + title +
                "\nActors: " + String.join(", ", actors) +
                "\nSummary: " + summary +
                "\nAge Restriction: " + ageRestriction + "+" +
                "\nIMDb Rating: " + imdbRating + "/10" +
                "\nLanguage: " + language +
                "\nDuration: " + duration + " minutes" +
                "\nHall Type: " + hallType +
                "\nShow Times: " + String.join(", ", showTimes);
    }
} 
