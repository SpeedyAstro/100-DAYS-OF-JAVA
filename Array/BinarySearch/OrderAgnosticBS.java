package BinarySearch;

public class OrderAgnosticBS {
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                if (isAsc) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (target > arr[mid]) {
                if (isAsc) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                return mid;
            }
        }
        return -1;
    }
}