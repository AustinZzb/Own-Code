/*
 *	��������
���������������� a, b, c�����һ�������Ȳ��� a ��������Ҳ���� b �������������� c �������������������Ϊ��������
���������� 1 �� n ���ж��ٸ���������
�����ʽ
��������ĵ�һ�а���һ������ n��
�����ڶ��а����������� a, b, c������������֮����һ���ո�ָ���
�����ʽ
�������һ�а���һ����������ʾ�𰸡�
��������
30
2 3 6
�������
10
 */
package lanqiaoTest.two;

import java.util.Scanner;

/**
 * 	@author ���°�
 *
 * 	2020��4��25��-����2:08:26
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
