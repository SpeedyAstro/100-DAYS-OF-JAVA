public class ws_08_MinMaxArr {
    static void MinMax(int []input){
        int min = input[0];
        int max = input[0];
        if (input == null || input.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        for (int i : input) {
            if (min>i) {
                min = i;
            }
            if (max<i) {
                max = i;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
    public static void main(String[] args) {
        int [] arr = {12,32,61,23,63,33,45,71};
        MinMax(arr);
    }
}
