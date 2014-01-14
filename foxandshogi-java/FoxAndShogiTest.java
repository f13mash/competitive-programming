import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FoxAndShogiTest {

    protected FoxAndShogi solution;

    @Before
    public void setUp() {
        solution = new FoxAndShogi();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] board = new String[]{".D.", "...", "..."};

        int expected = 3;
        int actual = solution.differentOutcomes(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] board = new String[]{".D.", "...", ".U."};

        int expected = 3;
        int actual = solution.differentOutcomes(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] board = new String[]{"DDDDD", ".....", ".....", ".....", "....."};

        int expected = 3125;
        int actual = solution.differentOutcomes(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] board = new String[]{"DDDDD", "U....", ".U...", "..U..", "...U."};

        int expected = 900;
        int actual = solution.differentOutcomes(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] board = new String[]{"....D..", "U....D.", "D.D.U.D", "U.U...D", "....U..", "D.U...D", "U.U...."};

        int expected = 2268;
        int actual = solution.differentOutcomes(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] board = new String[]{"DDDDDDDDDD", "..........", "..........", "..........", "..........", "..........", "..........", "..........", "..........", ".........."};

        int expected = 999999937;
        int actual = solution.differentOutcomes(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String[] board = new String[]{"..", ".."};

        int expected = 1;
        int actual = solution.differentOutcomes(board);

        Assert.assertEquals(expected, actual);
    }

}
