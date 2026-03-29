
/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}*/

class Solution {
    public int[] displayList(Node head) {
        // code here
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        
        int[] result = new int[count];
        
        temp = head;
        int index = 0;
        while (temp != null) {
            result[index++] = temp.data;
            temp = temp.next;
        }
        
        return result;
    }
}
