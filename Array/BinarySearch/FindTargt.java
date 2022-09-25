//package BinarySearch;
// Finding target in the sorted distinct array
public class FindTargt {
    public static int getTarget(int [] nums , int target){
        int start = 0 , end = nums.length-1;
        while(start<end){
            int mid = start + (end - start) /2;
            if(nums[mid] == target) return mid;
            else if(nums[mid]>target) end = mid -1;
            else start = mid +1;
        }
        return start;
    }
    public static void main(String[] args) {
        int [] arr = {2,3,5,6,7,10};
        System.out.println(getTarget(arr, 7));
    }
}
