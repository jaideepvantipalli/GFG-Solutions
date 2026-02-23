/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node curr=head,next=null,prev=null;
        while(curr!=null){
            prev=curr.next;
            curr.next=next;
            next=curr;
            curr=prev;
        }
        return next;
    }
}