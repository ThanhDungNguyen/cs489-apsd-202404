package edu.miu.cs489.lab11.task1b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.BeforeEach;

class AppTest {
    private ArrayFlattenerService arrayFlattenerService;

    @BeforeEach
    void initialize() {
        arrayFlattenerService = new ArrayFlattenerService();
    }

    @Test
    void flatten2DArrayWithServiceShouldWork() {
        int[][] testedArray = { { 1, 3 }, { 0 }, { 4, 5, 9 } };
        int[] expectedArray = { 9, 5, 4, 0, 3, 1 };
        assertArrayEquals(arrayFlattenerService.reverseArray(testedArray), expectedArray);
    }
}
