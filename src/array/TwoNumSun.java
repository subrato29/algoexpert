package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoNumSun {
	
	public static int[] twoNumberSum(int[] array, int targetSum) {
		Map<Integer, Integer> map = new HashMap<>();
		int resultant = 0;
		for (int i = 0; i < array.length; i++) {
			resultant = targetSum - array[i];
			if (map.containsKey(resultant)) {
				return new int[] {array[i], resultant};
			} else {
				map.put (array[i], resultant);
			}
		}
	    return new int[0];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8, 5, -2, 7, 6, 3};
		System.out.println(Arrays.toString(twoNumberSum(arr, 4)));
	}

}
