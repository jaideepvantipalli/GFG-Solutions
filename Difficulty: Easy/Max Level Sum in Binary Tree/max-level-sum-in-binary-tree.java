/*Complete the finction below
Node is as follows
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/
class Solution {
    public int maxLevelSum(Node root) {
        // add code here.
        if (root == null) {
            return 0;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int maxLevelSum = Integer.MIN_VALUE;

        while (!queue.isEmpty()) {
            int levelSum = 0;
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                Node node = queue.remove();
                levelSum += node.data;

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            maxLevelSum = Math.max(maxLevelSum, levelSum);
        }

        return maxLevelSum;
    }
}