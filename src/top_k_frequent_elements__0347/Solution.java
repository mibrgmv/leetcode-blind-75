package top_k_frequent_elements__0347;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        Arrays.stream(nums).forEach(a -> mp.put(a, mp.getOrDefault(a, 0) + 1));
        return mp.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
