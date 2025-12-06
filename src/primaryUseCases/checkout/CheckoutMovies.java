/**
 * Checkout Use Case
 * Single class handles the complete checkout process in the
 * Cinema Management System (CMS).
 * Key Responsibilities:
 * - Display the shopping cart and total booking price
 * - Apply discount codes and calculate discounted prices
 * - Handle payment processing with validation
 * - Manage saved and new payment methods
 * - Guide users through the checkout flow with a menu-driven interface
 */

package src.primaryUseCases.checkout;

import java.util.Scanner;
import src.dataStore;
import src.dataStore.Booking;
import src.dataStore.SavedPaymentMethod;
import src.dataStore.ValidDiscountCode;
import src.helpers.consoleColors;
import src.helpers.validation;

public class CheckoutMovies {

    private final Scanner scanner;

    public CheckoutMovies() {
        this.scanner = new Scanner(System.in);
    }

    // ==================== MAIN CHECKOUT FLOW ====================

    public void start() {
        System.out.println(consoleColors.BLUE_BOLD + "\n--- Checkout ---" + consoleColors.RESET);

        if (dataStore.getBookings().isEmpty()) {
            System.out.println(consoleColors.RED_BOLD +
                    "Sorry Shopping cart is empty, come back after booking tickets" +
                    consoleColors.RESET);
            return;
        }

        printShoppingCart();
        double price = calculateTotalPrice();

        String discountCode = promptForDiscountCode();
        if (!discountCode.isEmpty()) {
            price = applyDiscount(discountCode, price);
            System.out.println(consoleColors.GREEN_BOLD +
                    "Discount code applied successfully :)" +
                    consoleColors.RESET);
            System.out.println(consoleColors.DARK_GREEN_BOLD +
                    "Discounted Total Price = " +
                    consoleColors.RESET + price);
        }
        System.out.println();

        displayCheckoutMenu();

        while (true) {
            int choice = validation.getValidIntegerInput("Enter your choice: ", scanner);
            System.out.println();
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
            if (choice > 3 || choice < 1) {
                System.out.print(consoleColors.RED_BOLD +
                        "Invalid input. Please enter a valid number.\n" +
                        consoleColors.RESET);
                continue;
            }

            switch (choice) {
                case 1:
                    processPayment();
                    return;
                case 2:
                    System.out.println(consoleColors.YELLOW_BOLD +
                            "Processing... \n" +
                            consoleColors.RESET);
                    returnToMainMenu();
                    return;
                case 3:
                    System.out.println(consoleColors.YELLOW_BOLD +
                            "\nExiting the system. Goodbye!" +
                            consoleColors.RESET);
                    System.exit(0);
            }
        }
    }

    // ==================== SHOPPING CART METHODS ====================

    public static double calculateTotalPrice() {
        double total = 0;
        for (Booking booking : dataStore.getBookings()) {
            total += booking.getBookingPrice();
        }
        return total;
    }

    public void printShoppingCart() {
        System.out.println(consoleColors.BLUE_BOLD + "Shopping Cart:" + consoleColors.RESET);
        for (Booking booking : dataStore.getBookings()) {
            System.out.println(booking);
        }
        System.out.println(consoleColors.DARK_GREEN_BOLD + "Total Price = " +
                consoleColors.RESET + calculateTotalPrice());
        System.out.println();
    }

    // ==================== DISCOUNT CODE METHODS ====================

    public String promptForDiscountCode() {
        while (true) {
            System.out.print(consoleColors.YELLOW_BOLD +
                    "Enter discount code (or press Enter to skip):" +
                    consoleColors.RESET);

            if (scanner.hasNextLine()) {
                String discountCode = scanner.nextLine().trim();

                if (!discountCode.isEmpty()) {
                    String[] words = discountCode.split("\\s+");
                    int wordCount = words.length;

                    if (wordCount != 1) {
                        System.out.println(consoleColors.RED_BOLD +
                                "Error: The discount code should consist of a single word, try again. (No spaces)" +
                                consoleColors.RESET);
                    } else if (!validation.isValidString(discountCode)) {
                        System.out.println(consoleColors.RED_BOLD +
                                "Error: The discount code contains invalid characters. (Only letters, digits, hyphens, and underscores) are allowed."
                                +
                                consoleColors.RESET);
                    } else if (!isValidDiscountCode(discountCode)) {
                        System.out.println(consoleColors.RED_BOLD +
                                "Error: The discount code does not exist, try another one, try again." +
                                consoleColors.RESET);
                    } else {
                        return discountCode;
                    }
                } else {
                    return "";
                }
            } else {
                return "";
            }
        }
    }

    public double applyDiscount(String discountCode, double price) {
        double discountPercentage = getDiscountPercentageByCode(discountCode);
        return price * (1 - discountPercentage / 100);
    }

    private boolean isValidDiscountCode(String code) {
        for (ValidDiscountCode discountCode : dataStore.getValidDiscountCodes()) {
            if (discountCode.getCode().equalsIgnoreCase(code.trim())) {
                return true;
            }
        }
        return false;
    }

