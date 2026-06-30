class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n=mat.length;
        int i=0,j=n-1;
        while(i<j){
            if(mat[j][i]==0) i++;
            else j--;
        }
        int c=i;
        for(int k=0;k<n;k++){
            if(c==k) continue;
            if(mat[c][k]!=0 || mat[k][c]==0) return -1;
        }
        return c;
    }
}