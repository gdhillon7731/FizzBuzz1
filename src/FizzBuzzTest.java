import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void whenFizzBuzzPassedANumberItReturnsThatNumber() {
        assertEquals("1", fizzBuzz.fizz(1));

    }

    @Test
    public void whenFizzBuzzPassedATwoItReturnsTwo() {
        assertEquals("2", fizzBuzz.fizz(2));

    }
    @Test
    public void whenFizzBuzzPassedAThreeItReturnsFizz() {
        assertEquals("Fizz", fizzBuzz.fizz(3));
        assertEquals("Fizz", fizzBuzz.fizz(6));

    }
    @Test
    public void whenFizzBuzzPassedAMultipulOfFiveItReturnsBuzz() {
        assertEquals("Buzz", fizzBuzz.fizz(5));
        assertEquals("Buzz", fizzBuzz.fizz(10));


    }
    @Test
    public void whenFizzBuzzPassedAMultipulOfThreeAndFiveItReturnsFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.fizz(15));

    }


}