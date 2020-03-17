package lesson5.homework5;

import java.util.Arrays;

public class Main {

    final static  int size = 10000000;
    static final int h = size / 2;
    float[] arr = new float[size];

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.arrayOne();
        mainClass.arrayTwo();
    }

    private void arrayOne(){

        float[] arr = new float[size];
        Arrays.fill(arr, 1.0f);
        long start = System.currentTimeMillis();
        for(int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long end = System.currentTimeMillis();
        System.out.println(String.format("Завершение метода 1. Время выполнения %s", String.valueOf(end - start) + " ms"));
    }

    private void arrayTwo(){

        float[] arr = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        Arrays.fill(arr, 1.0f);
        long start = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
//        System.arraycopy(arr,0, a1, 0, h);
//        System.arraycopy(a2, 0, arr, h, h);
        long split = System.currentTimeMillis();
        System.out.println(String.format("Время разделения массива %s", String.valueOf(split - start) + " ms"));

        Thread thread1 = new Thread(() ->this.arrayTwoInternal(a1, 1));
        Thread thread2 = new Thread(() ->this.arrayTwoInternal(a2, 2));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            System.out.println(String.format("Исключения в потоках %s", e.getMessage()));
        }

        long connect = System.currentTimeMillis();
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        long end = System.currentTimeMillis();
        System.out.println(String.format("Время склейки массива %s", String.valueOf(end - connect) + " ms"));
        System.out.println(String.format("Завершение метода 2. Время выполнения %s", String.valueOf(end - start) + " ms"));
    }

    private void arrayTwoInternal(float[] arr, int number) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long end = System.currentTimeMillis();
        System.out.println(String.format("Время выполнения потока %d равно %s ", number, String.valueOf(end - start) + " ms" ));
    }
}