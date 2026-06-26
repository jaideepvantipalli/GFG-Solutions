class Solution {
    public void dfs(int src,boolean[] vist,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> adj){
        vist[src]=true;
        temp.add(src);
        for(int i:adj.get(src))if(!vist[i])dfs(i,vist,temp,adj);
    }
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        ArrayList<ArrayList<Integer>> trav=new ArrayList<>();
        int n=edges.length;
        for(int i=0;i<V;i++)adj.add(new ArrayList<>());
        for(int i=0;i<n;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] vist=new boolean[V+1];
        Arrays.fill(vist,false);
        
        for(int i=0;i<V;i++){
            
            if(vist[i]==false){
                ArrayList<Integer> temp=new ArrayList<>();
                dfs(i,vist,temp,adj);
                trav.add(temp);
            }
        }return trav;
        
    }
}