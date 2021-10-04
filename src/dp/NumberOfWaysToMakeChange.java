//Number Of Ways To Make Change

package dp;

public class NumberOfWaysToMakeChange {

	public static int numberOfWaysToMakeChange(int n, int[] denoms) {
    // Write your code here.
		int[] ways = new int[n + 1];
		ways[0] = 1;
		for (int denom : denoms) {
			for (int amount = 1; amount < n + 1; amount++) {
				if (denom <= amount) {
					ways[amount] += ways[amount - denom];
				}
			}
		}
		return ways[n];
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
