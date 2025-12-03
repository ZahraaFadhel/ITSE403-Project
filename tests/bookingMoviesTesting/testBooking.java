package tests.bookingMoviesTesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import src.primaryUseCases.bookingMovies.BookingMovies;
import src.dataStore;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.InputStream;

public class testBooking {

    private BookingMovies booking;
    private dataStore sampleDataStore;

    @Before
    public void setUp() {

        sampleDataStore = new dataStore();

        // Reset static lists for clean testing
        dataStore.setBookings(new ArrayList<>());
        dataStore.setMovies(sampleDataStore.getMovies());

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

    @Test
    public void testPL_CancelBooking_CaseInsensitiveID() {

        String bookingId = booking.bookMovie("Inception", "10:00 AM");
        String lowercaseId = bookingId.toLowerCase();
        String userInput = lowercaseId + "\n";
        simulateInput(userInput);
        booking = new BookingMovies(sampleDataStore, new Scanner(System.in));
        booking.cancelBookingPrompt();
        boolean exists = sampleDataStore.getBookings()
                .stream()
                .anyMatch(b -> b.getBookingId().equals(bookingId));

        Assert.assertFalse("Cancel should work even with lowercase ID", exists);
    }

    @Test
    public void test_BookMovie_TitleWithSpaces() {
        String bookingId = booking.bookMovie("   Inception   ", "10:00 AM");

        Assert.assertNotEquals("Booking ID should not be empty for trimmed title", "", bookingId);

        boolean exists = sampleDataStore.getBookings()
                .stream()
                .anyMatch(b -> b.getBookingId().equals(bookingId));

        Assert.assertTrue("Booking should be created even with spaces", exists);
    }

    @Test
    public void test_BookMovie_UppercaseTitle() {
        String bookingId = booking.bookMovie("INCEPTION", "10:00 AM");

        Assert.assertNotEquals("Uppercase title should still match movie", "", bookingId);

        boolean exists = sampleDataStore.getBookings()
                .stream()
                .anyMatch(b -> b.getBookingId().equals(bookingId));

        Assert.assertTrue("Booking should succeed with uppercase title", exists);
    }

    @Test
    public void test_BookMultipleMovies() {
        int before = sampleDataStore.getBookings().size();

        booking.bookMovie("Inception", "10:00 AM");
        booking.bookMovie("The Godfather", "12:00 PM");

        int after = sampleDataStore.getBookings().size();

        Assert.assertEquals("Booking count should increase by 2", before + 2, after);
    }

    @Test
    public void test_CancelOnlySelectedBooking() {

        String id1 = booking.bookMovie("Inception", "10:00 AM");
        String id2 = booking.bookMovie("The Godfather", "12:00 PM");

        booking.cancelBooking(id1);

        boolean stillExists1 = sampleDataStore.getBookings()
                .stream()
                .anyMatch(b -> b.getBookingId().equals(id1));

        boolean stillExists2 = sampleDataStore.getBookings()
                .stream()
                .anyMatch(b -> b.getBookingId().equals(id2));

        Assert.assertFalse("First booking should be deleted", stillExists1);
        Assert.assertTrue("Second booking must remain", stillExists2);
    }

    @Test
    public void test_CancelBooking_CaseInsensitiveID() {
        String bookingId = booking.bookMovie("Inception", "10:00 AM");

        String lowercaseId = bookingId.toLowerCase();

        boolean canceled = booking.cancelBooking(lowercaseId);

        Assert.assertTrue("Cancel should ignore ID letter casing", canceled);
    }

    @Test
    public void test_BookMovie_MinimumValidTitle() {
        String bookingId = booking.bookMovie("Up", "10:00 AM");

        Assert.assertNotEquals("Should book even with very short title", "", bookingId);
    }

    @Test
    public void test_CancelBooking_Twice() {
        String bookingId = booking.bookMovie("Inception", "10:00 AM");

        boolean firstCancel = booking.cancelBooking(bookingId);
        boolean secondCancel = booking.cancelBooking(bookingId);

        Assert.assertTrue("First cancel should succeed", firstCancel);
        Assert.assertFalse("Second cancel should fail", secondCancel);
    }

    @Test
    public void test_ViewBookings_NoBookingsAfterClear() {
        dataStore.clearAllBookings();

        int count = booking.viewBookings();

        Assert.assertEquals("Should return 0 when no bookings", 0, count);
    }

    // --------------------- Helper Method ---------------------------- //

    private void simulateInput(String data) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    }
}
