package lesson_2;

import java.util.Arrays;

public class Lesson_2_6 {
    public static void main(String[] args) {
        fillArray();
    }

    public static void fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(Arrays.toString(array));
        }
    }
}
