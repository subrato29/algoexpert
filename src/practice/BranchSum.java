package practice;

import java.util.ArrayList;
import java.util.List;

public class BranchSum {

	class BinaryTree {
		int value;
		BinaryTree left;
		BinaryTree right;
		
		BinaryTree (int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}
	
	public static List<Integer> branchSums(BinaryTree node) {
		List<Integer> sums = new ArrayList<Integer>();
		calculateSum(node, 0, sums);
		return sums;
	}
	
	public static void calculateSum(BinaryTree node, int runningSum, List<Integer> sums) {
		if (node == null) {
			return;
		}
		int newRunningSum = runningSum + node.value;
		if (node.left == null && node.right == null) {
			sums.add(newRunningSum);
			return;
		}
		calculateSum(node.left, newRunningSum, sums);
		calculateSum(node.right, newRunningSum, sums);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
