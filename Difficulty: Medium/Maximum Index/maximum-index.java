class Solution {
    int maxIndexDiff(int[] arr) {
        // code here
        int n=arr.length;
        int []leftmin=new int[n];
        int []rightmax=new int[n];
        
        leftmin[0]=arr[0];
        for(int i=1;i<n;i++){
            leftmin[i]=Math.min(leftmin[i-1],arr[i]);
        }
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],arr[i]);
        }
        
        int i=0,j=0,ans=0;
        while(i<n && j<n){
            if(leftmin[i]<=rightmax[j]){
                ans=Math.max(ans,j-i);
                j++;
            }
            else i++;
        }
        
        return ans;
    }
}