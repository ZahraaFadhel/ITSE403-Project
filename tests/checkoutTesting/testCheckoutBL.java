package tests.checkoutTesting;

/**
 * Test Class for Checkout Business Layer
 * Tests scenarios like calculating total price, applying discounts, and handling checkout.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.List;

import src.primaryUseCases.checkout.checkoutBusinessLayer;
import src.primaryUseCases.checkout.checkoutDataLayer;
import src.dataStore.Booking;

public class testCheckoutBL {

    private checkoutBusinessLayer checkoutBL;
    private checkoutDataLayer checkoutDL;

    @Before
    public void setUp() {
        checkoutDL = new checkoutDataLayer();
        new src.dataStore();
        checkoutBL = new checkoutBusinessLayer(checkoutDL);
    }

    // --------- Success Cases ---------

    /**
     * Test: Bookings Initialization
     * Verifies that bookings are initialized correctly.
     */
    @Test
    public void testBookings() {
        List<Booking> bookings = checkoutDL.bookings();
        assertNotNull("Bookings list should not be null", bookings);
        assertEquals("DataStore contains 4 sample bookings ensure they were initialized correctly", 4, bookings.size());
    }

    /**
     * Test: Calculate Total Price
     * Verifies that the total price is calculated correctly.
     */
    @Test
    public void testCalculateTotalPrice() {
        List<Booking> bookings = checkoutDL.bookings();
        double totalPrice = checkoutBusinessLayer.calculateTotalPrice(bookings);
        assertEquals("Total price should be 20.0 based on sample bookings", 20.0, totalPrice, 0.001);
    }

    /**
     * Test: Apply Valid Discount Code
     * Verifies that a valid discount code reduces the price correctly.
     */
    @Test
    public void testApplyDiscountCode_ValidCode() {
        String discountCode = "NEWYEAR25";
        double originalPrice = 100.0;
        double discountedPrice = checkoutBL.ApplyDiscountCode(discountCode, originalPrice);
        assertEquals("Discount code NEWYEAR25 should reduce the price by 25%", 75.0, discountedPrice, 0.001);
    }

    /**
     * Test: Proceed to Checkout with New Payment Method
     * Verifies that checkout succeeds with a new payment method.
     */
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
        checkoutBL = new checkoutBusinessLayer(checkoutDL);
        boolean result = checkoutBL.proceedToCheckout();
        assertTrue("Checkout with new payment method should succeed", result);
    }

    // --------- Failure Cases ---------

    /**
     * Test: Apply Invalid Discount Code
     * Verifies that an invalid discount code does not change the price.
     */
    @Test
    public void testApplyDiscountCode_InvalidCode() {
        String discountCode = "INVALIDCODE";
        double originalPrice = 100.0;
        double discountedPrice = checkoutBL.ApplyDiscountCode(discountCode, originalPrice);
        assertEquals("Invalid discount code should not change the price", 100.0, discountedPrice, 0.001);
    }

    /**
     * Test: Proceed to Checkout with Invalid Card Type
     * Verifies that checkout fails with an invalid card type.
     */
    @Test
    public void testProceedToCheckout_InvalidCardType() {
        String input = "2\n" +
                       "Amex\n" +
                       "no\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        checkoutBL = new checkoutBusinessLayer(checkoutDL);
        boolean result = checkoutBL.proceedToCheckout();
        assertFalse("Checkout with invalid card type should fail", result);
    }

    /**
     * Test: Handle Saved Payment Method (No Saved Method)
     * Verifies that checkout fails if no saved payment method exists.
     */
    @Test
    public void testHandleSavedPaymentMethod_NoSavedMethod() {
        src.dataStore.updatePaymentMethod(null);
        String input = "1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        checkoutBL = new checkoutBusinessLayer(checkoutDL);
        boolean result = checkoutBL.proceedToCheckout();
        assertFalse("Checkout should fail if no saved payment method exists", result);
    }

    /**
     * Test: Apply Empty Discount Code
     * Verifies that an empty discount code does not change the price.
     */
    @Test
    public void testApplyDiscountCode_EmptyCode() {
        String discountCode = "";
        double originalPrice = 100.0;
        double discountedPrice = checkoutBL.ApplyDiscountCode(discountCode, originalPrice);
        assertEquals("Empty discount code should not change the price", 100.0, discountedPrice, 0.001);
    }
}
