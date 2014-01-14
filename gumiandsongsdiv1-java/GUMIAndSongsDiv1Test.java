import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GUMIAndSongsDiv1Test {

    protected GUMIAndSongsDiv1 solution;

    @Before
    public void setUp() {
        solution = new GUMIAndSongsDiv1();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] duration = new int[]{934, 486, 375, 612, 621, 45, 549, 511, 474, 354, 558, 341, 777, 808, 470, 67, 553, 105, 91, 324, 611, 479, 513, 81, 965, 329, 221, 435, 681, 451, 704, 906, 666, 961, 546, 420, 446, 835, 193, 187, 124, 976, 985, 889, 543, 672, 170, 511, 178, 767};
        int[] tone = new int[]{5, 5, 8, 1, 1, 8, 9, 5, 4, 6, 5, 7, 6, 3, 4, 3, 3, 5, 5, 1, 9, 6, 8, 6, 8, 7, 2, 8, 4, 3, 9, 7, 4, 6, 6, 10, 3, 4, 6, 6, 6, 7, 3, 10, 10, 8, 5, 1, 10, 10};
        int T = 3614;

        int expected = 17;
        int actual = solution.maxSongs(duration, tone, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] duration = new int[]{100, 200, 300};
        int[] tone = new int[]{1, 2, 3};
        int T = 99;

        int expected = 0;
        int actual = solution.maxSongs(duration, tone, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] duration = new int[]{1, 2, 3, 4};
        int[] tone = new int[]{1, 1, 1, 1};
        int T = 100;

        int expected = 4;
        int actual = solution.maxSongs(duration, tone, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] duration = new int[]{9, 11, 13, 17};
        int[] tone = new int[]{2, 1, 3, 4};
        int T = 20;

        int expected = 1;
        int actual = solution.maxSongs(duration, tone, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] duration = new int[]{87, 21, 20, 73, 97, 57, 12, 80, 86, 97, 98, 85, 41, 12, 89, 15, 41, 17, 68, 37, 21, 1, 9, 65, 4, 67, 38, 91, 46, 82, 7, 98, 21, 70, 99, 41, 21, 65, 11, 1, 8, 12, 77, 62, 52, 69, 56, 33, 98, 97};
        int[] tone = new int[]{88, 27, 89, 2, 96, 32, 4, 93, 89, 50, 58, 70, 15, 48, 31, 2, 27, 20, 31, 3, 23, 86, 69, 12, 59, 61, 85, 67, 77, 34, 29, 3, 75, 42, 50, 37, 56, 45, 51, 68, 89, 17, 4, 47, 9, 14, 29, 59, 43, 3};
        int T = 212;

        int expected = 12;
        int actual = solution.maxSongs(duration, tone, T);

        Assert.assertEquals(expected, actual);
    }

}
