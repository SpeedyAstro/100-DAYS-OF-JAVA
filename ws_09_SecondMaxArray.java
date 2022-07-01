public class ws_09_SecondMaxArray {
    static void SecondMax(int[] input){
        int max = Integer.MIN_VALUE;
        int SecMax = Integer.MIN_VALUE;
        for(int i=0;i<input.length;i++){
            if(input[i]>max){
                SecMax = max;
                max = input[i];
            }
        }
        System.out.println("Max Value of array :"+max);
        System.out.println("Second Max Value of array :"+SecMax);
    }
    public static void main(String[] args) {
        int [] arr = {12,32,34,82,12,42,82};
        SecondMax(arr);
    }
}
