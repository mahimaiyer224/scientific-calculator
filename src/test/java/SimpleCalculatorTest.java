import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {

    @Test
    public void testSquareRoot() {
        assertEquals(3.0, Math.sqrt(9), 0.001);
        assertEquals(0.0, Math.sqrt(0), 0.001);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, factorial(5));
        assertEquals(1, factorial(0));
        assertThrows(IllegalArgumentException.class, () -> {
            factorial(-1);
        });
    }

    @Test
    public void testLogarithm() {
        assertEquals(Math.log(1), Math.log(1), 0.001);
        assertEquals(Math.log(Math.E), 1, 0.001);
        assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Logarithm is not defined for non-positive numbers.");
        });
    }

    @Test
    public void testPower() {
        assertEquals(8.0, Math.pow(2, 3), 0.001);
        assertEquals(1.0, Math.pow(5, 0), 0.001);
        assertEquals(0.25, Math.pow(2, -2), 0.001);
    }

    private long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
