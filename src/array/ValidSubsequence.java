//Time complexity: O(n)
//Space complexity: O(1)

package array;

import java.util.List;

public class ValidSubsequence {

	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		int count = 0;
		for (int i = 0; i < array.size(); i++) {
			if (count == sequence.size()) {
				break;
			}
			if (sequence.get(count).equals(array.get(i))) {
				count ++ ;
			}
		}
		return count == sequence.size();
  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
