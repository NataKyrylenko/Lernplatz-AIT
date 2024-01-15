package Lectione.Lection36;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    // @Test
    // public void testMultiply(){
    //     assertEquals(6,calculator.multiplication(2,3 ));

    // }
    @Test
    public void givenAandB_whenCompare_thenTrue(){
        assertTrue(calculator.compareNumbers(3, 0));
        assertTrue(3>2);
    }
    @Test
    public void givenThereeLessThanOne_whenResultFalse_thenTrue(){
        assertFalse(calculator.compareNumbers(1, 3));
    }

}
