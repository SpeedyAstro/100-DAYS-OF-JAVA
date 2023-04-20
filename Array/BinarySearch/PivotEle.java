public class PivotEle {
    public int getPivot(int [] arr){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start ) / 2;
            if((mid<end) && (arr[mid] > arr[mid+1])) return mid;
            else if((mid>start) && (arr[mid]<arr[mid-1])) return mid-1;
            else if(arr[start]>=arr[mid]) end = mid-1;
            else start = mid +1;
        }
        return -1;
    }
    static int getPivotInDuplicates(int [] arr){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start )  /2 ;
            if((mid<end) && (arr[mid] > arr[mid+1])) return mid;
            else if((mid>start) && (arr[mid]<arr[mid-1])) return mid-1;
            if((arr[start] == arr[mid]) && (arr[mid]==arr[end])) {
                if(arr[start]>arr[start+1]) return start;
                else if(arr[end]<arr[end-1]) return end-1;
                start++;
                end--;
            }
            else if((arr[start]>arr[mid]) || ((arr[start]==arr[mid]) && (arr[end]<arr[mid]))) end = mid -1;
            else start = mid +1 ;
        }
        return -1;
    }
}