    private int getDiscountPercentageByCode(String discountCode) {
        for (ValidDiscountCode validCode : dataStore.getValidDiscountCodes()) {
            if (validCode.getCode().equalsIgnoreCase(discountCode.trim())) {
                return validCode.getPercentage();
            }
        }
        return 0;
    }

    // ==================== PAYMENT PROCESSING METHODS ====================

    public boolean processPayment() {
        while (true) {
            System.out.println(consoleColors.GREEN_BOLD + "1. Use a saved payment method" + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "2. Use a new payment method" + consoleColors.RESET);
System.out.print(consoleColors.YELLOW_BOLD + "Enter your choice: " + consoleColors.RESET);

            if (scanner.hasNextLine()) {
                String input = scanner.nextLine().trim();
                try {
                    int choice = Integer.parseInt(input);

                    if (choice < 1 || choice > 2) {
                        System.out.println(consoleColors.RED_BOLD +
                                "Invalid input. Please enter a valid number.\n" +
                                consoleColors.RESET);
                        continue;
                    }
System.out.println();
                    switch (choice) {
                        case 1:
                            return handleSavedPaymentMethod();
                        case 2:
                            return handleNewPaymentMethod();
                        default:
                            System.out.println(consoleColors.RED_BOLD +
                                    "Error: Wrong input, try again." +
                                    consoleColors.RESET);
                    }
                } catch (NumberFormatException e) {
                    System.out.println(consoleColors.RED_BOLD +
                            "Invalid input. Please enter a number.\n" +
                            consoleColors.RESET);
                }
            } else {
                return false;
            }
        }
    }

    private boolean handleSavedPaymentMethod() {
        SavedPaymentMethod savedPaymentMethod = dataStore.getSavedPaymentMethod();
        if (savedPaymentMethod != null) {
            System.out.println(savedPaymentMethod);
            promptForCheckoutConfirmation();
            dataStore.clearAllBookings();
            return true;
        }
        System.out.println(consoleColors.RED_BOLD +
                "No saved payment method. Please enter a new one." +
                consoleColors.RESET);
        return false;
    }

    private boolean handleNewPaymentMethod() {
        String cardType = promptForCardType();
        String cardholderName = promptForCardholderName();
        String cardNumber = promptForCardNumber();
        String expiryDate = promptForExpiryDate();
        String cvv = promptForCVV();

        promptForCheckoutConfirmation();
        dataStore.clearAllBookings();

        return promptForSavePaymentMethod(cardType, cardholderName, cardNumber, expiryDate, cvv);
    }

    // ==================== PAYMENT INPUT METHODS ====================

    private String promptForCardType() {
        System.out.print(consoleColors.GREEN_BOLD +
                "Enter Card Type (Visa/MasterCard): " +
                consoleColors.RESET);

        while (true) {
            if (scanner.hasNextLine()) {
                String cardType = scanner.nextLine().trim();
                if (isValidCardType(cardType)) {
                    return cardType;
                }
                System.out.println(consoleColors.RED_BOLD +
                        "Invalid card type. Please enter Visa or MasterCard." +
                        consoleColors.RESET);
            } else {
                return "";
            }
        }
    }

    private String promptForCardholderName() {
        System.out.print(consoleColors.GREEN_BOLD +
                "Enter Cardholder Name: " +
                consoleColors.RESET);

        while (true) {
            if (scanner.hasNextLine()) {
                String name = scanner.nextLine().trim();
                if (isValidCardholderName(name)) {
                    return name;
                }
                System.out.println(consoleColors.RED_BOLD +
                        "Invalid name. Only letters and spaces are allowed." +
                        consoleColors.RESET);
            } else {
                return "";
            }
        }
    }

    private String promptForCardNumber() {
        System.out.print(consoleColors.GREEN_BOLD +
                "Enter Card Number: " +
                consoleColors.RESET);

        while (true) {
            if (scanner.hasNextLine()) {
                String cardNumber = scanner.nextLine().trim();
                if (isValidCardNumber(cardNumber)) {
                    return cardNumber;
                }
                System.out.println(consoleColors.RED_BOLD +
                        "Invalid card number. It must be exactly 16 digits." +
                        consoleColors.RESET);
            } else {
                return "";
            }
        }
    }

    private String promptForExpiryDate() {
        System.out.print(consoleColors.GREEN_BOLD +
                "Enter Expiry Date (MM/YY): " +
                consoleColors.RESET);

        while (true) {
            if (scanner.hasNextLine()) {
                String expiryDate = scanner.nextLine().trim();
                if (isValidExpiryDate(expiryDate)) {
                    return expiryDate;
                }
                System.out.println(consoleColors.RED_BOLD +
                         "Invalid expiry date. Format must be MM/YY and must be a future or current date (not expired)." +
                        consoleColors.RESET);
            } else {
                return "";
            }
        }
    }

