package find_minimum_in_rotated_sorted_array__0153;

class Solution {
    private int minimum = Integer.MAX_VALUE;

    public int findMin(int[] nums) {
        subSearch(nums, 0, nums.length - 1);
        return minimum;
    }

    private void subSearch(int[] nums, int l, int r) {
        if (l > r) {
            return;
        }
        minimum = Math.min(minimum, nums[(l + r) / 2]);
        if (nums[(l + r) / 2] <= nums[r]) {
            subSearch(nums, l, (l + r) / 2 - 1);
        } else {
            subSearch(nums, (l + r) / 2 + 1, r);
        }
    }
}