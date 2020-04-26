package LintCode;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;
/**
 * 样例
 * 样例1
 * 输入: str="ABCabcA"
 * 输出: 2
 * 解释:
 * A出现了2次，B出现了1次，C出现了1次，a出现了1次，b出现了1次，c出现了1次，A出现的次数最多，所以返回2。
 * 样例2
 * 输入: str="abca"
 * 输出: 2
 * 解释:
 * a 出现了2次，b和c都只出现了1次
 * 所以返回 2
 * 注意事项
 * 字母中只可能会出现大写字母或者小写字母。
 * 字符串长度不超过100000
 * @author 张致邦
 *
 * 2020年2月11日-下午9:15:22
 */
public class _1654_出现最多的字符 {
	private static int fun(List<Character> list) {
		int ans = 0;
		
		for (int i = 0; i < list.size(); i++) {
			int sum = 0;
			char old = list.get(i);
			while(list.contains(old)) {			
				sum++;
				list.remove(list.indexOf(old));
			}
			ans = sum > ans ? sum : ans;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[] c = scan.nextLine().toCharArray();
		List<Character> list = new Vector<Character>();
		for (int i = 0; i < c.length; i++) {
			list.add(c[i]);
		}
		System.out.println(fun(list));
	}

}
