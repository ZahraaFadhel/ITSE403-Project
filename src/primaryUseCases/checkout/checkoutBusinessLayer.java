package src.primaryUseCases.checkout; //.

/**
 * The checkoutBusinessLayer class handles the business logic for the checkout
 * process in the Cinema Management System (CMS). It facilitates user
 * interactions, payment processing, and discount code application while
 * ensuring valid input and data integrity.
 *
 * Key Responsibilities: - Calculate total booking price. - Validate and apply
 * discount codes. - Handle payment processing, supporting both saved and new
 * payment methods. - Ensure secure and valid user input for payment details,
 * enforcing format constraints. - Prompt users for confirmation and allow them
 * to save new payment methods.
 *
 * This class improves the checkout experience by enforcing data validation,
 * ensuring smooth transactions, and maintaining a user-friendly interface.
 */
import java.util.List; //.
import java.util.Scanner; //.
import src.dataStore; //.
import src.dataStore.Booking; //.
import src.dataStore.SavedPaymentMethod; //.
import src.helpers.consoleColors; //.
import src.helpers.validation; //.

public class checkoutBusinessLayer { //.

    private final checkoutDataLayer dataLayer; //.
    private final Scanner scanner; //.

    // Constructor to initialize the business layer //.
    public checkoutBusinessLayer(checkoutDataLayer dataLayer) { //.
        this.dataLayer = dataLayer; // Instantiate the data layer //.
        this.scanner = new Scanner(System.in); // Initialize the scanner for user input //.
    } //.

    public static double calculateTotalPrice(List<Booking> bookings) { //.
        double total = 0; //.
        for (Booking booking : dataStore.getBookings()) { //.
            total += booking.getBookingPrice(); //.
        } //.
        return total; //.
    } //.

    public String ApplyDiscountCode() { //.
        while (true) { //.
            System.out.print(consoleColors.YELLOW_BOLD + "Enter discount code (or press Enter to skip):" + consoleColors.RESET); //.
            if (scanner.hasNextLine()) { //.
                String discountCode = scanner.nextLine().trim(); //.
                if (!discountCode.isEmpty()) { //.
                    String[] words = discountCode.split("\\s+"); //.
                    int wordCount = words.length; //.
                    if (wordCount != 1) { //.
                        System.out.println(consoleColors.RED_BOLD
                                + "Error: The discount code should consist of a single word, try again. (No spaces)"
                                + consoleColors.RESET); //.
                    } else if (!validation.isValidString(discountCode)) { //.
                        System.out.println(consoleColors.RED_BOLD
                                + "Error: The discount code contains invalid characters. (Only letters, digits, hyphens, and underscores) are allowed."
                                + consoleColors.RESET); //.
                    } else if (!dataLayer.isValidDiscountCode(discountCode)) { //.
                        System.out.println(consoleColors.RED_BOLD
                                + "Error: The discount code does not exist, try another one, try again."
                                + consoleColors.RESET); //.
                    } else { //.
                        return discountCode; //.
                    } //.
                } else { //.
                    return ""; //.
                } //.
            } else { //.
                return ""; //.
            } //.
        } //.
    } //.

    public double ApplyDiscountCode(String discountCode, double price) { //.
        double discountPercentage = dataLayer.getDiscountPercentageByCode(discountCode); //.
        return price * (1 - discountPercentage / 100); //.
    } //.

    public boolean proceedToCheckout() { //.
        while (true) { //.
            System.out.println(consoleColors.GREEN_BOLD + "1. Use a saved payment method" + consoleColors.RESET); //.
            System.out.println(consoleColors.GREEN_BOLD + "2. Use a new payment method" + consoleColors.RESET); //.

            if (scanner.hasNextLine()) { //.
                String input = scanner.nextLine().trim(); //.
                try { //.
                    int choice = Integer.parseInt(input); //.
                    if (choice < 1 || choice > 2) { //.
                        System.out.println(consoleColors.RED_BOLD + "Invalid input. Please enter a valid number.\n" + consoleColors.RESET); //.
                        continue; //.
                    } //.

                    switch (choice) { //.
                        case 1 -> { //.
                            return handleSavedPaymentMethod(); //.
                        } //.
                        case 2 -> { //.
                            return handleNewPaymentMethod(); //.
                        } //.
                        default -> //.
                            System.out.println(consoleColors.RED_BOLD + "Error: Wrong input, try again." + consoleColors.RESET); //.
                    } //.
                } catch (NumberFormatException e) { //.
                    System.out.println(consoleColors.RED_BOLD + "Invalid input. Please enter a number.\n" + consoleColors.RESET); //.
                } //.
            } else { //.
                return false; //.
            } //.
        } //.
    } //.

