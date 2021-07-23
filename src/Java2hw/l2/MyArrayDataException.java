package Java2hw.l2;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int line, int position) {
        super("Невозможно преобразовать ячейку массива: " + line + "-" + position);
    }
}
