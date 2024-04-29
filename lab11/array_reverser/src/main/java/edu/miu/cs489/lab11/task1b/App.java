package edu.miu.cs489.lab11.task1b;

import java.util.stream.IntStream;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        int[][] myArray = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };
        ArrayFlattenerService arrayFlattenerService = new ArrayFlattenerService();
        IntStream.of(arrayFlattenerService.reverseArray(myArray))
                .forEach(n -> System.out.print(String.format("%d ", n)));
        System.out.println();
    }
}
