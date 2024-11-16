public class BinaryTree{
  public static int countNodes(Node root){
    if(root == null){
      return 0;
    }

    int lcount = countNodes(root.left);
    int rcount = countNodes(root.right);
    int count = lcount+rcount+1;

    return count;
  }
}
