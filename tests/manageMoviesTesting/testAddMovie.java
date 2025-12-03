package tests.manageMoviesTesting;

import org.junit.jupiter.api.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import src.primaryUseCases.manageMovies.AddMovie;
import src.primaryUseCases.manageMovies.Movie; 

import static org.junit.jupiter.api.Assertions.*;

class testAddMovie {

    private AddMovie addMovie;
    private final InputStream originalSystemIn = System.in;

    /**
     * Inject input as a Scanner into AddMovie.
     */
    private void provideInput(String data) {
        Scanner scanner = new Scanner(new ByteArrayInputStream(data.getBytes()));
        addMovie = new AddMovie(scanner);
    }

    @AfterEach
    void restore() {
        System.setIn(originalSystemIn);
    }

    // ------------------------------
    // TC1: Normal full valid data
    // ------------------------------
    @Test
    void TC1_NormalData() {
        String in =
                "The Shawshank Redemption\n" +
                        "Tim Robbins\n" +
                        "Morgan Freeman\n" +
                        "Bob Gunton\n" +
                        "Two imprisoned men bond over a number of years\n" +
                        "15\n" +
                        "9.3\n" +
                        "English\n" +
                        "142\n" +
                        "10:00\n" +  // AM
                        "13:15\n" +  // PM
                        "16:30\n" +  // PM
                        "19:45\n" +  // PM
                        "22:00\n" +  // PM
                        "STANDARD\n";

        provideInput(in);
        addMovie.addMovie();

        Movie m = addMovie.getMovies().get(0);
        assertEquals("The Shawshank Redemption", m.getTitle());
        assertArrayEquals(
                new String[]{"Tim Robbins", "Morgan Freeman", "Bob Gunton"},
                m.getActors()
        );
        assertEquals("Two imprisoned men bond over a number of years", m.getSummary());
        assertEquals(15, m.getAgeRestriction());
        assertEquals(9.3, m.getImdbRating());
        assertEquals("English", m.getLanguage());
        assertEquals(142, m.getDuration());
        assertArrayEquals(
                new String[]{"10:00 AM", "13:15 PM", "16:30 PM", "19:45 PM", "22:00 PM"},
                m.getShowTimes()
        );
        assertEquals("STANDARD", m.getHallType());
    }

    // ------------------------------
    // TC2: Duplicate movie title (case-insensitive)
    // ------------------------------
    @Test
    void TC2_DuplicateMovie() {
        String first =
                "Inception\n" +
                        "Leonardo DiCaprio\n" +
                        "Joseph Gordon Levitt\n" +
                        "Ellen Page\n" +
                        "A thief who steals corporate secrets\n" +
                        "13\n" +
                        "8.8\n" +
                        "English\n" +
                        "148\n" +
                        "11:00\n" +
                        "14:30\n" +
                        "17:45\n" +
                        "20:15\n" +
                        "23:00\n" +
                        "IMAX\n";

        provideInput(first);
        addMovie.addMovie();

        // new AddMovie instance (as in your existing pattern)
        String duplicate =
                "INCEPTION\n" +
                        "Tom Cruise\n" +
                        "Sarah Clark\n" +
                        "David White\n" +
                        "Different summary\n" +
                        "16\n" +
                        "7.7\n" +
                        "English\n" +
                        "120\n" +
                        "12:00\n" +
                        "15:00\n" +
                        "18:00\n" +
                        "21:00\n" +
                        "23:30\n" +
                        "VIP\n";

        provideInput(duplicate);
        addMovie.addMovie();

        // this still asserts that each separate AddMovie instance holds 1 movie
        assertEquals(1, addMovie.getMovies().size());
    }

