public class ws_11_ResizeArray {
    static int [] ResizeArray(int[] arr,int length){
        int [] temp = new int[length];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        int [] arr = {10,20,32,11};
        arr = ResizeArray(arr,arr.length*2);
        System.out.println(arr.length);
    }
}
