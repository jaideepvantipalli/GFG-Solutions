class Solution {
    public int assignHole(int[] mices, int[] holes) {
        // code here
        int max=Integer.MIN_VALUE;
        Arrays.sort(mices);
        Arrays.sort(holes);
        for(int i=0;i<mices.length;i++){
            max=Math.max(Math.abs(mices[i]-holes[i]),max);
        }
        return max;
    }
};