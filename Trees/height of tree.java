public class BinaryTree{
  public static int Height(Node root){
    if(root == null){
      return 0;
    }

    lh = height(root.left);
    rh = height(root.right);
    int height = Math.max(lh,rh)+1;

    return height;
  }
}
