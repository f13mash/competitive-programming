import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SpaceWarDiv2Test {

    protected SpaceWarDiv2 solution;

    @Before
    public void setUp() {
        solution = new SpaceWarDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] magicalGirlStrength = new int[]{2};
        int[] enemyStrength = new int[]{2};
        int[] enemyCount = new int[]{4};

        int expected = 7;
        int actual = solution.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] magicalGirlStrength = new int[]{2, 3, 5};
        int[] enemyStrength = new int[]{1, 1, 2};
        int[] enemyCount = new int[]{2, 9, 4};

        int expected = 5;
        int actual = solution.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] magicalGirlStrength = new int[]{14, 6, 22};
        int[] enemyStrength = new int[]{8, 33};
        int[] enemyCount = new int[]{9, 1};

        int expected = -1;
        int actual = solution.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] magicalGirlStrength = new int[]{17, 10, 29, 48, 92, 60, 80, 100, 15, 69, 36, 43, 70, 14, 88, 12, 14, 29, 9, 40};
        int[] enemyStrength = new int[]{93, 59, 27, 68, 48, 82, 15, 95, 61, 49, 68, 15, 16, 26, 64, 82, 7, 8, 92, 15};
        int[] enemyCount = new int[]{56, 26, 12, 52, 5, 19, 93, 36, 69, 61, 68, 66, 55, 28, 49, 55, 63, 57, 33, 45};

        int expected = 92;
        int actual = solution.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount);

        Assert.assertEquals(expected, actual);
    }

}
