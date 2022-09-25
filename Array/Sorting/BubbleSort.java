public class BubbleSort {
    public static void main(String[] args) {
        
    }
    public static void bubble(int []arr ){
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 1; j < arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    // swap 
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
