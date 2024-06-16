package three_sum__0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < n; ++i) {
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int threeSum = nums[i] + nums[j] + nums[k];
                if (threeSum > 0) {
                    --k;
                } else if (threeSum < 0) {
                    ++j;
                } else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (i + 1 < n && nums[i] == nums[i+1]) {
                        ++i;
                    }
                    do {
                        ++j;
                    } while (j < n && nums[j] == nums[j-1]);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().threeSum(new int[] {-1,0,1,2,-1,-4}));
    }
}
