class Solution {
    long MOD = 1000000007L;
    long ans = 0;

    private long dfs(TreeNode node) {
        if (node == null) return 0;

        node.val += dfs(node.left) + dfs(node.right);
        return node.val;
    }

    public int maxProduct(TreeNode root) {
        long total = dfs(root);

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node == null) continue;

            long cur = (total - node.val) * node.val;
            ans = Math.max(ans, cur);

            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }

        return (int)(ans % MOD);
    }
}
        //current SubTree (subarray) ka sum he 
        //total sum rkh lo store krke or remaining ke liye 
        //total sum Tree(array) ka minus krdo 
        //ek subtree ka sum kese nikalte he
        //root(val) + root->left + root->right  ==subTreeSum
        //inorder = left + root + right
        //use dfs to find all the sum of nodes of tree
        //again we will use dfs to find the sum of splitted part

