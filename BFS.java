// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        // base
        this.res = new ArrayList<>();
        if (root == null)
            return res;

        // logic
        dfs(root, 0);
        return res;
    }

    private void dfs(TreeNode root, int level) {
        // base
        if (root == null)
            return;

        // logic

        if (level == res.size()) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);

        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }

}