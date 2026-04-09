class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int l=0,r=arr.length-1;
        while(l<r){
            while(l<r && arr[l]==0) l++;
            while(l<r && arr[r]==1) r--;
            if(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;r--;
            }
        }
    }
}
