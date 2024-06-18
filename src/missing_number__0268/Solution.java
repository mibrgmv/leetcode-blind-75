package missing_number__0268;

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] presence = new int[n+1];
        for (int x : nums) {
            ++presence[x];
        }

        for (int i = 0; i < n; ++i) {
            if (presence[i] == 0) {
                return i;
            }
        }

        return n;
    }
}
