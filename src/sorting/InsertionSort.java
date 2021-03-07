//time complexity: O(n2)
//space complexity: O(1)

package sorting;

public class InsertionSort {

	public static int[] insertionSort(int[] array) {
		if (array.length == 0) {
			return new int[] {};
		}
		for (int i = 0; i < array.length; i++) {
			int currentIndex = i;
			while (currentIndex > 0 
					&& array[currentIndex] < array[currentIndex - 1]) {
				swap(currentIndex, currentIndex - 1, array);
				currentIndex -= 1;
			}
		}
		return array;
	}
	
	public static void swap(int currentIndex, int prevIndex, int[] array) {
		int temp = array[prevIndex];
		array[prevIndex] = array[currentIndex];
		array[currentIndex] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
