import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TopFoxTest {

    protected TopFox solution;

    @Before
    public void setUp() {
        solution = new TopFox();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String familyName = "ab";
        String givenName = "cd";

        int expected = 4;
        int actual = solution.possibleHandles(familyName, givenName);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String familyName = "abb";
        String givenName = "bbc";

        int expected = 7;
        int actual = solution.possibleHandles(familyName, givenName);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String familyName = "fox";
        String givenName = "ciel";

        int expected = 12;
        int actual = solution.possibleHandles(familyName, givenName);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String familyName = "abbbb";
        String givenName = "bbbbbbbc";

        int expected = 16;
        int actual = solution.possibleHandles(familyName, givenName);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String familyName = "abxy";
        String givenName = "xyxyxc";

        int expected = 21;
        int actual = solution.possibleHandles(familyName, givenName);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String familyName = "ababababab";
        String givenName = "bababababa";

        int expected = 68;
        int actual = solution.possibleHandles(familyName, givenName);

        Assert.assertEquals(expected, actual);
    }

}
