package word_break__0139;

import java.util.*;

public class Solution {
    private List<String> wordDict;
    private Map<String, Boolean> memo = new HashMap<>();

    public boolean wordBreak(String s, List<String> wordDict) {
        this.wordDict = wordDict;
        return check(s);
    }

    private boolean check(String s) {
        if (memo.containsKey(s)) {
            return memo.get(s);
        }
        if (s.isEmpty()) {
            return true;
        }

        for (String prefix : wordDict) {
            if (s.startsWith(prefix)) {
                if (check(s.substring(prefix.length()))) {
                    memo.put(s, true);
                    return true;
                }
            }
        }

        memo.put(s, false);
        return false;
    }
}
