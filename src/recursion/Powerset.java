package recursion;

import java.util.ArrayList;
import java.util.List;

public class Powerset {

	public static List<List<Integer>> powerset(List<Integer> array) {
	    List<List<Integer>> subsets = new ArrayList<List<Integer>>();
			subsets.add (new ArrayList<>());
			for (int i = 0; i < array.size(); i++) {
				int length = subsets.size();
				for (int j = 0; j < length; j++) {
					List<Integer> currentSubset = new ArrayList<Integer>(subsets.get(j));
					currentSubset.add (array.get(i));
					subsets.add (currentSubset);
				}
			}
	    return subsets;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
