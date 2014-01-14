import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PiecewiseLinearFunctionTest {

    protected PiecewiseLinearFunction solution;

    @Before
    public void setUp() {
        solution = new PiecewiseLinearFunction();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] Y = new int[]{3, 2};

        int expected = 1;
        int actual = solution.maximumSolutions(Y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] Y = new int[]{4, 4};

        int expected = -1;
        int actual = solution.maximumSolutions(Y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] Y = new int[]{1, 4, -1, 2};

        int expected = 3;
        int actual = solution.maximumSolutions(Y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] Y = new int[]{2, 1, 2, 1, 3, 2, 3, 2};

        int expected = 5;
        int actual = solution.maximumSolutions(Y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] Y = new int[]{125612666, -991004227, 0, 6, 88023, -1000000000, 1000000000, -1000000000, 1000000000};

        int expected = 6;
        int actual = solution.maximumSolutions(Y);

        Assert.assertEquals(expected, actual);
    }

}
