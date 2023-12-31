package BinarySearch;

// find element less than target close to the start in a sorted array non - distinct
public class FloorInArray {
    public static int floorInArray(int arr[], int low, int high, int x)
    {
        if (low > high)
            return -1;
        // If last element is smaller than x
        if (x >= arr[high])
            return high;

        // Find the middle point
        int mid = (low+high)/2;

        // If middle point is floor.
        // if (arr[mid] == x)
        //     return mid;

        // If x lies between mid-1 and mid
        if (mid > 0 && arr[mid-1] <= x && x <= arr[mid])
            return mid-1;

        // If x is smaller than mid, floor
        // must be in left half.
        if (x < arr[mid])
            return floorInArray(arr, low, mid - 1, x);

        // If mid-1 is not floor and x is
        // greater than arr[mid],
        return floorInArray(arr, mid + 1, high,x);
    }
}
