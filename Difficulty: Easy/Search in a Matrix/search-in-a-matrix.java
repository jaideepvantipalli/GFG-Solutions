// User function Template for Java

class Solution {
    // Function to search a given integer in a matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int rowLength=mat.length; // Row length
        int colLength=mat[0].length; // Col Length
        for(int i=0;i<rowLength;i++){   // Outer loop for Iterate Row
            for(int j=0;j<colLength;j++){ //Inner loop for Iterate Col
                if(mat[i][j]==x){ // Check whether the element match with target Or not 
                    return true;
                }
            }
        }
        return false;
    }
}
