package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import �����㷨.ing_�鲢����;

/**
 * ����bfs�Ͷ��н���ʵ��
 * 
 * ����һ���Թ�������߳�����Թ������·��
 * Input �� 1 ����ǽ�� 8  �������
 * 0010
 * 0000
 * 0010
 * 0180
 * 0001
 * 
 * ��ʾ �� ���⿪��һ�����飬�о���һ������������Щ��Ϊ
 * 
 * @author ���°�
 
 * 2020��2��9��-����3:24:01
 */
public class _�Թ�_������� {
	private static int[][] map;  // �Թ���ͼ
	private static int[][] book; // ��¼�㼣
	private static int[][] next = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}}; // ��һ���ļ��ַ���
	private static Queue<Integer[]> queue = new LinkedList<Integer[]>();

	/**
	 * ˼�룺
	 * վ��Ŀǰλ�ã�����һ�����е����ȫ������
	 */
	private static void bfs() {  
		Integer[] aIntegers1 = queue.poll();  
		int m = aIntegers1[0];
		int n = aIntegers1[1];
		
		if(map[m][n] == 8) {
			System.out.println(aIntegers1[2]);
			return;
		}
			
			
		for (int j = 0; j < next.length; j++) {  
			int x = m + next[j][0];
			int y = n + next[j][1];
			if (test(x, y)) {
				book[x][y] = 1;
				Integer[] aIntegers = new Integer[] {x, y, aIntegers1[2]+1};
				queue.offer(aIntegers);
			}
		}
		bfs();
		
	}

	private static boolean test(int x, int y) {
		// TODO Auto-generated method stub
		if(x >= 0 && x < map.length && y >= 0 && y < map[0].length) {
			if(book[x][y] == 0 && map[x][y] != 1)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Input : ����m�� n��ʾ��ͼ�Ĺ��֮������m*n�����֣�1Ϊǽ��0Ϊ·��8Ϊ���ʣ���ʾ��ͼ ��");
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		map = new int[m][n];
		book = new int[m][n];
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = scan.nextInt();
			}
		}
		System.out.println("ANSWER :");
		Integer[] aIntegers = new Integer[] {0, 0, 0};
		queue.offer(aIntegers);
		bfs();
	}

}
