class Solution {
    // Function to find the maximum product of any two adjacent elements in the array.
    public int maxValue(int[] arr) {
        // Your code goes here
        // int fmax=Integer.MIN_VALUE,smax=Integer.MAX_VALUE;
        // int fmaxi=0,smaxi=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>fmax){
        //         fmax=arr[i];
        //         fmaxi=i;
        //     }
        //     if(arr[i]>fmax && arr[i]>smax && fmaxi!=i){
        //         smax=fmax;
        //         smaxi=i;
        //     }
        // }
        // return Math.abs(fmaxi-smaxi)*Math.min(fmax,smax);
        int res=Integer.MIN_VALUE;
        int l=0,r=arr.length-1;
        
        while(l<r){
            res=Math.max(res,(r-l)*Math.min(arr[l],arr[r]));
            
            if(arr[l]<arr[r]) l++;
            else r--;
        }
        return res;
    }
}