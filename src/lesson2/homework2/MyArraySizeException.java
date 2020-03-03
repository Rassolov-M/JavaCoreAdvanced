package lesson2.homework2;


public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException() {

        super("Выход за рамки массива");
    }
}
