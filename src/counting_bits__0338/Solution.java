package counting_bits__0338;

import java.util.Arrays;

public class Solution {
    public int[] countBits(int n) {
        int[] bits = new int[n+1];
        for (int i = 1; i <= n; ++i) {
            int num = i;
            while (num > 0) {
                bits[i] += num & 1; // same as 'num % 2'
                num >>= 2; // same as 'num /= 2'
            }
        }
        return bits;
    }
}
