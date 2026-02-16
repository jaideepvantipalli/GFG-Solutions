// User function Template for Java

class Solution {
    int findMaxAverage(int[] arr, int n, int k) {
        // code here
        int index=0;
        int maxsum=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        maxsum=sum;
        for(int i=k;i<n;i++){
            sum+=arr[i]-arr[i-k];
            if(sum>maxsum){
                index=i-k+1;
                maxsum=sum;
            }
        }
        return index;
    }
}
