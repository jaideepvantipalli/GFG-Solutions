class Solution {
    int maxProduct(int[] arr) {
        // code here
        int ans=Integer.MIN_VALUE,n=arr.length;
        int left=1,right=1;
        for(int i=0;i<n;i++){
            
            if(left==0) left=1;
            if(right==0) right=1;
            left*=arr[i];
            right*=arr[n-i-1];
            ans=Math.max(ans,Math.max(left,right));
        }
        return ans;
    }
}