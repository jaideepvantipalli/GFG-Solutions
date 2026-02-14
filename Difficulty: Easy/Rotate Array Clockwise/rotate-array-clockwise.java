class Solution {
    public void rotateclockwise(int[] arr, int k) {
        // code here
        k=k%arr.length;
        rotate(arr,0,arr.length-1);
        rotate(arr,0,k-1);
        rotate(arr,k,arr.length-1);
    }
    private static  void rotate(int arr[],int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}