package edu.course.lab01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }

// IsPrime method tests

    @Test
    void isPrimeNumber() {
        boolean result = CourseToolkit.isPrime(2);
        assertTrue(result);
    }

    @Test
    void isNotPrimeNumber() {
        boolean result = CourseToolkit.isPrime(12);

        assertFalse(result);
    }

    @Test
    void NegativeNumber() {
        boolean result = CourseToolkit.isPrime(-1);

        assertFalse(result);
    }

    @Test
    void SqrtNumber() {
        boolean result = CourseToolkit.isPrime(121);

        assertFalse(result);
    }

    // IsPalindrome method tests

    @Test
    void isPalindromeNumber() {
        boolean result = CourseToolkit.isPalindrome("12321");

        assertTrue(result);
    }

    @Test
    void isNotPalindromeString() {
        boolean result = CourseToolkit.isPalindrome("qwertytrewq");

        assertTrue(result);
    }

    @Test
    void isNull() {

        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.isPalindrome(null));

    }

    // Average tests
    @Test
    void validArray() {
        double result = CourseToolkit.average(new int[]{4, 23, 5, 2, 7});

        assertEquals(8.2, result);
    }

    @Test
    void emptyArray() {

        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.average(new int[]{}));
    }

    @Test
    void negativeArray() {
        double result = CourseToolkit.average(new int[]{-4, -23, -5, -2, 7});

        assertEquals(-5.4, result);
    }

    // Extra. Parameterized Tests
    @ParameterizedTest
    @CsvSource({
            "2, true",
            "4, false" ,
            "3, true",
            "-1, false",
            "100, false"
    })

    void isPrimeTests(int number, boolean expected) {

        boolean result = CourseToolkit.isPrime(number);
        assertEquals(expected, result);
    }
}