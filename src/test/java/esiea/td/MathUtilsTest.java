package esiea.td;
import esiea.td.math.MathUtils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest{
    @ParameterizedTest
    @CsvSource({
        "3, 4",
        "0, 0",
        "-8, -6",
        "-4, 0"
    })
    public void Ints_AdditionResults_AreCorrect(int firstValue, int secondValue){
        // Arrange
        int cSharpSum = firstValue + secondValue;

        // Act
        int ourSum = MathUtils.Add(firstValue, secondValue);

        // Assert
        assertEquals(cSharpSum, ourSum);
    }

    @Test
    public void Zero_MinusPositiveNumber_NegatesIt(){
        // Arrange
        final int positiveNumber = 8;

        // Act
        int negativeValue = MathUtils.Subtract(0, positiveNumber);

        // Assert
        assertTrue(negativeValue == -positiveNumber);
    }
}