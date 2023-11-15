package com.dq.demo.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllThree {

    public static void main(String[] args) {
        FindAllThree findAllThree = new FindAllThree();
        List<TreeNode> treeNodes = findAllThree.generateTrees(2);
        for (TreeNode treeNode : treeNodes) {
            System.out.println(treeNode.val);
        }
    }

    public List<TreeNode> generateTrees(int n) {
        Map<String, List<TreeNode>> map = new HashMap<>();
        List<TreeNode> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                for (int j = 1; j <= n; j++) {
                    String key = i + "_" + j + "_" + i;
                    List<TreeNode> list = new ArrayList<>();
                    list.add(new TreeNode(j));
                    map.put(key, list);
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    String key = i + "_" + j + "_" + i;
                    String lastFloorKey = (i - 1) + "_" + j + "_" + (i - 1);
                    List<TreeNode> lastFloorTreeNodes = map.get(lastFloorKey);
                    for (TreeNode lastFloorTreeNode : lastFloorTreeNodes) {
                        TreeNode treeNode = new TreeNode(i);
                        if (lastFloorTreeNode.val < i) {
                            treeNode.left = lastFloorTreeNode;
                        } else {
                            treeNode.right = lastFloorTreeNode;
                        }
                        if (map.containsKey(key)) {
                            map.get(key).add(treeNode);
                        } else {
                            List<TreeNode> treeNodes = new ArrayList<>();
                            treeNodes.add(treeNode);
                            map.put(key, treeNodes);
                        }
                    }
                }
            }
        }

        for (Map.Entry<String, List<TreeNode>> entry : map.entrySet()) {
            if (entry.getKey().startsWith(String.valueOf(n))) {
                result.addAll(entry.getValue());
            }
        }
        return result;
    }
}
