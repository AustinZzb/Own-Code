package ���·��;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Dijkstra�㷨����Դ���·����  ��һ���㵽��������һ������·��
 *  
 * �˴���Ч�ʸߣ��򵥵�ʵ��ΪO��n^2��
 * ����N�����У�����֮�乲��M����·�����������֮������·��
 * 
 * ���磺(6�����У�9����·)
 * 1-->2(1)   1-->3(12)  
 * 2-->3(9)	  2-->4(3)
 * 3-->5(5)   
 * 4-->3(4)  4-->5(13)  4-->6(15)
 * 5-->6(4)
 * 
 * @author ���°�
 *
 * 2020��2��10��-����4:25:38
 */
public class _Dijkstra {
	private static int[][] map;         // ����ͼ���洢��·��Ϣ
	private static int[] dis;           // ��¼��Դ���·��������ֵ
	private static int[] book;			// ��¼�Ѿ����ʹ��ĵ�
	
	private static void Dijkstra() {
		
		for (int i = 1; i < dis.length; i++) {
			
			int min = Integer.MAX_VALUE;
			
			int t = 0;
			for (int j = 1; j < dis.length; j++) {
				if(dis[j] < min && book[j] == 0) {
					 min = dis[j];
					 t = j;
				}
			}
			book[t] = 1;
			
			for (int j2 = 1; j2 < map.length; j2++) {
				if((dis[t] + map[t][j2]) < dis[j2])
					dis[j2] = dis[t] + map[t][j2];
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
		
		book = new int[map.length];
		dis = new int[map.length];
		for (int i = 1; i < map.length; i++) {
			dis[i] = map[1][i];
		}
		
		Dijkstra();
		
		System.out.println(Arrays.toString(dis));
	}

}
