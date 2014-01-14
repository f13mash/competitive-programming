import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FoxAndGameTest {

    protected FoxAndGame solution;

    @Before
    public void setUp() {
        solution = new FoxAndGame();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] result = new String[]{"ooo", "ooo"};

        int expected = 6;
        int actual = solution.countStars(result);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] result = new String[]{"ooo", "oo-", "o--"};

        int expected = 6;
        int actual = solution.countStars(result);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] result = new String[]{"ooo", "---", "oo-", "---", "o--"};

        int expected = 6;
        int actual = solution.countStars(result);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] result = new String[]{"o--", "o--", "o--", "ooo", "---"};

        int expected = 6;
        int actual = solution.countStars(result);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] result = new String[]{"---", "o--", "oo-", "ooo", "ooo", "oo-", "o--", "---"};

        int expected = 12;
        int actual = solution.countStars(result);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] result = new String[]{"---", "---", "---", "---", "---", "---"};

        int expected = 0;
        int actual = solution.countStars(result);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String[] result = new String[]{"oo-"};

        int expected = 2;
        int actual = solution.countStars(result);

        Assert.assertEquals(expected, actual);
    }

}
