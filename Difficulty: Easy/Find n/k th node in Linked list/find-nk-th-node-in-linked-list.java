/*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public static int fractional_node(Node head, int k) {
        // Your code here
        int n=0;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            n++;
        }
        int frac=n/k;
        temp=head;
        while(frac-->0){
            temp=temp.next;
        }
        return temp.data;
    }
}