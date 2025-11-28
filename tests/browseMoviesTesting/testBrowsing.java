package tests.browseMoviesTesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.primaryUseCases.browseMovies.BrowseMovies;
import src.dataStore;
import src.dataStore.Movie;

import java.util.List;

/**
 * Test suite for Browse Movies functionality
 */
public class testBrowsing {

    private BrowseMovies browseMovies;
    private dataStore sampleDataStore;

    @Before
    public void setUp() {
        sampleDataStore = new dataStore();
        browseMovies = new BrowseMovies(sampleDataStore);
    }

    @Test
    public void test_RetrieveAllMovies() {
        List<Movie> movies = browseMovies.getMovies();
        Assert.assertEquals("Expected 10 movies in the sample dataset", 10, movies.size());
    }

    @Test
    public void test_BrowseMovies() {
        int displayedMoviesSize = browseMovies.browseMovies();
        Assert.assertEquals("Displayed movies count should match stored movies", 
                            displayedMoviesSize, browseMovies.getMovies().size());
    }

    @Test
    public void test_SearchExistingMovieByTitle() {
        List<Movie> results = browseMovies.searchMoviesByTitle("Inception");
        Assert.assertTrue("Movie 'Inception' should be found", 
                          results.stream().anyMatch(m -> m.getTitle().equals("Inception")));
    }

    @Test
    public void test_SearchNonexistentMovieByTitle() {
        List<Movie> results = browseMovies.searchMoviesByTitle("Nonexistent Movie");
        Assert.assertTrue("Search should return empty list for nonexistent movie", results.isEmpty());
    }

    @Test
    public void test_SearchMoviesByExistingLanguage() {
        List<Movie> results = browseMovies.searchMoviesByLanguage("English");
        Assert.assertTrue("At least one English movie should be found", 
                          !results.isEmpty() && results.stream().allMatch(m -> m.getLanguage().equals("English")));
    }

    @Test
    public void test_SearchMoviesByNonexistentLanguage() {
        List<Movie> results = browseMovies.searchMoviesByLanguage("Spanish");
        Assert.assertTrue("Search should return empty list for nonexistent language", results.isEmpty());
    }

    @Test
    public void test_SearchMoviesByValidRatingRange() {
        List<Movie> results = browseMovies.searchMoviesByRating(8.5, 9.0);
        Assert.assertTrue("Movies should be found within rating range 8.5 - 9.0", 
                          !results.isEmpty() && results.stream().allMatch(m -> m.getImdbRating() >= 8.5 && m.getImdbRating() <= 9.0));
    }

    @Test
    public void test_SearchMoviesByInvalidRatingRange() {
        List<Movie> results = browseMovies.searchMoviesByRating(-1.0, 0);
        Assert.assertTrue("Search should return empty list for rating range -1 to 0", results.isEmpty());
    }

    @Test
    public void test_SearchMoviesByPartialTitle() {
        List<Movie> results = browseMovies.searchMoviesByTitle("dark");
        Assert.assertTrue("Should find 'The Dark Knight' with partial match",
                          results.stream().anyMatch(m -> m.getTitle().contains("Dark")));
    }

    @Test
    public void test_SearchMoviesByTitleCaseInsensitive() {
        List<Movie> results = browseMovies.searchMoviesByTitle("INCEPTION");
        Assert.assertFalse("Case insensitive search should find movies", results.isEmpty());
    }

    @Test
    public void test_SearchMoviesByLanguageCaseInsensitive() {
        List<Movie> results = browseMovies.searchMoviesByLanguage("english");
        Assert.assertTrue("Case insensitive search should find English movies", results.size() > 0);
    }

    @Test
    public void test_SearchMultipleMoviesBySameLanguage() {
        List<Movie> results = browseMovies.searchMoviesByLanguage("English");
        Assert.assertTrue("Should find multiple English movies", results.size() == 6);
    }

