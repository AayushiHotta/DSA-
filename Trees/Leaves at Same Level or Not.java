// Helper function to check if a node is a leaf
    private static boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }
    
    // Main function to determine if all leaf nodes are at the same level
    public static boolean areAllLeavesAtSameLevel(Node root) {
        if (root == null) return true; // An empty tree is considered to have all leaves at the same level
        
        ArrayList<Integer> leafDepths = new ArrayList<>();
        checkLeaves(root, 0, leafDepths);

        // Check if all depths are the same
        for (int i = 1; i < leafDepths.size(); i++) {
            if (!leafDepths.get(i).equals(leafDepths.get(0))) {
                return false;
            }
        }
        return true;
    }
    
    // Helper function to find all leaf nodes and their depths
    private static void checkLeaves(Node node, int depth, ArrayList<Integer> leafDepths) {
        if (node == null) return;

        // If it's a leaf, add its depth to the list
        if (isLeaf(node)) {
            leafDepths.add(depth);
            return;
        }

        // Recursively check left and right subtrees
        checkLeaves(node.left, depth + 1, leafDepths);
        checkLeaves(node.right, depth + 1, leafDepths);
    }
