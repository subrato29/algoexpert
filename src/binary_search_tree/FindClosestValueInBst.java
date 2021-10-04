//Average
//Time: O(log(n)) && Space: O(log(n))
//
//Worst
//Time: O(n) && Space: O(n)

package binary_search_tree;

public class FindClosestValueInBst {

	public static int findClosestValueInBst(BST tree, int target) {
			return helper(tree, target, tree.value);
	  }
		
		public static int helper(BST tree, int target, int closest) {
			BST currNode = tree;
			while (currNode != null) {
				if (Math.abs(target - closest) > Math.abs(target - currNode.value)) {
					closest = currNode.value;
				}
				if(target < currNode.value) {
					currNode = currNode.left;
				} else if (target > currNode.value) {
					currNode = currNode.right;
				} else {
					break;
				}
			}
			return closest;
		}

	  static class BST {
	    public int value;
	    public BST left;
	    public BST right;

	    public BST(int value) {
	      this.value = value;
	    }
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
