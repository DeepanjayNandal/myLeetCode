
import com.sun.source.tree.Tree;

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
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        int currentDiameter = calculateHeight(root.left) + calculateHeight(root.right);
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        return Math.max(currentDiameter, Math.max(leftDiameter, rightDiameter));
    }

    public int calculateHeight(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(calculateHeight(root.left), calculateHeight(root.right));
    }
}
