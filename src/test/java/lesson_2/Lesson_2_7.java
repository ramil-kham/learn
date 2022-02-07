package lesson_2;

import java.util.Arrays;

public class Lesson_2_7 {
    public static void main(String[] args) {
        changeArray();
    }

    public static void changeArray() {
        int[] array = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 6) {
                array[i] = array[i] * 2;
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
