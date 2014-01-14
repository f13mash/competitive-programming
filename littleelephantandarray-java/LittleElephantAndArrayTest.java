import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LittleElephantAndArrayTest {

    protected LittleElephantAndArray solution;

    @Before
    public void setUp() {
        solution = new LittleElephantAndArray();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        long A = 1L;
        int N = 9;

        int expected = 1;
        int actual = solution.getNumber(A, N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        long A = 10L;
        int N = 2;

        int expected = 15;
        int actual = solution.getNumber(A, N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        long A = 4747774L;
        int N = 1;

        int expected = 8369;
        int actual = solution.getNumber(A, N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        long A = 6878542150015L;
        int N = 74;

        int expected = 977836619;
        int actual = solution.getNumber(A, N);

        Assert.assertEquals(expected, actual);
    }

}
