package maximum_depth_of_binary_tree__0104;

class Solution {
    private int height = 0;

    public int maxDepth(TreeNode root) {
        solve(root, 1);
        return height;
    }

    private void solve(TreeNode node, int currentHeight) {
        if (node == null) {
            return;
        } else if (node.left == null && node.right == null) {
            height = Math.max(height, currentHeight);
        }
        solve(node.left, currentHeight + 1);
        solve(node.right, currentHeight + 1);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
