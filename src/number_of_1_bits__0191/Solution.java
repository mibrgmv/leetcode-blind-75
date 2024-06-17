package number_of_1_bits__0191;

class Solution {
    public int hammingWeight(int n) {
        int hammingWeight = 0;
        for (int i = 0; i < 32; ++i) {
            if ((n & 1) == 1) {
                ++hammingWeight;
            }
            n >>= 1;
        }
        return hammingWeight;
    }
}
