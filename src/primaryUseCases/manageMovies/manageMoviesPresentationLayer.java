package src.primaryUseCases.manageMovies;

import java.util.Scanner;
import src.dataStore;
import src.helpers.consoleColors;
import src.helpers.validation;

public class manageMoviesPresentationLayer {

    private AddMovie businessLayer;
    private Scanner scanner;
    private dataStore globalStore;

    public manageMoviesPresentationLayer(AddMovie businessLayer, dataStore globalStore, Scanner scanner) {
        this.businessLayer = businessLayer;
        this.globalStore = globalStore;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println(consoleColors.BLUE_BOLD + "\n--- Manage Movies ---" + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "1. Add Movie" + consoleColors.RESET);
            System.out.println(consoleColors.RED_BOLD + "2. Return to Main Menu" + consoleColors.RESET);

            int choice = validation.getValidIntegerInput("Enter your choice: ", scanner);

            if (!handleChoice(choice)) {
                return;
            }
        }
    }

    public boolean handleChoice(int choice) {
        if (choice < 1 || choice > 2) {
            System.out.print(consoleColors.RED_BOLD + "Invalid input. Please enter a valid number.\n" + consoleColors.RESET);
            return true;
        }

        switch (choice) {
            case 1:
                businessLayer.addMovie();
                break;
            case 2:
                System.out.println(consoleColors.YELLOW_BOLD + "\nReturning to main menu >>>" + consoleColors.RESET);
                return false;
        }
        return true;
    }
}
