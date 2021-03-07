package array;

import java.util.Arrays;

public class SmallestDifference {
	
	public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
		Arrays.sort (arrayOne);
		Arrays.sort (arrayTwo);
		int indexOne = 0;
		int indexTwo = 0;
		int smallest = Integer.MAX_VALUE;
		int current = Integer.MAX_VALUE;
		int[] smallestPair = new int[2];
		while (indexOne < arrayOne.length && indexTwo < arrayTwo.length) {
			int firstNum = arrayOne[indexOne];
			int secondNum = arrayTwo[indexTwo];
			if (firstNum < secondNum) {
				current = secondNum - firstNum;
				indexOne++;
			} else if (secondNum < firstNum) {
				current = firstNum - secondNum;
				indexTwo++;
			} else {
				return new int[] {firstNum, secondNum};
			}
			if (smallest > current) {
				smallest = current;
				smallestPair = new int [] {firstNum, secondNum};
			}	
		}
		return smallestPair;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {-1, 5, 10, 20, 28, 3};
		int[] array2 = {26, 134, 135, 15, 17};
		System.out.println(Arrays.toString(smallestDifference (array1, array2)));
	}

}
