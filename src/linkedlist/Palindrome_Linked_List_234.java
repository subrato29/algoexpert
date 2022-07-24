/**
 * 234. Palindrome Linked List
Easy

9863

600

Add to List

Share
Given the head of a singly linked list, return true if it is a palindrome.

Example 1:
Input: head = [1,2,2,1]
Output: true

Example 2:
Input: head = [1,2]
Output: false
 */
package linkedlist;

public class Palindrome_Linked_List_234 {

	class LinkedList {
		int val;
		LinkedList next;
		
		public LinkedList(int val) {
			this.val = val;
		}
	}
	
    public boolean isPalindrome(LinkedList head) {
        LinkedList fast = head;
        LinkedList slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;
        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public LinkedList reverse(LinkedList head) {
        LinkedList prev = null;
        while (head != null) {
            LinkedList next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}