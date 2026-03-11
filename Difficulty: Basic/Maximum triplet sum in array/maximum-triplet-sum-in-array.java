// User function Template for Java

class Solution {
    // Function to find the maximum triplet sum in the array.
    public int maxTripletSum(List<Integer> arr) {
        // Complete the function
        int max1=Integer.MIN_VALUE, max2=Integer.MIN_VALUE, max3=Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>=max1){
                max3= max2;
                max2= max1;
                max1= arr.get(i);
            }
            else if(arr.get(i)>=max2){
                max3= max2;
                max2= arr.get(i);
            }
            else if(arr.get(i)>=max3){
                max3= arr.get(i);
            }
        }
        return max1+max2+max3;
    }
}
