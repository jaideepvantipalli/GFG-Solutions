class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i] ){
                dq.removeLast();
            }
            dq.add(i);
        }
        al.add(arr[dq.peekFirst()]);
        for(int i=k;i<arr.length;i++){
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]){
                dq.removeLast();
            }
            dq.add(i);
            al.add(arr[dq.peekFirst()]);
        }
        return al;
    }
}