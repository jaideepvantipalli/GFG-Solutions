/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    boolean findTarget(Node root, int target) {
        // Write your code here
        ArrayList<Integer> al=new ArrayList<>();
        getInorder(root,al);
        int s=0;
        int e=al.size()-1;
        while(s<e){
            if(al.get(s)+al.get(e)==target) return true;
            else if(al.get(s)+al.get(e)< target) s++;
            else e--;
        }
        return false;
    }
    
    void getInorder(Node root,ArrayList<Integer> al){
        if(root == null ) return;
        getInorder(root.left,al);
        al.add(root.data);
        getInorder(root.right,al);
    }
}