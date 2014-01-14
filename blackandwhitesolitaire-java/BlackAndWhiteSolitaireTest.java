import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BlackAndWhiteSolitaireTest {

    protected BlackAndWhiteSolitaire solution;

    @Before
    public void setUp() {
        solution = new BlackAndWhiteSolitaire();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String cardFront = "BBBW";

        int expected = 1;
        int actual = solution.minimumTurns(cardFront);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String cardFront = "WBWBW";

        int expected = 0;
        int actual = solution.minimumTurns(cardFront);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String cardFront = "WWWWWWWWW";

        int expected = 4;
        int actual = solution.minimumTurns(cardFront);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String cardFront = "BBWBWWBWBWWBBBWBWBWBBWBBW";

        int expected = 10;
        int actual = solution.minimumTurns(cardFront);

        Assert.assertEquals(expected, actual);
    }

}
