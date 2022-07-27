public class ws_04_arraywitfunc {
    public static void main(String[] args) {
        int [] marks = {11,23,42,15,50};
        display(marks);
        int [] revmarks;
        revmarks = reverseArray(marks);
        System.out.println("REVERSE MARKS ARRAY");
        display(revmarks);
    }
    public static void display(int [] input) {
        for(int i=0;i<input.length;i++){
            System.out.println(input[i]);
        }
    }
    public static int [] reverseArray(int[] input){ //taking integer array as a parameter
        int [] reverse = new int[input.length]; 
        for(int i=0,j = reverse.length-1;i<input.length;i++,j--){
            reverse[j] = input[i];
        }
        return reverse;
    }
}
