import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SemiPerfectSquareTest {

    protected SemiPerfectSquare solution;

    @Before
    public void setUp() {
        solution = new SemiPerfectSquare();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int N = 48;

        String expected = "Yes";
        String actual = solution.check(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 1000;

        String expected = "No";
        String actual = solution.check(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 25;

        String expected = "Yes";
        String actual = solution.check(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 47;

        String expected = "No";
        String actual = solution.check(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int N = 847;

        String expected = "Yes";
        String actual = solution.check(N);

        Assert.assertEquals(expected, actual);
    }

}
