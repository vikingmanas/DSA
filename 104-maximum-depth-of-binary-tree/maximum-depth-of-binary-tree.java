class Solution {
    int max = 0;

    public int maxDepth(TreeNode root) {
        depth(root, 1);
        return max;
    }

    public void depth(TreeNode root, int level) {
        if (root == null)
            return;

        if (max < level) {
            max = level;
        }

        depth(root.left, level + 1);
        depth(root.right, level + 1);
    }
}
