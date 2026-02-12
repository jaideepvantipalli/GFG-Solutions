// User function Template for Java

class Solution {

    int minProduct(int arr[], int k) {
        // Complete the function
        final int MOD = (int)1e9 + 7;
        if (k > arr.length) {
            k = arr.length; 
        }
        long prod = 1;
        Arrays.sort(arr);
        for(int i=0;i<k;i++){
            prod = (prod * arr[i]) % MOD;
        }
        return (int)prod;
    }
}
