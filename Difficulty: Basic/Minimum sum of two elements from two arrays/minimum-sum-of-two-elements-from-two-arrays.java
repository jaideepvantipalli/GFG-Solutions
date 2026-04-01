class Solution {
    public int minSum(int[] arr1, int[] arr2) {
        // code here
        int n = arr1.length;
        
        // arr1 minimum, second minimum and their indices
        int min1 = Integer.MAX_VALUE, min1Idx = -1;
        int secMin1 = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (arr1[i] < min1) {
                secMin1 = min1;
                min1 = arr1[i];
                min1Idx = i;
            } else if (arr1[i] < secMin1) {
                secMin1 = arr1[i];
            }
        }
        
        // arr2 minimum, second minimum and their indices
        int min2 = Integer.MAX_VALUE, min2Idx = -1;
        int secMin2 = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (arr2[i] < min2) {
                secMin2 = min2;
                min2 = arr2[i];
                min2Idx = i;
            } else if (arr2[i] < secMin2) {
                secMin2 = arr2[i];
            }
        }
        
        // If minimums are at different indices, use them directly
        if (min1Idx != min2Idx) {
            return min1 + min2;
        }
        
        // If minimums are at same index, the next best combination
        int option1 = min1 + secMin2;
        int option2 = secMin1 + min2;
        
        return Math.min(option1, option2);
    }
}
