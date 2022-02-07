package lesson_2;

public class Lesson_2_3 {
    public static void main(String[] args) {
        isPositiveOrNegative(0);
    }

    public static boolean isPositiveOrNegative(int number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }
}
