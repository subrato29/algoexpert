//timecomplexity: O(row + col)
//spacecomplexity: O(1)
package searching;

public class SearchInSortedMatrix {

	public static int[] searchInSortedMatrix(int[][] matrix, int target) {
		int row = 0;
		int col = matrix[0].length - 1;
		while (row < matrix.length && col >= 0) {
			if (matrix[row][col] > target) {
				col--;
			} else if (matrix[row][col] < target) {
				row++;
			} else {
				return new int[] {row, col};
			}
		}
		return new int[] {-1, -1};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
