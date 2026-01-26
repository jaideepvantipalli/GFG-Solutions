class Solution {
    public int countElements(int[] arr) {
        // code here
        int max=arr[0],count=1;
       for(int i=1;i<arr.length;i++){
           if(arr[i]>max){
               count++;
               max=arr[i];
           }
       }
       return count;
    }
}
