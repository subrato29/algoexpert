//Time complexity: O(n) -- n => number of nodes
//Space complexity: O(d) -- d => depth of the tree

package binarytree;

public class InvertBinaryTree {

    public static void invertBinaryTree(BinaryTree tree) {
        if (tree == null) {
            return;
        }
        swapLeftRight(tree);
        invertBinaryTree(tree.left);
        invertBinaryTree(tree.right);
    }

    public static void swapLeftRight(BinaryTree tree) {
        BinaryTree left = tree.left;
        tree.left = tree.right;
        tree.right = left;
    }

    public static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}