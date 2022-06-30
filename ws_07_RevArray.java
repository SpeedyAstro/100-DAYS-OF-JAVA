
public class ws_07_RevArray {
    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    } 
    public static int [] ReverseArray(int[] input,int start,int end){
        while(start<end){
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
        return input;
    }
    public static void main(String[] args) {
        int [] arr = {12,23,55,22,17,10,26,36};
        printArray(arr);
        ReverseArray(arr,0,arr.length-1);
        printArray(arr);
    }
}
