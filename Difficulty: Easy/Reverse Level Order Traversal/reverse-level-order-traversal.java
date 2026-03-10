/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Tree {
    public ArrayList<Integer> reverseLevelOrder(Node root) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            for(int i=q.size()-1;i>=0;i--){
                Node nn=q.poll();
                res.add(0,nn.data);
                if(nn.right!=null)
                    q.offer(nn.right);
                if(nn.left!=null)
                    q.offer(nn.left);
            }
        }
        return res;
    }
}