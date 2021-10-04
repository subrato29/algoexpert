//time: O(N) where N = no of elements in original array + elements in subarray or 'special' array
//space: O(d) where d is greatest depth of 'special' array;

package recursion;

import java.util.ArrayList;
//time: O(N)
//space: O(1)
import java.util.List;

public class productSum {

	public static int productSum(List<Object> array) {
	    return helper(array, 1);
	  }
		
		public static int helper(List<Object> array, int multiplier){
			int sum = 0;
			for (Object el : array) {
				if (el instanceof ArrayList) {
					@SuppressWarnings("unchecked")
					ArrayList<Object> ls = (ArrayList<Object>) el;
					sum = sum + helper(ls, multiplier + 1);
				} else {
					sum = sum + (int) el;
				}
			}
			return sum * multiplier;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
