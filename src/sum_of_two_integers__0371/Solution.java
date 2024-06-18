package sum_of_two_integers__0371;

class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int remainder = (a & b);
            a ^= b;
            b = remainder << 1;
        }

        return a;
    }
}
