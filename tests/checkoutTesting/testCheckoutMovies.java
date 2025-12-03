/**
 * Test Class for Checkout Use Case
 * Tests scenarios like calculating total price, applying discounts, 
 * payment validation, and handling checkout flow.
 */

package tests.checkoutTesting;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

import src.dataStore;
import src.dataStore.ValidDiscountCode;
import src.primaryUseCases.checkout.CheckoutMovies;

public class testCheckoutMovies {

    private CheckoutMovies checkout;
    private ByteArrayOutputStream outputStream;
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @Before
    public void setUp() {
        checkout = new CheckoutMovies();
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        new dataStore();
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    // ==================== SUCCESS CASES ====================

    @Test
    public void testCalculateTotalPrice() {
        double totalPrice = CheckoutMovies.calculateTotalPrice();
        assertEquals("Total price should be 20.0 based on sample bookings", 21.0, totalPrice, 0.001);
    }

    @Test
    public void testIsValidDiscountCodeSuccess() {
        assertTrue("Valid discount code", checkoutIsValidDiscountCode("NEWYEAR25"));
        assertTrue("Valid discount code case insensitive", checkoutIsValidDiscountCode("eidmubarak15"));
    }

    @Test
    public void testApplyDiscountCode_ValidCode() {
        double originalPrice = 100.0;
        double discountedPrice = checkout.applyDiscount("NEWYEAR25", originalPrice);
        assertEquals("Discount code NEWYEAR25 should reduce the price by 25%", 75.0, discountedPrice, 0.001);
    }

    @Test
    public void testIsValidCardTypeSuccess() {
        assertTrue(CheckoutMovies.isValidCardType("Visa"));
        assertTrue(CheckoutMovies.isValidCardType("MasterCard"));
        assertTrue("Case insensitive VISA", CheckoutMovies.isValidCardType("VISA"));
        assertTrue("Case insensitive MASTERCARD", CheckoutMovies.isValidCardType("MASTERCARD"));
    }

    @Test
    public void testIsValidCardholderNameSuccess() {
        assertTrue(CheckoutMovies.isValidCardholderName("John Doe"));
        assertTrue(CheckoutMovies.isValidCardholderName("Alice"));
    }

    @Test
    public void testIsValidCardNumberSuccess() {
        assertTrue(CheckoutMovies.isValidCardNumber("1234567890123456"));
    }

    @Test
    public void testIsValidExpiryDateSuccess() {
        assertTrue(CheckoutMovies.isValidExpiryDate("12/25"));
        assertTrue(CheckoutMovies.isValidExpiryDate("01/30"));
    }

    @Test
    public void testIsValidCVVSuccess() {
        assertTrue(CheckoutMovies.isValidCVV("123"));
        assertTrue("Trailing space", CheckoutMovies.isValidCVV("123 "));
        assertTrue("Leading space", CheckoutMovies.isValidCVV(" 123"));
    }

    @Test
    public void testProceedToCheckout_NewPaymentMethod() {
        String input = "2\n" +
                       "Visa\n" +
                       "John Doe\n" +
                       "1234567890123456\n" +
                       "12/25\n" +
                       "123\n" +
                       "yes\n" +
                       "\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        checkout = new CheckoutMovies();
        boolean result = checkout.processPayment();
        assertTrue("Checkout with new payment method should succeed", result);
    }

    // ==================== FAILURE CASES ====================

    @Test
    public void testApplyDiscountCode_InvalidCode() {
        double originalPrice = 100.0;
        double discountedPrice = checkout.applyDiscount("INVALIDCODE", originalPrice);
        assertEquals("Invalid discount code should not change the price", 100.0, discountedPrice, 0.001);
    }

    @Test
    public void testApplyDiscountCode_EmptyCode() {
        double originalPrice = 100.0;
        double discountedPrice = checkout.applyDiscount("", originalPrice);
        assertEquals("Empty discount code should not change the price", 100.0, discountedPrice, 0.001);
    }

    @Test
    public void testIsValidDiscountCodeFailure() {
        assertFalse("Invalid discount code", checkoutIsValidDiscountCode("INVALIDCODE"));
    }

    @Test
    public void testGetDiscountPercentageByCodeFailure() {
        assertEquals("INVALIDCODE should return 0%", 0, checkoutGetDiscountPercentageByCode("INVALIDCODE"));
        assertEquals("Empty string should return 0%", 0, checkoutGetDiscountPercentageByCode(""));
    }

    @Test
    public void testIsValidCardTypeFailure() {
        assertFalse("Not Visa/MasterCard", CheckoutMovies.isValidCardType("Amex"));
        assertFalse("Empty string", CheckoutMovies.isValidCardType(""));
        assertFalse("Null input", CheckoutMovies.isValidCardType(null));
    }

    @Test
    public void testIsValidCardholderNameFailure() {
        assertFalse("Contains numbers", CheckoutMovies.isValidCardholderName("John123"));
        assertFalse("Special characters", CheckoutMovies.isValidCardholderName("John@Doe"));
        assertFalse("Empty string", CheckoutMovies.isValidCardholderName(""));
        assertFalse("Null input", CheckoutMovies.isValidCardholderName(null));
        assertFalse("Numbers in name", CheckoutMovies.isValidCardholderName("John Doe123"));
        assertFalse("Special characters", CheckoutMovies.isValidCardholderName("John-Doe"));
    }

    @Test
    public void testIsValidCardNumberFailure() {
        assertFalse("Too short", CheckoutMovies.isValidCardNumber("1234"));
        assertFalse("Too long", CheckoutMovies.isValidCardNumber("12345678901234567"));
        assertFalse("Contains letters", CheckoutMovies.isValidCardNumber("123456789012345a"));
        assertFalse("Empty string", CheckoutMovies.isValidCardNumber(""));
        assertFalse("Null input", CheckoutMovies.isValidCardNumber(null));
        assertFalse("Spaces included", CheckoutMovies.isValidCardNumber("1234 5678 9012 3456"));
        assertFalse("Hyphens included", CheckoutMovies.isValidCardNumber("1234-5678-9012-3456"));
    }

    @Test
    public void testIsValidExpiryDateFailure() {
        assertFalse("Invalid month", CheckoutMovies.isValidExpiryDate("13/25"));
        assertFalse("Invalid month", CheckoutMovies.isValidExpiryDate("00/25"));
        assertFalse("Wrong format", CheckoutMovies.isValidExpiryDate("12/2025"));
        assertFalse("Too long format", CheckoutMovies.isValidExpiryDate("12/25/2025"));
        assertFalse("Empty string", CheckoutMovies.isValidExpiryDate(""));
        assertFalse("Null input", CheckoutMovies.isValidExpiryDate(null));
        assertFalse("Wrong separator", CheckoutMovies.isValidExpiryDate("12-25"));
        assertFalse("Short year", CheckoutMovies.isValidExpiryDate("12/5"));
    }

    @Test
    public void testIsValidCVVFailure() {
        assertFalse("Too short", CheckoutMovies.isValidCVV("12"));
        assertFalse("Too long", CheckoutMovies.isValidCVV("1234"));
        assertFalse("Contains letter", CheckoutMovies.isValidCVV("12a"));
        assertFalse("Empty string", CheckoutMovies.isValidCVV(""));
        assertFalse("Null input", CheckoutMovies.isValidCVV(null));
    }

    @Test
    public void testProceedToCheckout_InvalidCardType() {
        String input = "2\n" +
                       "Amex\n" +
                       "no\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        checkout = new CheckoutMovies();
        boolean result = checkout.processPayment();
        assertFalse("Checkout with invalid card type should fail", result);
    }

    @Test
    public void testStart_EmptyShoppingCart() {
        dataStore.getBookings().clear();
        checkout.start();
        String output = outputStream.toString();
        assertTrue(output.contains("Sorry Shopping cart is empty, come back after booking tickets"));
    }

    @Test
    public void testReturnToMainMenu() {
        String input = "y\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        checkout = new CheckoutMovies();
        checkout.returnToMainMenu();

        String output = outputStream.toString();
        assertTrue(output.contains("Returning to browsing menu >>>"));
    }

    // ==================== PRIVATE HELPER METHODS ====================
    
    private boolean checkoutIsValidDiscountCode(String code) {
        for (ValidDiscountCode discountCode : dataStore.getValidDiscountCodes()) {
            if (discountCode.getCode().equalsIgnoreCase(code.trim())) {
                return true;
            }
        }
        return false;
    }
    
    private int checkoutGetDiscountPercentageByCode(String discountCode) {
        for (ValidDiscountCode validCode : dataStore.getValidDiscountCodes()) {
            if (validCode.getCode().equalsIgnoreCase(discountCode.trim())) {
                return validCode.getPercentage();
            }
        }
        return 0;
    }
}