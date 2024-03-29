import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GearsDiv1Test {

    protected GearsDiv1 solution;

    @Before
    public void setUp() {
        solution = new GearsDiv1();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String color = "RGB";
        String[] graph = new String[]{"NYY", "YNY", "YYN"};

        int expected = 1;
        int actual = solution.getmin(color, graph);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String color = "RGBR";
        String[] graph = new String[]{"NNNN", "NNNN", "NNNN", "NNNN"};

        int expected = 0;
        int actual = solution.getmin(color, graph);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String color = "RGBR";
        String[] graph = new String[]{"NYNN", "YNYN", "NYNY", "NNYN"};

        int expected = 1;
        int actual = solution.getmin(color, graph);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String color = "RRRRRGRRBGRRGBBGGGBRRRGBRGRRGG";
        String[] graph = new String[]{"NNNNNYNNNYNNYNNNYNNNNNNNNYNNYY", "NNNNNNNNYNNNYNYNNYNNNNYNNYNNYY", "NNNNNYNNNNNNNNNNNNYNNNNNNYNNNY", "NNNNNNNNNYNNYNNYYYNNNNYNNYNNNN", "NNNNNNNNNYNNYNNYYYNNNNYNNNNNNN", "YNYNNNYYYNNYNYYNNNNNYYNYNNYYNN", "NNNNNYNNNNNNNNNYYYNNNNYNNYNNYY", "NNNNNYNNNNNNNNNYNNNNNNNNNNNNYN", "NYNNNYNNNYNNYNNYYYNNNNYNNYNNYY", "YNNYYNNNYNNNNYYNNNYNYYNYNNNNNN", "NNNNNNNNNNNNYNNYNYNNNNYNNNNNNY", "NNNNNYNNNNNNYNNYYYNNNNNNNNNNYN", "YYNYYNNNYNYYNYYNNNYNYNNYNNNNNN", "NNNNNYNNNYNNYNNYYYNNNNYNNYNYYY", "NYNNNYNNNYNNYNNYYYNNNNYNNYNNYY", "NNNYYNYYYNYYNYYNNNYNYNNYYNYYNN", "YNNYYNYNYNNYNYYNNNYNNNNYYNNYNN", "NYNYYNYNYNYYNYYNNNNYYNNYYNYNNN", "NNYNNNNNNYNNYNNYYNNNNNYNNYNNNY", "NNNNNNNNNNNNNNNNNYNNNNYNNYNNNY", "NNNNNYNNNYNNYNNYNYNNNNYNNNNNYY", "NNNNNYNNNYNNNNNNNNNNNNYNNNNNNN", "NYNYYNYNYNYNNYYNNNYYYYNYYNYNNN", "NNNNNYNNNYNNYNNYYYNNNNYNNNNNNY", "NNNNNNNNNNNNNNNYYYNNNNYNNYNNYY", "YYYYNNYNYNNNNYYNNNYYNNNNYNYYNN", "NNNNNYNNNNNNNNNYNYNNNNYNNYNNYN", "NNNNNYNNNNNNNYNYYNNNNNNNNYNNYY", "YYNNNNYYYNNYNYYNNNNNYNNNYNYYNN", "YYYNNNYNYNYNNYYNNNYYYNNYYNNYNN"};

        int expected = 3;
        int actual = solution.getmin(color, graph);

        Assert.assertEquals(expected, actual);
    }

}
