/**
 * Test Class for Checkout Presentation Layer
 * Tests scenarios like empty shopping cart and returning to the main menu.
 */
package tests.checkoutTesting;

import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import src.dataStore;
import src.primaryUseCases.checkout.checkoutBusinessLayer;
import src.primaryUseCases.checkout.checkoutDataLayer;
import src.primaryUseCases.checkout.checkoutPresentationLayer;

public class testCheckoutPL {

    private checkoutPresentationLayer checkoutPL;
    private checkoutBusinessLayer checkoutBL;
    private checkoutDataLayer checkoutDL;

    private ByteArrayOutputStream outputStream;
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @Before
    public void setUp() {
        checkoutDL = new checkoutDataLayer();
        dataStore dataStore = new dataStore(); 
        checkoutBL = new checkoutBusinessLayer(checkoutDL);
        checkoutPL = new checkoutPresentationLayer(checkoutBL);

        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    /**
     * Test: Empty Shopping Cart
     * Verifies correct handling of an empty cart.
     */
    @Test
    public void testStart_EmptyShoppingCart() {
        dataStore.getBookings().clear();
        checkoutPL.start();
        String output = outputStream.toString();
        assertTrue(output.contains("Sorry Shopping cart is empty, come back after booking tickets"));
    }

    /**
     * Test: Return to Main Menu
     * Checks if the user is returned to the main menu correctly.
     */
    @Test
    public void testReturnToMainMenu() {
        String input = "y\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        checkoutBusinessLayer businessLayer = new checkoutBusinessLayer(checkoutDL);
        checkoutPresentationLayer checkoutPL = new checkoutPresentationLayer(businessLayer);

        checkoutPL.returnToMainMenu();

        String output = outputStream.toString();
        assertTrue(output.contains("Returning to browsing menu >>>"));
    }
}

// Phase 6: This file was already merged into main. This comment was added so it appears for review, in case further changes are needed.