package lesson_2;

import java.util.Arrays;

public class Lesson_2_5 {
    public static void main(String[] args) {
        invertArray();
    }

    public static void invertArray() {
        int[] array = {0,1,0,1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
