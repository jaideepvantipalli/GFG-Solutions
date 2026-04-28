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
    public boolean isSymmetric(Node root) {
        // code here
        if(root == null) return true;
        return helper(root.left,root.right);
    }
    private static boolean helper(Node L,Node R){
        if(L==null && R==null) return true;
        if(L == null || R == null || L.data!=R.data) return false;
        return helper(L.left,R.right) && helper(L.right,R.left);
    }
}