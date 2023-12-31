package BinarySearch;

public class Floor {
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target < arr[start]) {
            return -1;
        }

        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
