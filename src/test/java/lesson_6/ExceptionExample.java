package lesson_6;

public class ExceptionExample {
    public static void main(String[] args) {
        String[][] correctArray = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        checkArray(correctArray);

        String[][] wrongDimensionArray = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3"},
                {"1", "2", "3", "4"}};
        checkArray(wrongDimensionArray);

        String[][] wrongDimensionArray4x3 = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        checkArray(wrongDimensionArray4x3);

        String[][] wrongElementArray = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "Y"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        checkArray(wrongElementArray);
    }

    public static void checkArray(String[][] array) {
        if (array.length != 4) {
            try {
                throw new MyArraySizeException();
            } catch (MyArraySizeException e) {
                System.out.println("Это не двумерный массив 4х4");
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                try {
                    throw new MyArraySizeException();
                } catch (MyArraySizeException e) {
                    System.out.println("Это не двумерный массив 4х4");
                }
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    try {
                        throw new MyArrayDataException(i, j);
                    } catch (MyArrayDataException ex) {
                        System.out.println("В ячейке " + i + "-" + j + "находятся неверные данные");
                    }
                }
            }
        }
    }
}
