import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = bookingDataLayer1.bookMovie(movie4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass5 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
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
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        src.dataStore.Movie movie6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = bookingDataLayer1.bookMovie(movie6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        src.dataStore.Movie movie2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = bookingDataLayer1.bookMovie(movie2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        src.dataStore.Movie movie2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = bookingDataLayer1.bookMovie(movie2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = bookingDataLayer1.bookMovie(movie6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = bookingList7.getClass();
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
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = bookingDataLayer1.bookMovie(movie3, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bookingDataLayer1.viewBookings();
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
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        src.dataStore.Movie movie5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = bookingDataLayer1.bookMovie(movie5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        src.dataStore.Movie movie7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = bookingDataLayer1.bookMovie(movie7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
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
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        src.dataStore.Movie movie9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = bookingDataLayer1.bookMovie(movie9, "");
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
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
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
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
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
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass6 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
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
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass5 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass7 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass4 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass3 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        src.dataStore.Movie movie6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = bookingDataLayer1.bookMovie(movie6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = bookingDataLayer1.bookMovie(movie6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = bookingDataLayer1.bookMovie(movie5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = movieList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = bookingList4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.lang.Class<?> wildcardClass2 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
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
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
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
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = bookingDataLayer1.bookMovie(movie9, "");
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
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = bookingDataLayer1.bookMovie(movie5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
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
        java.lang.Class<?> wildcardClass11 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = bookingList8.getClass();
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
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
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
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = bookingList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
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
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
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
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        src.dataStore.Movie movie6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = bookingDataLayer1.bookMovie(movie6, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        src.dataStore.Movie movie8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = bookingDataLayer1.bookMovie(movie8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = bookingDataLayer1.bookMovie(movie9, "");
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
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
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
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = bookingList7.getClass();
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
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = bookingDataLayer1.bookMovie(movie7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bookingDataLayer1.viewBookings();
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
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
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
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
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
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        src.dataStore.Movie movie6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = bookingDataLayer1.bookMovie(movie6, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bookingDataLayer1.viewBookings();
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
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass7 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = bookingList9.getClass();
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
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass3 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = bookingList3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = movieList6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
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
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        src.dataStore.Movie movie5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = bookingDataLayer1.bookMovie(movie5, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bookingDataLayer1.viewBookings();
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
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bookingDataLayer1.viewBookings();
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
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = bookingList6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass7 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(movieList3);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = bookingDataLayer1.bookMovie(movie5, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass5 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bookingDataLayer1.viewBookings();
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
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
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
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        // The following exception was thrown during execution in test generation
        try {
            int int10 = bookingDataLayer1.viewBookings();
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
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
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
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bookingDataLayer1.viewBookings();
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
        org.junit.Assert.assertNull(movieList8);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bookingDataLayer1.viewBookings();
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
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = movieList8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = bookingList8.getClass();
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
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass7 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = movieList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        src.dataStore.Movie movie8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = bookingDataLayer1.bookMovie(movie8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        src.dataStore.Movie movie8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = bookingDataLayer1.bookMovie(movie8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
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
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
        java.lang.Class<?> wildcardClass12 = bookingDataLayer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        src.dataStore.Movie movie7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = bookingDataLayer1.bookMovie(movie7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
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
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass7 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = bookingDataLayer1.bookMovie(movie8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        src.dataStore.Movie movie8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = bookingDataLayer1.bookMovie(movie8, "hi!");
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
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = bookingList8.getClass();
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
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
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
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bookingDataLayer1.viewBookings();
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
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(movieList7);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = bookingList9.getClass();
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
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass4 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = movieList9.getClass();
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
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = bookingDataLayer1.bookMovie(movie7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bookingDataLayer1.viewBookings();
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
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = bookingDataLayer1.bookMovie(movie6, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        src.dataStore.Movie movie8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = bookingDataLayer1.bookMovie(movie8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = movieList3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        java.lang.Class<?> wildcardClass11 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
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
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = movieList8.getClass();
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
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        src.dataStore.Movie movie6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = bookingDataLayer1.bookMovie(movie6, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = bookingDataLayer1.bookMovie(movie3, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bookingDataLayer1.viewBookings();
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
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
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
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = bookingDataLayer1.bookMovie(movie4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bookingDataLayer1.viewBookings();
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
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        java.lang.Class<?> wildcardClass13 = bookingDataLayer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = bookingList6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        java.lang.Class<?> wildcardClass10 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
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
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass8 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = bookingList6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = bookingList9.getClass();
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
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(movieList5);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = bookingDataLayer1.bookMovie(movie8, "");
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
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bookingDataLayer1.viewBookings();
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
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        java.lang.Class<?> wildcardClass11 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        java.lang.Class<?> wildcardClass11 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
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
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
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
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        java.lang.Class<?> wildcardClass10 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        java.lang.Class<?> wildcardClass11 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bookingDataLayer1.viewBookings();
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
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bookingDataLayer1.viewBookings();
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
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = bookingList8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
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
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = movieList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
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
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = bookingDataLayer1.bookMovie(movie7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bookingDataLayer1.viewBookings();
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
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass9 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
        java.lang.Class<?> wildcardClass10 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass6 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        src.dataStore.Movie movie9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = bookingDataLayer1.bookMovie(movie9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
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
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
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
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        src.dataStore.Movie movie7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = bookingDataLayer1.bookMovie(movie7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = bookingDataLayer1.bookMovie(movie8, "hi!");
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
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        src.dataStore.Movie movie4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = bookingDataLayer1.bookMovie(movie4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = bookingDataLayer1.bookMovie(movie6, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass7 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass9 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass13 = bookingDataLayer1.getClass();
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
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass7 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = movieList7.getClass();
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
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = movieList2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = bookingList7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass9 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        java.lang.Class<?> wildcardClass12 = bookingDataLayer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(movieList8);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        src.dataStore.Movie movie5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = bookingDataLayer1.bookMovie(movie5, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
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
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass11 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = bookingDataLayer1.bookMovie(movie8, "");
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
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(movieList8);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass7 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = bookingList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass6 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        src.dataStore.Movie movie7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = bookingDataLayer1.bookMovie(movie7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bookingDataLayer1.viewBookings();
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
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bookingDataLayer1.viewBookings();
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
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = movieList12.getClass();
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
        org.junit.Assert.assertNull(movieList12);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = movieList7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = bookingList10.getClass();
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
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = movieList10.getClass();
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
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
            java.lang.Class<?> wildcardClass10 = bookingList9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        java.lang.Class<?> wildcardClass11 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bookingDataLayer1.viewBookings();
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
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        src.dataStore.Movie movie14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = bookingDataLayer1.bookMovie(movie14, "");
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
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        src.dataStore.Movie movie6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = bookingDataLayer1.bookMovie(movie6, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
            java.lang.Class<?> wildcardClass11 = bookingList10.getClass();
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
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        java.lang.Class<?> wildcardClass10 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass9 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bookingDataLayer1.viewBookings();
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
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        src.dataStore.Movie movie8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = bookingDataLayer1.bookMovie(movie8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = bookingDataLayer1.bookMovie(movie8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass9 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass9 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bookingDataLayer1.viewBookings();
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
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
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
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = bookingDataLayer1.bookMovie(movie9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
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
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass9 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
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
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(movieList14);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        java.lang.Class<?> wildcardClass10 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = bookingList8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
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
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = movieList12.getClass();
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
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        src.dataStore.Movie movie7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = bookingDataLayer1.bookMovie(movie7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        java.lang.Class<?> wildcardClass14 = bookingDataLayer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
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
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass9 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = bookingList8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = bookingDataLayer1.bookMovie(movie8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = bookingDataLayer1.bookMovie(movie9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
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
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        src.dataStore.Movie movie11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = bookingDataLayer1.bookMovie(movie11, "");
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
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = bookingDataLayer1.bookMovie(movie5, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = movieList7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = bookingDataLayer1.bookMovie(movie9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = bookingDataLayer1.bookMovie(movie4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass6 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = bookingList8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        java.lang.Class<?> wildcardClass12 = bookingDataLayer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass9 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = bookingList3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        src.dataStore.Movie movie10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = bookingDataLayer1.bookMovie(movie10, "hi!");
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
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        src.dataStore.Movie movie9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = bookingDataLayer1.bookMovie(movie9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
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
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        src.dataStore.Movie movie13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = bookingDataLayer1.bookMovie(movie13, "hi!");
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
        org.junit.Assert.assertNull(movieList12);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass8 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        src.dataStore.Movie movie8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = bookingDataLayer1.bookMovie(movie8, "");
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
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        src.dataStore.Movie movie13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = bookingDataLayer1.bookMovie(movie13, "hi!");
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
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
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
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = bookingDataLayer1.bookMovie(movie9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass8 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = bookingList10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass7 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = movieList9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        src.dataStore.Movie movie8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = bookingDataLayer1.bookMovie(movie8, "");
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
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = movieList6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        src.dataStore.Movie movie7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = bookingDataLayer1.bookMovie(movie7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass9 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = bookingList9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        java.util.List<src.dataStore.Movie> movieList12 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(movieList12);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        src.dataStore.Movie movie6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = bookingDataLayer1.bookMovie(movie6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        src.dataStore.Movie movie14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = bookingDataLayer1.bookMovie(movie14, "hi!");
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
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(movieList3);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList10 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = bookingDataLayer1.bookMovie(movie9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
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
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        java.lang.Class<?> wildcardClass10 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList13 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass14 = bookingDataLayer1.getClass();
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
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(movieList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass11 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        src.dataStore.Movie movie10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = bookingDataLayer1.bookMovie(movie10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
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
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = movieList6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
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
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass11 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.lang.Class<?> wildcardClass8 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        src.dataStore.Movie movie14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = bookingDataLayer1.bookMovie(movie14, "");
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
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
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
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = bookingDataLayer1.bookMovie(movie6, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = bookingDataLayer1.bookMovie(movie8, "");
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
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass5 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = bookingList7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        java.lang.Class<?> wildcardClass14 = bookingDataLayer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = bookingDataLayer1.bookMovie(movie9, "");
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
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        src.dataStore.Movie movie15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = bookingDataLayer1.bookMovie(movie15, "");
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
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        org.junit.Assert.assertNull(movieList11);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass8 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bookingDataLayer1.viewBookings();
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
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(movieList13);
        org.junit.Assert.assertNull(movieList14);
        org.junit.Assert.assertNull(bookingList15);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        java.lang.Class<?> wildcardClass10 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bookingDataLayer1.viewBookings();
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
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass6 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        src.dataStore.Movie movie10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = bookingDataLayer1.bookMovie(movie10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
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
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = movieList11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass9 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = bookingList8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = bookingDataLayer1.bookMovie(movie7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList9 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bookingDataLayer1.viewBookings();
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
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(movieList14);
        org.junit.Assert.assertNull(movieList15);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = movieList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(movieList5);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass8 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.lang.Class<?> wildcardClass9 = bookingDataLayer1.getClass();
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        src.dataStore.Movie movie7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = bookingDataLayer1.bookMovie(movie7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        src.dataStore.Movie movie9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = bookingDataLayer1.bookMovie(movie9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
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
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList13 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(movieList13);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        src.dataStore.Movie movie14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = bookingDataLayer1.bookMovie(movie14, "hi!");
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
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = bookingDataLayer1.bookMovie(movie8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        src.dataStore.Movie movie8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = bookingDataLayer1.bookMovie(movie8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(movieList7);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bookingDataLayer1.viewBookings();
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
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        java.util.List<src.dataStore.Movie> movieList11 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList13 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList14 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList15 = bookingDataLayer1.movies();
        src.dataStore.Movie movie16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = bookingDataLayer1.bookMovie(movie16, "");
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
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(movieList14);
        org.junit.Assert.assertNull(movieList15);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
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
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        src.dataStore.Movie movie5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = bookingDataLayer1.bookMovie(movie5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
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
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        src.dataStore.Movie movie10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = bookingDataLayer1.bookMovie(movie10, "hi!");
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
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        java.lang.Class<?> wildcardClass12 = bookingDataLayer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(movieList12);
        org.junit.Assert.assertNull(movieList13);
        org.junit.Assert.assertNull(movieList14);
        org.junit.Assert.assertNull(bookingList15);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        src.dataStore.Movie movie8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = bookingDataLayer1.bookMovie(movie8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        java.lang.Class<?> wildcardClass15 = bookingDataLayer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = movieList9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(movieList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
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
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(movieList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bookingDataLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"src.primaryUseCases.bookingMovies.bookingDataLayer.bookings\" is null");
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
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = movieList6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(movieList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        java.util.List<src.dataStore.Movie> movieList10 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = movieList10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList3 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList8 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = movieList8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList4 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList7 = bookingDataLayer1.movies();
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
        org.junit.Assert.assertNull(movieList7);
        org.junit.Assert.assertNull(movieList8);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = bookingDataLayer1.bookings();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bookingDataLayer1.viewBookings();
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
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        java.util.List<src.dataStore.Booking> bookingList12 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList13 = bookingDataLayer1.movies();
        src.dataStore.Movie movie14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = bookingDataLayer1.bookMovie(movie14, "");
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
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
        org.junit.Assert.assertNull(movieList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(movieList13);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        // The following exception was thrown during execution in test generation
        try {
            bookingDataLayer1.cancelBooking("hi!");
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
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(movieList9);
        org.junit.Assert.assertNull(movieList10);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        src.dataStore.Movie movie7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = bookingDataLayer1.bookMovie(movie7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Movie> movieList2 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Movie> movieList5 = bookingDataLayer1.movies();
        java.util.List<src.dataStore.Movie> movieList6 = bookingDataLayer1.movies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = movieList6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(movieList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(movieList5);
        org.junit.Assert.assertNull(movieList6);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        src.dataStore dataStore0 = null;
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer1 = new src.primaryUseCases.bookingMovies.bookingDataLayer(dataStore0);
        java.util.List<src.dataStore.Booking> bookingList2 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = bookingDataLayer1.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = bookingDataLayer1.bookings();
        src.dataStore.Movie movie7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = bookingDataLayer1.bookMovie(movie7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        src.dataStore.Movie movie14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = bookingDataLayer1.bookMovie(movie14, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.dataStore$Movie.getTitle()\" because \"<parameter1>\" is null");
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
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        src.dataStore.Movie movie15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = bookingDataLayer1.bookMovie(movie15, "hi!");
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
    }
}

