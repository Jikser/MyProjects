package lesson4xogame;

import java.util.Random;
import java.util.Scanner;

public class XOTheGame {
    static final int SIZE = 3;
    static final char DOT_empty = '-';
    static final char DOT_X = 'x';
    static final char DOT_O = 'o';
    static final int DOT_TO_WIN = 3;

    static char[][] map;

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_empty;
            }
        }
    }

    public static void printMap() {
        System.out.print("   ");

        for (int i = 0; i < map.length; i++) {
            System.out.print(i + 1 + "  ");
        }
        System.out.println();

        for (int i = 0; i < map.length; i++) {
            System.out.print(i + 1 + "  ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static final Scanner sc = new Scanner(System.in);
    static final Random random = new Random();

    public static void turnHuman() {
        int x;
        int y;

        do {
            System.out.println("input y x");
            y = sc.nextInt() - 1;
            x = sc.nextInt() - 1;

        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;


    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_empty;
    }


    public static boolean checkDraw() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_empty) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void turnAi() {
        int x;
        int y;
        do {
            y = random.nextInt(SIZE);
            x = random.nextInt(SIZE);
        } while (!isCellValid(y, x));
        map[y][x] = DOT_O;
    }

    //    public static boolean checkWin(char dot) {
//        for (int i = 0; i < map.length; i++) {
//
//            if (map[i][0] == dot && map[i][1] == dot && map[i][2] == dot) {
//                return true;
//            } else if (map[0][i] == dot && map[1][i] == dot && map[2][i] == dot) {
//                return true;
//            }}
//
//            if (map[i][i] == dot && map[i + 1][i + 1] == dot && map[i + 2][i + 2] == dot) {
//                return true;
//            } else if (map[DOT_TO_WIN - i - 1][i] == dot && map[DOT_TO_WIN - i - 1][i] == dot && map[DOT_TO_WIN - i - 1][i] == dot) {
//                return true;
//            }
//        }
//        return false;

    public static boolean findRightUp(int y, int x, char dot) {
        for (int j = 0; j < DOT_TO_WIN; j++) {

            if (y < 0 || y >= SIZE || x < 0 || x >= SIZE || dot != map[y][x]) {
                return false;
            }

            y--;
            x++;
        }
        return true;
    }

    public static boolean findRight(int y, int x, char dot) {
        for (int j = 0; j < DOT_TO_WIN; j++) {

            if (y < 0 || y >= SIZE || x < 0 || x >= SIZE || dot != map[y][x]) {
                return false;
            }

            x++;
        }
        return true;
    }

    public static boolean findRightDown(int y, int x, char dot) {
        for (int j = 0; j < DOT_TO_WIN; j++) {

            if (y < 0 || y >= SIZE || x < 0 || x >= SIZE || dot != map[y][x]) {
                return false;
            }

            y++;
            x++;
        }
        return true;
    }

    public static boolean findDown(int y, int x, char dot) {
        for (int j = 0; j < DOT_TO_WIN; j++) {

            if (y < 0 || y >= SIZE || x < 0 || x >= SIZE || dot != map[y][x]) {
                return false;
            }

            y++;
        }
        return true;
    }

    public static boolean checkWin(char dot) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (findRightUp(i, j, dot)) {
                    return true;
                }
                if (findRight(i, j, dot)) {
                    return true;
                }
                if (findRightDown(i, j, dot)) {
                    return true;
                }
                if (findDown(i, j, dot)) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            turnHuman();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Вы победили!");
                break;
            }
            if (checkDraw()) {
                System.out.println("Ничья!");
                break;
            }
            System.out.println();

            turnAi();
//            krangBrain(DOT_X); //Программа работает, но идея не реализована как нужно, метод нуждается в доработке
//            if (!krangBrain(DOT_X)) {
//                turnAi();
//            }
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Потрачено!");
                break;
            }
            if (checkDraw()) {
                System.out.println("Ничья!");
                break;
            }
        }

    }

//    // Попытка подключить мозг...
//    public static boolean krangBrain(char dot) {
//
//
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                if (findRightUp1(i, j, dot)) {
//                    while (!isCellValid(i - 2, j + 2)) {
//                        map[i - 2][j + 2] = DOT_O;
//                        return true;
//                    }
//                }
//                if (findRight1(i, j, dot)) {
//                    while (!isCellValid(i, j + 2)) {
//                        map[i][j + 2] = DOT_O;
//                        return true;
//                    }
//                }
//                if (findRightDown1(i, j, dot)) {
//                    while (!isCellValid(i + 2, j + 2)) {
//                        map[i + 2][j + 2] = DOT_O;
//                        return true;
//                    }
//                }
//                if (findDown1(i, j, dot)) {
//                    while (!isCellValid(i + 2, j)) {
//                        map[i + 2][j] = DOT_O;
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
//
//
//    public static boolean findRightUp1(int y, int x, char dot) {
//        for (int j = 0; j < DOT_TO_WIN - 1; j++) {
//
//            if (y < 0 || y >= SIZE || x < 0 || x >= SIZE || dot != map[y][x]) {
//                return false;
//            }
//
//            y--;
//            x++;
//        }
//        return true;
//    }
//
//    public static boolean findRight1(int y, int x, char dot) {
//        for (int j = 0; j < DOT_TO_WIN - 1; j++) {
//
//            if (y < 0 || y >= SIZE || x < 0 || x >= SIZE || dot != map[y][x] || dot != DOT_empty) {
//                return false;
//            }
//
//            x++;
//        }
//        return true;
//    }
//
//    public static boolean findRightDown1(int y, int x, char dot) {
//        for (int j = 0; j < DOT_TO_WIN - 1; j++) {
//
//            if (y < 0 || y >= SIZE || x < 0 || x >= SIZE || dot != map[y][x]) {
//                return false;
//            }
//
//            y++;
//            x++;
//        }
//        return true;
//    }
//
//    public static boolean findDown1(int y, int x, char dot) {
//        for (int j = 0; j < DOT_TO_WIN - 1; j++) {
//
//            if (y < 0 || y >= SIZE || x < 0 || x >= SIZE || dot != map[y][x]) {
//                return false;
//            }
//
//            y++;
//        }
//        return true;
//    }


}