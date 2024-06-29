package unique_paths__0062;

public class Solution {
    public int uniquePaths(int m, int n) {
        int k = Math.max(m - 1, n - 1);
        long result = 1; // result = (m + n - 2)! / (m - 1)!(n - 1)!
        for (int i = k + 1; i <= m + n - 2; ++i) {
            result *= i;
            result /= i - k;
        }
        return (int) result;
    }
}
