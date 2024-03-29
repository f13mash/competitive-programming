import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShoutterDiv2Test {

    protected ShoutterDiv2 solution;

    @Before
    public void setUp() {
        solution = new ShoutterDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] s = new int[]{1, 2, 4};
        int[] t = new int[]{3, 4, 6};

        int expected = 2;
        int actual = solution.count(s, t);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] s = new int[]{0};
        int[] t = new int[]{100};

        int expected = 0;
        int actual = solution.count(s, t);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] s = new int[]{0, 0, 0};
        int[] t = new int[]{1, 1, 1};

        int expected = 3;
        int actual = solution.count(s, t);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] s = new int[]{9, 26, 8, 35, 3, 58, 91, 24, 10, 26, 22, 18, 15, 12, 15, 27, 15, 60, 76, 19, 12, 16, 37, 35, 25, 4, 22, 47, 65, 3, 2, 23, 26, 33, 7, 11, 34, 74, 67, 32, 15, 45, 20, 53, 60, 25, 74, 13, 44, 51};
        int[] t = new int[]{26, 62, 80, 80, 52, 83, 100, 71, 20, 73, 23, 32, 80, 37, 34, 55, 51, 86, 97, 89, 17, 81, 74, 94, 79, 85, 77, 97, 87, 8, 70, 46, 58, 70, 97, 35, 80, 76, 82, 80, 19, 56, 65, 62, 80, 49, 79, 28, 75, 78};

        int expected = 830;
        int actual = solution.count(s, t);

        Assert.assertEquals(expected, actual);
    }

}
