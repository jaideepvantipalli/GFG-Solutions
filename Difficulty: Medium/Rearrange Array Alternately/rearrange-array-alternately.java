class Solution {
    public void rearrange(int arr[]) {
        // code here
       Arrays.sort(arr);
       int[] in = new int[arr.length];
       int k = arr.length-1;
       int i=0;
       int j=0;
       while(i<k){
           in[j++] = arr[k];
           k--;
           in[j++] = arr[i];
           i++;   
       }
       if(arr.length%2!=0){
           in[j] = arr[i];
       }
       for(i=0;i<arr.length;i++){
           arr[i] = in[i];
       }
    }
}
