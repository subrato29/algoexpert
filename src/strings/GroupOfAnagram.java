package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupOfAnagram {

	public static List<List<String>> groupAnagrams(List<String> words) {
		Map<String, List<String>> anagrams = new HashMap<String, List<String>> ();
		
		for (String word : words) {
			char[] charArr = word.toCharArray();
			Arrays.sort (charArr);
			String sorted = new String (charArr);
			
			if (anagrams.containsKey (sorted)) {
				anagrams.get(sorted).add (word);
			} else {
				anagrams.put (sorted, new ArrayList<String>(Arrays.asList(word)));
			}
		}
		return new ArrayList<>(anagrams.values());
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		System.out.println(groupAnagrams (Arrays.asList(arr)));
	}

}
