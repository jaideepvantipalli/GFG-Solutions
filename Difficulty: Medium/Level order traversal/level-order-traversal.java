/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            ArrayList<Integer> al=new ArrayList<>();
            for(int i=1;i<=q.size();i++){
                Node nn=q.poll();
                al.add(nn.data);
                if(nn.left!=null)
                    q.offer(nn.left);
                if(nn.right!=null)
                    q.offer(nn.right);
            }
            res.add(al);
        }
        return res;
    }
}