//Time complexity: O(n)
//Space complexity: O(1);

package linkedlist;

public class ReverseLinkedList {
	class LinkedList {
		int value;
		LinkedList next = null;
		
		public LinkedList(int value) {
			this.value = value;
		}
	}
	
	public LinkedList reverseLinkedList (LinkedList head) {
		LinkedList currentNode = head;
		LinkedList prevNode = null;
		
		while (currentNode != null) {
			LinkedList nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}
		return prevNode;
	}
}