    // ------------------------------
    // TC3: Empty title — retry until valid
    // ------------------------------
    @Test
    void TC3_EmptyTitleRetry() {
        String in =
                "\n" +                       // invalid title
                        "The Godfather\n" +          // valid title
                        "Marlon Brando\n" +
                        "Al Pacino\n" +
                        "James Caan\n" +
                        "The aging patriarch...\n" +
                        "18\n" +
                        "9.2\n" +
                        "English\n" +
                        "175\n" +
                        "10:30\n" +
                        "14:00\n" +
                        "17:30\n" +
                        "21:00\n" +
                        "23:30\n" +
                        "VIP\n";

        provideInput(in);
        addMovie.addMovie();

        assertEquals("The Godfather",
                addMovie.getMovies().get(0).getTitle());
    }

    // ------------------------------
    // TC4: Whitespace-only title — retry
    // ------------------------------
    @Test
    void TC4_WhitespaceTitleRetry() {
        String in =
                "   \n" +                   // invalid
                        "Pulp Fiction\n" +          // valid
                        "John Travolta\n" +
                        "Samuel Jackson\n" +
                        "Uma Thurman\n" +
                        "Crime anthology film\n" +
                        "18\n" +
                        "8.9\n" +
                        "English\n" +
                        "154\n" +
                        "11:30\n" +
                        "14:45\n" +
                        "18:00\n" +
                        "21:15\n" +
                        "00:30\n" +
                        "STANDARD\n";

        provideInput(in);
        addMovie.addMovie();

        assertEquals("Pulp Fiction",
                addMovie.getMovies().get(0).getTitle());
    }

    // ------------------------------
    // TC5: Normal valid actors
    // ------------------------------
    @Test
    void TC5_ValidActors() {
        String in =
                "Forrest Gump\n" +
                        "Tom Hanks\n" +
                        "Robin Wright\n" +
                        "Gary Sinise\n" +
                        "Life story...\n" +
                        "13\n" +
                        "8.8\n" +
                        "English\n" +
                        "142\n" +
                        "11:00\n" +
                        "14:15\n" +
                        "17:30\n" +
                        "20:45\n" +
                        "23:00\n" +
                        "STANDARD\n";

        provideInput(in);
        addMovie.addMovie();

        assertArrayEquals(
                new String[]{"Tom Hanks", "Robin Wright", "Gary Sinise"},
                addMovie.getMovies().get(0).getActors()
        );
    }

    // ------------------------------
    // TC6: Empty actors must retry until non-empty
    // ------------------------------
    @Test
    void TC6_EmptyActorsRetry() {
        String in =
                "The Dark Knight\n" +
                        "\n" +                 // invalid for actor 1
                        "Christian Bale\n" +   // valid for actor 1
                        "\n" +                 // invalid for actor 2
                        "Heath Ledger\n" +     // valid for actor 2
                        "Aaron Eckhart\n" +    // valid for actor 3
                        "Batman vs Joker\n" +
                        "13\n" +
                        "9.0\n" +
                        "English\n" +
                        "152\n" +
                        "10:15\n" +
                        "13:45\n" +
                        "17:15\n" +
                        "20:30\n" +
                        "23:45\n" +
                        "IMAX\n";

        provideInput(in);
        addMovie.addMovie();

        assertArrayEquals(
                new String[]{"Christian Bale", "Heath Ledger", "Aaron Eckhart"},
                addMovie.getMovies().get(0).getActors()
        );
    }

    // ------------------------------
    // TC7: Actor with numbers rejected
    // ------------------------------
    @Test
    void TC7_ActorNumbersRejected() {
        String in =
                "Invalid Actor\n" +
                        "James 2\n" +         // invalid
                        "James Two\n" +       // valid
                        "Sarah Three\n" +
                        "David Williams\n" +
                        "Story...\n" +
                        "12\n" +
                        "7.4\n" +
                        "English\n" +
                        "120\n" +
                        "10:00\n" +
                        "13:00\n" +
                        "16:00\n" +
                        "19:00\n" +
                        "22:00\n" +
                        "STANDARD\n";

        provideInput(in);
        addMovie.addMovie();

        assertArrayEquals(
                new String[]{"James Two", "Sarah Three", "David Williams"},
                addMovie.getMovies().get(0).getActors()
        );
    }

