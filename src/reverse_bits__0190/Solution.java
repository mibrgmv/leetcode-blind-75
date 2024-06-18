package reverse_bits__0190;

public class Solution {
    public int reverseBits(int n) {
        int reversedNumber = 0;
        for (int i = 0; i < 32; ++i) {
            reversedNumber <<= 1;
            reversedNumber += n & 1; // same as 'n % 2'
            n >>= 1;
        }
        return reversedNumber;
    }
}
