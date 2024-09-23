package org.enricogiurin.interview.candidate.makeinterview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BSTTest {

    BST instance;

    @Test
    void bst() {
        TreeNode treeNode = buildTreeNode();
        //complete here

    }



    @BeforeEach
    void setUp() {
        //complete here
    }


    private TreeNode buildTreeNode() {
        //assume that this will create a proper instance of BST
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        return root;
    }


}