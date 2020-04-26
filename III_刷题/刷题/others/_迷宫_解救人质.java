package others;

import java.util.Scanner;

/**
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
 *
 * 2020��2��9��-����10:38:08
 */
public class _�Թ�_������� {
	
	private static int min = Integer.MAX_VALUE; // ·����Сֵ
	private static int[][] map;  // �Թ���ͼ
	private static int[][] book; // ��¼�㼣
	private static int[][] next = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}}; // ��һ���ļ��ַ���

	private static void dfs(int x, int y, int step) {  // x,y Ŀǰ���ڵ�λ�� step, Ŀǰ���ߵĲ���
		
		if(map[x][y] == 8) {
			min = min < step ? min : step;
			return ;
		}
		
		int old_x = 0, old_y = 0;
		for(int i = 0; i < next.length; i++) {
			old_x = x + next[i][0];
			old_y = y + next[i][1];
			if (test(old_x, old_y)) {
				book[old_x][old_y] = 1;
				dfs(old_x, old_y, step + 1);
				book[old_x][old_y] = 0;
			}
		}
		
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
		System.out.println("ANSWER :");
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
		dfs(0, 0, 0);
		System.out.println(min);
	}
	
}














