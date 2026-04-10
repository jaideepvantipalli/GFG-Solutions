class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int v=adj.size();
        ArrayList<Integer> al=new ArrayList<>();
        boolean[] visited=new boolean[v];
        dfshelper(0,adj,visited,al);
        return al;
    }
    private void dfshelper(int u, ArrayList<ArrayList<Integer>> adj,boolean visited[],ArrayList<Integer> al){
        visited[u]=true;
        al.add(u);
        for(int v:adj.get(u)){
            if(!visited[v]){
                dfshelper(v,adj,visited,al);
            }
        }
    }
}