package com.dq.demo.tree;

import java.util.LinkedList;
import java.util.Queue;

public class SubTree {
    public static boolean checkSubTree(TreeNode t1, TreeNode t2) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(t1);
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            if (checkSame(poll, t2)) {
                return true;
            }
            if (poll == null) {
                continue;
            }
            queue.offer(poll.left);
            queue.offer(poll.right);
        }
        return false;
    }

    public static boolean checkSame(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        if (t1.val != t2.val) {
            return false;
        }
        return checkSame(t1.left, t2.left) && checkSame(t1.right, t2.right);
    }
}
