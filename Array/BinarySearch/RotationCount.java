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
}
