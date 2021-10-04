//time: O(N)
//space: O(1)
package recursion;

public class NthFibonacci {

	public static int solution (int n) {
		int[] lastTwo = {0, 1};
		int counter = 3;
		while (counter <= n) {
			int nextFib = lastTwo[0] + lastTwo[1];
			lastTwo[0] = lastTwo[1];
			lastTwo[1] = nextFib;
			counter ++;
		}
		return n > 1 ? lastTwo[1] : lastTwo[0];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution (8));
	}

}
