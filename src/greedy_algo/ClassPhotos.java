
//Time complexity: O(n);
//Space complexity: O(n);
package greedy_algo;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ClassPhotos {

	public boolean classPhotos(
		ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
	    PriorityQueue<Integer> maxHeapRed = new PriorityQueue<Integer>((a, b) -> b - a);
		PriorityQueue<Integer> maxHeapBlue = new PriorityQueue<Integer>((a, b) -> b - a);
		
		maxHeapRed.addAll(redShirtHeights);
		maxHeapBlue.addAll(blueShirtHeights);
		
		String colorInFirstRow = "";
		if (maxHeapRed.peek() < maxHeapBlue.peek()) {
			colorInFirstRow = "BLUE";
		} else {
			colorInFirstRow = "RED";
		}
		while (!maxHeapRed.isEmpty() && !maxHeapBlue.isEmpty()) {
			if (colorInFirstRow == "BLUE" && maxHeapRed.remove() >= maxHeapBlue.remove()) {
				return false;
			} else if (colorInFirstRow == "RED" && maxHeapRed.remove() <= maxHeapBlue.remove()) {
				return false;
			}
		}
	    return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
