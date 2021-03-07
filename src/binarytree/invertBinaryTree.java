package binarytree;

public class invertBinaryTree {

	 public static void invertBinaryTree(BinaryTree tree) {
	    // Write your code here.
			if (tree == null) {
				return;
			}
			swapLeftRight(tree);
			invertBinaryTree (tree.left);
			invertBinaryTree (tree.right);
	  }
		
		public static void swapLeftRight (BinaryTree tree) {
			BinaryTree left = tree.left;
			tree.left = tree.right;
			tree.right = left;
		}
		
	   public static class BinaryTree {
			public int value;
			public BinaryTree left;
			public BinaryTree right;
			
			public BinaryTree (int value) {
				this.value = value;
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
