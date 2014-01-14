import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FencingPenguinsEasyTest {

    protected FencingPenguinsEasy solution;

    @Before
    public void setUp() {
        solution = new FencingPenguinsEasy();
    }

    public static void assertEquals(double expected, double actual) {
        if (Double.isNaN(expected)) {
            Assert.assertTrue("expected: <NaN> but was: <" + actual + ">", Double.isNaN(actual));
            return;
        }
        double delta = Math.max(1e-9, 1e-9 * Math.abs(expected));
        Assert.assertEquals(expected, actual, delta);
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int numPosts = 3;
        int radius = 5;
        int[] x = new int[]{-1};
        int[] y = new int[]{0};

        double expected = 32.47595264191645;
        double actual = solution.calculateMinArea(numPosts, radius, x, y);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int numPosts = 30;
        int radius = 5;
        int[] x = new int[]{6};
        int[] y = new int[]{0};

        double expected = -1.0;
        double actual = solution.calculateMinArea(numPosts, radius, x, y);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int numPosts = 4;
        int radius = 5;
        int[] x = new int[]{2};
        int[] y = new int[]{1};

        double expected = 25.0;
        double actual = solution.calculateMinArea(numPosts, radius, x, y);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int numPosts = 4;
        int radius = 5;
        int[] x = new int[]{2, -2};
        int[] y = new int[]{1, -1};

        double expected = 50.0;
        double actual = solution.calculateMinArea(numPosts, radius, x, y);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int numPosts = 8;
        int radius = 5;
        int[] x = new int[]{8};
        int[] y = new int[]{8};

        double expected = -1.0;
        double actual = solution.calculateMinArea(numPosts, radius, x, y);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int numPosts = 7;
        int radius = 10;
        int[] x = new int[]{9};
        int[] y = new int[]{1};

        double expected = 29.436752637711805;
        double actual = solution.calculateMinArea(numPosts, radius, x, y);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        int numPosts = 30;
        int radius = 800;
        int[] x = new int[]{8, 2, 100, 120, 52, 67, 19, -36};
        int[] y = new int[]{-19, 12, 88, -22, 53, 66, -140, 99};

        double expected = 384778.74757953023;
        double actual = solution.calculateMinArea(numPosts, radius, x, y);

        assertEquals(expected, actual);
    }

}
