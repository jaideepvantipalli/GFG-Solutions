class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int lsum=0,rsum=0;
        for(int i=0;i<arr.length;i++) lsum+=arr[i];
        for(int i=arr.length-1;i>=0;i--){
            rsum+=arr[i];
            lsum-=arr[i];
            if(lsum==rsum) return true;
        }
        return false;
    }
}