class Solution {
    public int sumSubMins(int[] arr) {
        // code here
        int n=arr.length;
        int prevs[]=new int[n];
        int nexts[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            prevs[i] = st.isEmpty() ? (i + 1) : (i - st.peek());
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            st.pop();
            
            nexts[i]=st.isEmpty()?(n-i):(st.peek()-i);
            st.push(i);
        }
        
        int res=0;
        for(int i=0;i<n;i++){
            res+=arr[i]*prevs[i]*nexts[i];
        }
        return res;
    }
}
