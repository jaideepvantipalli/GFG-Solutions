class SpecialStack {
    Stack<Integer> st1;
    Stack<Integer> st2;
    public SpecialStack() {
        // Define Stack
        st1=new Stack<>();
        st2=new Stack<>();
    }

    public void push(int data) {
        // Add an element to the top of Stack
        if(st1.isEmpty()){
                st1.push(data);
                st2.push(data);
            }else{
                st1.push(data);
                if(st2.peek()>data) st2.push(data);
                else st2.push(st2.peek());
            }
    }

    public void pop() {
        // Remove the top element from the Stack
        if(!st1.isEmpty()){
                st1.pop();
                st2.pop();
            }
    }

    public int peek() {
        // Returns top element of the Stack
        if(!st1.isEmpty()) return st1.peek();
        return -1;
    }

    boolean isEmpty() {
        // Check if the stack is empty
        return st1.isEmpty();
    }

    public int getMin() {
        // Finds minimum element of Stack
        if(!st2.isEmpty()) return st2.peek();
        return -1;
    }
}