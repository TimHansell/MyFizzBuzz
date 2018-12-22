import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void whenFizzBuzzIsPassedANumberItReturnsThatNumber() {
        assertEquals("1", fizzBuzz.fizz(1));
    }

    @Test
    public void whenFizzBuzzIsPassedATwoItReturnsTwo() {
        assertEquals("2", fizzBuzz.fizz(2));
    }

    @Test
    public void whenFizzBuzzIsPassedAMultipleOfThreeItReturnsFizz() {
        assertEquals("fizz", fizzBuzz.fizz(3));
        assertEquals("fizz", fizzBuzz.fizz(6));
    }
}
