public class BinaryTree{
  //find the subroot in the main tree
  public static boolean isSubtree(Node root, Node subRoot){
    if(root == null){
      return false;
    }

    if(root.data == subroot.data){
      if(isIdentical(root,subroot)){
        return true;
    }

    return isSubtree(root.left, subtree) || isSubtree(root.right, subtree);
  }
  //check if the subtree and the node subtree is identical 
  /* Conditions for non-identical:
   1. node.data != subroot.data
   2. node = null || subroot = null
   3. leftSubtree -> non identical
   4. rightSubtree ->non-identical*/

    public static boolean isIdentical(Node root, Node subroot){
      if(root == null && subtree == null){
        return true;
      } else if(node == null || subroot == null || root.data != subroot.data){
        return false;
      }
      if(!isIdentical(root.left, subroot.left)){
        return false;
      }
      if(!isIdentical(root.right, subroot.right)){
        return false;
      }
      return true;
    }

      
}
