class Solution {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        // code here
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i:arr) dq.add(i);
        return dq;
    }
}