
public class KadaneAlgo {
    public int maxSubArray(int[] nums) {
        int currcount = 0 , maxcount = Integer.MIN_VALUE;
        for (int num : nums) {
            currcount += num;
            if (maxcount < currcount) {
                maxcount = currcount;
            }
            if (currcount < 0) {
                currcount = 0;
            }
        }
            return maxcount;
    }
}
