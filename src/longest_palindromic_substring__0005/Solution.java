package longest_palindromic_substring__0005;

class Solution {
    public String longestPalindrome(String s) {
        if (s.contentEquals(new StringBuilder(s).reverse())) {
            return s;
        }

        String maxPalindrome = "";
        for (int i = 0; i < s.length(); ++i) {
            maxPalindrome = palindromeHelper(s, maxPalindrome, i, i, maxPalindrome.length());
            maxPalindrome = palindromeHelper(s, maxPalindrome, i, i + 1, maxPalindrome.length());
        }

        return maxPalindrome;
    }

    private String palindromeHelper(String s, String currentPalindrome, int l, int r, int maxLength) {
        int n = s.length();

        while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
            if (r - l + 1 > maxLength) {
                maxLength = r - l + 1;
                currentPalindrome = s.substring(l, r + 1);
            }
            --l;
            ++r;
        }

        return currentPalindrome;
    }
}
