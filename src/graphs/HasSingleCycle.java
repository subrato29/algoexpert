package graphs;

public class HasSingleCycle {

	//Time complexity: O(n)
	//Space complexity: O(1)
	
    public static boolean hasSingleCycle(int[] array) {
        int currentIndex = 0;
        int elementVisuted = 0;
        while (elementVisuted < array.length) {
            if (elementVisuted > 0 && currentIndex == 0) {
                return false;
            }
            elementVisuted++;
            currentIndex = getNextIndex(currentIndex, array);
        }
        return currentIndex == 0;
    }

    public static int getNextIndex(int currentIndex, int[] array) {
        int jump = array[currentIndex];
        int nextIndex = (currentIndex + jump) % array.length;
        return nextIndex >= 0 ? nextIndex : nextIndex + array.length;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}