import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HexagonalBoardTest {

    protected HexagonalBoard solution;

    @Before
    public void setUp() {
        solution = new HexagonalBoard();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] board = new String[]{"---", "---", "---"};

        int expected = 0;
        int actual = solution.minColors(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] board = new String[]{"-X--", "---X", "----", "-X--"};

        int expected = 1;
        int actual = solution.minColors(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] board = new String[]{"XXXX", "---X", "---X", "---X"};

        int expected = 2;
        int actual = solution.minColors(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] board = new String[]{"XX-XX--", "-XX-XXX", "X-XX--X", "X--X-X-", "XX-X-XX", "-X-XX-X", "-XX-XX-"};

        int expected = 3;
        int actual = solution.minColors(board);

        Assert.assertEquals(expected, actual);
    }

}
