class kQueues {
    ArrayList<Integer>[] Q;
    int n;
    int currsize;
    kQueues(int n, int k) {
        // Initialize your data members
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] temp = new ArrayList[k];
        Q = temp;
        
        this.n = n;
        currsize = 0; // currently filled with
        for(int i=0; i<k; i++)
            Q[i] = new ArrayList<>();
    }

    void enqueue(int x, int i) {
        // enqueue element x into queue number i
        if(currsize==n) return; // already full
        
        Q[i].add(x);
        currsize++; // update size
    }

    int dequeue(int i) {
        // dequeue element from queue number i
        if(Q[i].isEmpty()) return -1; // q is empty
        
        currsize--;
        return Q[i].remove(0);
    }

    boolean isEmpty(int i) {
        // check if queue i is empty
        return Q[i].size()==0;
    }

    boolean isFull() {
        // check if array is full
        return n==currsize;
    }
}
