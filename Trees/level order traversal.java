public class BinaryTree{
  public static void levelorder(Node root){
    //Use queue for traversal

    Queue<Node> q = new LinkedList<>();

    //add the root of the tree
    q.add(root);
    q.add(null);

    //Add the nodes one by one and print while emptying the queue
    while(!q.isEmpty()){
      //retrieve the current node from the queue
      Node currNode = q.remove();
      //check if the current Node is null
      if(currNode == null){
        System.out.println();
        if(q.isEmpty()){
          break;
        } else {
          q.add(null);
        }
      }else{
        System.out.println(currNode.data+" ");
        if(currNode.left != null){
          q.add(currNode.left);
        }
        if(currNode.right != null){
          q.add(currNode.right);
        }
      }
    }
  }
}
