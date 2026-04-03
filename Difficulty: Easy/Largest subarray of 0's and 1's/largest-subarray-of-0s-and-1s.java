class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        int len=0;
        int preSum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int right=0;right<arr.length;right++){
            preSum += (arr[right] == 0) ? -1 : 1;
            if (preSum == 0)
                len = Math.max(len,right + 1);
                
            if(hm.containsKey(preSum))
                len = Math.max(len, right - hm.get(preSum));
            else
                hm.put(preSum, right);
        }
        return len;
    }
}