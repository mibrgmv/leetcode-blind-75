package longest_consequtive_sequence__0128;

import java.util.HashSet;
import java.util.Set;

class Solution {
    /**
     * Runtime: O(n)
     * Memory: O(n)
     */
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int x : nums) {
            s.add(x);
        }

        int countMax = 0;
        for (int x : s) {
            if (!s.contains(x - 1)) {
                int j = 1;
                while (s.contains(x + j)) {
                    ++j;
                }
                countMax = Math.max(countMax, j);
            }
        }

        return countMax;
    }
}
