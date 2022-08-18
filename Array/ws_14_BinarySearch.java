public class ws_14_BinarySearch {
    private static int SearchBinary(int[] arr , int key){
        int start = 0, end = arr.length-1;
        int mid = start + (end-start)/2;
        while(start<=end){
            if (arr[mid] == key) {
                return mid;
            }
            if(arr[mid]> key){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
            mid = start + (end-start)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,6,12,15,33};
        int index = SearchBinary(arr, 33);
        System.out.println("index is : "+index);
    }
}
