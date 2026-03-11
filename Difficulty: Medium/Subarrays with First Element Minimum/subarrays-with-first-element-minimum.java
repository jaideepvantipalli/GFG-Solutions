class Solution {
    public int countSubarrays(int[] arr) {
        // code here
        int n=arr.length;
        int nexts[]=new int[n];
        for(int i=0;i<n;i++)
            nexts[i]=n;
            
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(!st.isEmpty()) nexts[i]=st.peek();
            st.push(i);
        }
        int res=0;
        for(int i=0;i<n;i++)
        res+=nexts[i]-i;
        
        return res;
    }
}
