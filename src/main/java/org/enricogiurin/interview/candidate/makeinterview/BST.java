package org.enricogiurin.interview.candidate.makeinterview;


/**

 In computer science, a binary search tree (BST), also called an ordered or sorted binary tree,
 is a rooted binary tree data structure with the key of each internal node being greater
 than all the keys in the respective node's left subtree and less than the ones in its right subtree.

 A valid BST is defined as follows:

 The left subtree of a node contains only nodes with keys less than the node's key.
 The right subtree of a node contains only nodes with keys greater than the node's key.
 Both the left and right subtrees must also be binary search trees.

 Defines a function which return true if the element is present in the BST,
 false otherwise.



            20
    10                  30
 5      15      21              40


 */
public class BST {

    public boolean bst(TreeNode root, int val){
        return false;
    }
}


class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }
}

/*
public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        if(val<root.val){
            return searchBST(root.left, val);
        }else{
            return searchBST(root.right, val);
        }
    }
 */