class Solution {
    public boolean checkElements(int start, int end, int[] arr) {
        // code here
         HashSet<Integer> hs=new HashSet<>();
        for(int i:arr) hs.add(i);
        for(int i=start;i<=end;i++){
            if(!hs.contains(i))
            return false;
        }
        return true;
        
    }
}