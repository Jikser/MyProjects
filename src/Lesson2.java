public class Lesson2 {
    public static void main(String[] args) {
        // System.out.println(summ1020(3,5));
        // System.out.println(summ1020(10, 6));
        // positiveOrNegativeNum(123);
        // positiveOrNegativeNum(-123);
        // System.out.println(positiveOrNegativeBoolean(7));
        // printMultipleTimes("AHOY!", 3);
        leapYearOrNot(1600); // високосный
        leapYearOrNot(2100); // невисокосный
        leapYearOrNot(4);
        leapYearOrNot(1764); // високосный
        leapYearOrNot(2021);
        leapYearOrNot(2020);
        leapYearOrNot(1977);

    }

    /**
     * Метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно),
     * если да – вернуть true, в противном случае – false.
     **/
    public static boolean summ1020(int x, int y) {
        if (x + y >= 10 && x + y <= 20) {
            return true;
        } else {
            return false;
        }
    }

    /*** Метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль,
     * положительное ли число передали или отрицательное.
     * Замечание: ноль считаем положительным числом.
     */
    public static void positiveOrNegativeNum(int x) {
        if (x >= 0) {
            System.out.println("Переданное число - положительное");
        } else {
            System.out.println("Переданное число - отрицательное");
        }
    }

    /*** Метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное,
     * и вернуть false если положительное.
     */
    public static boolean positiveOrNegativeBoolean(int x) {
        if (x >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /*** Метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку,
     * указанное количество раз;
     */
    public static void printMultipleTimes(String string, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(string);
        }
    }

    /*** Метод, который определяет, является ли год високосным,
     * и возвращает boolean (високосный - true, не високосный - false).
     * Каждый 4-й год является високосным, кроме каждого 100-го,
     * при этом каждый 400-й – високосный.
     */
    public static boolean leapYearOrNot(int x) {
        if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)) {
            System.out.println("Год " + x + " - високосный");
            return true;
        } else {
            System.out.println("Год " + x + " - НЕвисокосный");
            return false;
        }
    }
}

