package jump_game__0055;

public class Solution {
    public boolean canJump(int[] nums) {
        int jumpLength = 0;
        for (int x : nums) {
            if (jumpLength < 0) {
                return false;
            }
            if (x >= jumpLength) {
                jumpLength = x;
            }
            --jumpLength;
        }
        return true;
    }
}
