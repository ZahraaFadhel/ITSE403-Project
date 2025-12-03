package tests.bookingMoviesTesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import src.primaryUseCases.bookingMovies.BookingMovies;
import src.dataStore;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.io.InputStream;


public class testBooking {

    private BookingMovies booking;
    private dataStore sampleDataStore;

    @Before
    public void setUp() {
        sampleDataStore = new dataStore();
        booking = new BookingMovies(sampleDataStore);
    }

    // ------------------ CORE FUNCTION TESTS --------------------------- //

    @Test
    public void test_BookValidMovieAndShowtime() {
        String bookingId = booking.bookMovie("Inception", "10:00 AM");

        Assert.assertNotEquals("Booking ID should not be empty", "", bookingId);

        boolean exists = sampleDataStore.getBookings()
                .stream()
                .anyMatch(b -> b.getBookingId().equals(bookingId));

        Assert.assertTrue("Booking should exist in the datastore", exists);
    }

    @Test
    public void test_BookInvalidMovie() {
        String bookingId = booking.bookMovie("NotAMovie", "10:00 AM");
        Assert.assertEquals("Invalid movie should return empty booking ID", "", bookingId);
    }

    @Test
    public void test_InvalidShowtime() {
        String bookingId = booking.bookMovie("Inception", "INVALID");
        Assert.assertEquals("Invalid showtime should return empty booking ID", "", bookingId);
    }

    @Test
    public void test_CancelExistingBooking() {
        // First book a movie
        String bookingId = booking.bookMovie("Inception", "10:00 AM");

        boolean canceled = booking.cancelBooking(bookingId);

        Assert.assertTrue("Cancel should succeed for existing ID", canceled);
    }

    @Test
    public void test_CancelNonexistentBooking() {
        boolean canceled = booking.cancelBooking("B999");
        Assert.assertFalse("Cancel should fail for non-existing ID", canceled);
    }

    @Test
    public void test_ViewBookingsCount() {
        int before = booking.viewBookings();
        booking.bookMovie("Inception", "10:00 AM");
        int after = booking.viewBookings();

        Assert.assertEquals("View bookings should increase by 1", before + 1, after);
    }

    // ---------------- USER INPUT PROMPT TESTS (PL Equivalent) ---------------- //

 @Test
public void testPL_BookMoviePrompt() {
    String userInput = "Inception\n10:00 AM\n";
    simulateInput(userInput);

    // RECREATE booking with NEW scanner linked to new System.in
    booking = new BookingMovies(sampleDataStore, new Scanner(System.in));

    booking.bookMoviePrompt();

    assertTrue("Should have at least 1 booking",
        sampleDataStore.getBookings().size() > 0);
}


   @Test
public void testPL_CancelMoviePrompt() {

    String bookingId = booking.bookMovie("Inception", "10:00 AM");

    String userInput = bookingId + "\n";
    simulateInput(userInput);

    // RECREATE booking with NEW scanner linked to new System.in
    booking = new BookingMovies(sampleDataStore, new Scanner(System.in));

    booking.cancelBookingPrompt();

    boolean stillExists = sampleDataStore.getBookings()
            .stream()
            .anyMatch(b -> b.getBookingId().equals(bookingId));

    Assert.assertFalse("Booking should be removed", stillExists);
}

    @Test
    public void testPL_Start_InvalidChoice() {

        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            String input = "99\n4\n"; // invalid then return to menu
            System.setIn(new ByteArrayInputStream(input.getBytes()));

            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            booking.start();

            String output = outContent.toString();

            Assert.assertTrue(
                    "Should display invalid input message",
                   output.contains("Invalid choice."));

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    // --------------------- Helper Method ---------------------------- //

    private void simulateInput(String data) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    }
}
