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
        Stack<Node> st=new Stack<>();
        Node temp=head;
        while(temp!=null){
            st.push(temp);
            temp=temp.next;
        }
        if(!st.isEmpty()){
            head=st.pop();
            temp=head;
            while(!st.isEmpty()){
                temp.next=st.pop();
                temp=temp.next;
            }
            temp.next=null;
        }
        return head;
    }
}