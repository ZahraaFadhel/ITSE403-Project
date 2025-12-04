import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer0 = null;
        src.primaryUseCases.bookingMovies.bookingBusinessLayer bookingBusinessLayer1 = new src.primaryUseCases.bookingMovies.bookingBusinessLayer(bookingDataLayer0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = bookingBusinessLayer1.viewBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.primaryUseCases.bookingMovies.bookingDataLayer.viewBookings()\" because \"this.dataLayer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer0 = null;
        src.primaryUseCases.bookingMovies.bookingBusinessLayer bookingBusinessLayer1 = new src.primaryUseCases.bookingMovies.bookingBusinessLayer(bookingDataLayer0);
        java.util.Scanner scanner2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = bookingBusinessLayer1.bookMovie(scanner2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Scanner.nextLine()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer0 = null;
        src.primaryUseCases.bookingMovies.bookingBusinessLayer bookingBusinessLayer1 = new src.primaryUseCases.bookingMovies.bookingBusinessLayer(bookingDataLayer0);
        java.lang.Class<?> wildcardClass2 = bookingBusinessLayer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        src.primaryUseCases.bookingMovies.bookingDataLayer bookingDataLayer0 = null;
        src.primaryUseCases.bookingMovies.bookingBusinessLayer bookingBusinessLayer1 = new src.primaryUseCases.bookingMovies.bookingBusinessLayer(bookingDataLayer0);
        java.util.Scanner scanner2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingBusinessLayer1.cancelBooking(scanner2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Scanner.nextLine()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

