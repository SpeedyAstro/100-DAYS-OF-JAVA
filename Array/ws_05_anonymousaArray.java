public class ws_05_anonymousaArray {
    public static void main(String[] args) {
        /* 
         * anonymous array dont have any name in program
         * use only once 
         * initalize and declare in a single line
         * can be single or multi dimensional
         * can be used as an argument in method
         */
        ws_05_anonymousaArray.sum(new int[]{10,20,40}); 
    }
    static void sum(int [] input){
        int total = 0;
        for(int ele:input){
            total = total+ele;
        }
        System.out.println(total);
    }
}
