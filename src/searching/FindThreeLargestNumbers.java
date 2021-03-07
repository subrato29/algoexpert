//Time complexity: O(n)
//Space complexity: O(1)

package searching;

public class FindThreeLargestNumbers {

	public static int[] findThreeLargestNumbers(int[] array) {
	    int[] threeLargest = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
		for (int i = 0; i < array.length; i++) {
			updateLargest(threeLargest, array[i]);
		}
		return threeLargest;
	 }
	
	//Traversing each element in threeLargest array 
	public static void updateLargest(int[] array, int num) {
		if (num > array[2]) {
			shiftUpdate(array, num, 2);
		} else if (num > array[1]) {
			shiftUpdate(array, num, 1);
		} else if (num > array[0]) {
			shiftUpdate(array, num, 0);
		}
	}
	
	//updating target indexing element by largest and shifting element from right to left
	public static void shiftUpdate(int[] array, int num, int index) {
		for (int i = 0; i <= index; i++) {
			if (i == index) {
				array[i] = num;
			} else {
				array[i] = array[i + 1];
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
