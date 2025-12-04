package tests.bookingMoviesTesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import src.primaryUseCases.bookingMovies.BookingMovies;
import src.dataStore;
import src.dataStore.Movie;

import java.util.ArrayList;

public class testBooking {

    private BookingMovies booking;
    private dataStore sampleDataStore;

    @Before
    public void setUp() {
        // Reset datastore static lists
        dataStore.setMovies(new ArrayList<>());
        dataStore.setBookings(new ArrayList<>());
        dataStore.setValidDiscountCodes(new ArrayList<>());
        dataStore.getHalls();

        sampleDataStore = new dataStore();  // Rebuild sample data
        booking = new BookingMovies(sampleDataStore);
    }

    // ---------------- BOOKING TESTS ONLY ---------------- //

    // 1. Valid booking
    @Test
    public void test_ValidBooking() {
        String id = booking.bookMovie("Inception", "10:00 AM");
        Assert.assertFalse(id.isEmpty());
    }

    // 2. Title case-insensitive
    @Test
    public void test_TitleCaseInsensitive() {
        String id = booking.bookMovie("inCEPtion", "10:00 AM");
        Assert.assertFalse(id.isEmpty());
    }

    // 3. Title with spaces around
    @Test
    public void test_TitleTrimmed() {
        String id = booking.bookMovie("   Inception   ", "10:00 AM");
        Assert.assertFalse(id.isEmpty());
    }

    // 4. Invalid title (not found)
    @Test
    public void test_TitleNotFound() {
        String id = booking.bookMovie("RandomMovie", "10:00 AM");
        Assert.assertEquals("", id);
    }

    // 5. Empty title
    @Test
    public void test_EmptyTitle() {
        String id = booking.bookMovie("", "10:00 AM");
        Assert.assertEquals("", id);
    }

    // 6. Null title
    @Test
    public void test_NullTitle() {
        String id = booking.bookMovie(null, "10:00 AM");
        Assert.assertEquals("", id);
    }

    // 7. Title with internal spaces (malformed)
    @Test
    public void test_InternalSpacesTitle() {
        String id = booking.bookMovie("In cep tion", "10:00 AM");
        Assert.assertEquals("", id);
    }

    // 8. Title with special characters
    @Test
    public void test_TitleWithSymbols() {
        String id = booking.bookMovie("Inception!!!", "10:00 AM");
        Assert.assertEquals("", id);
    }

    // 9. Title with emoji
    @Test
    public void test_TitleWithEmoji() {
        String id = booking.bookMovie("Inception 🎬", "10:00 AM");
        Assert.assertEquals("", id);
    }

    // 10. Unicode valid movie (French)
    @Test
    public void test_TitleUnicodeValid() {
        String id = booking.bookMovie("Amélie", "12:00 PM");
        Assert.assertFalse(id.isEmpty());
    }

    // ---------------- SHOWTIME TESTS ---------------- //

    // 11. Valid showtime
    @Test
    public void test_ValidShowtime() {
        String id = booking.bookMovie("Inception", "10:00 AM");
        Assert.assertFalse(id.isEmpty());
    }

    // 12. Showtime case-insensitive
    @Test
    public void test_ShowtimeCaseInsensitive() {
        String id = booking.bookMovie("Inception", "10:00 am");
        Assert.assertFalse(id.isEmpty());
    }

    // 13. Invalid showtime
    @Test
    public void test_ShowtimeInvalid() {
        String id = booking.bookMovie("Inception", "25:00");
        Assert.assertEquals("", id);
    }

    // 14. Empty showtime
    @Test
    public void test_ShowtimeEmpty() {
        String id = booking.bookMovie("Inception", "");
        Assert.assertEquals("", id);
    }

    // 15. Null showtime
    @Test
    public void test_ShowtimeNull() {
        String id = booking.bookMovie("Inception", null);
        Assert.assertEquals("", id);
    }

    // 16. Symbol showtime
    @Test
    public void test_ShowtimeSymbol() {
        String id = booking.bookMovie("Inception", "@@@");
        Assert.assertEquals("", id);
    }

    // 17. Emoji showtime
    @Test
    public void test_ShowtimeEmoji() {
        String id = booking.bookMovie("Inception", "10:00 AM 🎥");
        Assert.assertEquals("", id);
    }

    // 18. Showtime not in schedule
    @Test
    public void test_ShowtimeNotInSchedule() {
        String id = booking.bookMovie("Inception", "3:33 PM");
        Assert.assertEquals("", id);
    }

    // 19. Showtime leading spaces
    @Test
    public void test_ShowtimeLeadingSpaces() {
        String id = booking.bookMovie("Inception", "   10:00 AM");
        Assert.assertNotEquals("", id);
    }

    // 20. Showtime trailing spaces → allowed because trim()
    @Test
    public void test_ShowtimeTrailingSpaces() {
        String id = booking.bookMovie("Inception", "10:00 AM   ");
        Assert.assertFalse(id.isEmpty());
    }
}