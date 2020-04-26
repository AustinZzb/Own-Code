package lanqiao;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ��������
 * ����ȡ�������ؾ���ı�ȡ��������ǰ������������ȡ���Ѿ�ȡ��������ת90�ȡ�һ��ʼλ�ھ������Ͻǣ��������¡�
 * �����ʽ
 * �����һ��������������200��������m, n����ʾ������к��С�������m��ÿ��n����������ʾ�������
 * �����ʽ
 * ���ֻ��һ�У���mn������Ϊ����������ȡ���õ��Ľ������֮����һ���ո�ָ�����ĩ��Ҫ�ж���Ŀո�
 * 
 * @author ���°�
 *
 * 2020��2��24��-����10:38:56
 */
public class BASIC_25 {
	private static int[][] map;
	private static int[][] mapcount;
	private static int[] newmap;
	private static int count = 0;
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		map = new int[m][n];
		mapcount = new int[m][n];
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = scan.nextInt();
				mapcount[i][j] = 0;
			}
		}
		if(m == 1) {
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if(i == 0 && j == 0)
						System.out.print(map[i][j]);
					else 
						System.out.print(" "+map[i][j]);
				}
			}
		}else {
			
			newmap = new int[m*n];
			get(0, 0, true, 0);
			for (int i = 0; i < newmap.length; i++) {
				if(i == 0)
					System.out.print(newmap[i]);
				else
					System.out.print(" "+newmap[i]);
			}
		}
	}
	
	private static void get(int x, int y, boolean flag, int cent){
		
		if(flag){
			newmap[count++] = map[x][y];
			mapcount[x][y] = 1;
		}
			
		if(x+1 == map.length - cent || mapcount[x+1][y] == 1)
			return;
		while(++x < map.length - cent){
			newmap[count++] = map[x][y];
			mapcount[x][y] = 1;
		}
		x--;
		
		if(y+1 == map[0].length - cent || mapcount[x][y+1] == 1)
			return;
		while(++y < map[0].length - cent){
			newmap[count++] = map[x][y];	
			mapcount[x][y] = 1;
		}
		y--;
		
		if(x-1 < 0 + cent || mapcount[x-1][y] == 1)
			return;
		while(--x >= 0 + cent){
			newmap[count++] = map[x][y];
			mapcount[x][y] = 1;
		}
		x++;
		
		if(y-1 == 0 + cent || mapcount[x][y-1] == 1)
			return;
		while(--y > 0 + cent){
			newmap[count++] = map[x][y];
			mapcount[x][y] = 1;
		}
		y++;
		
		get(x, y, false, cent+1);
		
	}
	
	
	
}
