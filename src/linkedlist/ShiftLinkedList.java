//Time complexity: O(n)
//Space complexity: O(1)

package linkedlist;

public class ShiftLinkedList {

	class LinkedList {
		int value;
		LinkedList next = null;
		
		LinkedList(int value) {
			this.value = value;
		}
	}
	
	public LinkedList shiftLinkedList (LinkedList head, int k) {
		if (head == null) {
            return head;
        }
		int listLength = 1;
		LinkedList listTail = head;
		while (listTail.next != null) {
			listTail = listTail.next;
			listLength++;
		}
		
		int offset = Math.abs(k) % listLength;
		if (offset == 0) {
			return head;
		}
		int newTailPosition = 0;
		if (k > 0) {
			newTailPosition = listLength - offset;
		} else {
			newTailPosition = offset;
		}
		
		LinkedList newTail = head;
		for (int i = 1; i < newTailPosition; i++) {
			newTail = newTail.next;
		}
		
		LinkedList newHead = newTail.next;
		newTail.next = null;
		listTail.next = head;
		
		return newHead;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
