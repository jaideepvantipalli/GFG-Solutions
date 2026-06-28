class Solution {
    public int[][] adjToMat(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int v=adj.size();
        int res[][]=new int[v][v];
        for(int i=0;i<v;i++){
            for(int j:adj.get(i)){
                res[i][j]=1;
            }
        }
        return res;
    }
}
