// User function Template for Java

class Solution {
    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        int track=1;
        for(int i=0;i<matrix.length;i++)
        {
            if(track%2!=0)
            {
                int j=0;
                while(j< matrix[i].length)
                {
                    arr.add(matrix[i][j]);
                    j++;
                    
                }
                    
            }
            else
            {
                int j=matrix[i].length-1;
                while(j >= 0)
                {
                    arr.add(matrix[i][j]);
                    j--;
                }
            }
            track++;
        }
        
        return arr;
    }
}