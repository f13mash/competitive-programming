import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SurveillanceSystemTest {

    protected SurveillanceSystem solution;

    @Before
    public void setUp() {
        solution = new SurveillanceSystem();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String containers = "-X--XX";
        int[] reports = new int[]{1, 2};
        int L = 3;

        String expected = "??++++";
        String actual = solution.getContainerInfo(containers, reports, L);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String containers = "-XXXXX-";
        int[] reports = new int[]{2};
        int L = 3;

        String expected = "???-???";
        String actual = solution.getContainerInfo(containers, reports, L);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String containers = "------X-XX-";
        int[] reports = new int[]{3, 0, 2, 0};
        int L = 5;

        String expected = "++++++++++?";
        String actual = solution.getContainerInfo(containers, reports, L);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String containers = "-XXXXX---X--";
        int[] reports = new int[]{2, 1, 0, 1};
        int L = 3;

        String expected = "???-??++++??";
        String actual = solution.getContainerInfo(containers, reports, L);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String containers = "-XX--X-XX-X-X--X---XX-X---XXXX-----X";
        int[] reports = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        int L = 7;

        String expected = "???++++?++++++++++++++++++++??????--";
        String actual = solution.getContainerInfo(containers, reports, L);

        Assert.assertEquals(expected, actual);
    }

}
