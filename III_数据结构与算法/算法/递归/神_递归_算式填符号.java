package 递归;

import java.util.ArrayList;

/**
 * 1 2 3 4 5 6 7 8 9 = 110
 * 请看上边的算式，为了使等式成立，需要在数字间填入加号或者减号（可以不填，但不能填入其它符号）。
 * 之间没有填入符号的数字组合成一个数
 * 例如：12+34+56+7-8+9 就是一种合格的填法；123+4+5+67-89 是另一个可能的答案。
 * 
 * @author 张致邦
 *
 * 2020年2月3日-上午10:58:43
 */
public class 神_递归_算式填符号 {
	
	private static void fun(int[] a, String s, int k, int sum) {
		if(k == 0) {
			if(sum == a[k])
				System.out.println(a[k]+s);
			return ;
		}
		
		fun(a, "+"+a[k]+s, k-1, sum-a[k]);
		fun(a, "-"+a[k]+s, k-1, sum+a[k]);
		
		int old = a[k-1];
		a[k-1] = Integer.parseInt(""+a[k-1]+a[k]);
		fun(a, s, k-1, sum);
		a[k-1] = old;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		fun(a, "", 8, 110);
	}

}
