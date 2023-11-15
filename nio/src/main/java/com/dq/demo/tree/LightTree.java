package com.dq.demo.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LightTree {


    public TreeNode expandBinaryTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode treeNode = new TreeNode(root.val);
        addNode(root, treeNode);
        return treeNode;
    }


    public static void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.val);
            inOrderTraversal(node.right);
        }
    }

    public static void dfs(TreeNode node) {

    }

    public static void bfs(TreeNode node) {
        if (node == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            if (poll == null) {
                continue;
            }
            System.out.println(poll.val);
            if (node.left != null) {
                queue.offer(poll.left);
            }
            if (node.right != null) {
                queue.offer(poll.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(10);
        root.right.left = new TreeNode(7);

        inOrderTraversal(root);
        System.out.println("=====================");
        TreeNode treeNode = new TreeNode(root.val);
        addNode(root, treeNode);
        System.out.println("=====================");
        inOrderTraversal(treeNode);
        System.out.println("=====================");
        bfs(treeNode);
    }

    public static void addNode(TreeNode node, TreeNode newTreeNode) {
        if (node != null) {
            TreeNode left = null;
            if (node.left != null) {
                TreeNode nNode = new TreeNode(-1);
                newTreeNode.left = nNode;
                left = new TreeNode(node.left.val);
                nNode.left = left;
            }
            addNode(node.left, left);
            TreeNode right = null;
            if (node.right != null) {
                TreeNode nNode = new TreeNode(-1);
                newTreeNode.right = nNode;
                right = new TreeNode(node.right.val);
                nNode.right = right;
            }
            addNode(node.right, right);
        }
    }
}