    // ------------------------------
    // TC8: Empty summary rejected then valid accepted
    // ------------------------------
    @Test
    void TC8_EmptySummaryRetry() {
        String in =
                "Empty Summary Movie\n" +
                        "Tom Wilson\n" +
                        "Andrew Miles\n" +
                        "Peter Brown\n" +
                        "\n" +                     // invalid summary (empty)
                        "Proper summary text\n" +  // valid
                        "12\n" +
                        "6.5\n" +
                        "English\n" +
                        "110\n" +
                        "09:30\n" +
                        "12:00\n" +
                        "14:30\n" +
                        "17:00\n" +
                        "19:30\n" +
                        "3D\n";

        provideInput(in);
        addMovie.addMovie();

        assertEquals("Proper summary text",
                addMovie.getMovies().get(0).getSummary());
    }

    // ------------------------------
    // TC9: Whitespace summary rejected then valid accepted
    // ------------------------------
    @Test
    void TC9_WhiteSpaceSummaryRetry() {
        String in =
                "White Space Summary\n" +
                        "Adam Baker\n" +
                        "Linda Rose\n" +
                        "Oliver Stone\n" +
                        "   \n" +                 // invalid summary
                        "Another good summary\n" + // valid
                        "15\n" +
                        "7.2\n" +
                        "English\n" +
                        "125\n" +
                        "10:45\n" +
                        "13:15\n" +
                        "15:45\n" +
                        "18:15\n" +
                        "20:45\n" +
                        "VIP\n";

        provideInput(in);
        addMovie.addMovie();

        assertEquals("Another good summary",
                addMovie.getMovies().get(0).getSummary());
    }

    // ------------------------------
    // TC10: Valid long summary
    // ------------------------------
    @Test
    void TC10_ValidSummary() {
        String summary = "Detailed long summary describing events, characters, timeline and conflicts.";
        String in =
                "Long Summary Movie\n" +
                        "Eric Mason\n" +
                        "Laura Smith\n" +
                        "Henry Cooper\n" +
                        summary + "\n" +
                        "16\n" +
                        "8.1\n" +
                        "English\n" +
                        "135\n" +
                        "11:30\n" +
                        "14:00\n" +
                        "16:30\n" +
                        "19:00\n" +
                        "21:30\n" +
                        "IMAX\n";

        provideInput(in);
        addMovie.addMovie();

        assertEquals(summary, addMovie.getMovies().get(0).getSummary());
    }

    // ------------------------------
    // TC11: Empty language rejected then valid accepted
    // ------------------------------
    @Test
    void TC11_EmptyLanguageRetry() {
        String in =
                "Empty Language Movie\n" +
                        "Daniel Harris\n" +
                        "Jessica Brown\n" +
                        "Robert Lewis\n" +
                        "Brief summary\n" +
                        "12\n" +
                        "6.8\n" +
                        "\n" +          // invalid language
                        "English\n" +   // valid language
                        "115\n" +
                        "10:20\n" +
                        "12:50\n" +
                        "15:20\n" +
                        "17:50\n" +
                        "20:20\n" +
                        "STANDARD\n";

        provideInput(in);
        addMovie.addMovie();

        assertEquals("English", addMovie.getMovies().get(0).getLanguage());
    }

    // ------------------------------
    // TC12: Whitespace language rejected then valid accepted
    // ------------------------------
    @Test
    void TC12_WhiteSpaceLanguageRetry() {
        String in =
                "Whitespace Language Movie\n" +
                        "Alan Carter\n" +
                        "Patrick Robinson\n" +
                        "Emily King\n" +
                        "Short plot\n" +
                        "13\n" +
                        "7.0\n" +
                        "   \n" +        // invalid
                        "Spanish\n" +    // valid
                        "118\n" +
                        "09:45\n" +
                        "12:15\n" +
                        "14:45\n" +
                        "17:15\n" +
                        "19:45\n" +
                        "3D\n";

        provideInput(in);
        addMovie.addMovie();

        assertEquals("Spanish", addMovie.getMovies().get(0).getLanguage());
    }

