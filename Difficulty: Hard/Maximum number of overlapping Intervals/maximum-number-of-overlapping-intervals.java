
class Solution {
    public static int overlapInt(int[][] arr) {
        // code here
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        for(int[] interval:arr){
            tm.put(interval[0],tm.getOrDefault(interval[0],0)+1);
            tm.put(interval[1]+1,tm.getOrDefault(interval[1]+1,0)-1);
        }
        
        int res=0,count=0;
        for(int value:tm.values()){
            count+=value;
            res=Math.max(res,count);
        }
        return res;
    }
}
