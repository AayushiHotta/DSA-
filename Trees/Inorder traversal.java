public class BinaryTree{
  public static void Inorder(Node root){
    if(root == null){
      return;
    }
    inorder(root.left);
    System.out.println(root.data);
    inorder(root.right);
  }
}
