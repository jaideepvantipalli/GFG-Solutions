// User function Template for javascript

class Solution {
    countZeroes(arr) {
        // write your code here
        let count=0;
        for(let i=0;i<=arr.length;i++){
            if(arr[i]===0)
            {
                count++;
            }
        }
        return count;
    }
}