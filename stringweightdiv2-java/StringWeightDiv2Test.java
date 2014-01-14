import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringWeightDiv2Test {

    protected StringWeightDiv2 solution;

    @Before
    public void setUp() {
        solution = new StringWeightDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int L = 1;

        int expected = 26;
        int actual = solution.countMinimums(L);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int L = 2;

        int expected = 650;
        int actual = solution.countMinimums(L);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int L = 50;

        int expected = 488801539;
        int actual = solution.countMinimums(L);

        Assert.assertEquals(expected, actual);
    }

}
