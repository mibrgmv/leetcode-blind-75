package two_sum__0001;

import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * Runtime: O(n)
     * Memory: O(n)
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i=0; i<nums.length; ++i) {
            if (mp.containsKey(target - nums[i])) {
                return new int[] { mp.get(target - nums[i]), i };
            }
            mp.put(nums[i], i);
        }
        return null;
    }
}
