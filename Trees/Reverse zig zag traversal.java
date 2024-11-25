public static List<List<Integer>> reverse_zigzag_traversal(Node root){
  List<List<Integer>> result = new ArrayList<>();
  Queue<Node> q = new LinkedList<>();
  boolean leftToRight = true;

  q.add(root);
  while(!q.isEmpty()){
    int levelSize = q.size();
    List<Integer> level = new ArrayList<>();
    for(int i = 0;i<levelSize;i++){
      Node curr = q.remove();
      if(leftToRight){
        level.addLast(curr.val);
      } else {
        level.addFirst(curr.val);
      }

      if(curr.left != null){
        q.add(curr.left);
      }
      if(curr.right != null){
        q.add(curr.right);
      }
    }
    result.addFirst(level);
    leftToRight = !leftToRight;
  }
return result;
}
