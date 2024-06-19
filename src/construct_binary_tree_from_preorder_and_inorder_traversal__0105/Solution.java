package construct_binary_tree_from_preorder_and_inorder_traversal__0105;

class Solution {
    private int[] preorder;
    private int[] inorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        return reconstruct(0, 0, inorder.length - 1);
    }

    public TreeNode reconstruct(int preRootIndex, int inLeft, int inRight) {
        if (inLeft > inRight) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preRootIndex]);
        int inRootIndex = inLeft;
        while (inorder[inRootIndex] != root.val && inRootIndex <= inRight) {
            ++inRootIndex;
        }

        root.left = reconstruct(preRootIndex + 1, inLeft, inRootIndex - 1);
        root.right = reconstruct(preRootIndex + (inRootIndex - inLeft + 1), inRootIndex + 1, inRight);
        return root;
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
