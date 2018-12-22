import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void whenFizzBuzzIsPassedANumberItReturnsThatNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz() ;
        assertEquals("1", fizzBuzz.fizz(1));
    }
}
