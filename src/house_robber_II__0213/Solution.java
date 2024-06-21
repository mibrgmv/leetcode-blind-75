package house_robber_II__0213;

import java.util.Arrays;

public class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        if (n == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] dp = new int[n - 1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n - 1; ++i) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        int choiceOne = dp[n - 2];
        Arrays.fill(dp, 0);
        dp[0] = nums[1];
        dp[1] = Math.max(nums[1], nums[2]);
        for (int i = 2; i < n - 1; ++i) {
            dp[i] = Math.max(dp[i - 2] + nums[i + 1], dp[i - 1]);
        }

        return Math.max(choiceOne, dp[n - 2]);
    }
}
