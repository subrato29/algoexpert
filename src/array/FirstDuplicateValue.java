package array;

import java.util.HashSet;

public class FirstDuplicateValue {

	//time complexity: O(n)
	//Space complexity: O(n)	
	public int firstDuplicateValue(int[] array) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			int value = array[i];
			if (set.contains(value)) {
				return value;
			}
			set.add (value);
		}
		return -1;
	}
	
	//time complexity: O(n)
	//Space complexity: O(1)
	public int firstDuplicateValue1(int[] array) {
	    for (int i = 0; i < array.length; i++) {
				int absValue = Math.abs(array[i]);
				int index = absValue - 1;
				if (array[index] < 0) {
					return absValue;
				}
				array[index] *= -1;
			}
		return -1;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
