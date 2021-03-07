//time complexity: O(n)
//space complexity: O(1);

package linkedlist;

public class FindLoop {

	static class LinkedList{
		int value;
		LinkedList next = null;
		
		public LinkedList(int value) {
			this.value = value;
		}
	}
	
	public static LinkedList findLoop(LinkedList head) {
		LinkedList first = head.next;
		LinkedList second = head.next.next;
		
		while (first != second) {
			first = first.next;
			second = second.next.next;
		}
		
		first = head;
		while (first != second) {
			first = first.next;
			second = second.next;
		}
		return first;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
