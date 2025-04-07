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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(root);
        boolean reverse = false;

        while (!deque.isEmpty()) {
            int levelSize = deque.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                if (!reverse) {
                    TreeNode node = deque.pollFirst();
                    level.add(node.val);
                    if (node.left != null) deque.offerLast(node.left);
                    if (node.right != null) deque.offerLast(node.right);
                } else {
                    TreeNode node = deque.pollLast();
                    level.add(node.val);
                    // Add in reverse order when going right to left
                    if (node.right != null) deque.offerFirst(node.right);
                    if (node.left != null) deque.offerFirst(node.left);
                }
            }

            result.add(level);
            reverse = !reverse; // Flip direction for next level
        }

        return result;
    }
}