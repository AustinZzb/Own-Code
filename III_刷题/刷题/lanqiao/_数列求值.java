package lanqiao;

import java.math.BigInteger;

/**
 * 【问题描述】
 * 给定数列 1, 1, 1, 3, 5, 9, 17, …，从第 4 项开始，每项都是前 3 项的和。求 第 20190324 项的最后 4 位数字。
 * @author 张致邦
 *
 * 2020年2月2日-下午9:29:09
 */
public class _数列求值 {
	public static void fun() {
		
		int[] a = new int[20190324];
		a[0] = a[1] = a[2] = 1;
		int ans = 0;
		for(int i = 3;i <20190324; i++) {
			a[i] = (a[i-1] + a[i-2] + a[i-3]) % 1000000;
		}
		System.out.println(a[20190323]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun();
	}

}
