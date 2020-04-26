/*
 *	��������
��������һ�� n �� m �еı�����ǿ���ʹ�������ķ�ʽ������������������������ǳ���õı��Ϊһ����������
�������磬һ�� 4 �� 5 �е������������£�
����1 2 3 4 5
����14 15 16 17 6
����13 20 19 18 7
����12 11 10 9 8
�����ʽ
��������ĵ�һ�а����������� n, m���ֱ��ʾ���������������������
�����ڶ��а����������� r, c����ʾҪ����кź��кš�
�����ʽ
�������һ����������ʾ���������е� r �е� c �е�Ԫ�ص�ֵ��
��������
4 5
2 2
�������
15
 */
package lanqiaoTest.two;

import java.util.Scanner;

/**
 * 	@author ���°�
 *
 * 	2020��4��25��-����3:57:50
 */
public class _8 {

	/**@method
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt(), n = in.nextInt(), r = in.nextInt(), c = in.nextInt();
		fun(m, n, r, c);
		in.close();
	}
	
	public static void fun(int m, int n, int r, int c) {
		int sum = m*n, i = 0, j = 0, flag = 1;
		int[][] map = new int[m][n];
		
		for (int t = 1; t <= sum; t++) {
			map[i][j] = t;
			if (i+1 == r && j+1 == c) 
				break;
			
			if (flag == 1 && j < n-1 && map[i][j+1] == 0) {
				j++;
			} else if (flag == 2 && i < m-1 && map[i+1][j] == 0) {
				i++;
			} else if (flag == 3 && j > 0 && map[i][j-1] == 0) {
				j--;
			} else if (flag == 4 && i > 0 && map[i-1][j] == 0) {
				i--;
			} else {
				if (j < n-1 && map[i][j+1] == 0) { // ������
					j++;
					flag = 1;
				} else if (i < m-1 && map[i+1][j] == 0) { // ������
					i++;
					flag = 2;
				} else if (j > 0 && map[i][j-1] == 0) {	// ������
					j--;
					flag = 3;
				} else {
					i--;
					flag = 4;
				}
			}
		}
		
		System.out.println(map[i][j]);
	}
}
