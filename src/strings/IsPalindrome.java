package strings;

public class IsPalindrome {

	public static boolean isPalindrome(String str) {
		String reverseString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseString += str.charAt(i);
		}
		return str.equals(reverseString);
	}
	
	//better approach;
//	time: o(n)
//	space: o(1)
	public static boolean isPalindrome1(String str) {
	    int left = 0;
			int right = str.length() - 1;
			while (left < right) {
				if (str.charAt(left) != str.charAt(right)) {
					return false;
				}
				left++;
				right--;
			}
			return true;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome ("abcba"));
	}

}
