package array;

import java.util.Arrays;

public class FindThreeLargestNumbers_WithoutSorting {

	public static int[] findThreeLargestNumbers(int[] array) {
		int[] result = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
		for (int i = 0; i < array.length; i++) {
			updateLargest(result, array[i]);
		}
    return result;
  }
	
	public static void updateLargest(int[] result, int num) {
		if (num > result[2]) {
			shiftUpdate(result, num, 2);
		} else if (num > result[1]) {
			shiftUpdate(result, num, 1);
		} else if (num > result[0]) {
			shiftUpdate(result, num, 0);
		}
	}
	
	public static void shiftUpdate(int[] array, int num, int index) {
		for (int i = 0; i <= index; i++) {
			if(i == index) {
				array[i] = num;
			} else {
				array[i] = array[i + 1];
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};
		System.out.println(Arrays.toString(findThreeLargestNumbers(array)));
	}

}
