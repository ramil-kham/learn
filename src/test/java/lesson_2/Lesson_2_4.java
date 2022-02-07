package lesson_2;

public class Lesson_2_4 {
    public static void main(String[] args) {
        printWordNTimes("word", 3);
        checkLeapYear(100);
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println(word);
        }
    }

    public static void checkLeapYear(int year) {
        if (year%4 == 0 || year%400 == 0) {
            System.out.println("Leap year");
        } else if (year%100 != 0 ) {
            System.out.println("Normal year");
        }
    }
}
