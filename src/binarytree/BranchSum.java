//Time complexity: O(n)
//Space complexity: O(n)

package binarytree;

import java.util.ArrayList;
import java.util.List;

public class BranchSum {

	 public static class BinaryTree {
	    int value;
	    BinaryTree left;
	    BinaryTree right;

	    BinaryTree(int value) {
	      this.value = value;
	      this.left = null;
	      this.right = null;
	    }
	  }

	  public static List<Integer> branchSums(BinaryTree root) {
		List<Integer> sums = new ArrayList<>();
		calculateBranchSum(root, 0, sums);
		return sums;
	  }
	
	public static void calculateBranchSum (BinaryTree node, int runningSum, List<Integer> sums) {
		if (node == null) return;
		
		int newRunningSum = runningSum + node.value;
		if (node.left == null && node.right == null) {
			sums.add (newRunningSum);
			return;
		}
		calculateBranchSum (node.left, newRunningSum, sums);
		calculateBranchSum (node.right, newRunningSum, sums);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
