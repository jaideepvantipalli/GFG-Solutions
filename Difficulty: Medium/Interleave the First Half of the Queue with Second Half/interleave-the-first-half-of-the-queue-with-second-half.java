class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        int n=q.size();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=q.poll();
        }
        for(int i=0;i<n/2;i++){
            q.add(a[i]);
            q.add(a[i+n/2]);
        }
        
    }
}
