public class BinaryTree{
  public static int sumNodes(Node root){
    if(root == null){
      return 0;
    }
    int leftSum = sumNodes(root.left);
    int rightSum = sumNodes(root.right);
    int nodeSum = leftSum + rightSum + root.data;

    return nodeSum;
  }
}
