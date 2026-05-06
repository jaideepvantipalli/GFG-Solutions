/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        postorder(root, list);
        return list;
    }
    void postorder(Node root, ArrayList<Integer> list)
    {
        if(root == null)
            return;
        postorder(root.left, list);
        postorder(root.right, list);
        list.add(root.data);
    }
}