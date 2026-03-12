class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        Stack<Integer> st=new Stack<>();
        int n=s.size()/2;
        while(n-->0){
            st.push(s.pop());
        }
        s.pop();
        while(!st.isEmpty()) s.push(st.pop());
    }
}