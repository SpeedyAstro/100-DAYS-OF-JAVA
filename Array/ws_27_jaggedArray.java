import java.util.Arrays;

public class ws_27_jaggedArray{
    public static void main(String[] args) {
        // Implementing Jagged array...
        int [][] arr = new int [3][];
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[4];
        // initalizing values in array..
        arr[0][0] = 10;
        System.out.println(Arrays.toString(arr));
    }
}