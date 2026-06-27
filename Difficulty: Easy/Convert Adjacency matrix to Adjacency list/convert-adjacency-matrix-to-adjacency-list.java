class Solution {
    public ArrayList<ArrayList<Integer>> matToAdj(int[][] mat) {
        // code here
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            ArrayList<Integer> al=new ArrayList<>();
            for(int j=0;j<mat.length;j++){
                if(mat[i][j]==1) al.add(j);
            }
            res.add(al);
        }
        return res;
    }
}