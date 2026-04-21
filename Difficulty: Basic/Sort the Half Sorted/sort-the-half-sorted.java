// User function Template for Java

class Solution {
    public static void sortHalves(int arr[], int n) {
        // your code here
        int mid=0;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]) mid=i-1;
        }
        
        int i=0,j=mid+1;
        int temp[]=new int[n];
        for(int k=0;k<=n-1;k++){
            if(i>mid){
                temp[k]=arr[j++];
                continue;
            }
            if(j>n-1){
                temp[k]=arr[i++];
                continue;
            }
            temp[k]=(arr[i]<arr[j])?arr[i++]:arr[j++];
        }
        
        for(int k=0;k<=n-1;k++){
            arr[k]=temp[k];
        }
    }
}