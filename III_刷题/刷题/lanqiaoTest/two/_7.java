/*
 *	��������
�������һ�����е��������ǰһ���ż�����ǰһ��С�����Ϊһ���ڶ����С��� a[2i]<a[2i-1], a[2i+1]>a[2i]��
����С����֪��������Ϊ m��ÿ�������� 1 �� n ֮����������İڶ�����һ���ж��ٸ���
�����ʽ
��������һ�а����������� m��n��
�����ʽ
�������һ����������ʾ�𰸡��𰸿��ܴܺ�������𰸳���10000��������
��������
3 4
�������
14
����˵��
���������Ƿ���Ҫ��İڶ����У�
����2 1 2
����2 1 3
����2 1 4
����3 1 2
����3 1 3
����3 1 4
����3 2 3
����3 2 4
����4 1 2
����4 1 3
����4 1 4
����4 2 3
����4 2 4
����4 3 4
 */
package lanqiaoTest.two;

import java.util.Scanner;

/**
 * 	@author ���°�
 *
 * 	2020��4��25��-����2:30:56
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
	
	public static int sum(int[] num, int t) {// ǰt���
		int sum = 0;
		for (int i = 0; i < t; i++)
			sum += num[i];
		return sum;
	}

}
