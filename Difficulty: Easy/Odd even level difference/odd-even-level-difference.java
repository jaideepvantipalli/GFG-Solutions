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
    int getLevelDiff(Node root) {
        // code here
        int oddsum=0,evensum=0;
        int lvl=1;
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            int sum=0;
            for(int i=1;i<=n;i++){
                Node node=q.poll();
                sum+=node.data;
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            if(lvl%2==0)
            evensum+=sum;
            else oddsum+=sum;
            lvl++;
        }
        return oddsum-evensum;
    }
}