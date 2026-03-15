/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        Stack<Integer> st=new Stack<>();
        Node curr=head;
        while(curr!=null){
            st.push(curr.data);
            curr=curr.next;
        }
        curr=head;
        while(curr !=null && curr.data==st.pop()){
            curr=curr.next;
        }
        return curr==null;
    }
}