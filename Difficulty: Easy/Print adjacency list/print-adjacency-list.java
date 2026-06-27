
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        // code here
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<V;i++){
            res.add(new ArrayList<Integer>());
        }
        
        for(int []edge:edges){
            int u=edge[0];
            int v=edge[1];
            res.get(u).add(v);
            res.get(v).add(u);
        }
        return res;
    }
}