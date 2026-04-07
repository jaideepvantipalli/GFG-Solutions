/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean search(Node root, int key) {
        // code here
        if(root == null) return false;
         while(root != null){
            if(root.data == key){
                return true;
            }
            else if(key < root.data){
                root = root.left;
            }
            else{
                root = root.right;
            }
        }
        
        return false;
    }
}