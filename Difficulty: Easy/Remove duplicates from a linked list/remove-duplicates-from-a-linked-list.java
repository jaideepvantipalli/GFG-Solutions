/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        // Your code here
        if(head==null || head.next==null) return head;
        HashSet<Integer> hs=new HashSet<>();
        Node curr=head,prev=head,begin=null;
        
        while(curr!=null){
            if(!hs.contains(curr.data)){
                prev.data=curr.data;
                begin=prev;
                prev=prev.next;
                hs.add(curr.data);
            }
            curr=curr.next;
        }
        
        begin.next=null;
        return head;
    }
}