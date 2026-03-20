/*
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        ArrayList<Node> res=new ArrayList<>();
        Node predecessor=null,successor=null;
        Node curr=root;
        while(curr!=null){
            if(curr.data<key){
                predecessor=curr;
                curr=curr.right;
            }else if(curr.data>key){
                successor=curr;
                curr=curr.left;
            }else{
                if(curr.left!=null){
                    predecessor=rightmost(curr.left);
                }
                if(curr.right!=null){
                    successor=leftmost(curr.right);
                }
                break;
            }
        }
        res.add(predecessor);
        res.add(successor);
        return res;
    }
    static Node rightmost(Node node) {
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }

    static Node leftmost(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}