package BinarySearch;

public class RotationCount {
    static int rotationCount(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
//            TODO: I don't understand this part
            while (start <= end) {
                // find the middle element
                int mid = start + (end - start) / 2;
                int next = (mid + 1) % arr.length;
                int prev = (mid + arr.length - 1) % arr.length;

                if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                    return mid;
                } else if (arr[mid] <= arr[end]) {
                    end = mid - 1;
                } else if (arr[mid] >= arr[start]) {
                    start = mid + 1;
                }
            }
            return -1;
    }
    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // array is not rotated
    }
    static int findPivotWithDuplicates(int[] arr){
        int start = 0 ;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + ((end - start) / 2);
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] == arr[start]  && arr[mid] == arr[end]){
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot?
                // check if start is pivot
                if(start<end && arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                // check whether end is pivot
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
