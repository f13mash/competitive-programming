import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ColorTheCellsTest {

    protected ColorTheCells solution;

    @Before
    public void setUp() {
        solution = new ColorTheCells();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] dryingTime = new int[]{2, 2, 3};

        int expected = 6;
        int actual = solution.minimalTime(dryingTime);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] dryingTime = new int[]{1, 2, 100, 1};

        int expected = 7;
        int actual = solution.minimalTime(dryingTime);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] dryingTime = new int[]{33, 58, 21, 44};

        int expected = 26;
        int actual = solution.minimalTime(dryingTime);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] dryingTime = new int[]{35198, 26281, 72533, 91031, 44326, 43178, 85530};

        int expected = 26287;
        int actual = solution.minimalTime(dryingTime);

        Assert.assertEquals(expected, actual);
    }

}
