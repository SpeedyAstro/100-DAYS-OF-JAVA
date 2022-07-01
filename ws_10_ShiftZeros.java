public class ws_10_ShiftZeros {
    static void printARRAY(int[] input){
        for(int ele:input){
            System.out.print(ele+",");
        }
    }
    static void ShiftZero(int[] input){
        int j=0;
        for(int i = 0;i<input.length;i++){
            if(input[i]==1 && input[j]==0){
                int temp = input[j];
                input[j] = input[i];
                input[i] = temp;
            }
            if(input[j]!=0){
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,0,0,1,1,0,0,1,0,0,0,1,1,1,1,1,0};
        ShiftZero(arr);
        printARRAY(arr);
    }
}
