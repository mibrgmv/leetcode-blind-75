package longest_repeating_character_replacement__0424;

class Solution {
    public int characterReplacement(String s, int k) {
        int longestSubstringLength = 0;
        int i = 0;
        int[] frequencies = new int[26];

        for (int j = 0; j < s.length(); ++j) {
            ++frequencies[s.charAt(j)-'A'];
            int maxFrequency = -1;
            for (int f : frequencies) {
                maxFrequency = Math.max(f, maxFrequency);
            }
            if (j - i + 1 - maxFrequency <= k) {
                longestSubstringLength = Math.max(j - i + 1, longestSubstringLength);
            } else {
                --frequencies[s.charAt(i)-'A'];
                ++i;
            }
        }

        return longestSubstringLength;
    }
}