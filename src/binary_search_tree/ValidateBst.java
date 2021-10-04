//Time: O(N)
//Space: O(d)
package binary_search_tree;

public class ValidateBst {

	public static boolean validateBst(BST tree) {
	  return helper(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
		
	public static boolean helper(BST tree, int minValue, int maxValue) {
		if (tree.value < minValue || tree.value >= maxValue) {
			return false;
			//tree.value >= maxValue -- for tree.left
			//tree.value < minValue -- for tree.right
		}
		if (tree.left != null && !helper(tree.left, minValue, tree.value)) {
			return false;
		}
		if (tree.right != null && !helper(tree.right, tree.value, maxValue)) {
			return false;
		}
		return true;
	}

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }

}
