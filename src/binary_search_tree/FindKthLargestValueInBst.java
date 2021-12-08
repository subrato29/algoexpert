package binary_search_tree;

import java.util.ArrayList;

public class FindKthLargestValueInBst {

    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    //Time complexity: O(n);
    //Space complexity: O(n);
    public int findKthLargestValueInBst(BST tree, int k) {
        ArrayList < Integer > list = new ArrayList < Integer > ();
        inorder(tree, list);
        return list.get(list.size() - k);
    }

    public void inorder(BST tree, ArrayList < Integer > list) {
        if (tree != null) {
            inorder(tree.left, list);
            list.add(tree.value);
            inorder(tree.right, list);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}