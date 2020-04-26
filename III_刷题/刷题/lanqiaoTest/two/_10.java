/*
 *	��������
����2015�꣬ȫ�й�ʵ���˻���ͨ�硣��Ϊһ�����������ߣ�С�����ڰ���һ��һ·�ϵĹ���ͨ�硣
������һ�Σ�С��Ҫ���� n ����ׯͨ�磬���� 1 �Ŵ�ׯ���ÿ��Խ���һ������վ�������ĵ��㹻���д�ׯʹ�á�
�������ڣ��� n ����ׯ֮�䶼û�е���������С����ҪҪ�����Ǽ������������Щ��ׯ��ʹ�����д�ׯ��ֱ�ӻ��ӵ��뷢��վ��ͨ��
����С�����������д�ׯ��λ�ã����꣩�͸߶ȣ����Ҫ����������ׯ��С����Ҫ����������ׯ֮������������ϸ߶Ȳ��ƽ������ʽ������Ϊ����Ϊ (x_1, y_1) �߶�Ϊ h_1 �Ĵ�ׯ������Ϊ (x_2, y_2) �߶�Ϊ h_2 �Ĵ�ׯ֮�����ӵķ���Ϊ
����sqrt((x_1-x_2)*(x_1-x_2)+(y_1-y_2)*(y_1-y_2))+(h_1-h_2)*(h_1-h_2)��
��������ʽ�� sqrt ��ʾȡ�����ڵ�ƽ��������ע�����ŵ�λ�ã��߶ȵļ��㷽ʽ���������ļ��㷽ʽ��ͬ��
�������ھ������ޣ������С������������Ҫ���Ѷ��ٷ��ò���ʹ�� n ����ׯ��ͨ�硣
�����ʽ
��������ĵ�һ�а���һ������ n ����ʾ��ׯ��������
���������� n �У�ÿ���������� x, y, h���ֱ��ʾһ����ׯ�ĺᡢ������͸߶ȣ����е�һ����ׯ���Խ�������վ��
�����ʽ
�������һ�У�����һ��ʵ�����������뱣�� 2 λС������ʾ�𰸡�
��������
4
1 1 3
9 9 7
8 8 6
4 5 4
�������
17.41
 */
package lanqiaoTest.two;

import java.util.Scanner;

/**
 * 	@author ���°�
 *
 * 	2020��4��25��-����4:43:08
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
