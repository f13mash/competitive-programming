import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FlippingBitsDiv2Test {

    protected FlippingBitsDiv2 solution;

    @Before
    public void setUp() {
        solution = new FlippingBitsDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] S = new String[]{"00111000"};
        int M = 1;

        int expected = 2;
        int actual = solution.getmin(S, M);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] S = new String[]{"00111000"};
        int M = 2;

        int expected = 3;
        int actual = solution.getmin(S, M);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] S = new String[]{"111111"};
        int M = 3;

        int expected = 0;
        int actual = solution.getmin(S, M);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] S = new String[]{"00100"};
        int M = 5;

        int expected = 2;
        int actual = solution.getmin(S, M);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] S = new String[]{"00010", "11010110", "1010111", "110001010", "0110001100", "000110110", "011010101", "00", "111", "100"};
        int M = 13;

        int expected = 31;
        int actual = solution.getmin(S, M);

        Assert.assertEquals(expected, actual);
    }

}
