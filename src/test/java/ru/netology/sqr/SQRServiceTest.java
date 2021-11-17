package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'full range', 100, 9801, 90",
            "'half of the range', 100, 2916, 45",
            "'one value', 2916, 2916, 1",
            "'beyond the limits of the range', 0, 20000, 90",
            "'zero value', 101, 102, 0"})
    void squaresInTheRange(String testName, int lowerLimit, int upperLimit, int expected) {
        SQRService service = new SQRService();

        // вызываем целевой метод:
        int actual = service.squaresInTheRange(lowerLimit, upperLimit);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}