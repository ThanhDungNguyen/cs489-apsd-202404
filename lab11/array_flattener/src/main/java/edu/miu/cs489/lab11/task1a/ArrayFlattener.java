package edu.miu.cs489.lab11.task1a;

import java.util.Arrays;

public class ArrayFlattener {
    public int[] flattenArray(int[][] input) {
        if (input == null)
            return null;
        return Arrays.stream(input).flatMapToInt(row -> Arrays.stream(row)).toArray();
    }
}
