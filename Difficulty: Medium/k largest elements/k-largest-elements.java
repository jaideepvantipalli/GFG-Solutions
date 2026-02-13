class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:arr) pq.add(i);
        
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<k;i++){
            al.add(pq.poll());
        }
        return al;
    }
}
