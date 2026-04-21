// User function Template for Java

class Solution {
    public int minimumDifference(int[] arr) {
        // code here
        Arrays.sort(arr);
        int minDiff = arr[1] - arr[0];
        
        for (int i=1; i<arr.length-1; i++) {
            int diff = arr[i+1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }
}