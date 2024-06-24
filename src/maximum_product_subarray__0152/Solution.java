package maximum_product_subarray__0152;

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;
        int currentProductLeft = 1;
        int currentProductRight = 1;

        for (int i = 0; i < n; ++i) {
            currentProductLeft *= (double) nums[i];
            currentProductRight *= (double) nums[n - i - 1];
            maxProduct = Math.max(maxProduct, Math.max(currentProductLeft, currentProductRight));
            currentProductLeft = (currentProductLeft == 0) ? 1 : currentProductLeft;
            currentProductRight = (currentProductRight == 0) ? 1 : currentProductRight;
        }

        return maxProduct;
    }
}