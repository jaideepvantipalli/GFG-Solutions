class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if(k>q.size()) return q;
        int n=q.size()-k;
        Stack<Integer> st=new Stack<>();
        while(k-->0){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
        while(n-->0){
            q.offer(q.poll());
        }
        return q;
    }
}