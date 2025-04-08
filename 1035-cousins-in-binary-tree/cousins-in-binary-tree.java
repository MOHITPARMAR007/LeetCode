/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        return (
            level(root, xx, 0) == level(root, yy, 0) &&
            !isSibling(root, xx, yy)
        );
    }

    private TreeNode findNode(TreeNode node, int x) {
        if (node == null) return null;
        if (node.val == x) return node;

        TreeNode left = findNode(node.left, x);
        if (left != null) return left;

        return findNode(node.right, x);
    }

    private int level(TreeNode node, TreeNode target, int lv) {
        if (node == null) return -1;
        if (node == target) return lv;

        int left = level(node.left, target, lv + 1);
        if (left != -1) return left;

        return level(node.right, target, lv + 1);
    }

    private boolean isSibling(TreeNode node, TreeNode x, TreeNode y) {
        if (node == null) return false;

        boolean sibling = (node.left == x && node.right == y) ||
                          (node.left == y && node.right == x);

        return sibling || isSibling(node.left, x, y) || isSibling(node.right, x, y);
    }
}
