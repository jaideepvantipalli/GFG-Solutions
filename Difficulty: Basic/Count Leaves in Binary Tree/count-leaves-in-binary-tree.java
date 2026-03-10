/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Solution {
    int countLeaves(Node node) {
        // Your code
        int cnt=0;
        Queue<Node> q=new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=1;i<=n;i++){
                Node node1=q.poll();
                if(node1.left!=null)
                    q.offer(node1.left);
                if(node1.right!=null)
                    q.offer(node1.right);
                if(node1.left==null && node1.right==null) cnt++;
            }
        }
        return cnt;
    }
}