    // ------------------------------
    // TC13: Valid language text
    // ------------------------------
    @Test
    void TC13_ValidLanguage() {
        String in =
                "Valid Language Movie\n" +
                        "Sarah Williams\n" +
                        "Michael Johnson\n" +
                        "Nancy Evans\n" +
                        "Drama film based on real events\n" +
                        "14\n" +
                        "7.8\n" +
                        "French with English subtitles\n" +
                        "128\n" +
                        "11:15\n" +
                        "13:45\n" +
                        "16:15\n" +
                        "18:45\n" +
                        "21:15\n" +
                        "VIP\n";

        provideInput(in);
        addMovie.addMovie();

        assertEquals("French with English subtitles",
                addMovie.getMovies().get(0).getLanguage());
    }

    // ------------------------------
    // TC14: Language with digits rejected then valid accepted
    // ------------------------------
    @Test
    void TC14_ValidLanguageLettersOnly() {
        String in =
                "Letter Language Movie\n" +
                        "Martha Green\n" +
                        "Steve Harris\n" +
                        "Julia Baker\n" +
                        "Adventure story\n" +
                        "13\n" +
                        "7.1\n" +
                        "Spanish2\n" + // invalid
                        "Spanish\n" +  // valid
                        "123\n" +
                        "10:00\n" +
                        "12:30\n" +
                        "15:00\n" +
                        "17:30\n" +
                        "20:00\n" +
                        "STANDARD\n";

        provideInput(in);
        addMovie.addMovie();

        assertEquals("Spanish", addMovie.getMovies().get(0).getLanguage());
    }

    // ------------------------------
    // TC15: Valid IMDb rating
    // ------------------------------
    @Test
    void TC15_ValidIMDBRating() {
        String in =
                "Valid Rating Movie\n" +
                        "Paul Carter\n" +
                        "Susan Rogers\n" +
                        "Helen Scott\n" +
                        "Touching drama\n" +
                        "12\n" +
                        "7.5\n" +
                        "English\n" +
                        "130\n" +
                        "10:00\n" +
                        "12:30\n" +
                        "15:00\n" +
                        "17:30\n" +
                        "20:00\n" +
                        "IMAX\n";

        provideInput(in);
        addMovie.addMovie();

        assertEquals(7.5, addMovie.getMovies().get(0).getImdbRating());
    }

    // ------------------------------
    // TC16: Invalid IMDb above 10 -> retry
    // ------------------------------
    @Test
    void TC16_InvalidIMDBAbove10() {
        String in =
                "High Score Movie\n" +
                        "Andrew Collins\n" +
                        "Laura Adams\n" +
                        "Kevin Thomas\n" +
                        "Action story\n" +
                        "13\n" +
                        "10.5\n" +   // invalid
                        "8.7\n" +    // valid
                        "English\n" +
                        "125\n" +
                        "11:00\n" +
                        "13:30\n" +
                        "16:00\n" +
                        "18:30\n" +
                        "21:00\n" +
                        "VIP\n";

        provideInput(in);
        addMovie.addMovie();

        assertEquals(8.7, addMovie.getMovies().get(0).getImdbRating());
    }

    // ------------------------------
    // TC17: Invalid IMDb below 1 -> retry
    // ------------------------------
    @Test
    void TC17_InvalidIMDBBelow1() {
        String in =
                "Low Score Movie\n" +
                        "Peter Nelson\n" +
                        "Diana Brooks\n" +
                        "Emily Turner\n" +
                        "Drama film\n" +
                        "14\n" +
                        "0.5\n" +   // invalid
                        "6.2\n" +   // valid
                        "English\n" +
                        "118\n" +
                        "09:30\n" +
                        "12:00\n" +
                        "14:30\n" +
                        "17:00\n" +
                        "19:30\n" +
                        "3D\n";

        provideInput(in);
        addMovie.addMovie();

        assertEquals(6.2, addMovie.getMovies().get(0).getImdbRating());
    }

