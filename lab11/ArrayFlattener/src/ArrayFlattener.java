import java.util.Arrays;

public class ArrayFlattener {
    public int[] flattenArray(int[][] input) {
        return Arrays.stream(input).flatMapToInt(row -> Arrays.stream(row)).toArray();
    }
}
