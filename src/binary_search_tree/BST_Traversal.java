//Time: O(N)
//Space: O(d) / O(N) -> where array is involved to store the value, O(N) is applicable
// where N is no of nodes > d, depth of the tree.
package binary_search_tree;

import java.util.List;

public class BST_Traversal {
	
	/*
	I/P
		  40
	     /  \
	    20   60
	   / \    / \
	  10   30 50 70   

	O/P: 10 20 30 40 50 60 70
	
	extreme left -> parent -> right
	*/
	
	public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
		if (tree != null) {
			inOrderTraverse(tree.left, array);
			array.add(tree.value);
			inOrderTraverse(tree.right, array);
		}
		return array;
  }

	/*
	I/P
		  40
	     /  \
	    20   60
	   / \    / \
	  10   30 50 70   

	O/P: 40 20 10 30 60 50 70 
	parent -> left -> extreme left -> right 
	*/	
  public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
    if (tree != null) {
		array.add(tree.value);
		preOrderTraverse(tree.left, array);
		preOrderTraverse(tree.right, array);
	}
	return array;
  }

  /*
  I/P
  	    40
       /  \
      20   60
     / \    / \
    10   30 50 70   

  O/P: 10 30 20 50 70 60 40
  extreme left -> right -> parent -> extreme left of right side -> right -> parent
  */
  
  public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
	if (tree != null) {
		postOrderTraverse(tree.left, array);
		postOrderTraverse(tree.right, array);
		array.add(tree.value);
	}
	return array;
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
