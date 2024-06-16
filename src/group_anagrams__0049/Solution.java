package group_anagrams__0049;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = Arrays.toString(chars);
            mp.computeIfAbsent(key, a -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(mp.values());
    }
}
