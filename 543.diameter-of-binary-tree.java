/*
 * @lc app=leetcode id=543 lang=java
 *
 * [543] Diameter of Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        return helper(root).maxD;
    }

    public diameter helper(TreeNode root) {
        if (root == null) {
            diameter bc = new diameter();
            bc.lh = 0;
            bc.rh = 0;
            bc.maxD = 0;
            return bc;
        }
        diameter l = helper(root.left);
        diameter r = helper(root.right);

        diameter res = new diameter();
        res.lh = Math.max(l.lh, l.rh);
        res.rh = Math.max(r.lh, r.rh);
        res.maxD = Math.max(Math.max(l.maxD, r.maxD), res.lh + res.rh);

        res.lh += 1;
        res.rh += 1;
        return res;

    }

    private class diameter {
        int lh;
        int rh;
        int maxD;
    }

}
// @lc code=end
