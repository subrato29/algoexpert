package strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public int firstNonRepeatingCharacter(String string) {
	    Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < string.length(); i++) {
			char current = string.charAt(i);
			map.put (current, map.getOrDefault(current, 0) + 1);
		}
		for (int i = 0; i < string.length(); i++) {
			char current = string.charAt(i);
			if (map.get(current) == 1) {
				return i;
			}
		}
		return -1;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
