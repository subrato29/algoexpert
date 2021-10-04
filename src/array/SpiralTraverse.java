//Time complexity: O(n)
//Space complexity: O(n)

package array;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {

	public static List<Integer> spiralTraverse(int[][] array) {
	    if (array.length == 0) {
				return new ArrayList<Integer>();
			}
		List<Integer> result = new ArrayList<Integer>();
		helper (array, 0, array.length - 1, 0, array[0].length - 1, result);
		return result;
	  }
		
	public static void helper (int[][] array,
								int startRow,
								int endRow,
								int startCol,
								int endCol,
								List<Integer> result) {
		if (startRow > endRow || startCol > endCol) {
			return;
		}
		
		for (int col = startCol; col <= endCol; col++) {
			result.add (array[startRow][col]);
		}
		
		for (int row = startRow + 1; row <= endRow; row++) {
			result.add (array[row][endCol]);
		}
		
		for (int col = endCol - 1; col >= startCol; col--) {
			if (startRow == endRow) {
				break;
			}
			result.add (array[endRow][col]);
		}
		
		for (int row = endRow - 1; row > startRow; row--) {
			if (startCol == endCol) {
				break;
			}
			result.add (array[row][startCol]);
		}
		helper(array, startRow + 1, endRow - 1, startCol + 1, endCol - 1, result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
