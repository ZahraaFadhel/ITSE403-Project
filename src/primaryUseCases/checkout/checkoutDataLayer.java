package src.primaryUseCases.checkout;

/**
 * The checkoutDataLayer class is responsible for managing checkout-related data
 * in the Cinema Management System (CMS). It facilitates interactions between
 * the business layer and the data storage by providing methods to handle
 * discount codes, payment validations, and cart operations.
 *
 * Key Responsibilities: - Retrieve and validate discount codes, ensuring they
 * exist and apply to transactions. - Manage bookings by fetching the current
 * shopping cart and calculating total price. - Validate payment details
 * including card type, cardholder name, card number, expiry date, and CVV to
 * prevent invalid entries.
 *
 * This class enhances the security and efficiency of the checkout process by
 * ensuring only valid payment and discount information is processed.
 */
import java.util.List;
import src.dataStore.Booking;
import src.dataStore.ValidDiscountCode;
import src.helpers.consoleColors;

public class checkoutDataLayer {

    public List<Booking> bookings() {
        return src.dataStore.getBookings();
    }

    // Retrieve all valid discount code from dataStore
    public List<ValidDiscountCode> validDiscountCode() {
        return src.dataStore.getValidDiscountCodes();
    }

    // Get all valid discount codes from the dataStore
    public List<ValidDiscountCode> validDiscountCodes() {
        return src.dataStore.getValidDiscountCodes();
    }

// Method to check if a discount code is valid, ignoring case
    public boolean isValidDiscountCode(String code) {
        for (ValidDiscountCode discountCode : src.dataStore.getValidDiscountCodes()) {
            if (discountCode.getCode().equalsIgnoreCase(code.trim())) {
                return true;
            }
        }
        return false;
    }

    public int getDiscountPercentageByCode(String discountCode) {
        for (ValidDiscountCode validCode : src.dataStore.getValidDiscountCodes()) {
            if (validCode.getCode().equalsIgnoreCase(discountCode.trim())) {
                return validCode.getPercentage();  // Return the discount percentage
            }
        }
        return 0;
    }

    public static void printShoppingCart() {
        System.out.println(consoleColors.BLUE_BOLD + "Shopping Cart:" + consoleColors.RESET);
        for (Booking booking : src.dataStore.getBookings()) {
            System.out.println(booking);
        }
        System.out.println(consoleColors.DARK_GREEN_BOLD + "Total Price = " + consoleColors.RESET + checkoutBusinessLayer.calculateTotalPrice(src.dataStore.getBookings()));
        System.out.println();
    }

    public static boolean isValidCardType(String cardType) {
        if (cardType == null) {
            return false; // Null is not a valid card type
        }
        return cardType.equalsIgnoreCase("Visa") || cardType.equalsIgnoreCase("MasterCard");
    }
    
    public static boolean isValidCardholderName(String name) {
        if (name == null) {
            return false; // Null is not a valid name
        }
        return name.matches("^[a-zA-Z ]+$"); // Only letters and spaces allowed
    }
    
    public static boolean isValidCardNumber(String cardNumber) {
        if (cardNumber == null) {
            return false; // Null is not a valid card number
        }
        return cardNumber.matches("^\\d{16}$"); // Exactly 16 digits
    }
    
    public static boolean isValidExpiryDate(String expiryDate) {
        if (expiryDate == null) {
            return false; // Null is not a valid expiry date
        }
        return expiryDate.matches("^(0[1-9]|1[0-2])/(\\d{2})$"); // MM/YY format (01-12/YY)
    }
    
    public static boolean isValidCVV(String cvv) {
        if (cvv == null) {
            return false; // Null is not a valid CVV
        }
        return cvv.trim().matches("^\\d{3}$"); // Exactly 3 digits (0-9)
    }
}

// Phase 6: This file was already merged into main. This comment was added so it appears for review, in case further changes are needed.