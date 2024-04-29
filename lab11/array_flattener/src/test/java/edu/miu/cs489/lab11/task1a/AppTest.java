package edu.miu.cs489.lab11.task1a;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class AppTest {
    private ArrayFlattener arrayFlattener;

    @Before
    public void initialize() {
        arrayFlattener = new ArrayFlattener();
    }

    @Test
    public void flattenArrayShouldWork() {
        int[][] testedArray = { { 1, 3 }, { 0 }, { 4, 5, 9 } };
        int[] expectedArray = { 1, 3, 0, 4, 5, 9 };
        assertArrayEquals(arrayFlattener.flattenArray(testedArray), expectedArray);
    }
}
