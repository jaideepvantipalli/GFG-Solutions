class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n=arr.length;
        int l=0,r=n-1;
        int lm=0,rm=0;
        int water=0;
        while(l<r){
            if(arr[l]<arr[r]){
                lm=Math.max(lm,arr[l]);
                water+=lm-arr[l];
                l++;
            }
            else{
                rm=Math.max(rm,arr[r]);
                water+=rm-arr[r];
                r--;
            }
        }
        return water;
    }
}
