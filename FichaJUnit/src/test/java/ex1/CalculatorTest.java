package ex1;

import org.example.ex1.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calculator;
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
        assertEquals(-5, calculator.add(-2, -3));
        assertEquals(0, calculator.add(0,0));

        // 2 147 483 647
        assertEquals(2147483646, calculator.add(2147483645, 1 ));
        assertEquals(2147483647, calculator.add(2147483646, 1 ));
    }
    @Test    public void testDivide() {
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }
    @Test    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}