    // ------------------------------
    // TC18: All valid show times with AM/PM
    // ------------------------------
    @Test
    void TC18_ValidShowTimes() {
        String in =
                "Valid Showtimes Movie\n" +
                        "Ella Martin\n" +
                        "George Baker\n" +
                        "Sophia Adams\n" +
                        "Family story\n" +
                        "12\n" +
                        "7.3\n" +
                        "English\n" +
                        "140\n" +
                        "09:00\n" +  // AM
                        "11:30\n" +  // AM
                        "14:00\n" +  // PM
                        "16:30\n" +  // PM
                        "19:00\n" +  // PM
                        "STANDARD\n";

        provideInput(in);
        addMovie.addMovie();

        assertArrayEquals(
                new String[]{"09:00 AM", "11:30 AM", "14:00 PM", "16:30 PM", "19:00 PM"},
                addMovie.getMovies().get(0).getShowTimes()
        );
    }

    // ------------------------------
    // TC19: Invalid time format then valid retry
    // ------------------------------
    @Test
    void TC19_InvalidTimeFormatRetry() {
        String in =
                "Invalid Time Movie\n" +
                        "John Walker\n" +
                        "Lisa Howard\n" +
                        "Mark Phillips\n" +
                        "Interesting story\n" +
                        "15\n" +
                        "6.8\n" +
                        "English\n" +
                        "135\n" +
                        "abc\n" +      // invalid time
                        "09:00\n" +    // valid time 1
                        "12:00\n" +    // valid time 2
                        "15:00\n" +    // valid time 3
                        "18:00\n" +    // valid time 4
                        "21:00\n" +    // valid time 5
                        "IMAX\n";

        provideInput(in);
        addMovie.addMovie();

        String[] expected = {
                "09:00 AM",
                "12:00 PM",
                "15:00 PM",
                "18:00 PM",
                "21:00 PM"
        };

        assertArrayEquals(expected,
                addMovie.getMovies().get(0).getShowTimes());
    }

    // ------------------------------
    // TC20: Whitespace show time rejected then valid
    // ------------------------------
    @Test
    void TC20_WhiteSpaceShowTimeRetry() {
        String in =
                "Whitespace Showtime Movie\n" +
                        "Donna Silver\n" +
                        "Rachel Moore\n" +
                        "Victoria Reed\n" +
                        "Story...\n" +
                        "16\n" +
                        "7.1\n" +
                        "English\n" +
                        "128\n" +
                        "   \n" +      // invalid first showtime
                        "08:00\n" +    // valid showtime 1
                        "10:30\n" +    // 2
                        "13:00\n" +    // 3
                        "15:30\n" +    // 4
                        "18:00\n" +    // 5
                        "VIP\n";

        provideInput(in);
        addMovie.addMovie();

        String[] expected = {
                "08:00 AM",
                "10:30 AM",
                "13:00 PM",
                "15:30 PM",
                "18:00 PM"
        };

        assertArrayEquals(expected,
                addMovie.getMovies().get(0).getShowTimes());
    }

    // ------------------------------
    // TC21: Valid PM show times conversion
    // ------------------------------
    @Test
    void TC21_PMShowTimes() {
        String in =
                "PM Showtimes\n" +
                        "Olivia Barnes\n" +
                        "Liam Murphy\n" +
                        "Ethan Kelly\n" +
                        "Plot...\n" +
                        "18\n" +
                        "7.9\n" +
                        "English\n" +
                        "145\n" +
                        "12:00\n" +
                        "15:30\n" +
                        "18:45\n" +
                        "21:15\n" +
                        "23:59\n" +
                        "STANDARD\n";

        provideInput(in);
        addMovie.addMovie();

        assertArrayEquals(
                new String[]{"12:00 PM", "15:30 PM", "18:45 PM", "21:15 PM", "23:59 PM"},
                addMovie.getMovies().get(0).getShowTimes()
        );
    }

