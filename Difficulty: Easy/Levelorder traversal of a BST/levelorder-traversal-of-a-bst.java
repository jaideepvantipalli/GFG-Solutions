class Solution {
    // Function to return the level order traversal of a BST.
    static ArrayList<Integer> levelOrder(Node node) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.offer(node);

        while(!q.isEmpty()){
            for(int i=1;i<=q.size();i++){
                Node nn=q.poll();
                res.add(nn.data);
                if(nn.left!=null)
                    q.offer(nn.left);
                if(nn.right!=null)
                    q.offer(nn.right);
            }
        }
        return res;
    }
}