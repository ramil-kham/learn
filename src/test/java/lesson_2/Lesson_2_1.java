package lesson_2;

public class Lesson_2_1 {
    public static void main(String[] args) {
        isNumberBetween10And20(9, 100);
    }
    public static boolean isNumberBetween10And20(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        if (sum <=20 && sum >= 10) {
            return true;
        } else {
            return false;
        }
    }
}
