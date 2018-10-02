import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TDDEx1 {
    private static int counter = 0;

    @BeforeClass
    public static void suiteSetup() {
        assertEquals(0,counter);
        counter++;
    }

    public TDDEx1() {
        assertTrue(Arrays.asList(1,5).contains(counter));
        counter++;
    }

    @Before
    public void prepareTest() {
        assertTrue(Arrays.asList(2,6).contains(counter));
        counter++;
    }

    @Test
    public void firstTest() {
        assertTrue(Arrays.asList(3,7).contains(counter));
        counter++;
    }

    @Test
    public void scondTest() {
        assertTrue(Arrays.asList(3,7).contains(counter));
        counter++;
    }

    @Test
    public void assertionWithMessage() {
        final List<Integer> numbers = new ArrayList<>();
        numbers.add(1);

        assertTrue("The numbers list should not be empty",numbers.isEmpty());
    }

    @After
    public void cleanupTest() {
        assertTrue(Arrays.asList(4,8).contains(counter));
        counter++;
    }

    @AfterClass
    public static void suiteFinished() {
        assertEquals(0,counter);
    }
}
