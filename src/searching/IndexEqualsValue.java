//timecomplexity: O(logn)
//spacecomplexity: O(1)

package searching;

public class IndexEqualsValue {

	public static int indexEqualsValue(int[] array) {
		return helper(array, 0, array.length - 1);
	}
	
	public static int helper(int[] array, int left, int right) {
		while (left <= right) {
			int midIndex = left + (right - left) / 2;
			int midValue = array[midIndex];
			if (midIndex > midValue) {
				left = midIndex + 1;
			} else if (midIndex == midValue && midIndex == 0) {
				return midIndex;
			} else if (midIndex == midValue && array[midIndex - 1] < midIndex - 1) {
				return midIndex;
			} else if (midIndex == midValue && midIndex == array.length - 1) {
				return midIndex;
			} else if (midIndex == midValue && array[midIndex + 1] > midIndex + 1) {
				return midIndex;
			} else {
				right = midIndex - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
