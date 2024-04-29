import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] myArray = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };

        var arrayFlattener = new ArrayFlattener();
        Arrays.stream(arrayFlattener.flattenArray(myArray)).forEach(System.out::print);
    }
}
