class Solution {
    static ArrayList<Integer> kthLargest(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int n=arr.length;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
            if(pq.size() == k) al.add(pq.peek());
            else if(pq.size() < k) al.add(-1);
            else{
                pq.poll();
                al.add(pq.peek());
            }
        }
        return al;
    }
}