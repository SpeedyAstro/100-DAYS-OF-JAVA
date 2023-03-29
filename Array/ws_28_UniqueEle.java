public class ws_28_UniqueEle {
    public static void main(String[] args) {
        int [] arr = {2,3,1,6,3,6,2};
        System.out.println(findUnion(arr));
    }

    private static int findUnion(int [] arr){
        int ans = 0;
        for(int i : arr) { System.out.println(ans+ "= "+ ans +"^ "+i+" = "+(ans ^ i)); ans = ans ^ i; System.out.println(ans);}
        return ans;
    }
}
