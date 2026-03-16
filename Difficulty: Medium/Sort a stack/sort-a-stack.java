class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        Stack<Integer> temp=new Stack<>();
        while(!st.isEmpty()){
            int ele=st.pop();
            if(temp.isEmpty()) temp.push(ele);
            else{
                while(!temp.isEmpty() && temp.peek()<ele){
                    st.push(temp.pop());
                }
                temp.push(ele);
            }
        }
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
    }
}