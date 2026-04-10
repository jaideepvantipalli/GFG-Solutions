class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n=adj.size();
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> al=new ArrayList<>();
        boolean[] visit=new boolean[n];
        q.offer(0);
        visit[0]=true;
        while(!q.isEmpty()){
            int u=q.poll();
            al.add(u);
            for(int i=0;i<adj.get(u).size();i++){
                int v=adj.get(u).get(i);
                if(!visit[v]){
                    visit[v]=true;
                    q.offer(v);
                }
            }
        }
        return al;
    }
}