import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TravelOnMars2Test {

    protected TravelOnMars2 solution;

    @Before
    public void setUp() {
        solution = new TravelOnMars2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] range = new int[]{2, 1, 1, 1, 1, 1};
        int startCity = 1;
        int endCity = 4;

        int expected = 2;
        int actual = solution.minTimes(range, startCity, endCity);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] range = new int[]{2, 1, 1, 2, 1, 2, 1, 1};
        int startCity = 2;
        int endCity = 6;

        int expected = 3;
        int actual = solution.minTimes(range, startCity, endCity);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] range = new int[]{3, 2, 1, 1, 3, 1, 2, 2, 1, 1, 2, 2, 2, 2, 3};
        int startCity = 6;
        int endCity = 13;

        int expected = 4;
        int actual = solution.minTimes(range, startCity, endCity);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] range = new int[]{2, 4, 2, 3, 4, 1, 4, 2, 5, 4, 3, 3, 5, 4, 5, 2, 2, 4, 4, 3, 3, 4, 2, 3, 5, 4, 2, 4, 1, 3, 2, 3, 4, 1, 1, 4, 4, 3, 5, 3, 2, 1, 4, 1, 4};
        int startCity = 24;
        int endCity = 8;

        int expected = 5;
        int actual = solution.minTimes(range, startCity, endCity);

        Assert.assertEquals(expected, actual);
    }

}
