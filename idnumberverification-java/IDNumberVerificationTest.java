import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IDNumberVerificationTest {

    protected IDNumberVerification solution;

    @Before
    public void setUp() {
        solution = new IDNumberVerification();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String id = "44405619350217028X";
        String[] regionCodes = new String[]{"441323", "444056"};

        String expected = "Male";
        String actual = solution.verify(id, regionCodes);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String id = "62012319240507058X";
        String[] regionCodes = new String[]{"620123"};

        String expected = "Female";
        String actual = solution.verify(id, regionCodes);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String id = "321669197204300886";
        String[] regionCodes = new String[]{"610111", "659004"};

        String expected = "Invalid";
        String actual = solution.verify(id, regionCodes);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String id = "230231198306900162";
        String[] regionCodes = new String[]{"230231"};

        String expected = "Invalid";
        String actual = solution.verify(id, regionCodes);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String id = "341400198407260005";
        String[] regionCodes = new String[]{"341400"};

        String expected = "Invalid";
        String actual = solution.verify(id, regionCodes);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String id = "520381193206090891";
        String[] regionCodes = new String[]{"532922", "520381"};

        String expected = "Invalid";
        String actual = solution.verify(id, regionCodes);

        Assert.assertEquals(expected, actual);
    }

}
