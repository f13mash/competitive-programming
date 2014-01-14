import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FoxAndChessTest {

    protected FoxAndChess solution;

    @Before
    public void setUp() {
        solution = new FoxAndChess();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String begin = "R...";
        String target = "..R.";

        String expected = "Possible";
        String actual = solution.ableToMove(begin, target);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String begin = "..R.";
        String target = "R...";

        String expected = "Impossible";
        String actual = solution.ableToMove(begin, target);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String begin = ".L.R.R.";
        String target = "L...R.R";

        String expected = "Possible";
        String actual = solution.ableToMove(begin, target);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String begin = ".L.R.";
        String target = ".R.L.";

        String expected = "Impossible";
        String actual = solution.ableToMove(begin, target);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String begin = "LRLLRLRLLRLLRLRLRL";
        String target = "LRLLRLRLLRLLRLRLRL";

        String expected = "Possible";
        String actual = solution.ableToMove(begin, target);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String begin = "L";
        String target = ".";

        String expected = "Impossible";
        String actual = solution.ableToMove(begin, target);

        Assert.assertEquals(expected, actual);
    }

}
