public class ws_06_RmEven{
        public static void printArray(int[] arr){
            for (int i : arr) {
                System.out.print(i+" ");
            }
            System.out.println();
        } 
        public static int[] removeEven(int [] input){
            int oddcount =0,idx=0;
            for(int i=0;i<input.length;i++){
                if(input[i]%2 != 0){
                    oddcount++;
                }
            }
            int[] OddArr = new int[oddcount];
            for(int i=0;i<input.length;i++){
                if (input[i]%2 != 0) {
                    OddArr[idx] = input[i];
                    idx++;
                }
            }
            return OddArr;
        }
    
    public static void main(String[] args) {
        int [] arr = {12,23,55,22,17,10,26,36};
        printArray(arr);
        int [] oddarr = removeEven(arr);
        printArray(oddarr);
    }
}