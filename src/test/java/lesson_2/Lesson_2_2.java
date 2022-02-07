package lesson_2;

public class Lesson_2_2 {
    public static void main(String[] args) {
        isPositiveOrNegative(0);
    }

    public static void isPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("It's positive number");
        } else {
            System.out.println("It's negative number");
        }
    }
}
