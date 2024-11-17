import java.util.* ;
import java.io.*; 
/*************************************************************

	Following is the TreeNode class structure

	class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int val)
		{
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

 *************************************************************/

public class Solution
{
	public static TreeNode lca(TreeNode root, int n1, int n2){
		if(root == null || root.val == n1 || root.val == n2){
			return root;
		}
		TreeNode left = lca(root.left,n1,n2);
		TreeNode right = lca(root.right, n1, n2);
		if(left != null && right != null){
			return root;
		}
		return left!=null ? left : right;
	}

	public static int lcaDist(TreeNode root, int n){
		if(root == null){
			return -1;
		}
		if(root.val == n){
			return 0;
		}
		int leftDist = lcaDist(root.left, n);
		int rightDist = lcaDist(root.right, n);

		if(leftDist == -1 && rightDist == -1){
			return -1;
		} else if(leftDist == -1){
			return rightDist + 1;
		} else {
			return leftDist + 1;
		}
	}

	public static int findDistanceBetweenNodes(TreeNode root, int node1, int node2)
	{
		TreeNode lca = lca(root, node1, node2);
		int dist1 = lcaDist(lca, node1);
		int dist2 = lcaDist(lca, node2);
		if(dist1 == -1 && dist2 == -1){
			return -1;
		}
		return dist1 + dist2;
	}
}
