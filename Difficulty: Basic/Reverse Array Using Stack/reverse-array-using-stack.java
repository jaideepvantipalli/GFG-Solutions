class Solution {
    void reverseArray(int[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        for(int i:arr) st.push(i);
        for(int i=0;i<arr.length;i++){
            arr[i]=st.pop();
        }
    }
}
