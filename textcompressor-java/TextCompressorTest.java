import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TextCompressorTest {

    protected TextCompressor solution;

    @Before
    public void setUp() {
        solution = new TextCompressor();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String sourceText = "ABCDABCFG";

        String expected = "ABC";
        String actual = solution.longestRepeat(sourceText);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String sourceText = "ABABA";

        String expected = "AB";
        String actual = solution.longestRepeat(sourceText);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String sourceText = "This is a test.";

        String expected = "is ";
        String actual = solution.longestRepeat(sourceText);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String sourceText = "Testing testing 1 2 3.";

        String expected = "esting ";
        String actual = solution.longestRepeat(sourceText);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String sourceText = "The quick brown fox jumps over the lazy dog.";

        String expected = "he ";
        String actual = solution.longestRepeat(sourceText);

        Assert.assertEquals(expected, actual);
    }

}
