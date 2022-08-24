import java.util.Arrays;

public class ws_25_LinearSearch2d {
    public static void main(String[] args) {
        int [][] arr = {
            {1,2,3},
            {4,5,6,7},
            {8,9,11,32,15}
        };
        int target = 15;
        // System.out.println(searchIn2d(arr, target));
        int [] ans =searchIn2d(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    private static int[] searchIn2d(int[][] arr, int target){
        int ele;
        for(int i = 0 ; i < arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
