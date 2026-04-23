class Solution {
    public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
        // code here
        int l=0,r=0;
        int s1=0,s2=0,res=0;
        int n=arr1.size(),m=arr2.size();
        
        while(l<n && r<m){
            if(arr1.get(l) < arr2.get(r)){
                s1+=arr1.get(l++);
            }else if(arr1.get(l) > arr2.get(r)){
                s2+=arr2.get(r++);
            }else{
                res+=Math.max(s1,s2)+arr1.get(l);
                l++;
                r++;
                s1=0;
                s2=0;
            }
        }
        
        while(l<n){
            s1+=arr1.get(l);
            l++;
        }
        while(r<m){
            s2+=arr2.get(r);
            r++;
        }
        return res+Math.max(s1,s2);
    }
}