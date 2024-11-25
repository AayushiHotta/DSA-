class Tree {
    public ArrayList<Integer> reverseLevelOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        
        Queue<Node> q = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            Node curr = q.remove();
            stack.push(curr);
            
            if(curr.left != null){
                q.add(curr.left);
            }
            
            if(curr.right != null){
                q.add(curr.right);
            }
        }
        
        while(!stack.isEmpty()){
            result.add(stack.pop().data);
        }
        
        return result;
    }
}
