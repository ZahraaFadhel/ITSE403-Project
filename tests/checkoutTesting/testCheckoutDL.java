package tests.checkoutTesting;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import src.primaryUseCases.checkout.checkoutDataLayer;
import src.dataStore.*;

import static org.junit.Assert.*;

public class testCheckoutDL {

    private checkoutDataLayer checkoutDL;

    @Before
    public void setUp() {
        checkoutDL = new checkoutDataLayer();
        new src.dataStore();
    }

    // ----------- Success Cases -----------

    @Test
    public void testBookingsInitialization() {
        List<Booking> bookings = checkoutDL.bookings();
        assertNotNull("Bookings list should not be null", bookings);
        assertEquals("DataStore contains 4 sample bookings", 4, bookings.size());
    }

    @Test
    public void testValidDiscountCodesInitialization() {
        List<ValidDiscountCode> discountCodes = checkoutDL.validDiscountCodes();
        assertNotNull("Discount codes list should not be null", discountCodes);
        assertEquals("DataStore contains 3 sample discount codes", 3, discountCodes.size());
    }

    @Test
    public void testIsValidDiscountCodeSuccess() {
        assertTrue(checkoutDL.isValidDiscountCode("NEWYEAR25"));
        assertTrue("Valid discount code (case insensitive)", checkoutDL.isValidDiscountCode("eidmubarak15"));
        assertTrue("Trailing space", checkoutDL.isValidDiscountCode("NEWYEAR25 "));
        assertTrue("Leading space", checkoutDL.isValidDiscountCode(" NEWYEAR25"));
    }

    @Test
    public void testGetDiscountPercentageByCodeSuccess() {
        assertEquals(25, checkoutDL.getDiscountPercentageByCode("NEWYEAR25"));
        assertEquals(15, checkoutDL.getDiscountPercentageByCode("EIDMUBARAK15"));
        assertEquals("Trailing space", 25, checkoutDL.getDiscountPercentageByCode("NEWYEAR25 "));
        assertEquals("Leading space", 25, checkoutDL.getDiscountPercentageByCode(" NEWYEAR25"));
    }

    @Test
    public void testIsValidCardTypeSuccess() {
        assertTrue(checkoutDataLayer.isValidCardType("Visa"));
        assertTrue(checkoutDataLayer.isValidCardType("MasterCard"));
        assertTrue("Case insensitive VISA", checkoutDataLayer.isValidCardType("VISA"));
        assertTrue("Case insensitive MASTERCARD", checkoutDataLayer.isValidCardType("MASTERCARD"));
    }

    @Test
    public void testIsValidCardholderNameSuccess() {
        assertTrue(checkoutDataLayer.isValidCardholderName("John Doe"));
        assertTrue(checkoutDataLayer.isValidCardholderName("Alice"));
    }

    @Test
    public void testIsValidCardNumberSuccess() {
        assertTrue(checkoutDataLayer.isValidCardNumber("1234567890123456"));
    }

    @Test
    public void testIsValidExpiryDateSuccess() {
        assertTrue(checkoutDataLayer.isValidExpiryDate("12/25"));
        assertTrue(checkoutDataLayer.isValidExpiryDate("01/30"));
    }

    @Test
    public void testIsValidCVVSuccess() {
        assertTrue(checkoutDataLayer.isValidCVV("123"));
        assertTrue("Trailing space", checkoutDataLayer.isValidCVV("123 "));
        assertTrue("Leading space", checkoutDataLayer.isValidCVV(" 123"));
    }

    // ----------- Failure Cases -----------

    @Test
    public void testIsValidDiscountCodeFailure() {
        assertFalse("Invalid discount code", checkoutDL.isValidDiscountCode("INVALIDCODE"));
    }

    @Test
    public void testGetDiscountPercentageByCodeFailure() {
        assertEquals("INVALIDCODE should return 0%", 0, checkoutDL.getDiscountPercentageByCode("INVALIDCODE"));
        assertEquals("Empty string should return 0%", 0, checkoutDL.getDiscountPercentageByCode(""));
    }

    @Test
    public void testIsValidCardTypeFailure() {
        assertFalse("Not Visa/MasterCard", checkoutDataLayer.isValidCardType("Amex"));
        assertFalse("Empty string", checkoutDataLayer.isValidCardType(""));
        assertFalse("Null input", checkoutDataLayer.isValidCardType(null));
    }

    @Test
    public void testIsValidCardholderNameFailure() {
        assertFalse("Contains numbers", checkoutDataLayer.isValidCardholderName("John123"));
        assertFalse("Special characters", checkoutDataLayer.isValidCardholderName("John@Doe"));
        assertFalse("Empty string", checkoutDataLayer.isValidCardholderName(""));
        assertFalse("Null input", checkoutDataLayer.isValidCardholderName(null));
        assertFalse("Numbers in name", checkoutDataLayer.isValidCardholderName("John Doe123"));
        assertFalse("Special characters", checkoutDataLayer.isValidCardholderName("John-Doe"));
    }

    @Test
    public void testIsValidCardNumberFailure() {
        assertFalse("Too short", checkoutDataLayer.isValidCardNumber("1234"));
        assertFalse("Too long", checkoutDataLayer.isValidCardNumber("12345678901234567"));
        assertFalse("Contains letters", checkoutDataLayer.isValidCardNumber("123456789012345a"));
        assertFalse("Empty string", checkoutDataLayer.isValidCardNumber(""));
        assertFalse("Null input", checkoutDataLayer.isValidCardNumber(null));
        assertFalse("Spaces included", checkoutDataLayer.isValidCardNumber("1234 5678 9012 3456"));
        assertFalse("Hyphens included", checkoutDataLayer.isValidCardNumber("1234-5678-9012-3456"));
    }

    @Test
    public void testIsValidExpiryDateFailure() {
        assertFalse("Invalid month", checkoutDataLayer.isValidExpiryDate("13/25"));
        assertFalse("Invalid month", checkoutDataLayer.isValidExpiryDate("00/25"));
        assertFalse("Wrong format", checkoutDataLayer.isValidExpiryDate("12/2025"));
        assertFalse("Too long format", checkoutDataLayer.isValidExpiryDate("12/25/2025"));
        assertFalse("Empty string", checkoutDataLayer.isValidExpiryDate(""));
        assertFalse("Null input", checkoutDataLayer.isValidExpiryDate(null));
        assertFalse("Wrong separator", checkoutDataLayer.isValidExpiryDate("12-25"));
        assertFalse("Short year", checkoutDataLayer.isValidExpiryDate("12/5"));
    }

    @Test
    public void testIsValidCVVFailure() {
        assertFalse("Too short", checkoutDataLayer.isValidCVV("12"));
        assertFalse("Too long", checkoutDataLayer.isValidCVV("1234"));
        assertFalse("Contains letter", checkoutDataLayer.isValidCVV("12a"));
        assertFalse("Empty string", checkoutDataLayer.isValidCVV(""));
        assertFalse("Null input", checkoutDataLayer.isValidCVV(null));
    }
}

// Phase 6: This file was already merged into main. This comment was added so it appears for review, in case further changes are needed.