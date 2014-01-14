import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class XorCardsTest {

    protected XorCards solution;

    @Before
    public void setUp() {
        solution = new XorCards();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        long[] number = new long[]{1L, 2L};
        long limit = 2L;

        long expected = 3L;
        long actual = solution.numberOfWays(number, limit);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        long[] number = new long[]{5L, 5L};
        long limit = 3L;

        long expected = 2L;
        long actual = solution.numberOfWays(number, limit);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        long[] number = new long[]{1L, 2L, 3L, 4L, 5L, 6L, 7L};
        long limit = 5L;

        long expected = 96L;
        long actual = solution.numberOfWays(number, limit);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        long[] number = new long[]{123L, 456L, 789L, 147L, 258L, 369L, 159L, 357L};
        long limit = 500L;

        long expected = 125L;
        long actual = solution.numberOfWays(number, limit);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        long[] number = new long[]{0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L};
        long limit = 1000000000000000L;

        long expected = 4294967296L;
        long actual = solution.numberOfWays(number, limit);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        long[] number = new long[]{1000000000000000L, 999999999999999L};
        long limit = 65535L;

        long expected = 2L;
        long actual = solution.numberOfWays(number, limit);

        Assert.assertEquals(expected, actual);
    }

}
