package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class LeetCode_118 {
	
	public static List<List<Integer>> generate(int numRows) {
        
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (numRows == 0) {
            return list;
        }
		for (int i = 0; i < numRows; i++) {
			List<Integer> list1 = new ArrayList<Integer>();
			list1.add(1);
			for (int j = 1; j < i; j++) {
				int m = list.get(i-1).get(j) + list.get(i-1).get(j-1);
				list1.add(m);
			}
			if(i != 0)
				list1.add(1);
			list.add(list1);
		}
		
		return list;
		
    }
	
	public static void main(String[] args) {
		System.out.println(generate(5));
	}
	
}
