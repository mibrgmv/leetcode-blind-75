package coin_change__0322;

import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1]; // dp[i] -- min amount of coins to reach the amount 'i'
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int i = 1; i <= amount; ++i) {
            for (int j = coins.length - 1; j >= 0; --j) {
                if (i - coins[j] >= 0 && dp[i - coins[j]] >= 0) { // if there is a way to reach the amount 'i'
                    if (dp[i] == -1 || dp[i] > dp[i - coins[j]] + 1) { // if this way is less costly
                        dp[i] = dp[i - coins[j]] + 1;
                    }
                }
            }
        }

        return dp[amount];
    }
}
