package contains_duplicate__0217;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for (int x : nums) {
            if (!hs.add(x)) {
                return true;
            }
        }
        return false;
    }
}
