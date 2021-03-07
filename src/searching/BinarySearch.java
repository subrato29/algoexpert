// time-complexity O(log(n)), --- space-complexity O(1)

package searching;

public class BinarySearch {
	
	public static int binarySearch_1(int[] array, int target) {
	    return helper (array, target, 0, array.length - 1);
	}
		
	public static int helper(int[] array, int target, int left, int right) {
		while (left <= right) {
			int middle = (left + right) / 2;
			int potentialMatch = array[middle];
			if (potentialMatch > target) {
				right = middle - 1;
			} else if (potentialMatch < target) {
				left = middle + 1;
			} else if (potentialMatch == target){
				return middle;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
