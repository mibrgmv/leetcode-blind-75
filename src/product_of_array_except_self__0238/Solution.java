package product_of_array_except_self__0238;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] productExceptSelf = new int[n];
        int x = 1;
        for (int i = 0; i < n; ++i) {
            productExceptSelf[i] = x;
            x *= nums[i];
        }
        x = 1;
        for (int i = n - 1; i >= 0; --i) {
            productExceptSelf[i] *= x;
            x *= nums[i];
        }

        return productExceptSelf;
    }
}
