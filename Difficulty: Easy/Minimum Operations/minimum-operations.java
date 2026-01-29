// User function Template for Java

class Solution {
    public int minOperation(int n) {
        // code here.
        int ops=0;
        while(n>0){
            if(n%2==0){ n/=2; ops++;}
            else{
                n-=1;
                ops++;
            }
        }
        return ops;
    }
}