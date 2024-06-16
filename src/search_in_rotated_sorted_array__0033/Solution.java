package search_in_rotated_sorted_array__0033;

class Solution {
    public int search(int[] nums, int target) {
        return subSearch(nums, target, 0, nums.length - 1);
    }

    private int subSearch(int[] nums, int target, int l, int r) {
        if (r < l) {
            return -1;
        }
        if (target == nums[(l + r) / 2]) {
            return (l + r) / 2;
        }
        if (nums[l] <= nums[(l + r) / 2] && target <= nums[(l + r) / 2] && target >= nums[l]) {
            return subSearch(nums, target, l, (l + r) / 2 - 1);
        }
        if (nums[l] <= nums[(l + r) / 2] || target >= nums[(l + r) / 2] && target <= nums[r]) {
            return subSearch(nums, target, (l + r) / 2 + 1, r);
        }
        return subSearch(nums, target, l, (l + r) / 2 - 1);
    }
}
