// User function Template for Java

class Solution {
    public ArrayList<Integer> largestValues(Node root) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        if(root == null) return al;
        Queue<Node> q=new LinkedList<>();
        
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                Node node=q.poll();
                max=Math.max(max,node.data);
                if(node.left != null) q.offer(node.left);
                if(node.right !=null) q.offer(node.right);
            }
            al.add(max);
        }
        return al;
    }
}