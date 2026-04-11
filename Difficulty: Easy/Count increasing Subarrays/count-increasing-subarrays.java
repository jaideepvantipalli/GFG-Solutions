class Solution {
    public int countIncreasing(int[] arr) {
        // code here
        int cnt=0,n=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1])
            n++;
            else{
                cnt+=n*(n-1)/2;
                n=1;
            }
        }
        cnt+=n*(n-1)/2;
        return cnt;
    }
}
