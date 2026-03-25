// User function Template for Java

class Solution {
    static String preToPost(String pre_exp) {
        // code here
        Stack<String> st=new Stack<>();
        for(int i=pre_exp.length()-1;i>=0;i--){
            if(Character.isLetter(pre_exp.charAt(i))){
                String a=pre_exp.charAt(i)+"";
                st.push(a);
            }else{
                String x=st.pop();
                String y=st.pop();
                String z=x+y+pre_exp.charAt(i);
                st.push(z);
            }
        }
        return st.peek();
    }
}
