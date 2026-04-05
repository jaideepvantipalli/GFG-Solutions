/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    // Return the level (0-indexed) with maximum number of nodes.
    public static int maxNodeLevel(Node root) {
        // add your code here
        if(root == null) return 0;
        Queue<Node> q=new LinkedList<>();
        int max=0,depth=0,ans=0;
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            if(n>max){
                max=n;
                ans=depth;
            }
            for(int i=0;i<n;i++){
                Node node=q.poll();
                if(node.left != null) q.offer(node.left);
                if(node.right !=null) q.offer(node.right);
            }
            depth++;
        }
        return ans;
    }
}