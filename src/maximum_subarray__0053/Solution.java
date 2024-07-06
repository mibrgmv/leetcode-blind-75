package maximum_subarray__0053;

public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sumLeft = 0;
        for (int x : nums) {
            sumLeft += x;
            maxSum = Math.max(sumLeft, maxSum);
            sumLeft = Math.max(sumLeft, 0);
        }
        return maxSum;
    }
}
