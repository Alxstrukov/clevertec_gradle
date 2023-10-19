package ru.clevertec.gradle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilsTest {
    @Test
    void isAllPositiveNumbers() {
        boolean positiveNumbers = Utils.isAllPositiveNumbers("1", "2", "3");
        Assertions.assertTrue(positiveNumbers);
    }
}
