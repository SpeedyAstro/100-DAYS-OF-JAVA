package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int [] mergeSort(int arr []){
        if (arr.length==1) return arr;
        int mid = arr.length/2;
        int [] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int [] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {
        int i = 0 , j = 0 , k=0;
        int [] mix = new int[first.length+second.length];
        while (i<first.length&&j<second.length){
            if (first[i]<second[j]) {
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
