import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest extends TestCase {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testReturnsFizzWhenInputIsDivisibleByThree() {
        String result = fizzBuzz.run("1 2 3 4");
        assertEquals("1 2 Fizz 4", result);
    }

    @Test
    public void testReturnsBuzzWhenInputIsDivisibleByFive() {
        String result = fizzBuzz.run("5 7");
        assertEquals("Buzz 7", result);
    }

    @Test
    public void testReturnsFizzBuzzWhenInputIsDivisibleByThreeAndFive() {
        String result = fizzBuzz.run("5 15 18");
        assertEquals("Buzz FizzBuzz Fizz", result);
    }
}
