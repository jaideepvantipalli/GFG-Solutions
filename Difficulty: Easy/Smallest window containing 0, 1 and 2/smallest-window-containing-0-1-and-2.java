// User function Template for Java

class Solution {
    public int smallestSubstring(String S) {
        // Code here
        int res=Integer.MAX_VALUE;
        int count[]=new int[3];
        int left=0;
        
        for(int right=0;right<S.length();right++){
            count[S.charAt(right)-'0']++;
            while(count[0] > 0 && count[1] > 0 && count[2] > 0){
                res=Math.min(res,right-left+1);
                count[S.charAt(left)-'0']--;
                left++;
            }
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
};
