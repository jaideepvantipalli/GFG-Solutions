class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int ans=0,n=start.length;
        PriorityQueue<int []> pq=new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        for(int i=0;i<n;i++){
            pq.add(new int[]{start[i],end[i]});
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
