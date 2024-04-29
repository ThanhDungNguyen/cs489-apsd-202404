package edu.miu.cs489.lab11.task1a;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        int[][] myArray = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };

        ArrayFlattener arrayFlattener = new ArrayFlattener();
        Arrays.stream(arrayFlattener.flattenArray(myArray)).forEach(System.out::print);
    }
}
