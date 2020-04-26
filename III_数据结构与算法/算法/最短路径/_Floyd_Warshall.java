package ���·��; 

import java.util.Arrays;
import java.util.Scanner;

/**
 * Floyd_Warshall�㷨����Դ���·����  ����������֮������·��
 *  
 * ���㷨�����࣬ʱ�临�Ӷȸߣ�ΪO��n^3��
 * ����N�����У�����֮�乲��M����·�����������֮������·��
 * 
 * ���磺(4�����У�8����·)
 * 1-->2(2)   1-->3(4)  1-->4(4)
 * 2-->3(3)
 * 3-->1(7)   3-->4(1)
 * 4-->3(12)  4-->1(5)
 * 
 * @author ���°�
 *
 * 2020��2��10��-����3:48:18
 */
public class _Floyd_Warshall {
	private static int[][] map;         // ����ͼ���洢��·��Ϣ
	
	private static void floyd() {
		
		for (int k = 1; k < map.length; k++) {
			for (int i = 1; i < map.length; i++) {
				for (int j = 1; j < map[i].length; j++) {
					if((map[i][k] + map[k][j]) < map[i][j])         // �����·��i-->k-->j��·��С��i-->j����ôֱ�ӽ���������֮���·��ת����
						map[i][j] = map[i][k] + map[k][j];
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input : ��������������N(���и���)��M(����֮��Ĺ�·��Ŀ),����������M�����ݣ���ʾ��A-->B��·��");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		map = new int[n+1][n+1];
		
		for (int i = 1; i < map.length; i++) {
			for (int j = 1; j < map[i].length; j++) {
				if(i == j) map[i][j] = 0;
				else map[i][j] = Integer.MAX_VALUE / 2;
			}
		}
		for (int t = 0; t < m; t++) {
			int i = scan.nextInt();
			int j = scan.nextInt();
			int s = scan.nextInt();
			map[i][j] = s;
		}
		
		floyd();
		
		for (int i = 1; i < map.length; i++) {
			for (int j = 1; j < map.length; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}

	}

}















