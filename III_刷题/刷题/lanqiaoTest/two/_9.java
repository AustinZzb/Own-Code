/*
 *	
 */
package lanqiaoTest.two;

import java.util.Scanner;

/**
 * 	@author 张致邦
 *
 * 	2020年4月25日-下午5:56:26
 */
public class _9 {

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
				if (sum(index, j, params)) {
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
	
	public static boolean sum(int a, int b, int[][] params) {
		return Math.sqrt((params[a][0]-params[b][0])*(params[a][0]-params[b][0]) + (params[a][1]-params[b][1])*(params[a][1]-params[b][1])) < (params[a][2]+params[b][2]);
	}
	

}
