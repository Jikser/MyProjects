package hw3arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr1 = {1, 0, 0, 1, 0, 0};
        //System.out.println(Arrays.toString(changeZero(arr)));
        //System.out.println(Arrays.toString(changeZero(arr1)));
        int[] arr2 = new int[100];
        //System.out.println(Arrays.toString(onToHundred(arr2)));
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //printArr(multiplySix(arr3));
        //System.out.println(Arrays.toString(multiplySix(arr3)));
        int[][] doubleArr = new int[5][5];
        //printArr(diagonal(doubleArr));
        //printArr(initArr(5, 7));
        //minMax(arr3);
        //System.out.println(checkBalance(arr3));
        int[] arr7 = {3, 2, 3, 1, 2, 1, 12};
        // System.out.println(checkBalance(arr7));
        int[] arr8 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(changeToN(arr8, 2)));

    }

    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */

    public static int[] changeZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                System.out.println("error > ячейка массива со значением " + arr[i] + " не соответствует условию");
                break;
            }
        }
        return arr;
    }

    /**
     * 2. Задать пустой целочисленный массив длиной 100.
     * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    public static int[] onToHundred(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        return arr2;
    }

    /**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     * пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    public static int[] multiplySix(int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 6;
            }
        }
        return arr3;
    }

    /**
     * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами
     * (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно
     * по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    public static int[][] diagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
        int m = 0;
        for (int j = arr.length - 1; j >= 0; j--) {
            arr[m][j] = 1;
            m++;
        }
        return arr;
    }

    /***
     * 5. Написать метод, принимающий на вход два аргумента:
     * len и initialValue, и возвращающий одномерный массив
     * типа int длиной len, каждая ячейка которого равна initialValue;
     */
    public static int[] initArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    /***
     * 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы;
     */
    public static void minMax(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальное значение: " + min);

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное значение: " + max);
    }

    /***
     * 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
     * метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
     * **Примеры:
     * checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
     * checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
     * checkBalance([1, 14, 1, ||| 2, 1, 6, 7]) → true, т.е. 1 + 14 + 1 = 2 + 1 + 6 + 7
     * граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
     */

    public static boolean checkBalance(int[] arr) {
        int leftSum;
        int rightSum;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);


        for (int i = 0; i < arr.length; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j <= i; j++) {
                leftSum += arr[j];
            }

            for (int n = i + 1; n < arr.length; n++) {
                rightSum += arr[n];
            }

            if (leftSum == rightSum) { // 3, 2, 3, 1, 2, 1, 12
                return true;
            }
            System.out.println("ls " + leftSum);
            System.out.println("rs " + rightSum);
        }
        return false;
    }

    /***
     * 8. *** Написать метод, которому на вход подается одномерный массив и число n
     * (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
     * Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     * Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
     * при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
     */
    public static int[] changeToN(int[] arr, int n) {
        int now;
        int next;
        if (n < 0) {
            n *= -1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    now = arr[j];
                    next = j + 1;

                    if (j + 1 > arr.length - 1) {
                        next = 0;
                    }
                    arr[j] = arr[next];
                    arr[next] = now;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = arr.length - 1; 0 <= j; j--) {
                    now = arr[j];
                    next = j - 1;

                    if (j - 1 < 0) {
                        next = 0;
                    }
                    arr[j] = arr[next];
                    arr[next] = now;
                }
            }
        }
        return arr;
    }
}
