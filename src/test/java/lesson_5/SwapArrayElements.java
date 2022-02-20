package lesson_5;

import java.util.Arrays;

public class SwapArrayElements {
    public static void main(String[] args) {
        String[] array = new String[]{"1", "2", "3", "4", "5", "6"};
        System.out.println(Arrays.toString(array));
        swapElements(array, 1, 5);
        System.out.println(Arrays.toString(array));
    }

    public static <T> void swapElements(T[] array, int firstIndex, int secondIndex) {
        T broker = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = broker;
    }
}
