/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
    
       //create the resultant matrix
       List<List<Integer>> result = new ArrayList<>();
       //create the queue to traverse the tree
       Queue<TreeNode> queue = new LinkedList<>();
       if(root == null) return result;

       //add the root to the queue
       queue.add(root);

       //level order
       //till the queue is not empty
       while(!queue.isEmpty()){
         //levelSize = size of the queue
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0;i<levelSize;i++){
                //till the levelSize add the node to the level list
                TreeNode node = queue.poll();
                level.add(node.val);
                //add the left child to queue
                if(node.left != null) queue.add(node.left);
                 //add the right child to the queue
                if(node.right != null) queue.add(node.right);
            }
            result.add(level);
       }
       return result;

    }
}
