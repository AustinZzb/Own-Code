package 递归;

import java.util.List;
import java.util.Vector;

/**
 * 输入一个字符串，将字符串的所有排列可能输出
 * 
 * @author 张致邦
 *
 * 2020年2月3日-下午5:39:18
 */
public class 神_递归_全排列 {
	
	public static void fun_1(char[] a, int k) {
		
		if(k == a.length-1) {
			System.out.println(String.valueOf(a));
			return ;
		}
		
		for (int i = k; i < a.length; i++) {
			char t = a[i];
			a[i] = a[k];
			a[k] = t;
			fun_1(a, k+1);
			t = a[i];
			a[i] = a[k];
			a[k] = t;
		}
		
	}
	
	private static List<String> fun(String s){
		List list = new Vector();
		
		if(s.length() == 1)
			list.add(s.charAt(0));

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			List list_1 = fun(s.substring(0,i)+s.substring(i+1));
			for (int j = 0; j < list_1.size(); j++) {
				list.add("" + c + list_1.get(j));
			}
		}
		
		return list;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new Vector<String>();
		list = fun("ABC");
		System.out.println(list);
		System.out.println();
		fun_1("ABC".toCharArray(), 0);
	}

}
