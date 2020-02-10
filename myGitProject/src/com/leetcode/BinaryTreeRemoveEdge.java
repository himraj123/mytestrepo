package com.leetcode;


import java.sql.SQLOutput;
import java.util.*;

public class BinaryTreeRemoveEdge {
    static class TreeNode {
        int data;
        TreeNode left, right;
        TreeNode(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static TreeNode removeEdgeBT(TreeNode root) {
        return removeEdgeBT(root, new HashSet<>());
    }

    private static TreeNode removeEdgeBT(TreeNode node, Set<Integer> seen) {
        if (node == null || !seen.add(node.data)) {
            System.out.println(Arrays.toString(seen.toArray()));
            /*for(int i = 0; i < seen.size(); i++) {
                System.out.print(seen.toArray()[i]);
            }*/
            return null;
        }
        node.left = removeEdgeBT(node.left, seen);
        node.right = removeEdgeBT(node.right, seen);
        return node;
    }

    private static void preorderTraversal(TreeNode root){
        if(root!=null){
            System.out.print(root.data+" -> ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public static void main(String args[])
    {

        /* Constructed binary tree is
                  1
                /   \
              2     3
            /  \  /
          4     5
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = root.left.right;


        //preorderTraversal(root);

        // Populates nextRight pointer in all nodes
        //connect(root);
        removeEdgeBT(root);

        System.out.println("");

        preorderTraversal(root);

    }
}

