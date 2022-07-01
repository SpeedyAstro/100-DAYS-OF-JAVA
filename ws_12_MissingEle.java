import java.util.Arrays;

public class ws_12_MissingEle {
    private static int MissingEle(int []arr){
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        for(int ele:arr){
            sum = sum - ele;
        }
        return sum;
    }
// Arithmetic Progression
    // lastNumb = firstNumber + (totalNumbersInAP - 1)(differenceBetweenNumbers)
    // a_last = a_first + (n - 1)d
    // sum =(n/2)(2a+(n-1)d)
// Different approach to find the missing numeber (can be used in a series having difference more than 1)
    static int findMissingNum(int[] arr) {
        Arrays.sort(arr);
        int minNum = arr[0];
        int n = arr.length + 1;
        //assuming diff between numbers = 1
        int sum = (n/2)*((2*minNum) + (n-1));

        for (int num : arr){
            sum = sum - num;
        }

        return sum;
    }
    public static void main(String[] args) {
        int [] arr = {1,4,3,2,5};
        int missing_no = MissingEle(arr);
        System.out.println(missing_no);
    }
}
