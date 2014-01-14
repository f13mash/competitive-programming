import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MagicMoleculeEasyTest {

    protected MagicMoleculeEasy solution;

    @Before
    public void setUp() {
        solution = new MagicMoleculeEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] magicPower = new int[]{1, 2};
        String[] magicBond = new String[]{"NY", "YN"};
        int k = 1;

        int expected = 2;
        int actual = solution.maxMagicPower(magicPower, magicBond, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] magicPower = new int[]{100, 1, 100};
        String[] magicBond = new String[]{"NYN", "YNY", "NYN"};
        int k = 1;

        int expected = 1;
        int actual = solution.maxMagicPower(magicPower, magicBond, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] magicPower = new int[]{100, 1, 100};
        String[] magicBond = new String[]{"NYN", "YNY", "NYN"};
        int k = 2;

        int expected = 200;
        int actual = solution.maxMagicPower(magicPower, magicBond, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] magicPower = new int[]{4, 7, 5, 8};
        String[] magicBond = new String[]{"NYNY", "YNYN", "NYNY", "YNYN"};
        int k = 2;

        int expected = 15;
        int actual = solution.maxMagicPower(magicPower, magicBond, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] magicPower = new int[]{46474, 60848, 98282, 58073, 42670, 50373};
        String[] magicBond = new String[]{"NYNNNY", "YNNYNY", "NNNYYY", "NYYNNN", "NNYNNN", "YYYNNN"};
        int k = 3;

        int expected = 209503;
        int actual = solution.maxMagicPower(magicPower, magicBond, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] magicPower = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        String[] magicBond = new String[]{"NNYYYNYYNYNNY", "NNYNYYYYYYYNY", "YYNYYNYYYYYYY", "YNYNYYNYYYYYY", "YYYYNNYYYYYNY", "NYNYNNYYYYYNN", "YYYNYYNYYYYYY", "YYYYYYYNYNYYY", "NYYYYYYYNYYYY", "YYYYYYYNYNNNN", "NYYYYYYYYNNYN", "NNYYNNYYYNYNN", "YYYYYNYYYNNNN"};
        int k = 9;

        int expected = -1;
        int actual = solution.maxMagicPower(magicPower, magicBond, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        int[] magicPower = new int[]{1, 1};
        String[] magicBond = new String[]{"NN", "NN"};
        int k = 1;

        int expected = 1;
        int actual = solution.maxMagicPower(magicPower, magicBond, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase7() {
        int[] magicPower = new int[]{1, 1, 2, 5, 2, 4, 2};
        String[] magicBond = new String[]{"NNNNNNN", "NNYNNNN", "NYNNNYN", "NNNNNNY", "NNNNNNN", "NNYNNNN", "NNNYNNN"};
        int k = 3;

        int expected = 11;
        int actual = solution.maxMagicPower(magicPower, magicBond, k);

        Assert.assertEquals(expected, actual);
    }

}
