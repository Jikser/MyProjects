package Java2hw.les5_Threads;

import java.util.Arrays;

public class Main {
    final static int SIZE = 10000000;
    final static int h = SIZE / 2;
    static float[] arr = new float[SIZE];

    public static void main(String[] args) {
        time_arr1();
        time_arr2();
    }

    static void time_arr1() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long arr1T = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + (float) i / 5) * Math.cos(0.2f + (float) i / 5) * Math.cos(0.4f + (float) i / 2));
        }
        System.out.println("time method 1 = " + (System.currentTimeMillis() - arr1T));
    }

    static void time_arr2() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        long arr2T1 = System.currentTimeMillis();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < a1.length; i++) {
                a1[i] = (float) (a1[i] * Math.sin(0.2f + (float) i / 5) * Math.cos(0.2f + (float) i / 5) * Math.cos(0.4f + (float) i / 2));
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < a2.length; i++) {
                a2[i] = (float) (a2[i] * Math.sin(0.2f + (float) (h + i / 5) * Math.cos(0.2f + (float) (h + i / 5)) * Math.cos(0.4f + (float) (h + i / 2))));
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.out.println("time method 2 = " + (System.currentTimeMillis() - arr2T1));
    }
}
