package edu.miu.cs489.lab11.task1b;

import java.util.Arrays;

public class ArrayFlattenerService {
    public int[] reverseArray(int[][] input) {
        if (input == null)
            return null;
        return Arrays.stream(input).flatMapToInt(row -> Arrays.stream(row)).boxed().toList().reversed().stream()
                .mapToInt(Integer::intValue).toArray();
    }
}
