public class BinaryTree{
  //Approach 1
  public static int diameter1(Node root){
    if(root == null){
      return 0;
    }
    int leftDiam = diameter1(root.left);
    int rightDiam = diameter1(root.right);
    int leftHeight = height(root.left);
    int rightHeight = height(root.right);
    int self = leftHeight + rightHeight + 1;

    return Math.max(leftDiam, rightDiam, self);
  }

  static class Info{
    int diam;
    int ht;

    public Info(int diam, int ht){
      this.diam = diam;
      this.ht = ht;
    }
  }

  public static Info diameter2(Node root){
    if(root == null){
      return new Info(0,0);
    }

    Info leftInfo = diameter2(root.left);
    Info rightInfo = diameter2(root.right);

    int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht + 1);
    int height = Math.max(leftInfo.ht, rightInfo.ht)+1;

    return new Info(diam, height);
  }
}
