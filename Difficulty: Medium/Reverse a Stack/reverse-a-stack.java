class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        while(!st.isEmpty()) al.add(st.pop());
        
        for(int i:al) st.push(i);
    }
}
