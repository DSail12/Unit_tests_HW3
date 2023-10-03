package hw3.Test.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class MainHWTest {

    private MainHW mainHW;

    @BeforeEach
    void setup() {
        mainHW = new MainHW();
    }

    @Test
    public void testEvenOddNumber_EvenNumber_ReturnsTrue() {
        boolean isEven = mainHW.evenOddNumber(4);
        Assertions.assertTrue(isEven);
    }

    @Test
    public void testEvenOddNumber_OddNumber_ReturnsFalse() {
        boolean isEven = mainHW.evenOddNumber(7);
        Assertions.assertFalse(isEven);
    }

    @Test
    void numberInInterval_NumberGreaterThan25AndLessThan100_ReturnsTrue() {
        boolean isInInterval = mainHW.numberInInterval(50);
        Assertions.assertTrue(isInInterval);
    }

    @Test
    void numberInInterval_NumberLessThan25_ReturnsFalse() {
        boolean isInInterval = mainHW.numberInInterval(10);
        Assertions.assertFalse(isInInterval);
    }

    @Test
    void numberInInterval_NumberEqualTo25_ReturnsFalse() {
        boolean isInInterval = mainHW.numberInInterval(25);
        Assertions.assertFalse(isInInterval);
    }

    @Test
    void numberInInterval_NumberGreaterThan100_ReturnsFalse() {
        boolean isInInterval = mainHW.numberInInterval(150);
        Assertions.assertFalse(isInInterval);
    }
}