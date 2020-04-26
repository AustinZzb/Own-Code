package Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

/**
 * 给定一个数组对其进行全排列
 * 
 * @author 张致邦
 *
 * 2020年2月8日-下午4:20:03
 */
public class _全排列 {
	
	private static Set<String> list_1 = new HashSet<String>();
	
	// 利用递归回溯的方式，具体操作：定义一个变量k表示位置指针
	// 将k所指的元素依次与k之后的元素进行交换，交换递归过后记得回溯
	private static void fun_1(char[] c, int k) {
		
		if(k == c.length - 1) {
			list_1.add(String.valueOf(c));
			return ;
		}
		
		for (int i = k; i < c.length; i++) {
			char cc = c[i]; c[i] = c[k] ; c[k] = cc;
			fun_1(c,k+1);
			cc = c[i]; c[i] = c[k] ; c[k] = cc;
		}
		
	}
	
	
	
	// 利用递归的方法，具体操作：对字符串进行迭代，每回取出一个元素放到字符串的头部
	// 然后对剩下的子串进行全排列
	private static List<String> fun(String s) {
		
		List<String> list = new Vector<String>();
		
		if(s.length() == 1) {
			list.add(""+s.charAt(0));
			return list;
		}
		
		for (int i = 0; i < s.length(); i++) {
			char old = s.charAt(i);
			List<String> list2 = fun(s.substring(0,i)+s.substring(i+1));
			for (int j = 0; j < list2.size(); j++) {
				list.add("" + old + list2.get(j));
			}
		}
		
		return list;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入一串字符，对其进行全排列输出");
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String string = scan.nextLine();
			System.out.println("answer ONE : " + fun(string));
			fun_1(string.toCharArray(), 0);
			System.out.println("answer TWO : " + list_1);
			list_1.removeAll(list_1);
		}
	}

}
