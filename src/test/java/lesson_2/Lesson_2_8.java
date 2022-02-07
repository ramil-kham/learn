package lesson_2;

import java.util.Arrays;

public class Lesson_2_8 {
    public static void main(String[] args) {
        fillDiagonal();
    }

    public static void fillDiagonal() {
        int n = 3;
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j=0; j<array.length; n= array[i].length, j++, n--){
                if (i==j|| i==n-j ) {
                    array[i][j] = 1;
                }
                else {
                    array[i][j]=0;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
