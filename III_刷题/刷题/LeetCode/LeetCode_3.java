package LeetCode;
/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 
 * @author 张致邦
 *
 * 2020年1月31日-下午8:23:32
 */
import java.util.ArrayList;
import java.util.Scanner;

public class LeetCode_3 {
	
	public static int lengthOfLongestSubstring(String s) {
		if(s == "") return 0;
		char[] cs = s.toCharArray();
		int res = 0, i = 0;
		for (int j = 0; j < cs.length; j++) {
			for (int k = i; k < j; k++) {
				if (cs[j] == cs[k]) {
					i = k + 1;
					break;
				}
			}
			res = (j - i + 1) > res ? (j - i + 1) : res ;
		}
		return res;
        
//		ArrayList<Character> list = new ArrayList<Character>();
//		int length = 0;
//		
//		for (int i = 0; i < s.length(); i++) {
//			for (int j = i; j < s.length(); j++) {
//				if (j == i) {
//					list.add(s.charAt(j));
//				}else {
//					boolean flag = true;
//					for (int j2 = 0; j2 < list.size(); j2++) {
//						if (s.charAt(j) == list.get(j2)) {
//							flag = false;
//							break;
//						}
//					}
//					if (flag) {
//						list.add(s.charAt(j));
//					}else {
//						if(list.size() > length) {
//							length = list.size();
//						}
//						list.removeAll(list);
//						break;
//					}
//					
//				}
//				
//				if(j == s.length()-1) {
//					if(list.size() > length) {
//						length = list.size();
//					}
//					list.removeAll(list);
//					break;
//				}
//				
//			}
//		}
//		
//		return length;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String string = scan.next();
		System.out.println(lengthOfLongestSubstring(string));

	}

}
