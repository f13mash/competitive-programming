import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FoxAndGoTest {

    protected FoxAndGo solution;

    @Before
    public void setUp() {
        solution = new FoxAndGo();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] board = new String[]{".....", "..x..", ".xox.", ".....", "....."};

        int expected = 1;
        int actual = solution.maxKill(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] board = new String[]{"ooooo", "xxxxo", "xxxx.", "xxxx.", "ooooo"};

        int expected = 6;
        int actual = solution.maxKill(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] board = new String[]{".xoxo", "ooxox", "oooxx", "xoxox", "oxoox"};

        int expected = 13;
        int actual = solution.maxKill(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] board = new String[]{".......", ".......", ".......", "xxxx...", "ooox...", "ooox...", "ooox..."};

        int expected = 9;
        int actual = solution.maxKill(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] board = new String[]{".......", ".xxxxx.", ".xooox.", ".xo.ox.", ".xooox.", ".xxxxx.", "......."};

        int expected = 8;
        int actual = solution.maxKill(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] board = new String[]{"o.xox.o", "..xox..", "xxxoxxx", "ooo.ooo", "xxxoxxx", "..xox..", "o.xox.o"};

        int expected = 12;
        int actual = solution.maxKill(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String[] board = new String[]{".......", "..xx...", ".xooox.", ".oxxox.", ".oxxxo.", "...oo..", "......."};

        int expected = 4;
        int actual = solution.maxKill(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase7() {
        String[] board = new String[]{".ox....", "xxox...", "..xoox.", "..xoox.", "...xx..", ".......", "......."};

        int expected = 5;
        int actual = solution.maxKill(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase8() {
        String[] board = new String[]{"...................", "...................", "...o..........o....", "................x..", "...............x...", "...................", "...................", "...................", "...................", "...................", "...................", "...................", "...................", "...................", "................o..", "..x................", "...............x...", "...................", "..................."};

        int expected = 0;
        int actual = solution.maxKill(board);

        Assert.assertEquals(expected, actual);
    }

}
