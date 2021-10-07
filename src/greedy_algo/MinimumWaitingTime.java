package greedy_algo;

import java.util.Arrays;

public class MinimumWaitingTime {

	//Time complexity: O(nlongn)
	//Space complexity: O(1)
    public int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries);
        int totalWaitingTime = 0;
        for (int i = 0; i < queries.length; i++) {
            int duration = queries[i];
            int queriesLeft = (queries.length - (i + 1));
            totalWaitingTime += duration * queriesLeft;
        }
        return totalWaitingTime;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}