package array;

import java.util.HashSet;

public class FirstDuplicateValue {

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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
