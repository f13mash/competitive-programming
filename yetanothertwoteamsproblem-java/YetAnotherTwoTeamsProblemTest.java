import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class YetAnotherTwoTeamsProblemTest {

    protected YetAnotherTwoTeamsProblem solution;

    @Before
    public void setUp() {
        solution = new YetAnotherTwoTeamsProblem();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] skill = new int[]{5, 4, 7, 6};

        long expected = 2L;
        long actual = solution.count(skill);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] skill = new int[]{1, 1, 1, 1, 1};

        long expected = 10L;
        long actual = solution.count(skill);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] skill = new int[]{1, 2, 3, 5, 10};

        long expected = 5L;
        long actual = solution.count(skill);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] skill = new int[]{1, 2, 3, 4, 10};

        long expected = 0L;
        long actual = solution.count(skill);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] skill = new int[]{999, 999, 999, 1000, 1000, 1001, 999, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 999, 1000, 512, 511, 1001, 1001, 1001, 1001, 1001, 1000};

        long expected = 17672631900L;
        long actual = solution.count(skill);

        Assert.assertEquals(expected, actual);
    }

}
