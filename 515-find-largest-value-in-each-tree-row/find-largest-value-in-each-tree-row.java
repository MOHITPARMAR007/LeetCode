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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res; // If the tree is empty, return an empty list.

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); // Start with the root node.

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Number of nodes in the current level.
            int maxVal = Integer.MIN_VALUE; // Track the largest value in this level.

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll(); // Get the next node in the queue.
                maxVal = Math.max(maxVal, node.val); // Update the max value for the level.

                // Add the child nodes to the queue for the next level.
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            res.add(maxVal); // Add the largest value of this level to the result list.
        }

        return res; // Return the list of largest values at each level.
    }
}
