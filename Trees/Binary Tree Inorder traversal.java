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
    // Method to perform in-order traversal of a binary tree
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>(); // Initialize the result list
        inorderTraversalHelper(root, result); // Helper method to fill the result list
        return result; // Return the result list
    }

    // Helper method to perform in-order traversal
    private void inorderTraversalHelper(TreeNode node, List<Integer> result) {
        if (node == null) { // If the node is null, return immediately
            return;
        }

        inorderTraversalHelper(node.left, result); // Traverse the left subtree
        result.add(node.val); // Visit the current node
        inorderTraversalHelper(node.right, result); // Traverse the right subtree
    }
}
