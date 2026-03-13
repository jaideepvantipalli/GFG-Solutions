// User function Template for Java

class Solution{
    static Stack<Integer> deleteMid(int n, Stack<Integer> st)
    {
        // code here
        helper(st,0,n);
        return st;
    }
    static void helper(Stack<Integer> st,int curr,int size){
        if(curr==size/2){
            st.pop();
            return;
        }
        int top=st.pop();
        helper(st,curr+1,size);
        st.push(top);
    }
}