// User function Template for Java

class Solution {
    static String postToPre(String post_exp) {
        // code here
        Stack<String> st=new Stack<>();
        for(char ch:post_exp.toCharArray()){
            if(Character.isLetterOrDigit(ch))
            st.push(String.valueOf(ch));
            else{
                String x=st.pop();
                String y=st.pop();
                st.push(ch+y+x);
            }
        }
        return st.peek();
    }
}
