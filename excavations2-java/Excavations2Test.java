import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Excavations2Test {

    protected Excavations2 solution;

    @Before
    public void setUp() {
        solution = new Excavations2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] kind = new int[]{1, 2, 2, 1};
        int[] found = new int[]{1};
        int K = 2;

        long expected = 1L;
        long actual = solution.count(kind, found, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] kind = new int[]{1, 2, 2, 1};
        int[] found = new int[]{1, 2};
        int K = 2;

        long expected = 4L;
        long actual = solution.count(kind, found, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] kind = new int[]{1, 2, 1, 1, 2, 3, 4, 3, 2, 2};
        int[] found = new int[]{4, 2};
        int K = 3;

        long expected = 6L;
        long actual = solution.count(kind, found, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] kind = new int[]{50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50};
        int[] found = new int[]{50};
        int K = 21;

        long expected = 5567902560L;
        long actual = solution.count(kind, found, K);

        Assert.assertEquals(expected, actual);
    }

}
