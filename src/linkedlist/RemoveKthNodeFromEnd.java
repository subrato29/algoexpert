/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.

Follow up: Could you do this in one pass?

Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []

Example 3:
Input: head = [1,2], n = 1
Output: [1]
 */

//Time complexity: O(n), where n is the length of the linkedlink
//Space complexity: O(1);

package linkedlist;

public class RemoveKthNodeFromEnd {

	static class LinkedList {
		int value;
		LinkedList next;
		
		public LinkedList(int value) {
			this.value = value;
		}
	}
	
	public static void removeKthNodeFromEnd(LinkedList head, int k) {
		LinkedList first = head;
		LinkedList second = head;
		int counter = 1;
		while (counter <= k) {
			second = second.next;
			counter++;
		}
		if (second == null) {
			head.value = head.next.value;
			head.next = head.next.next;
			return;
		}
		while (second.next != null) {
			second = second.next;
			first = first.next;
		}
		first.next = first.next.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
