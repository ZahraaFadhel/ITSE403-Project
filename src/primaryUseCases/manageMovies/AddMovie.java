package src.primaryUseCases.manageMovies;

import src.helpers.consoleColors;
import java.util.*;

public class AddMovie {

    private Scanner scanner;
    private List<Movie> movies = new ArrayList<>();
    private Set<String> movieTitles = new HashSet<>();

    private static final int ACTOR_COUNT = 3;
    private static final int SHOWTIME_COUNT = 5;

    private static final Set<String> VALID_HALL_TYPES =
            Set.of("VIP", "3D", "IMAX", "STANDARD");

    private static final String LETTERS_ONLY_REGEX = "^[A-Za-z ]+$";
    private static final String TIME_REGEX = "^(?:[01][0-9]|2[0-3]):[0-5][0-9]$";

    public AddMovie(Scanner scanner) {
        this.scanner = scanner;
    }

    public void addMovie() {
        System.out.println("\n" + consoleColors.CYAN_BOLD + "=== Add New Movie ===" + consoleColors.RESET);

        String title = readTitle();

        if (movieExists(title)) {
            System.out.println(consoleColors.RED_BOLD + "Movie with this title already exists." + consoleColors.RESET);
            return;
        }

        String[] actors = readActors();
        String summary = readSummary();
        int ageRestriction = readPositiveInt(consoleColors.BLUE_BOLD + "Enter age restriction: " + consoleColors.RESET);
        double imdbRating = readImdbRating();
        String language = readLanguage();
        int duration = readPositiveInt(consoleColors.BLUE_BOLD + "Enter duration (minutes): " + consoleColors.RESET);
        String[] showTimes = readShowTimes();
        String hallType = readHallType();

        Movie movie = new Movie(
                title, actors, summary, ageRestriction, imdbRating,
                language, duration, showTimes, hallType
        );

        addMovieToCollection(movie);

        System.out.println(consoleColors.GREEN_BOLD +
                "Movie '" + title + "' added successfully!" +
                consoleColors.RESET);
    }

    // -------------------- Input helpers --------------------

    private String readTitle() {
        while (true) {
            System.out.print(consoleColors.BLUE_BOLD + "Enter movie title: " + consoleColors.RESET);

            String input = scanner.nextLine();

            // FIX FOR CONSOLE MODE:
            // If input is empty because a stray newline existed, skip ONLY if tests are not providing lines.
            while (input.isEmpty() && scanner.hasNextLine() && input.trim().isEmpty()) {
                input = scanner.nextLine();
            }

            String trimmed = input.trim();

            if (trimmed.isEmpty()) {
                System.out.println(consoleColors.RED_BOLD + "Title cannot be empty or whitespace." + consoleColors.RESET);
                continue;
            }
            return trimmed;
        }
    }

    private String[] readActors() {
        String[] actors = new String[ACTOR_COUNT];
        System.out.println(consoleColors.BLUE_BOLD + "Enter 3 main actors:" + consoleColors.RESET);

        for (int i = 0; i < ACTOR_COUNT; i++) {
            while (true) {
                System.out.print(consoleColors.BLUE_BOLD +
                        "Enter actor " + (i + 1) + ": " + consoleColors.RESET);

                String input = scanner.nextLine();
                String trimmed = input.trim();

                if (trimmed.isEmpty()) {
                    System.out.println(consoleColors.RED_BOLD + "Actor name cannot be empty or whitespace." + consoleColors.RESET);
                    continue;
                }

                if (!trimmed.matches(LETTERS_ONLY_REGEX)) {
                    System.out.println(consoleColors.RED_BOLD + "Actor name must contain letters and spaces only." + consoleColors.RESET);
                    continue;
                }

                actors[i] = trimmed;
                break;
            }
        }
        return actors;
    }

    private String readSummary() {
        while (true) {
            System.out.print(consoleColors.BLUE_BOLD + "Enter summary: " + consoleColors.RESET);
            String input = scanner.nextLine();
            String trimmed = input.trim();

            if (trimmed.isEmpty()) {
                System.out.println(consoleColors.RED_BOLD + "Summary cannot be empty or whitespace." + consoleColors.RESET);
                continue;
            }
            return trimmed;
        }
    }

