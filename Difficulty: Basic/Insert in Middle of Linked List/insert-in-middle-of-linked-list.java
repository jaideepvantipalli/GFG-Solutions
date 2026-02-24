/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        // Code here
        Node newnode=new Node(x);
        if(head==null) return newnode;
        int len=1;
        Node sp=head,fp=head;
        while(fp.next!=null && fp.next.next !=null){
            sp=sp.next;
            fp=fp.next.next;
        }
        newnode.next=sp.next;
        sp.next=newnode;
        return head;
    }
}