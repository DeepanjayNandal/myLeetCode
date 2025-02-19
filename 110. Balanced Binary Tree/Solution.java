/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int lHeight = calculateheight(root.left);
        int rHeight = calculateheight(root.right);
        if (Math.abs(lHeight - rHeight) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int calculateheight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(calculateheight(root.left), calculateheight(root.right));
    }
}
