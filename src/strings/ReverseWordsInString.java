package strings;

import java.util.Stack;

public class ReverseWordsInString {
	
	public static String reverseWordsInString(String string) {
		Stack<String> stack = new Stack<String>();
		int start = 0;
		int i = 0;
		String result = "";
		while (i < string.length()) {
			if (string.charAt(i) == ' ') {
				stack.push(string.substring(start, i));
				start = i + 1;
			}
			i++;
		}
	    stack.push(string.substring(start, i));
		while (stack.size() > 0) {
			result += stack.peek();
			if (stack.size() != 1) {
				result += " "; 
			}
			stack.pop();
		}
		return result;
	 }
	
	public static void main(String[] args) {
		String input = "AlgoExpert is the best!";
		System.out.println(reverseWordsInString(input));
	}

}
