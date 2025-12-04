import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        src.dataStore.Movie movie12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = bookingDataLayer1.bookMovie(movie12, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        src.dataStore.Movie movie9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = bookingDataLayer1.bookMovie(movie9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList13 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(movieList13);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList15 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = movieList15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(movieList14);
        org.junit.Assert.assertNull(movieList15);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList14 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = bookingDataLayer1.bookMovie(movie15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(bookingList14);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass14 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList13 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList15 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList16 = bookingDataLayer1.movies();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(movieList13);
        org.junit.Assert.assertNull(movieList14);
        org.junit.Assert.assertNull(bookingList15);
        org.junit.Assert.assertNull(movieList16);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass13 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList13 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(movieList13);
        org.junit.Assert.assertNull(movieList14);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList13 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList14 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList15 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(movieList13);
        org.junit.Assert.assertNull(bookingList14);
        org.junit.Assert.assertNull(movieList15);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = bookingDataLayer1.bookMovie(movie13, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass13 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(movieList14);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList13 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList15 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList16 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList17 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList18 = bookingDataLayer1.movies();
        src.dataStore.Movie movie19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = bookingDataLayer1.bookMovie(movie19, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(movieList13);
        org.junit.Assert.assertNull(movieList14);
        org.junit.Assert.assertNull(bookingList15);
        org.junit.Assert.assertNull(bookingList16);
        org.junit.Assert.assertNull(movieList17);
        org.junit.Assert.assertNull(movieList18);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList13 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(movieList13);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = bookingDataLayer1.bookMovie(movie13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass13 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(movieList14);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList14 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList15 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList16 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(bookingList14);
        org.junit.Assert.assertNull(movieList15);
        org.junit.Assert.assertNull(movieList16);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList13 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList14 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = bookingDataLayer1.bookMovie(movie15, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(movieList13);
        org.junit.Assert.assertNull(bookingList14);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList14 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList15 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList16 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(bookingList14);
        org.junit.Assert.assertNull(movieList15);
        org.junit.Assert.assertNull(bookingList16);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = bookingList13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass12 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass10 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = bookingDataLayer1.bookMovie(movie11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = bookingDataLayer1.bookMovie(movie10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass13 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = bookingDataLayer1.bookMovie(movie10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(movieList12);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList14 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList15 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList16 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList17 = bookingDataLayer1.bookings();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(bookingList14);
        org.junit.Assert.assertNull(movieList15);
        org.junit.Assert.assertNull(bookingList16);
        org.junit.Assert.assertNull(bookingList17);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList15 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList16 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(movieList14);
        org.junit.Assert.assertNull(movieList15);
        org.junit.Assert.assertNull(movieList16);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList15 = bookingDataLayer1.movies();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(movieList14);
        org.junit.Assert.assertNull(movieList15);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        src.dataStore.Movie movie11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = bookingDataLayer1.bookMovie(movie11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = bookingDataLayer1.bookMovie(movie11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = movieList7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass9 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass12 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList13 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList15 = bookingDataLayer1.movies();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(movieList13);
        org.junit.Assert.assertNull(movieList14);
        org.junit.Assert.assertNull(movieList15);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList13 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = movieList13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(movieList13);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        src.dataStore.Movie movie10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = bookingDataLayer1.bookMovie(movie10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList13 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList14 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList15 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList16 = bookingDataLayer1.movies();
        src.dataStore.Movie movie17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = bookingDataLayer1.bookMovie(movie17, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(movieList13);
        org.junit.Assert.assertNull(bookingList14);
        org.junit.Assert.assertNull(bookingList15);
        org.junit.Assert.assertNull(movieList16);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList13 = bookingDataLayer1.movies();
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(movieList13);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        src.dataStore.Movie movie11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = bookingDataLayer1.bookMovie(movie11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList15 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList16 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList17 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList18 = bookingDataLayer1.movies();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(movieList14);
        org.junit.Assert.assertNull(bookingList15);
        org.junit.Assert.assertNull(movieList16);
        org.junit.Assert.assertNull(movieList17);
        org.junit.Assert.assertNull(movieList18);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList15 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(movieList14);
        org.junit.Assert.assertNull(movieList15);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        src.dataStore.Movie movie13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = bookingDataLayer1.bookMovie(movie13, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(movieList12);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList13 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList14 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList15 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList16 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList17 = bookingDataLayer1.bookings();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(movieList13);
        org.junit.Assert.assertNull(bookingList14);
        org.junit.Assert.assertNull(bookingList15);
        org.junit.Assert.assertNull(movieList16);
        org.junit.Assert.assertNull(bookingList17);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass10 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = bookingList12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(movieList14);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(movieList14);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = bookingList10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(movieList14);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList15 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList16 = bookingDataLayer1.movies();
        src.dataStore.Movie movie17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = bookingDataLayer1.bookMovie(movie17, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(movieList14);
        org.junit.Assert.assertNull(movieList15);
        org.junit.Assert.assertNull(movieList16);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = bookingList11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = bookingDataLayer1.bookMovie(movie12, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = bookingDataLayer1.bookMovie(movie14, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList13 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList15 = bookingDataLayer1.movies();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(movieList13);
        org.junit.Assert.assertNull(movieList14);
        org.junit.Assert.assertNull(movieList15);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList13 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList15 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList16 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList17 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(movieList13);
        org.junit.Assert.assertNull(movieList14);
        org.junit.Assert.assertNull(bookingList15);
        org.junit.Assert.assertNull(bookingList16);
        org.junit.Assert.assertNull(movieList17);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList15 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList16 = bookingDataLayer1.movies();
        src.dataStore.Movie movie17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = bookingDataLayer1.bookMovie(movie17, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(movieList14);
        org.junit.Assert.assertNull(bookingList15);
        org.junit.Assert.assertNull(movieList16);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = movieList14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(movieList14);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = bookingDataLayer1.bookMovie(movie12, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass13 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = bookingList11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList13 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList15 = bookingDataLayer1.bookings();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(movieList13);
        org.junit.Assert.assertNull(movieList14);
        org.junit.Assert.assertNull(bookingList15);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList13 = bookingDataLayer1.movies();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(movieList13);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList13 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass14 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(movieList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass13 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList15 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList16 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList17 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList18 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass19 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(movieList14);
        org.junit.Assert.assertNull(bookingList15);
        org.junit.Assert.assertNull(bookingList16);
        org.junit.Assert.assertNull(bookingList17);
        org.junit.Assert.assertNull(bookingList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }
}

