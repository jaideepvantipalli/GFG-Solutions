class Solution {
    public boolean isProduct(int[] arr, long target) {
        // code here
        Arrays.sort(arr);

        // Initialize two pointers
        int left = 0, right = arr.length - 1;

        // Traverse using two pointers
        while (left < right) {
            // Calculate current product safely using long
            long currProd = (long)arr[left] * arr[right];

            // If product matches target → pair found
            if (currProd == target)
                return true;

            // If product is greater → decrease it
            if (currProd > target)
                right--;

            // If product is smaller → increase it
            else
                left++;
        }

        // No pair found
        return false;
    }
}