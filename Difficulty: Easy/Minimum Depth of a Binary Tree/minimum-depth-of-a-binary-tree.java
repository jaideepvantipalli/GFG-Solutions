/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    int minDepth(Node root) {
        // code here
        if(root == null) return 0;
        Queue<Node> q=new LinkedList<>();
        int depth=1;
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            // Node node=q.poll();
            for(int i=0;i<n;i++){
                Node node=q.poll();
                if(node.left==null && node.right == null) return depth;
                if(node.left != null) q.offer(node.left);
                if(node.right !=null) q.offer(node.right);
            }
            depth++;
        }
        return depth;
    }
}