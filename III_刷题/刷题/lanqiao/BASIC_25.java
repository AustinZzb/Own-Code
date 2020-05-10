package lanqiao;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 问题描述
 * 回形取数就是沿矩阵的边取数，若当前方向上无数可取或已经取过，则左转90度。一开始位于矩阵左上角，方向向下。
 * 输入格式
 * 输入第一行是两个不超过200的正整数m, n，表示矩阵的行和列。接下来m行每行n个整数，表示这个矩阵。
 * 输出格式
 * 输出只有一行，共mn个数，为输入矩阵回形取数得到的结果。数之间用一个空格分隔，行末不要有多余的空格。
 * 
 * @author 张致邦
 *
 * 2020年2月24日-上午10:38:56
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
