package linkedlist;

public class DoublyLinkedListConsructionAndManipulation {

	public static class Node {
		public int value;
		public Node prev;
		public Node next;
		
		public Node(int value) {
			this.value = value;
			this.next = null;
			this.prev = null;
		}
	}
	
	public static class DoublyLinkedList {
		public Node head;
		public Node tail;
		
		public boolean containsNodeWithValue(int value) {
		    Node node = head;
		    while (node != null && node.value != value) {
		    	node = node.next;
		    }
		    return node != null;
		}
		
		// time complexity: O(1) && space complexity: O(1);
		public void remove(Node node) {
	      if (node == head) {
	    	  head = head.next;
	      }
	      if (node == tail) {
	    	  tail = tail.prev;
	      }
	      removeNodeBindings(node);
	    }
		
		public void removeNodeBindings(Node node) {
			if (node.prev != null) {
				node.prev.next = node.next;
			}
			if (node.next != null) {
				node.next.prev = node.prev;
			}
			node.prev = null;
			node.next = null;
		}
		
		// time complexity: O(n) && space complexity: O(1);
		public void removeNodesWithValue(int value) {
	      Node node = head;
	      while (node != null) {
	    	  Node nodeToRemove = node;
	    	  node = node.next;
	    	  if(nodeToRemove.value == value) {
	    		  remove(nodeToRemove);
	    	  }
	      }
	    }
		
		// time complexity: O(1) && space complexity: O(1);
		public void insertBefore(Node node, Node nodeToInsert) {
	      if (nodeToInsert == head && nodeToInsert == tail) {
	    	  return;
	      }
	      remove(nodeToInsert);
	      nodeToInsert.prev = node.prev;
	      nodeToInsert.next = node;
	      if (node.prev == null) {
	    	  head = nodeToInsert;
	      } else {
	    	  node.prev.next = nodeToInsert;
	      }
	      node.prev = nodeToInsert;
	    }
		
		// time complexity: O(1) && space complexity: O(1);
		public void insertAfter(Node node, Node nodeToInsert) {
	      if (nodeToInsert == head && nodeToInsert == tail) {
	    	  return;
	      }
	      remove(nodeToInsert);
	      nodeToInsert.prev = node;
	      nodeToInsert.next = node.next;
	      if (node.next == null) {
	    	  tail = nodeToInsert;
	      } else {
	    	  node.next.prev = nodeToInsert;
	      }
	      node.next = nodeToInsert;
	    }
		
		// time complexity: O(1) && space complexity: O(1);
		public void setHead(Node node) {
	      if (head == null) {
	    	  head = node;
	    	  tail = node;
	    	  return;
	      }
	      insertBefore(head, node);
	    }
		
		// time complexity: O(1) && space complexity: O(1);
		public void setTail(Node node) {
	      if (tail == null) {
	    	  setHead(node);
	    	  return;
	      }
	      insertAfter(tail, node);
	    }
		
		// time complexity: O(p) && space complexity: O(1);
		public void insertAtPosition(int position, Node nodeToInsert) {
	      if (position == 1) {
	    	  setHead(nodeToInsert);
	    	  return;
	      }
	      Node node = head;
	      int currentPosition = 1;
	      while (node != null && currentPosition++ != position) {
	    	  node = node.next;
	      }
	      if (node != null) {
	    	  insertBefore(node, nodeToInsert);
	      } else {
	    	  setTail(nodeToInsert);
	      }
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
