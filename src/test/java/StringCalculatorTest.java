import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    @DisplayName("Test add() for exception thrown with negative number")
    public void addTest1() {
        // arrange

        // act/assert
        assertThrows(IllegalArgumentException.class, () -> StringCalculator.add("-1,5"));
    }

    @Test
    @DisplayName("Test add() for exception thrown with both numbers negative")
    public void addTest2() {
        // arrange

        // act/assert
        assertThrows(IllegalArgumentException.class, () -> StringCalculator.add("-1,-20"));
    }

    @Test
    @DisplayName("Test add() for ignored number >= 1000")
    public void addTest3() {
        // arrange
        int expected = 1;

        // act
        int actual = StringCalculator.add("1,1000");

        // assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test add() for both numbers ignored number >= 1000")
    public void addTest4() {
        // arrange
        int expected = 0;

        // act
        int actual = StringCalculator.add("200000,1000");

        // assert
        assertEquals(expected, actual);
    }
}
