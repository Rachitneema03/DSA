class Solution {
    private TreeNode prev = null; // tracks the previously visited node in preorder

    public void flatten(TreeNode root) {
        if (root == null) return;

        TreeNode left = root.left;
        TreeNode right = root.right;

        if (prev != null) {
            prev.left = null;
            prev.right = root;
        }
        prev = root;

        flatten(left);
        flatten(right);
    }
}