    @Test
    public void test_SearchMoviesByEmptyTitle() {
        List<Movie> results = browseMovies.searchMoviesByTitle("");
        Assert.assertTrue("Empty string should return empty list", results.isEmpty());
    }

    @Test
    public void test_SearchMoviesByWhitespaceTitle() {
        List<Movie> results = browseMovies.searchMoviesByTitle("   ");
        Assert.assertTrue("Whitespace should not match any movies", results.isEmpty());
    }

    @Test
    public void test_SearchMoviesByTitleWithTrailingSpaces() {
        List<Movie> results = browseMovies.searchMoviesByTitle("Inception   ");
        Assert.assertTrue("Should find movie even with trailing spaces",
                          results.stream().anyMatch(m -> m.getTitle().equals("Inception")));
    }

    @Test
    public void test_SearchMoviesByTitleWithLeadingSpaces() {
        List<Movie> results = browseMovies.searchMoviesByTitle("   Inception");
        Assert.assertTrue("Should find movie even with leading spaces",
                          results.stream().anyMatch(m -> m.getTitle().equals("Inception")));
    }

    @Test
    public void test_SearchMoviesByLanguageWithTrailingSpaces() {
        List<Movie> results = browseMovies.searchMoviesByLanguage("English   ");
        Assert.assertTrue("Should find English movies with trailing spaces",
                          !results.isEmpty() && results.stream().allMatch(m -> m.getLanguage().equals("English")));
    }

    @Test
    public void test_SearchMoviesByLanguageWithLeadingSpaces() {
        List<Movie> results = browseMovies.searchMoviesByLanguage("   English");
        Assert.assertTrue("Should find English movies with leading spaces",
                          !results.isEmpty() && results.stream().allMatch(m -> m.getLanguage().equals("English")));
    }

    @Test
    public void test_SearchMoviesByExactMinRating() {
        List<Movie> results = browseMovies.searchMoviesByRating(8.3, 8.3);
        Assert.assertTrue("Should find movies with exact rating 8.3",
                          results.stream().anyMatch(m -> m.getImdbRating() == 8.3));
    }

    @Test
    public void test_SearchMoviesByMaxRating() {
        List<Movie> results = browseMovies.searchMoviesByRating(9.0, 10.0);
        Assert.assertTrue("Should find high-rated movies",
                          results.stream().allMatch(m -> m.getImdbRating() >= 9.0));
    }

    @Test
    public void test_SearchMoviesByInvertedRatingRange() {
        List<Movie> results = browseMovies.searchMoviesByRating(9.0, 7.0);
        Assert.assertTrue("Inverted range should return empty list", results.isEmpty());
    }

    @Test
    public void test_SearchMoviesByZeroRatingRange() {
        List<Movie> results = browseMovies.searchMoviesByRating(0, 0);
        Assert.assertTrue("Zero rating range should return empty list", results.isEmpty());
    }

    @Test
    public void test_SearchMoviesByFrenchLanguage() {
        List<Movie> results = browseMovies.searchMoviesByLanguage("French");
        Assert.assertTrue("Should find French movie",
                          results.stream().anyMatch(m -> m.getTitle().equals("Amélie")));
    }

    @Test
    public void test_SearchMoviesByJapaneseLanguage() {
        List<Movie> results = browseMovies.searchMoviesByLanguage("Japanese");
        Assert.assertTrue("Should find Japanese movie",
                          results.stream().anyMatch(m -> m.getTitle().equals("Spirited Away")));
    }

    @Test
    public void test_SearchMoviesByKoreanLanguage() {
        List<Movie> results = browseMovies.searchMoviesByLanguage("Korean");
        Assert.assertTrue("Should find Korean movie",
                          results.stream().anyMatch(m -> m.getTitle().equals("Parasite")));
    }

    @Test
    public void test_SearchTopRatedMovies() {
        List<Movie> results = browseMovies.searchMoviesByRating(9.0, 10.0);
        Assert.assertTrue("Should find top-rated movies", results.size() == 2);
    }
}
