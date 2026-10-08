class Solution {
    public int maxFrequency(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        long windowSum = 0;
        int left = 0;
        int res = 1;
        for (int right = 0; right < arr.length; ++right) {
            windowSum += arr[right];
            // Shrink the window if more than k increments are required.
            while ((long) arr[right] * (right - left + 1) - windowSum > k) {
                windowSum -= arr[left];
                ++left;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}