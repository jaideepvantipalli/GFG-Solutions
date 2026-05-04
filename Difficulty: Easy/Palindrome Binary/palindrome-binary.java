class Solution {
    public boolean isBinaryPalindrome(int n) {
        // code here
        String s="";
        while(n>0){
            if(n%2==0)
            s+="0";
            else s+="1";
            n/=2;
        }
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            return false;
        }
        return true;
    }
};