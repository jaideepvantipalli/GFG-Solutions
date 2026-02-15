// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int res=Integer.MAX_VALUE;
        for(int i=0;i+m-1<arr.size();i++){
            res=Math.min(res,arr.get(i+m-1)-arr.get(i));
        }
        return res;
    }
}