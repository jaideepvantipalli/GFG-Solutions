class Solution {
    /* Returns level of given data value */
    int getLevel(Node node, int data) {
        // Write your code here
        Queue<Node> q=new LinkedList<>();
        int res=1;
        q.offer(node);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=1;i<=n;i++){
                Node nn=q.poll();
                if(nn.data==data) return res;
                if(nn.left!=null) q.offer(nn.left);
                if(nn.right!=null) q.offer(nn.right);
            }
            res++;
        }
        return 0;
    }
}