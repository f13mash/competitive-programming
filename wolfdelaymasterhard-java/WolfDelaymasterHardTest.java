import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WolfDelaymasterHardTest {

    protected WolfDelaymasterHard solution;

    @Before
    public void setUp() {
        solution = new WolfDelaymasterHard();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int N = 8;
        int wlen = 5;
        int w0 = 2;
        int wmul = 3;
        int wadd = 2;
        int olen = 0;
        int o0 = 6;
        int omul = 7;
        int oadd = 1;

        int expected = 6;
        int actual = solution.countWords(N, wlen, w0, wmul, wadd, olen, o0, omul, oadd);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 20;
        int wlen = 19;
        int w0 = 12;
        int wmul = 9;
        int wadd = 15;
        int olen = 1;
        int o0 = 8;
        int omul = 11;
        int oadd = 1;

        int expected = 26;
        int actual = solution.countWords(N, wlen, w0, wmul, wadd, olen, o0, omul, oadd);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 40;
        int wlen = 24;
        int w0 = 34;
        int wmul = 5;
        int wadd = 11;
        int olen = 33;
        int o0 = 35;
        int omul = 23;
        int oadd = 27;

        int expected = 296;
        int actual = solution.countWords(N, wlen, w0, wmul, wadd, olen, o0, omul, oadd);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 60;
        int wlen = 35;
        int w0 = 8;
        int wmul = 55;
        int wadd = 3;
        int olen = 11;
        int o0 = 20;
        int omul = 9;
        int oadd = 29;

        int expected = 10058904;
        int actual = solution.countWords(N, wlen, w0, wmul, wadd, olen, o0, omul, oadd);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int N = 2000;
        int wlen = 183;
        int w0 = 994;
        int wmul = 862;
        int wadd = 468;
        int olen = 148;
        int o0 = 433;
        int omul = 1247;
        int oadd = 1989;

        int expected = 532199331;
        int actual = solution.countWords(N, wlen, w0, wmul, wadd, olen, o0, omul, oadd);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int N = 2000000;
        int wlen = 419443;
        int w0 = 1305303;
        int wmul = 1761823;
        int wadd = 1007025;
        int olen = 874640;
        int o0 = 1516339;
        int omul = 229519;
        int oadd = 1473199;

        int expected = 861766906;
        int actual = solution.countWords(N, wlen, w0, wmul, wadd, olen, o0, omul, oadd);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        int N = 8;
        int wlen = 6;
        int w0 = 0;
        int wmul = 1;
        int wadd = 1;
        int olen = 3;
        int o0 = 3;
        int omul = 6;
        int oadd = 1;

        int expected = 0;
        int actual = solution.countWords(N, wlen, w0, wmul, wadd, olen, o0, omul, oadd);

        Assert.assertEquals(expected, actual);
    }

}
