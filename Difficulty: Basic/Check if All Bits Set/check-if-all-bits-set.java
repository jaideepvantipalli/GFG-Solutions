class Solution {
    public boolean isBitSet(int n) {
        // code here
        if (n == 0)
            return false;

        // Loop until n becomes 0
        while (n > 0) {

            // Check if last bit is 0
            if ((n & 1) == 0) {
                return false;
            }

            // Right shift n
            n = n >> 1;
        }

        return true;
    }
};