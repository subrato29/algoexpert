package greedy_algo;

import java.util.Arrays;

public class TandemBicycle {
	
	//Time complexity: O(nlogn)
	//Space complexity: O(1)
    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);

        int lengthOfArray = redShirtSpeeds.length;

        int total = 0;
        if (fastest) {
            for (int i = 0; i < lengthOfArray; i++) {
                total += Math.max(redShirtSpeeds[i], blueShirtSpeeds[lengthOfArray - i - 1]);
            }
        } else {
            for (int i = lengthOfArray - 1; i >= 0; i--) {
                total += Math.max(redShirtSpeeds[i], blueShirtSpeeds[i]);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}