package edu.course.lab01;

/**
 * Небольшие методы для первой лабораторной работы.
 */
public final class CourseToolkit {

    private CourseToolkit() {
        // Утилитарный класс не должен иметь экземпляров.
    }

    /**
     * Возвращает true, если число четное.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

//    Метод определения, простое число или нет.
//        Условия:
//    1. false при number < 2
//    2. true при 2, составных числах и квадратах простых чисел
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (i % 2 == 0) {
                return false;
            }
        }
        return true;
    }
//    public static boolean isPalindrome(String text) {
//
//    }
//    public static double average(int[] values) {
//
//    }
}
