/*
 *	问题描述
　　给定三个整数 a, b, c，如果一个整数既不是 a 的整数倍也不是 b 的整数倍还不是 c 的整数倍，则这个数称为反倍数。
　　请问在 1 至 n 中有多少个反倍数。
输入格式
　　输入的第一行包含一个整数 n。
　　第二行包含三个整数 a, b, c，相邻两个数之间用一个空格分隔。
输出格式
　　输出一行包含一个整数，表示答案。
样例输入
30
2 3 6
样例输出
10
 */
package lanqiaoTest.two;

import java.util.Scanner;

/**
 * 	@author 张致邦
 *
 * 	2020年4月25日-下午2:08:26
 */
public class _5 {

	/**@method
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] param = new int[3];
		for (int i = 0; i < param.length; i++) {
			param[i] = in.nextInt();
		}
		
		fun(n, param);
		in.close();
	}
	
	public static void fun(int n, int[] param) {
		int[] ans = new int[n+1];
		int sum = 0;
		
		for (int num: param) {
			for (int i = 1;i < n; i++) {
				if (num*i <= n)
					ans[num*i]++;
				else 
					break;
			}
		}
		
		for (int i : ans) {
			if (i == 0)
				sum++;
		}
		System.out.println(sum-1);
	}

}
