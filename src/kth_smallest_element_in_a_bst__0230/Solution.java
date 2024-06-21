package kth_smallest_element_in_a_bst__0230;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(4);
        System.out.println(new Solution().kthSmallest(root, 1));
    }

    List<Integer> inOrderTraversal = new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        return inOrderTraversal.get(k - 1);
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        inOrderTraversal.add(root.val);
        inorder(root.right);
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
