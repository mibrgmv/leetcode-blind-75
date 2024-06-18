package container_with_most_water__0011;

class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }

    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;

        while (i < j) {
            int currentArea = Math.min(height[i], height[j]) * (j - i);
            maxArea = Math.max(maxArea, currentArea);
            if (height[i] > height[j]) {
                --j;
            } else {
                ++i;
            }
        }

        return maxArea;
    }
}
