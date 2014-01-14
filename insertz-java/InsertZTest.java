import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InsertZTest {

    protected InsertZ solution;

    @Before
    public void setUp() {
        solution = new InsertZ();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String init = "fox";
        String goal = "fozx";

        String expected = "Yes";
        String actual = solution.canTransform(init, goal);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String init = "fox";
        String goal = "zfzoxzz";

        String expected = "Yes";
        String actual = solution.canTransform(init, goal);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String init = "foon";
        String goal = "foon";

        String expected = "Yes";
        String actual = solution.canTransform(init, goal);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String init = "topcoder";
        String goal = "zopzoder";

        String expected = "No";
        String actual = solution.canTransform(init, goal);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String init = "aaaaaaaaaa";
        String goal = "a";

        String expected = "No";
        String actual = solution.canTransform(init, goal);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String init = "mvixrdnrpxowkasufnvxaq";
        String goal = "mvizzxzzzrdzznzrpxozzwzzkazzzszzuzzfnvxzzzazzq";

        String expected = "Yes";
        String actual = solution.canTransform(init, goal);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String init = "opdlfmvuicjsierjowdvnx";
        String goal = "zzopzdlfmvzuicjzzsizzeijzowvznxzz";

        String expected = "No";
        String actual = solution.canTransform(init, goal);

        Assert.assertEquals(expected, actual);
    }

}