    // ------------------------------
    // TC22: Valid AM show times conversion
    // ------------------------------
    @Test
    void TC22_AMShowTimes() {
        String in =
                "AM Showtimes\n" +
                        "Lauren Porter\n" +
                        "Patrick Reed\n" +
                        "Maria Rogers\n" +
                        "Plot...\n" +
                        "12\n" +
                        "6.5\n" +
                        "English\n" +
                        "132\n" +
                        "00:00\n" +
                        "03:15\n" +
                        "06:30\n" +
                        "09:45\n" +
                        "11:59\n" +
                        "3D\n";

        provideInput(in);
        addMovie.addMovie();

        assertArrayEquals(
                new String[]{"00:00 AM", "03:15 AM", "06:30 AM", "09:45 AM", "11:59 AM"},
                addMovie.getMovies().get(0).getShowTimes()
        );
    }

    // ------------------------------
    // TC23: Valid Hall type
    // ------------------------------
    @Test
    void TC23_ValidHallType() {
        String in =
                "Valid Hall Test\n" +
                        "Ryan Edwards\n" +
                        "Chloe Harris\n" +
                        "Sean Miller\n" +
                        "Plot...\n" +
                        "13\n" +
                        "7.4\n" +
                        "English\n" +
                        "126\n" +
                        "10:15\n" +
                        "12:45\n" +
                        "15:15\n" +
                        "17:45\n" +
                        "20:15\n" +
                        "VIP\n";

        provideInput(in);
        addMovie.addMovie();

        assertEquals("VIP", addMovie.getMovies().get(0).getHallType());
    }

    // ------------------------------
    // TC24: Mixed-case hall type auto-normalized
    // ------------------------------
    @Test
    void TC24_MixedCaseHallType() {
        String in =
                "Mixed Hall Type\n" +
                        "Robert Green\n" +
                        "Nicole Turner\n" +
                        "Kevin Adams\n" +
                        "Plot...\n" +
                        "14\n" +
                        "7.6\n" +
                        "English\n" +
                        "119\n" +
                        "11:30\n" +
                        "14:00\n" +
                        "16:30\n" +
                        "19:00\n" +
                        "21:30\n" +
                        "ImAx\n";

        provideInput(in);
        addMovie.addMovie();

        assertEquals("IMAX", addMovie.getMovies().get(0).getHallType());
    }

    // ------------------------------
    // TC25: Invalid hall type -> retry
    // ------------------------------
    @Test
    void TC25_InvalidHallTypeRetry() {
        String in =
                "Retry Hall Type\n" +
                        "Jason Morris\n" +
                        "Hannah Stewart\n" +
                        "Rachel Morgan\n" +
                        "Plot...\n" +
                        "15\n" +
                        "6.7\n" +
                        "English\n" +
                        "124\n" +
                        "10:45\n" +
                        "13:15\n" +
                        "15:45\n" +
                        "18:15\n" +
                        "20:45\n" +
                        "INVALID\n" +   // rejected
                        "STANDARD\n";   // accepted

        provideInput(in);
        addMovie.addMovie();

        assertEquals("STANDARD", addMovie.getMovies().get(0).getHallType());
    }

    // ------------------------------
    // TC26: Empty hall type rejected
    // ------------------------------
    @Test
    void TC26_EmptyHallTypeRejected() {
        String in =
                "Hall Type Empty Test\n" +
                        "Tom Hardy\n" +
                        "Emily Rose\n" +
                        "Jack Nolan\n" +
                        "Summary...\n" +
                        "13\n" +
                        "7.2\n" +
                        "English\n" +
                        "120\n" +
                        "10:00\n" +
                        "13:00\n" +
                        "16:00\n" +
                        "19:00\n" +
                        "22:00\n" +
                        "\n" +        // invalid hall type
                        "VIP\n";      // valid

        provideInput(in);
        addMovie.addMovie();

        assertEquals("VIP", addMovie.getMovies().get(0).getHallType());
    }

