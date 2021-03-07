//timecomplixity: O(nlogn)
//spacecomplexity: O(1)

package array;

import java.util.Arrays;

public class NonConstructibleChange {
	
	public static int nonConstructibleChange(int[] coins) {
		Arrays.sort(coins);
		int change = 0;
	    for (int i = 0; i < coins.length; i++) {
				if (coins[i] > change + 1) {
					return change + 1;
				} else {
					change += coins[i];
				}
			}
	    return change + 1;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 0};
		System.out.println(nonConstructibleChange(array));
	}

}
