/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public ArrayList<Integer> nodesAtOddLevels(Node root) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        if(root == null) return al;
        Queue<Node> q=new LinkedList<>();
        int depth=1;
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                Node node=q.poll();
                if(depth%2==1)
                al.add(node.data);
                if(node.left != null) q.offer(node.left);
                if(node.right !=null) q.offer(node.right);
            }
            depth++;
        }
        return al;
    }
}