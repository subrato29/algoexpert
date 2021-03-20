package practice;

public class NodeDepths {

	class BinaryTree {
		int value;
		BinaryTree left;
		BinaryTree right;
		
		BinaryTree(int value) {
			this.value = value;
			left = null;
			right = null;
		}
	}
	
	public static int nodeDepths(BinaryTree head) {
		return nodeDepthsHelper(head, 0);
	}
	
	public static int nodeDepthsHelper(BinaryTree node, int depth) {
		if (node == null) {
			return 0;
		}
		return depth + nodeDepthsHelper (node.left, depth + 1) + nodeDepthsHelper (node.right, depth + 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