    private boolean handleSavedPaymentMethod() { //.
        SavedPaymentMethod savedPaymentMethod = dataStore.getSavedPaymentMethod(); //.
        if (savedPaymentMethod != null) { //.
            System.out.println(savedPaymentMethod); //.
            promptForCheckout(); //.
            dataStore.clearAllBookings(); //.
            return true; //.
        } //.
        System.out.println(consoleColors.RED_BOLD + "No saved payment method. Please enter a new one." + consoleColors.RESET); //.
        return false; //.
    } //.

    private boolean handleNewPaymentMethod() { //.
        System.out.print(consoleColors.GREEN_BOLD + "Enter Card Type (Visa/MasterCard): " + consoleColors.RESET); //.
        String cardType; //.
        while (true) { //.
            if (scanner.hasNextLine()) { //.
                cardType = scanner.nextLine().trim(); //.
                if (checkoutDataLayer.isValidCardType(cardType)) { //.
                    break; //.
                } //.
                System.out.println(consoleColors.RED_BOLD + "Invalid card type. Please enter Visa or MasterCard." + consoleColors.RESET); //.
            } else { //.
                return false; //.
            } //.
        } //.

        System.out.print(consoleColors.GREEN_BOLD + "Enter Cardholder Name: " + consoleColors.RESET); //.
        String cardholderName; //.
        while (true) { //.
            if (scanner.hasNextLine()) { //.
                cardholderName = scanner.nextLine().trim(); //.
                if (checkoutDataLayer.isValidCardholderName(cardholderName)) { //.
                    break; //.
                } //.
                System.out.println(consoleColors.RED_BOLD + "Invalid name. Only letters and spaces are allowed." + consoleColors.RESET); //.
            } else { //.
                return false; //.
            } //.
        } //.

        System.out.print(consoleColors.GREEN_BOLD + "Enter Card Number: " + consoleColors.RESET); //.
        String cardNumber; //.
        while (true) { //.
            if (scanner.hasNextLine()) { //.
                cardNumber = scanner.nextLine().trim(); //.
                if (checkoutDataLayer.isValidCardNumber(cardNumber)) { //.
                    break; //.
                } //.
                System.out.println(consoleColors.RED_BOLD + "Invalid card number. It must be exactly 16 digits." + consoleColors.RESET); //.
            } else { //.
                return false; //.
            } //.
        } //.

        System.out.print(consoleColors.GREEN_BOLD + "Enter Expiry Date (MM/YY): " + consoleColors.RESET); //.
        String expiryDate; //.
        while (true) { //.
            if (scanner.hasNextLine()) { //.
                expiryDate = scanner.nextLine().trim(); //.
                if (checkoutDataLayer.isValidExpiryDate(expiryDate)) { //.
                    break; //.
                } //.
                System.out.println(consoleColors.RED_BOLD + "Invalid expiry date. Format must be MM/YY." + consoleColors.RESET); //.
            } else { //.
                return false; //.
            } //.
        } //.

        System.out.print(consoleColors.GREEN_BOLD + "Enter CVV: " + consoleColors.RESET); //.
        String cvv; //.
        while (true) { //.
            if (scanner.hasNextLine()) { //.
                cvv = scanner.nextLine().trim(); //.
                if (checkoutDataLayer.isValidCVV(cvv)) { //.
                    break; //.
                } //.
                System.out.println(consoleColors.RED_BOLD + "Invalid CVV. It must be exactly 3 digits." + consoleColors.RESET); //.
            } else { //.
                return false; //.
            } //.
        } //.

        promptForCheckout(); //.
        dataStore.clearAllBookings(); //.

        return handleSavePaymentMethodResponse(cardType, cardholderName, cardNumber, expiryDate, cvv); //.
    } //.

    private void promptForCheckout() { //.
        System.out.println(consoleColors.YELLOW_BOLD + "+-----------------+"); //.
        System.out.println("|    CHECKOUT     |"); //.
        System.out.println("+-----------------+"); //.
        System.out.println("Press ENTER to continue..." + consoleColors.RESET); //.
        if (scanner.hasNextLine()) { //.
            scanner.nextLine(); //.
        } //.
    } //.

    private boolean handleSavePaymentMethodResponse(String cardType, String cardholderName, String cardNumber, String expiryDate, String cvv) { //.
        System.out.println(consoleColors.YELLOW_BOLD + "Do you want to save this payment method? (yes/no)" + consoleColors.RESET); //.
        System.out.println(consoleColors.RED_BOLD + "Note: Previous saved method will be replaced." + consoleColors.RESET); //.
        if (scanner.hasNextLine()) { //.
            String response = scanner.nextLine().trim().toLowerCase(); //.
            if (response.equals("yes")) { //.
                SavedPaymentMethod newPaymentMethod = new SavedPaymentMethod(cardType, cardholderName, cardNumber, expiryDate, cvv); //.
                dataStore.updatePaymentMethod(newPaymentMethod); //.
            } //.
            return true; //.
        } else { //.
            return false; //.
        } //.
    } //.
} //.

// Phase 6: This file was already merged into main. This comment was added so it appears for review, in case further changes are needed. //.
