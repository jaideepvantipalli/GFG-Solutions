class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        int ans=1;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0,j=0,len=0;
        while(i<arr.length){
            if(arr[i]<=dep[j]){
                len++;
                i++;
            }else{
                len--;
                j++;
            }
            ans=Math.max(len,ans);
        }
        return ans;
    }
}
