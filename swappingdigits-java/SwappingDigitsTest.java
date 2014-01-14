import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SwappingDigitsTest {

    protected SwappingDigits solution;

    @Before
    public void setUp() {
        solution = new SwappingDigits();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String num = "596";

        String expected = "569";
        String actual = solution.minNumber(num);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String num = "93561";

        String expected = "13569";
        String actual = solution.minNumber(num);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String num = "5491727514";

        String expected = "1491727554";
        String actual = solution.minNumber(num);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String num = "10234";

        String expected = "10234";
        String actual = solution.minNumber(num);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String num = "93218910471211292416";

        String expected = "13218910471211292496";
        String actual = solution.minNumber(num);

        Assert.assertEquals(expected, actual);
    }

}