    private String promptForCVV() {
        System.out.print(consoleColors.GREEN_BOLD +
                "Enter CVV: " +
                consoleColors.RESET);

        while (true) {
            if (scanner.hasNextLine()) {
                String cvv = scanner.nextLine().trim();
                if (isValidCVV(cvv)) {
                    return cvv;
                }
                System.out.println(consoleColors.RED_BOLD +
                        "Invalid CVV. It must be exactly 3 digits." +
                        consoleColors.RESET);
            } else {
                return "";
            }
        }
    }

    // ==================== PAYMENT VALIDATION METHODS ====================

    public static boolean isValidCardType(String cardType) {
        if (cardType == null) {
            return false;
        }
        return cardType.equalsIgnoreCase("Visa") || cardType.equalsIgnoreCase("MasterCard");
    }

    public static boolean isValidCardholderName(String name) {
        if (name == null) {
            return false;
        }
        return name.matches("^[a-zA-Z ]+$");
    }

    public static boolean isValidCardNumber(String cardNumber) {
        if (cardNumber == null) {
            return false;
        }
        return cardNumber.matches("^\\d{16}$");
    }

   public static boolean isValidExpiryDate(String expiryDate) {
    if (expiryDate == null) {
        return false;
    }
    
    // Check format MM/YY
    if (!expiryDate.matches("^(0[1-9]|1[0-2])/(\\d{2})$")) {
        return false;
    }
    
    try {
        String[] parts = expiryDate.split("/");
        int month = Integer.parseInt(parts[0]);
        int year = Integer.parseInt(parts[1]);
        
        int fullYear = 2000 + year;
        
        java.time.LocalDate currentDate = java.time.LocalDate.now();
        int currentYear = currentDate.getYear();
        int currentMonth = currentDate.getMonthValue();
        
        // Check if date is not in the past
        if (fullYear < currentYear) {
            return false; 
        } else if (fullYear == currentYear) {
            if (month < currentMonth) {
                return false;
            }
        }
        
        return true;
        
    } catch (Exception e) {
        return false;
    }
}

    public static boolean isValidCVV(String cvv) {
        if (cvv == null) {
            return false;
        }
        return cvv.trim().matches("^\\d{3}$");
    }

    // ==================== CHECKOUT CONFIRMATION METHODS ====================

    private void promptForCheckoutConfirmation() {
        System.out.println(consoleColors.YELLOW_BOLD + "+-----------------+");
        System.out.println("|    CHECKOUT     |");
        System.out.println("+-----------------+");
        System.out.println("Press ENTER to continue..." + consoleColors.RESET);

        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

    private boolean promptForSavePaymentMethod(String cardType, String cardholderName,
            String cardNumber, String expiryDate, String cvv) {
        System.out.println(consoleColors.YELLOW_BOLD +
                "Do you want to save this payment method? (yes/no)" +
                consoleColors.RESET);
        System.out.println(consoleColors.RED_BOLD +
                "Note: Previous saved method will be replaced." +
                consoleColors.RESET);

        if (scanner.hasNextLine()) {
            String response = scanner.nextLine().trim().toLowerCase();
            if (response.equals("yes")) {
                SavedPaymentMethod newPaymentMethod = new SavedPaymentMethod(
                        cardType, cardholderName, cardNumber, expiryDate, cvv);
                dataStore.updatePaymentMethod(newPaymentMethod);
            }
            return true;
        } else {
            return false;
        }
    }

    // ==================== MENU DISPLAY METHODS ====================

    private void displayCheckoutMenu() {
        System.out.println(consoleColors.GREEN_BOLD + "1. Proceed to checkout" + consoleColors.RESET);
        System.out.println(consoleColors.GREEN_BOLD + "2. Go back to the main menu" + consoleColors.RESET);
        System.out.println(consoleColors.RED_BOLD + "3. Exit" + consoleColors.RESET);
    }

    public void returnToMainMenu() {
        System.out.println(consoleColors.YELLOW_BOLD + "Go Back? (y/n)" + consoleColors.RESET);
        System.out.print(consoleColors.YELLOW_BOLD + "Enter your choice: " + consoleColors.RESET);

        String choice = scanner.nextLine().trim().toLowerCase();

        while (!(choice.equals("y") || choice.equals("n"))) {
            if (choice.length() != 1 || !choice.matches("[yn]")) {
                System.out.println(consoleColors.RED_BOLD +
                        "Invalid choice. Please enter 'y' or 'n'." +
                        consoleColors.RESET);
            }
            System.out.println(consoleColors.YELLOW_BOLD +
                    "Enter your choice: " +
                    consoleColors.RESET);
            choice = scanner.nextLine().trim().toLowerCase();
        }

        switch (choice) {
            case "y":
                System.out.println(consoleColors.YELLOW_BOLD +
                        "\nReturning to browsing menu >>>" +
                        consoleColors.RESET);
                break;
            case "n":
                System.out.println(consoleColors.RED_BOLD +
                        "Exiting the system. Goodbye!" +
                        consoleColors.RESET);
                System.exit(0);
            default:
                System.out.println(consoleColors.RED_BOLD +
                        "Invalid choice, Returning to main menu." +
                        consoleColors.RESET);
                break;
        }
    }
}