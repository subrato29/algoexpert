package linkedlist;

public class MergeSortedLinkedList {

	class LinkedList {
		int value;
		LinkedList next;
		
		public LinkedList(int value) {
			this.value = value;
		}
	}
	
	public static LinkedList mergeSortedLinkedList (LinkedList head1, 
			LinkedList head2) {
				
		LinkedList p1 = head1;
		LinkedList p1_prev = null;
		LinkedList p2 = head2;
		while (p1 != null && p2 != null) {
			if (p1.value < p2.value) {
				p1_prev = p1;
				p1 = p1.next;
			} else {
				if (p1_prev != null) {
					p1_prev.next = p2;
				}
				p1_prev = p2;
				p2 = p2.next;
				p1_prev.next = p1;
			}
		}
		if (p1 == null) {
			p1_prev.next = p2;
		}
		return head1.value < head2.value ? head1 : head2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
