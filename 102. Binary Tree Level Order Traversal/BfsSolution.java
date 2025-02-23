// Time : 0(n)
// space : 0(n)

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
class BfsSolution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        result.add(new ArrayList<>(Arrays.asList(root.val)));
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = queue.poll();
                if (curr.left != null) {
                    temp.add(curr.left.val);
                    queue.offer(curr.left);
                }

                if (curr.right != null) {
                    temp.add(curr.right.val);
                    queue.offer(curr.right);
                }
            }
            if (!temp.isEmpty()) {
                result.add(temp);
            }
        }
        return result;
    }
}
