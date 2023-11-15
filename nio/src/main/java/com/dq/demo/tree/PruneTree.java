package com.dq.demo.tree;

public class PruneTree {

    public TreeNode doPrune(TreeNode root) {
        if (root == null) {
            return null;
        }
        root.left = doPrune(root.left);
        root.right = doPrune(root.right);
        if (root.left == null && root.right == null && root.val == 0) {
            return null;
        }
        return root;
    }
}
