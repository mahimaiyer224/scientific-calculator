import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {

    @Test
    public void testSquareRoot() {
        assertEquals(3.0, ScientificCalculator.sqrt(9), 0.001);
        assertEquals(0.0, ScientificCalculator.sqrt(0), 0.001);
        assertThrows(IllegalArgumentException.class, () -> {
            ScientificCalculator.sqrt(-1);
        });
    }

    @Test
    public void testFactorial() {
        assertEquals(120, ScientificCalculator.factorial(5));
        assertEquals(1, ScientificCalculator.factorial(0));
        assertThrows(IllegalArgumentException.class, () -> {
            ScientificCalculator.factorial(-1);
        });
    }

    @Test
    public void testLogarithm() {
        assertEquals(Math.log(1), ScientificCalculator.log(1), 0.001);
        assertEquals(Math.log(Math.E), ScientificCalculator.log(Math.E), 0.001);
        assertThrows(IllegalArgumentException.class, () -> {
            ScientificCalculator.log(-1);
        });
    }

    @Test
    public void testPower() {
        assertEquals(8.0, ScientificCalculator.power(2, 3), 0.001);
        assertEquals(1.0, ScientificCalculator.power(5, 0), 0.001);
        assertEquals(0.25, ScientificCalculator.power(2, -2), 0.001);
    }
}
