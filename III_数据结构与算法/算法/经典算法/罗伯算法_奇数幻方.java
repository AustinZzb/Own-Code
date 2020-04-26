/*
 *	�޲��㷨 ---> ��������÷�
 *	i. ��1�ŵ���ά������м�һ��
 *	ii.i+1 �ŵ� i �ĨL�I�K�J����ѡһ���ɣ�
 *	       �����±߽�ƽ�����ϱ߽磬�����ұ߽�ƽ������߽磬�����������ͬ��
 *	       ��� i+1 Ԥ����λ���Ѿ������ݣ���ô�Ͱ� i+1 �ŵ� i �����Ϸ��������·���������ƶ������෴��
 */
package �����㷨;

import java.util.Scanner;

/**
 * 	@author ���°�
 *
 * 	2020��3��22��-����5:33:17
 */
public class �޲��㷨_�����÷� {

	public static void main(String[] args) {
		System.out.println("�����������÷��� ����ż���˳�����");
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		
		while (m%2 != 0) {
			Lobo(m);
			m = scan.nextInt();
		}
	}
	
	private static void Lobo(int n) {
		int x = 0, y = n/2, old_x = x, old_y = y, count = 1, len = (n*n+"").length();
		int[][] map = new int[n][];
		
		while (count <= n*n) {
			old_x = x; old_y = y;
			map[x--][y++] = count++;
			
			if (x < 0) {
				x = n-1;
			}
			if (y > n-1) {
				y = 0;
			}
			if (map[x][y] != 0) {
				x = old_x - 1;
				y = old_y;
			}
		}
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (j == 0)
					System.out.printf("%"+len+"d", map[i][j]);
				else
					System.out.printf(" %"+len+"d", map[i][j]);
			}
			System.out.println();
		}	
	}

}
