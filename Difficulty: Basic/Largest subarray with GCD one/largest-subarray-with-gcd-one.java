class Solution {
    public int longestSubarray(int[] arr) {
        // code here
        int n=arr.length;
        int x = arr[0];
        for(int i=1;i<n;i++)
        {
            x = gcd(x,arr[i]);
        }
        if(x==1)
            return n;
        else
            return -1;
    }
    static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}