package edu.course.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

}
