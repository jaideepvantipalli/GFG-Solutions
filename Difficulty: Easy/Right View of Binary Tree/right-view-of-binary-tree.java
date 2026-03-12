/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> rightView(Node root) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        if(root==null) return null;
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                Node node=q.poll();
                if(i==n-1) res.add(node.data);
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
        }
        return res;
    }
}