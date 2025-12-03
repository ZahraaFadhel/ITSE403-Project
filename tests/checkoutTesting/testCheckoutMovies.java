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
        assertEquals("Total price should be 21.0 based on sample bookings", 21.0, totalPrice, 0.001);
    }

    @Test
    public void testIsValidDiscountCodeSuccess_NewYear25() {
        assertTrue("Valid discount code NEWYEAR25", checkoutIsValidDiscountCode("NEWYEAR25"));
    }

    @Test
    public void testIsValidDiscountCodeSuccess_EidMubarak15_CaseInsensitive() {
        assertTrue("Valid discount code case insensitive", checkoutIsValidDiscountCode("eidmubarak15"));
    }

    @Test
    public void testApplyDiscountCode_ValidCodeNewYear25() {
        double originalPrice = 100.0;
        double discountedPrice = checkout.applyDiscount("NEWYEAR25", originalPrice);
        assertEquals("Discount code NEWYEAR25 should reduce the price by 25%", 75.0, discountedPrice, 0.001);
    }

    @Test
    public void testIsValidCardTypeSuccess_Visa() {
        assertTrue(CheckoutMovies.isValidCardType("Visa"));
    }

    @Test
    public void testIsValidCardTypeSuccess_MasterCard() {
        assertTrue(CheckoutMovies.isValidCardType("MasterCard"));
    }

    @Test
    public void testIsValidCardTypeSuccess_Visa_CaseInsensitive() {
        assertTrue("Case insensitive VISA", CheckoutMovies.isValidCardType("VISA"));
    }

    @Test
    public void testIsValidCardTypeSuccess_MasterCard_CaseInsensitive() {
        assertTrue("Case insensitive MASTERCARD", CheckoutMovies.isValidCardType("MASTERCARD"));
    }

    @Test
    public void testIsValidCardholderNameSuccess_JohnDoe() {
        assertTrue(CheckoutMovies.isValidCardholderName("John Doe"));
    }

    @Test
    public void testIsValidCardholderNameSuccess_Alice() {
        assertTrue(CheckoutMovies.isValidCardholderName("Alice"));
    }

    @Test
    public void testIsValidCardNumberSuccess_Valid16Digit() {
        assertTrue(CheckoutMovies.isValidCardNumber("1234567890123456"));
    }

@Test
public void testIsValidExpiryDateSuccess_FutureDate() {
    // Test a date 1 year in the future (always valid)
    java.time.LocalDate future = java.time.LocalDate.now().plusYears(1);
    String expiryDate = String.format("%02d/%02d", future.getMonthValue(), future.getYear() % 100);
    assertTrue(CheckoutMovies.isValidExpiryDate(expiryDate));
}

@Test
public void testIsValidExpiryDateSuccess_CurrentMonth() {
    // Test current month (should be valid)
    java.time.LocalDate now = java.time.LocalDate.now();
    String expiryDate = String.format("%02d/%02d", now.getMonthValue(), now.getYear() % 100);
    assertTrue(CheckoutMovies.isValidExpiryDate(expiryDate));
}

@Test
public void testIsValidExpiryDateFailure_PastMonth() {
    // Test a date 1 month in the past (should fail)
    java.time.LocalDate past = java.time.LocalDate.now().minusMonths(1);
    String expiryDate = String.format("%02d/%02d", past.getMonthValue(), past.getYear() % 100);
    assertFalse(CheckoutMovies.isValidExpiryDate(expiryDate));
}

@Test
public void testIsValidExpiryDateFailure_InvalidMonth_13() {
    assertFalse(CheckoutMovies.isValidExpiryDate("13/25"));
}

@Test
public void testIsValidExpiryDateFailure_InvalidMonth_00() {
    assertFalse(CheckoutMovies.isValidExpiryDate("00/25"));
}

