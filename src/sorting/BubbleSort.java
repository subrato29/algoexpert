//Time complexity: O(n2)
//Space complexity: O(1)

package sorting;

public class BubbleSort {
	
	public static int[] bubbleSort(int[] array) {
		if (array.length == 0) {
			return new int [] {};
		}
		boolean isSorted = false;
		int counter = 0;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < array.length - 1 - counter; i++) {
				if (array[i] > array[i + 1]) {
					swap (i, i + 1, array);
					isSorted = false;
				}
			}
			counter ++;
		}
		return array;
	}
		
	public static void swap (int i, int j, int[] array) {
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
