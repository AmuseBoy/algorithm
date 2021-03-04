package com.amuse.algorithm.jz;

import java.util.Arrays;

/**
 * @ClassName JZ4
 * @Description 重建二叉树
 * @Author 刘培振
 * @Date 2021-03-03 14:34
 * @Version 1.0
 */
public class JZ4 {

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0) {
            return null;
        }
        int rootVal = pre[0];
        TreeNode treeNode = new TreeNode(rootVal);
        int rootIndex = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }
        treeNode.left = this.reConstructBinaryTree(Arrays.copyOfRange(pre, 1, rootIndex + 1), Arrays.copyOfRange(in, 0, rootIndex));
        treeNode.right = this.reConstructBinaryTree(Arrays.copyOfRange(pre, rootIndex + 1, pre.length), Arrays.copyOfRange(in, rootIndex + 1, in.length));
        return treeNode;
    }

    public static void main(String[] args) {

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

