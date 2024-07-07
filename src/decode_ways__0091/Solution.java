package decode_ways__0091;

class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n];
        int[] pd = new int[n];
        dp[0] = (s.charAt(0) != '0') ? 1 : 0;
        for (int i = 1; i < n; i++) {
            dp[i] = (s.charAt(i) != '0') ? dp[i - 1] + pd[i - 1] : 0;
            pd[i] = (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2' && s.charAt(i) <= '6') ? dp[i - 1] : 0;
        }
        return dp[n - 1] + pd[n - 1];
    }
}
