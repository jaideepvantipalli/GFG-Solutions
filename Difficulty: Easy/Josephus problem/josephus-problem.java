class Solution {
    public int josephus(int n, int k) {
        // code her
        int i = 1, ans = 0;
        while (i <= n) {
            ans = (ans + k) % i;
            i++;
        }
        return ans + 1;
    }
}