package 递归;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/**
 * 求从一个数组中取n个不同的元素的所有情况（无重复元素）
 * 
 * @author 张致邦
 *
 * 2020年2月3日-下午9:27:47
 */
public class Set_无重复元素_从数组中取n个元素 {
	
	public static List fun(String s, int n) {
		
		List list2 = new Vector();
		
		if(n == 0) {
			list2.add("");
			return list2;
		}
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			List list = fun(s.substring(i+1), n - 1);
			for (int j = 0; j < list.size(); j++) {
				list2.add(""+c+list.get(j));
			}
		}
		
		return list2;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun("ABCDE", 3).size());
		System.out.println(fun("ABCDE", 3));
		
		
		
		/**
		 * 利用set对集合进行去重
		 */
//		HashSet liStrings = new HashSet();
//		List list2 = fun("AABBBC", 3);
//		for (int i = 0; i < list2.size(); i++) {
//			liStrings.add(list2.get(i));
//		}
//		
//		System.out.println(liStrings);
		
	}

}
