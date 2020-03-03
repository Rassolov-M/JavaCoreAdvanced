package lesson2.homework2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws MyArraySizeException {

        int result = 0;
        String[][] arr = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}};
        String[][] arr_size = {{"11", "10", "11", "10", "vn"}, {"10", "11", "20", "11"}};
        String[][] arr_data = {{"1", "2", "3", "4",}, {"5", "10o", "7", "8"}};

        System.out.println("START");
        try {
            result = 0;
            result = analyze(arr);
        } catch (MyArraySizeException ms) {
            System.out.println(ms.getMessage());
            ms.printStackTrace();
        } catch (MyArrayDataException ms) {
            System.out.println(ms.getMessage());
            ms.printStackTrace();
        } finally {
            System.out.println("Результат суммирования элементов массива(arr) равна " + String.valueOf(result));
            System.out.println("=======================");
        }


        System.out.println("Массив(arr_size) другого размера");
        try {
            result = 0;
            result = analyze(arr_size);
        } catch (MyArraySizeException ms) {
            System.out.println(ms.getMessage());
            ms.printStackTrace();
        } catch (MyArrayDataException md) {
            System.out.println(md.getMessage());
            md.printStackTrace();
        } finally {
            System.out.println("Результат суммирования элементов массива равна(arr_size) " + String.valueOf(result));
            System.out.println("=======================");
        }


        System.out.println("Случай некорректных данных массмва(arr_data)");
        try {
            result = 0;
            result = analyze(arr_data);
        } catch (MyArraySizeException ms) {
            System.out.println(ms.getMessage());
            ms.printStackTrace();
        } catch (MyArrayDataException md) {
            System.out.println(md.getMessage());
            md.printStackTrace();
        } finally {
            System.out.println("Результат суммирования элементов массива равна(arr_data) " + String.valueOf(result));
        }


        System.out.println("Работа программы завершена");
    }

    public static int analyze(String[][] arr) throws MyArraySizeException, MyArrayDataException {

        int summ = 0;
        int value = 0;
        int row = 0;
        int cell = 0;

        if (arr.length != 2 || arr[0].length != 4 || arr[1].length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 1; i < 3; i++) {
            row = i;
            for (int j = 1; j < 5; j++) {
                cell = j;
                try {
                    value = Integer.parseInt(arr[i - 1][j - 1]);
                    summ += value;
                } catch (IllegalArgumentException e) {
                    String message = " в " + String.valueOf(row) + " ряду, " + String.valueOf(cell) + " ячейке";
                    throw new MyArrayDataException(message);
                }
            }
        }

        return summ;
    }


}
