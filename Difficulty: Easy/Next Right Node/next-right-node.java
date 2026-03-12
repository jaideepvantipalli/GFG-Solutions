class Solution {
    Node nextRight(Node root, int key) {
        // Write your code here
        Queue<Node> q=new LinkedList<>();
        if(root==null) return new Node(-1);
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                Node node=q.poll();
                if(node.data==key){
                    if(i!=n-1) return q.peek();
                    else return new Node(-1);
                }
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
        }
        return new Node(-1);
    }
}