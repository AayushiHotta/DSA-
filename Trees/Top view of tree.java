import java.util.*;

class BinaryTree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class Info {
        Node node;
        int hd; // horizontal distance

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        if (root == null) return;

        // Queue to store tree nodes along with their horizontal distance
        Queue<Info> q = new LinkedList<>();
        // Map to store the first node at each horizontal distance
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;

        // Start with the root node at horizontal distance 0
        q.add(new Info(root, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();

            // If this horizontal distance is being encountered for the first time
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node);
            }

            // Traverse the left subtree
            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1));
                min = Math.min(min, curr.hd - 1);
            }

            // Traverse the right subtree
            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1));
                max = Math.max(max, curr.hd + 1);
            }
        }

        // Print the top view using the map from min to max horizontal distance
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }

    // Main method to test the code
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Top view of the binary tree is:");
        topView(root);
    }
          1
        /    \
      2        3
    /    \    /   \  
  4      5   6      7
}