    private String readLanguage() {
        while (true) {
            System.out.print(consoleColors.BLUE_BOLD + "Enter language: " + consoleColors.RESET);
            String input = scanner.nextLine();
            String trimmed = input.trim();

            if (trimmed.isEmpty()) {
                System.out.println(consoleColors.RED_BOLD + "Language cannot be empty or whitespace." + consoleColors.RESET);
                continue;
            }

            if (!trimmed.matches(LETTERS_ONLY_REGEX)) {
                System.out.println(consoleColors.RED_BOLD + "Language must contain letters and spaces only." + consoleColors.RESET);
                continue;
            }
            return trimmed;
        }
    }

    private int readPositiveInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine();
                int val = Integer.parseInt(input.trim());
                if (val > 0) return val;

                System.out.println(consoleColors.RED_BOLD + "Enter a positive number only." + consoleColors.RESET);
            } catch (NumberFormatException e) {
                System.out.println(consoleColors.RED_BOLD + "Invalid number format." + consoleColors.RESET);
            }
        }
    }

    private double readImdbRating() {
        while (true) {
            try {
                System.out.print(consoleColors.BLUE_BOLD + "Enter IMDb rating (1 to 10): " + consoleColors.RESET);
                String input = scanner.nextLine();
                double rating = Double.parseDouble(input.trim());

                if (rating >= 1 && rating <= 10) return rating;

                System.out.println(consoleColors.RED_BOLD + "Rating must be between 1 and 10." + consoleColors.RESET);
            } catch (NumberFormatException e) {
                System.out.println(consoleColors.RED_BOLD + "Invalid rating input." + consoleColors.RESET);
            }
        }
    }

    private String[] readShowTimes() {
        String[] times = new String[SHOWTIME_COUNT];
        System.out.println(consoleColors.BLUE_BOLD + "Enter 5 show times (HH:MM):" + consoleColors.RESET);

        for (int i = 0; i < SHOWTIME_COUNT; i++) {
            while (true) {
                System.out.print(consoleColors.BLUE_BOLD + "Enter show time " + (i + 1) + ": " + consoleColors.RESET);

                String input = scanner.nextLine();
                String trimmed = input.trim();

                if (trimmed.isEmpty()) {
                    System.out.println(consoleColors.RED_BOLD + "Show time cannot be empty or whitespace." + consoleColors.RESET);
                    continue;
                }

                if (!trimmed.matches(TIME_REGEX)) {
                    System.out.println(consoleColors.RED_BOLD + "Invalid time format. Must be HH:MM (00:00–23:59)." + consoleColors.RESET);
                    continue;
                }

                times[i] = appendAmPm(trimmed);
                break;
            }
        }
        return times;
    }

    private String appendAmPm(String hhmm) {
        int hour = Integer.parseInt(hhmm.substring(0, 2));
        return hour < 12 ? hhmm + " AM" : hhmm + " PM";
    }

    private String readHallType() {
        while (true) {
            System.out.print(consoleColors.BLUE_BOLD + "Choose hall type (VIP / 3D / IMAX / STANDARD): " + consoleColors.RESET);

            String input = scanner.nextLine();
            String trimmed = input.trim();

            if (trimmed.isEmpty()) {
                System.out.println(consoleColors.RED_BOLD + "Hall type cannot be empty or whitespace." + consoleColors.RESET);
                continue;
            }

            String upper = trimmed.toUpperCase();
            if (VALID_HALL_TYPES.contains(upper)) return upper;

            System.out.println(consoleColors.RED_BOLD + "Invalid hall type." + consoleColors.RESET);
        }
    }

    // -------------------- Collection helpers --------------------

    private void addMovieToCollection(Movie movie) {
        movieTitles.add(movie.getTitle().toLowerCase());
        movies.add(movie);
    }

    private boolean movieExists(String title) {
        return movieTitles.contains(title.toLowerCase());
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
