/*
Node class is as follows:

class Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        int len=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        temp=head;
        len-=n;
        int res=0;
        while(len-- >0){
            temp=temp.next;
        }
        while(temp!=null){
            res+=temp.data;
            temp=temp.next;
        }
        return res;
    }
}