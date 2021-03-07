// time-complexity: O(log(n))
//space-complexity: O(1)

package searching;

public class ShiftedBinarySearch {
	
	public static int shiftedBinarySearch(int[] array, int target) {
	  return helper(array, target, 0, array.length - 1);
	}
		
	public static int helper(int[] array, int target, int left, int right) {
		while (left <= right) {
			int mid = (left + right) / 2;
			int potentialMatch = array[mid];
			int leftNum = array[left];
			int rightNum = array[right];
			if (target == potentialMatch) {
				return mid;
			} else if (leftNum <= potentialMatch) {
				if (target >= leftNum && target < potentialMatch) {
					right = mid - 1; 
				} else {
					left = mid + 1;
				}
			} else {
				if (target >= potentialMatch && target < rightNum) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
