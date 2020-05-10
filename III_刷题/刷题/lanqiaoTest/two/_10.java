/*
 *	问题描述
　　2015年，全中国实现了户户通电。作为一名电力建设者，小明正在帮助一带一路上的国家通电。
　　这一次，小明要帮助 n 个村庄通电，其中 1 号村庄正好可以建立一个发电站，所发的电足够所有村庄使用。
　　现在，这 n 个村庄之间都没有电线相连，小明主要要做的是架设电线连接这些村庄，使得所有村庄都直接或间接的与发电站相通。
　　小明测量了所有村庄的位置（坐标）和高度，如果要连接两个村庄，小明需要花费两个村庄之间的坐标距离加上高度差的平方，形式化描述为坐标为 (x_1, y_1) 高度为 h_1 的村庄与坐标为 (x_2, y_2) 高度为 h_2 的村庄之间连接的费用为
　　sqrt((x_1-x_2)*(x_1-x_2)+(y_1-y_2)*(y_1-y_2))+(h_1-h_2)*(h_1-h_2)。
　　在上式中 sqrt 表示取括号内的平方根。请注意括号的位置，高度的计算方式与横纵坐标的计算方式不同。
　　由于经费有限，请帮助小明计算他至少要花费多少费用才能使这 n 个村庄都通电。
输入格式
　　输入的第一行包含一个整数 n ，表示村庄的数量。
　　接下来 n 行，每个三个整数 x, y, h，分别表示一个村庄的横、纵坐标和高度，其中第一个村庄可以建立发电站。
输出格式
　　输出一行，包含一个实数，四舍五入保留 2 位小数，表示答案。
样例输入
4
1 1 3
9 9 7
8 8 6
4 5 4
样例输出
17.41
 */
package lanqiaoTest.two;

import java.util.Scanner;

/**
 * 	@author 张致邦
 *
 * 	2020年4月25日-下午4:43:08
 */
public class _10 {
//	public static double sum = Integer.MAX_VALUE;

	/**@method
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int[] n = new int[m];
		int[] t = new int[m];
		int[][] params = new int[m][3];
		for (int i = 0; i < n.length; i++) {
			n[i] = i;
			for (int j = 0; j < 3; j++)
				params[i][j] = in.nextInt();
		}
		
		fun(t, params);
		
		in.close();
	}
	
	public static void fun(int[] n, int[][] params) {
		double ans = 0;
		int index = 0;
		while (test(n)) {
			if (n[index] > 1)
				continue;
			n[index]++;
			double temp = Integer.MAX_VALUE;
			int i = 0;
			for (int j = 0; j < n.length; j++) {
				if (n[j] != 0)
					continue;
				if (sum(index, j, params) < temp) {
					temp = sum(index, j, params);
					i = j;
				}
			}
			ans += temp;
			n[i]++;
			index = i;
		}
		System.out.printf("%.2f", ans);
	}
	
	public static boolean test(int[] n) {
		for (int i : n) {
			if (i == 0) return true;
		}
		return false;
	}
	
	public static double sum(int a, int b, int[][] params) {
		return Math.sqrt((params[a][0]-params[b][0])*(params[a][0]-params[b][0]) + (params[a][1]-params[b][1])*(params[a][1]-params[b][1])) + (params[a][2]-params[b][2])*(params[a][2]-params[b][2]);
	}
	
//	public static void fun(int[] n, int k, int[][] params) {
//		if (k == n.length-1) {
//			double temp = sum(n, k+1, params);
//			if (temp < sum)
//				sum = temp;
//			return ;
//		}
//		
//		if (k >= 10 && sum(n, k+1, params) > sum) 
//			return ;
//		
//		for (int i = k; i < n.length; i++) {
//			int t = n[i]; n[i] = n[k]; n[k] = t;
//			fun(n, k+1, params);
//			t = n[i]; n[i] = n[k]; n[k] = t;
//		}
//	}
//
//	public static double sum(int[] n, int k, int[][] params) {
//		double sum = 0;
//		for (int i = 1; i < k; i++) {
//			int a = n[i-1], b = n[i];
//			sum += Math.sqrt((params[a][0]-params[b][0])*(params[a][0]-params[b][0]) + (params[a][1]-params[b][1])*(params[a][1]-params[b][1])) + (params[a][2]-params[b][2])*(params[a][2]-params[b][2]);
//		}
//		return sum;
//	}
	
}
