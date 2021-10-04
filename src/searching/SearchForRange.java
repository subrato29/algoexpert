//timecomplexity: O(logn)
//spacecomplexity: O(1)

package searching;

public class SearchForRange {

	public static int[] searchForRange(int[] array, int target) {
		int[] finalRange = {-1, -1};
		helper(array, target, 0, array.length - 1, finalRange, true);
		helper(array, target, 0, array.length - 1, finalRange, false);
		return finalRange;
	}
	
	public static void helper(int[] array, int target, int left, int right,
			int[] finalRange, boolean goLeft) {
		while (left <= right) {
			int mid = (left + right) / 2;
			// validating where target != array[mid]
			if (target > array[mid]) {
				left = mid + 1;
			} else if (target < array[mid]) {
				right = mid - 1;
			} else {
				// validating where target == array[mid]
				if (goLeft) {
					if (mid == 0 || array[mid - 1] != target ) {
						finalRange[0] = mid;
						return;
					} else {
						right = mid - 1;
					}
				} else {
					if (mid == array.length - 1 || array[mid + 1] != target) {
						finalRange[1] = mid;
						return;
					} else {
						left = mid + 1;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = {5, 7, 7, 8, 8, 9};
		System.out.println(searchForRange(array, 5));
	}

}
