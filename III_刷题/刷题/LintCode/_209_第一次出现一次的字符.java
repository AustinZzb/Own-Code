package LintCode;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;
/**
 * 给出一个字符串，找出第一个只出现一次的字符。
 * 样例
 * 样例 1:
 * 输入: "abaccdeff"
 * 输出:  'b'
 * 解释:
 * 'b' 是第一个出现一次的字符
 * 样例 2:
 * 输入: "aabccd"
 * 输出:  'b'
 * 解释:
 * 'b' 是第一个出现一次的字符
 * 
 * @author 张致邦
 *
 * 2020年2月11日-下午8:44:24
 */
public class _209_第一次出现一次的字符 {
	private static char first(List<Character> list) {
		
		for (int i = 0; i < list.size(); i++) {
			char old = list.get(i);
			list.remove(i);
			if(!list.contains(old))
				return old;
			list.add(i, old);
		}
		
		return ' ';
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[] c = scan.nextLine().toCharArray();
		List<Character> list = new Vector<Character>();
		for (int i = 0; i < c.length; i++) {
			list.add(c[i]);
		}
		System.out.println(first(list));
	}

}
