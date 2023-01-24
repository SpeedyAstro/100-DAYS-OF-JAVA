package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {-1,7,-32,0,89};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void bubble(int []arr ){
        boolean flag = false;
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 1; j < arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    flag = true;
                    // swap 
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            // if no element swap through the pass then list must be sorted 
            if(!flag){
                break;
            }
        }
    }
}
/*
 * Output -
 * [-32, -1, 0, 7, 89]
 */