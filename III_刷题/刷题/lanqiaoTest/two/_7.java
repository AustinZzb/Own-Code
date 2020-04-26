/*
 *	问题描述
　　如果一个序列的奇数项都比前一项大，偶数项都比前一项小，则称为一个摆动序列。即 a[2i]<a[2i-1], a[2i+1]>a[2i]。
　　小明想知道，长度为 m，每个数都是 1 到 n 之间的正整数的摆动序列一共有多少个。
输入格式
　　输入一行包含两个整数 m，n。
输出格式
　　输出一个整数，表示答案。答案可能很大，请输出答案除以10000的余数。
样例输入
3 4
样例输出
14
样例说明
　　以下是符合要求的摆动序列：
　　2 1 2
　　2 1 3
　　2 1 4
　　3 1 2
　　3 1 3
　　3 1 4
　　3 2 3
　　3 2 4
　　4 1 2
　　4 1 3
　　4 1 4
　　4 2 3
　　4 2 4
　　4 3 4
 */
package lanqiaoTest.two;

import java.util.Scanner;

/**
 * 	@author 张致邦
 *
 * 	2020年4月25日-下午2:30:56
 */
public class _7 {

	/**@method
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt(), n = in.nextInt();

		System.out.println(fun(m, n));
		in.close();
	}
	
	public static int fun(int m, int n) {
		int t = n-1, ans = 0;
		int[] num = new int[t];
		num[0] = t;
		for (int i = 1; i < num.length; i++) 
			num[i] = num[i-1]-1;
		
		if (m == 1)
			return n;
		if (m == 2) 
			return sum(num, t)%10000;
		
		for (int i = 2; i < m; i++) {
			int[] temp = new int[t];
			for (int j = 0; j < num.length; j++) {
				temp[j] = sum(num, t-j)%10000;
			}
			for (int j = 0; j < num.length; j++) {
				num[j] = temp[j];
			}
			
			ans += sum(num, t);
			ans %= 10000;
		}
		
		return ans;
	}
	
	public static int sum(int[] num, int t) {// 前t项和
		int sum = 0;
		for (int i = 0; i < t; i++)
			sum += num[i];
		return sum;
	}

}
