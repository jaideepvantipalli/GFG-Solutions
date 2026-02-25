class Solution {
    public int longestSubarray(int[] arr, int k) {
        // Code Here
        int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<>();
        int ans = 0, sum = 0;

        for (int i = 0; i < n; i++) {
            // Treat elements <= k as -1, > k as +1
            if (arr[i] <= k) sum--;
            else sum++;

            // If sum is positive, entire prefix is valid
            if (sum > 0) ans = i + 1;
            else {
                // Look for prefix sum = sum - 1
                if (mp.containsKey(sum - 1)) {
                    ans = Math.max(ans, i - mp.get(sum - 1));
                }
            }

            // Store first occurrence of this sum
            if (!mp.containsKey(sum)) {
                mp.put(sum, i);
            }
        }

        return ans;
    }
}