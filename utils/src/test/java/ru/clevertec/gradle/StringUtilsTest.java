package ru.clevertec.gradle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        boolean positiveNumber = StringUtils.isPositiveNumber("3");
        assertTrue(positiveNumber);
    }
}