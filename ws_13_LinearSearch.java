import java.util.Scanner;

public class ws_13_LinearSearch {
    static boolean Search(int [] arr,int key){
        
        for (int ele : arr) {
            if (key == ele) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of array");
        int n = input.nextInt(); 
        int [] arr = new int[n];
        System.out.println("Enter elements of array");
        for(int i = 0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the key to search : ");
        int key = input.nextInt();
        boolean j = Search(arr, key);
        System.out.println(j);
        input.close();
    }
}
