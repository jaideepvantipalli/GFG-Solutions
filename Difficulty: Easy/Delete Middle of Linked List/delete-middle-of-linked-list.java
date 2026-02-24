/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        if(head==null) return null;
        if(head.next == null) return null;
        Node sp=head,fp=head,prev=null;
        while(fp!=null && fp.next!=null){
            fp=fp.next.next;
            prev=sp;
            sp=sp.next;
        }
        prev.next=sp.next;
        return head;
    }
}