    // ------------------------------
    // TC27: Whitespace hall type rejected
    // ------------------------------
    @Test
    void TC27_WhiteSpaceHallTypeRejected() {
        String in =
                "Hall Type Whitespace Test\n" +
                        "Chris Pine\n" +
                        "Anne Bell\n" +
                        "Lewis King\n" +
                        "Summary...\n" +
                        "13\n" +
                        "7.0\n" +
                        "English\n" +
                        "115\n" +
                        "09:00\n" +
                        "12:00\n" +
                        "15:00\n" +
                        "18:00\n" +
                        "21:00\n" +
                        "    \n" +    // invalid hall type
                        "IMAX\n";     // valid

        provideInput(in);
        addMovie.addMovie();

        assertEquals("IMAX", addMovie.getMovies().get(0).getHallType());
    }

    // ------------------------------
    // TC28: Valid age restriction accepted
    // ------------------------------
    @Test
    void TC28_ValidAgeRestriction() {
        String in =
                "Valid Age Movie\n" +
                        "Actor One\n" +
                        "Actor Two\n" +
                        "Actor Three\n" +
                        "Summary text\n" +
                        "16\n" +            // valid age
                        "8.5\n" +
                        "English\n" +
                        "120\n" +
                        "09:00\n" +
                        "12:00\n" +
                        "15:00\n" +
                        "18:00\n" +
                        "21:00\n" +
                        "IMAX\n";

        provideInput(in);
        addMovie.addMovie();

        Movie m = addMovie.getMovies().get(0);
        assertEquals(16, m.getAgeRestriction());
    }

    // ------------------------------
    // TC29: Invalid age restriction -> retry
    // ------------------------------
    @Test
    void TC29_InvalidAgeRestrictionRetry() {
        String in =
                "Retry Age Movie\n" +
                        "Actor One\n" +
                        "Actor Two\n" +
                        "Actor Three\n" +
                        "Summary text\n" +
                        "0\n" +        // invalid (zero)
                        "-5\n" +      // invalid (negative)
                        "abc\n" +     // invalid (non-numeric)
                        "18\n" +      // valid
                        "7.1\n" +
                        "English\n" +
                        "130\n" +
                        "10:00\n" +
                        "12:30\n" +
                        "15:00\n" +
                        "17:30\n" +
                        "20:00\n" +
                        "STANDARD\n";

        provideInput(in);
        addMovie.addMovie();

        Movie m = addMovie.getMovies().get(0);
        assertEquals(18, m.getAgeRestriction());
    }

    // ------------------------------
    // TC30: Valid duration accepted
    // ------------------------------
    @Test
    void TC30_ValidDuration() {
        String in =
                "Valid Duration Movie\n" +
                        "Actor One\n" +
                        "Actor Two\n" +
                        "Actor Three\n" +
                        "Summary text\n" +
                        "15\n" +
                        "8.1\n" +
                        "English\n" +
                        "142\n" +     // valid duration
                        "09:00\n" +
                        "11:30\n" +
                        "14:00\n" +
                        "16:30\n" +
                        "19:00\n" +
                        "VIP\n";

        provideInput(in);
        addMovie.addMovie();

        Movie m = addMovie.getMovies().get(0);
        assertEquals(142, m.getDuration());
    }

    // ------------------------------
    // TC31: Invalid duration -> retry
    // ------------------------------
    @Test
    void TC31_InvalidDurationRetry() {
        String in =
                "Retry Duration Movie\n" +
                        "Actor One\n" +
                        "Actor Two\n" +
                        "Actor Three\n" +
                        "Summary text\n" +
                        "13\n" +
                        "7.4\n" +
                        "English\n" +
                        "0\n" +        // invalid
                        "-100\n" +    // invalid
                        "xyz\n" +     // invalid
                        "125\n" +     // valid duration
                        "09:00\n" +
                        "12:00\n" +
                        "15:00\n" +
                        "18:00\n" +
                        "21:00\n" +
                        "3D\n";

        provideInput(in);
        addMovie.addMovie();

        Movie m = addMovie.getMovies().get(0);
        assertEquals(125, m.getDuration());
    }

}
