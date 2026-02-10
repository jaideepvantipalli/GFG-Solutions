// User function Template for Java

class Solution {

    // Function for finding maximum and value pair
    public ArrayList<Integer> countArray(int[] nums, int x) {
        // Complete the function
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i = 0;i<nums.length;i++){
            int avg = (nums[i]+x)/2;
            if(map.containsKey(avg)){
                list.add(map.get(avg));
            }
            else{
                list.add(0);
            }
        }
        return list;
    }
}
