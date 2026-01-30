class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int ans=0,n=start.length;
        PriorityQueue<int []> pq=new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        for(int i=0;i<n;i++){
            pq.add(new int[]{start[i],finish[i]});
        }
        int ftime=-1;
        while(!pq.isEmpty()){
            int[] activity= pq.poll(); 
            if (activity[0] > ftime) {
                ftime = activity[1];
                ans++;
            }
        }
        return ans;
    }
}
