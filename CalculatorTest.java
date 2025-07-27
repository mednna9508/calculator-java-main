package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testCalculate() {
        Calculator calculator = new Calculator();
        String result = calculator.calculate("2+3*4");
        assertEquals("14", result);
    }
}
