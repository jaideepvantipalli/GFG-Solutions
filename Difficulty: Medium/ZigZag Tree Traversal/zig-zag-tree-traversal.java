/*
class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        if(root==null) return null;
        ArrayList<Integer> res=new ArrayList<>();
        Deque<Node> q=new LinkedList<>();
        int lvl=1;
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            if(lvl%2!=0){
                for(int i=1;i<=n;i++){
                    Node node=q.pollFirst();
                    res.add(node.data);
                    if(node.left!=null) q.add(node.left);
                    if(node.right!=null) q.add(node.right);
                }
            }
            else{
                for(int i=1;i<=n;i++){
                    Node node=q.pollLast();
                    res.add(node.data);
                    if(node.right!=null) q.addFirst(node.right);
                    if(node.left!=null) q.addFirst(node.left);
                }
            }
            lvl++;
        }
        return res;
    }
}