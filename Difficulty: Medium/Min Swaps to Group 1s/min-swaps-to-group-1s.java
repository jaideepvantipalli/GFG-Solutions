class Solution {
    public int minSwaps(int[] arr) {
        // code here
        int n=arr.length;
        int noofones=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1) noofones++;
        }
        
        if(noofones==0) return -1;
        int x=noofones;
        int cntones=0,maxones=0;
        for(int i=0;i<x;i++){
            if(arr[i]==1){
                cntones++;
            }
        }
        maxones=cntones;
        
        for(int i=1;i<=n-x;i++){
            if(arr[i-1]==1) cntones--;
            if(arr[i+x-1]==1) cntones++;
            maxones=Math.max(maxones,cntones);
        }
        
        int noofzeros=x-maxones;
        return noofzeros;
    }
}
