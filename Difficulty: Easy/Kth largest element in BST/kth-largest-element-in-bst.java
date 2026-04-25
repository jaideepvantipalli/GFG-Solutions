/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    static int count,ans;
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root, int k) {
        // Your code here
        count=0;
        ans=0;
        inorder(root,k);
        return ans;
    }
    public void inorder(Node root,int k){
        if(root == null || count>=k) return ;
        inorder(root.right,k);
        if(count<k){
            ans=root.data;
            count++;
        }
        inorder(root.left,k);
    }
}