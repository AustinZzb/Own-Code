package others;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Set_有重复元素_从数组中取n个元素 {
	
	// 普通递归方法
	public static void fun_1(int[] x, int[] k, int n, int m){
		
		if(n == k.length) {
			if(m == 0) {
				for (int i = 0; i < k.length; i++) {
					for (int j = 0; j < k[i]; j++) {
						System.out.print((char)('A'+i));
					}
				}
				System.out.println();
			}
			return ;
		}
		
		for (int i = 0; i <= Math.min(x[n], m); i++) {
			k[n] = i;
			fun_1(x, k, n+1, m-i);
		}
		k[n] = 0;
		
	}
	
	
	// 利用Set直接进行去重
	public static Set<String> fun(String s, int n) {
		
		Set<String> set = new HashSet<String>();
		
		if(n == 0) {
			set.add("");
			return set;
		}
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			Set<String> tSet = fun(s.substring(i + 1), n - 1);
			for (String t: tSet) {
				set.add("" + c + t);
			}
		}
		
		return set;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun("AABBBC", 3));
		int[] a = {2, 3, 1};
		int[] b = new int[a.length];
		fun_1(a, b, 0, 3);
	}

}
