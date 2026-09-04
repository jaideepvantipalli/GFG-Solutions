class Solution {
    public int maxFruits(ArrayList<Integer> arr, int m) {
        // code here
        int n=arr.size();
        int s=0,e=(m-1) % n,sum=0,max=0;
        
        while(s<m){
            sum+=arr.get(s++);
        }
        max=Math.max(max,sum);
        
        if(n==m) return max;
        
        int temp=0;
        
        while(s != e){
            sum-=arr.get(temp++);
            sum+=arr.get(s);
            max=Math.max(sum,max);
            s=(s+1) % n;
        }
        
        return max;
    }
}