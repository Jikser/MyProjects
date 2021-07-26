package Java2hw.l2;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"0", "1", "2", "3"},
                {"10", "11", "12", "13"},
                {"20", "21", "22", "23"},
                {"30", "31", "32gg", "33"}
        };
        try {
            System.out.println(sumArray4x4(array));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    static int sumArray4x4(String[][] array) throws MyArraySizeException, MyArrayDataException {
        for (int i = 0; i < array.length; i++) {
            if (array.length != 4 || array[i].length != 4) {
                throw new MyArraySizeException("Неверный размер массива");
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
       // System.out.println("Программа выполнена без ошибок");
        return sum;
    }
}
