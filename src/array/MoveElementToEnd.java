package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveElementToEnd {
	
	public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
		List<Integer> list = new ArrayList<>();
		int count = 0;
		
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) == toMove) {
				count ++;
			} else {
				list.add (array.get(i));
			}
		}
		int i = 0;
		while (i < count) {
			list.add (toMove);
			i++;	
		}
		return list;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = {2, 1, 2, 2, 2, 3, 4, 2};
		System.out.println(moveElementToEnd(Arrays.asList(array), 2));
	}

}
