import java.util.Arrays;

public class SrchRowColMatrix{
    public static void main(String[] args) {
        int [][] arr = {
            {11,12,13,14},
            {21,22,23,24},
            {31,32,33,34},
            {41,42,43,44}
        };
        System.out.println(Arrays.toString(BinarySearch(arr, 33)));
        
    }
    public static int [] BinarySearch(int [][] arr ,int target){
            int start = 0 , end = arr[0].length-1;
            while(start<arr[0].length&& end >= 0){
                if(arr[start][end]==target){
                    return new int[]{start,end};
                }
                else if(arr[start][end]<target){
                    start++;
                }else {
                    end--;
                }
            }
            return new int[]{-1,-1};
    }
}