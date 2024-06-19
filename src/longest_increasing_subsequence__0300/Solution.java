package longest_increasing_subsequence__0300;

import java.util.Arrays;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxLength = 1;

        for (int end = 1; end < n; ++end) {
            for (int start = 0; start < end; ++start) {
                if (nums[end] > nums[start]) {
                    dp[end] = Math.max(dp[end], dp[start] + 1);
                }
                maxLength = Math.max(maxLength, dp[end]);
            }
        }

        return maxLength;
    }
}