@Test
public void testIsValidExpiryDateFailure_WrongFormat() {
    assertFalse(CheckoutMovies.isValidExpiryDate("12-25"));
}

    @Test
    public void testIsValidCVVSuccess_ThreeDigits() {
        assertTrue(CheckoutMovies.isValidCVV("123"));
    }

    @Test
    public void testIsValidCVVSuccess_ThreeDigitsWithTrailingSpace() {
        assertTrue("Trailing space", CheckoutMovies.isValidCVV("123 "));
    }

    @Test
    public void testIsValidCVVSuccess_ThreeDigitsWithLeadingSpace() {
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
    public void testIsValidDiscountCodeFailure_InvalidCode() {
        assertFalse("Invalid discount code", checkoutIsValidDiscountCode("INVALIDCODE"));
    }

    @Test
    public void testGetDiscountPercentageByCodeFailure_InvalidCode() {
        assertEquals("INVALIDCODE should return 0%", 0, checkoutGetDiscountPercentageByCode("INVALIDCODE"));
    }

    @Test
    public void testGetDiscountPercentageByCodeFailure_EmptyString() {
        assertEquals("Empty string should return 0%", 0, checkoutGetDiscountPercentageByCode(""));
    }

    @Test
    public void testIsValidCardTypeFailure_Amex() {
        assertFalse("Not Visa/MasterCard", CheckoutMovies.isValidCardType("Amex"));
    }

    @Test
    public void testIsValidCardTypeFailure_EmptyString() {
        assertFalse("Empty string", CheckoutMovies.isValidCardType(""));
    }

    @Test
    public void testIsValidCardTypeFailure_NullInput() {
        assertFalse("Null input", CheckoutMovies.isValidCardType(null));
    }

    @Test
    public void testIsValidCardholderNameFailure_ContainsNumbers() {
        assertFalse("Contains numbers", CheckoutMovies.isValidCardholderName("John123"));
    }

    @Test
    public void testIsValidCardholderNameFailure_SpecialCharactersAtSign() {
        assertFalse("Special characters @", CheckoutMovies.isValidCardholderName("John@Doe"));
    }

    @Test
    public void testIsValidCardholderNameFailure_EmptyString() {
        assertFalse("Empty string", CheckoutMovies.isValidCardholderName(""));
    }

    @Test
    public void testIsValidCardholderNameFailure_NullInput() {
        assertFalse("Null input", CheckoutMovies.isValidCardholderName(null));
    }

    @Test
    public void testIsValidCardholderNameFailure_NumbersAtEnd() {
        assertFalse("Numbers in name", CheckoutMovies.isValidCardholderName("John Doe123"));
    }

    @Test
    public void testIsValidCardholderNameFailure_SpecialCharactersHyphen() {
        assertFalse("Special characters hyphen", CheckoutMovies.isValidCardholderName("John-Doe"));
    }

    @Test
    public void testIsValidCardNumberFailure_TooShort() {
        assertFalse("Too short", CheckoutMovies.isValidCardNumber("1234"));
    }

    @Test
    public void testIsValidCardNumberFailure_TooLong() {
        assertFalse("Too long", CheckoutMovies.isValidCardNumber("12345678901234567"));
    }

    @Test
    public void testIsValidCardNumberFailure_ContainsLetters() {
        assertFalse("Contains letters", CheckoutMovies.isValidCardNumber("123456789012345a"));
    }

    @Test
    public void testIsValidCardNumberFailure_EmptyString() {
        assertFalse("Empty string", CheckoutMovies.isValidCardNumber(""));
    }

    @Test
    public void testIsValidCardNumberFailure_NullInput() {
        assertFalse("Null input", CheckoutMovies.isValidCardNumber(null));
    }

    @Test
    public void testIsValidCardNumberFailure_WithSpaces() {
        assertFalse("Spaces included", CheckoutMovies.isValidCardNumber("1234 5678 9012 3456"));
    }

    @Test
    public void testIsValidCardNumberFailure_WithHyphens() {
        assertFalse("Hyphens included", CheckoutMovies.isValidCardNumber("1234-5678-9012-3456"));
    }

    @Test
    public void testIsValidExpiryDateFailure_InvalidMonth13() {
        assertFalse("Invalid month 13", CheckoutMovies.isValidExpiryDate("13/25"));
    }

    @Test
    public void testIsValidExpiryDateFailure_InvalidMonth00() {
        assertFalse("Invalid month 00", CheckoutMovies.isValidExpiryDate("00/25"));
    }

    @Test
    public void testIsValidExpiryDateFailure_WrongFormat4DigitYear() {
        assertFalse("Wrong format 4-digit year", CheckoutMovies.isValidExpiryDate("12/2025"));
    }

    @Test
    public void testIsValidExpiryDateFailure_TooLongFormat() {
        assertFalse("Too long format", CheckoutMovies.isValidExpiryDate("12/25/2025"));
    }

    @Test
    public void testIsValidExpiryDateFailure_EmptyString() {
        assertFalse("Empty string", CheckoutMovies.isValidExpiryDate(""));
    }

    @Test
    public void testIsValidExpiryDateFailure_NullInput() {
        assertFalse("Null input", CheckoutMovies.isValidExpiryDate(null));
    }

    @Test
    public void testIsValidExpiryDateFailure_WrongSeparatorHyphen() {
        assertFalse("Wrong separator hyphen", CheckoutMovies.isValidExpiryDate("12-25"));
    }

    @Test
    public void testIsValidExpiryDateFailure_ShortYear() {
        assertFalse("Short year", CheckoutMovies.isValidExpiryDate("12/5"));
    }

    @Test
    public void testIsValidCVVFailure_TooShort() {
        assertFalse("Too short", CheckoutMovies.isValidCVV("12"));
    }

    @Test
    public void testIsValidCVVFailure_TooLong() {
        assertFalse("Too long", CheckoutMovies.isValidCVV("1234"));
    }

    @Test
    public void testIsValidCVVFailure_ContainsLetter() {
        assertFalse("Contains letter", CheckoutMovies.isValidCVV("12a"));
    }

    @Test
    public void testIsValidCVVFailure_EmptyString() {
        assertFalse("Empty string", CheckoutMovies.isValidCVV(""));
    }

    @Test
    public void testIsValidCVVFailure_NullInput() {
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