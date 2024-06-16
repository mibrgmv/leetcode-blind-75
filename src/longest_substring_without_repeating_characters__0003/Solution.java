package longest_substring_without_repeating_characters__0003;

import java.util.Set;
import java.util.HashSet;

public class Solution {
    /**
     * Runtime: O(n)
     * Memory: O(n)
     */
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int length = 0;
        int n = s.length();
        Set<Character> set = new HashSet<>();

        for (int j = 0; j < n; ++j) {
            while (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                ++i;
            }
            set.add(s.charAt(j));
            length = Math.max(length, j - i + 1);
        }

        return length;
    }
}
