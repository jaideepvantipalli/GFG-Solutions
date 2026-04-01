// User function Template for Java

class Solution {

    public int findMissing(int[] arr1, int[] arr2) {
        // code here
        int s=0;
        for(int i:arr1) s+=i;
        for(int i:arr2) s-=i;
        return s;
    }
}