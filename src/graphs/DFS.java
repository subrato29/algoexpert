package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DFS {
	  // Do not edit the class below except
	  // for the depthFirstSearch method.
	  // Feel free to add new properties
	  // and methods to the class.
	static class Node {
	    String name;
	    List<Node> children = new ArrayList<Node>();

	    public Node(String name) {
	      this.name = name;
	    }
			
		public Node addChild(String name) {
	      Node child = new Node(name);
	      children.add(child);
	      return this;
	    }
			
	    public List<String> depthFirstSearch(List<String> list) {
				list.add (this.name);
				for (int i = 0; i < children.size(); i++) {
					children.get(i).depthFirstSearch(list);
				}
	      return list;
	    }
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 1, 3, 4, 6, 7, 8, 9}; 
		List<Integer> list = new ArrayList<>(Arrays.asList(a));
	}

}
