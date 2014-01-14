import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PronunciationTest {

    protected Pronunciation solution;

    @Before
    public void setUp() {
        solution = new Pronunciation();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] words = new String[]{"All", "of", "these", "are", "not", "difficult"};

        String expected = "";
        String actual = solution.canPronounce(words);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] words = new String[]{"The", "word", "REALLY", "is", "really", "hard"};

        String expected = "REALLY";
        String actual = solution.canPronounce(words);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] words = new String[]{"TRiCKy"};

        String expected = "TRiCKy";
        String actual = solution.canPronounce(words);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] words = new String[]{"irresistable", "prerogative", "uttermost", "importance"};

        String expected = "";
        String actual = solution.canPronounce(words);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] words = new String[]{"Aa"};

        String expected = "";
        String actual = solution.canPronounce(words);

        Assert.assertEquals(expected, actual);
    }

}
