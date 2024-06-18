package palindromic_substrings__0647;

class Solution {
    public int countSubstrings(String s) {
        int numberOfSubstrings = 0;
        for (int i = 0; i < s.length(); ++i) {
            numberOfSubstrings += palindromeHelper(s, i, i);
            numberOfSubstrings += palindromeHelper(s, i, i + 1);
        }

        return numberOfSubstrings;
    }

    private int palindromeHelper(String s, int l, int r) {
        int numberOfSubstrings = 0;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            ++numberOfSubstrings;
            --l;
            ++r;
        }

        return numberOfSubstrings;
    }
}
