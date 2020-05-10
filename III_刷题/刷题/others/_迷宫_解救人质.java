package others;

import java.util.Scanner;

/**
 * 给定一个迷宫，求解走出这个迷宫的最短路径
 * Input ： 1 代表墙， 8  代表出口
 * 0010
 * 0000
 * 0010
 * 0180
 * 0001
 * 
 * 提示 ： 另外开辟一个数组，列举下一步都可以有哪些行为
 * 
 * @author 张致邦
 *
 * 2020年2月9日-上午10:38:08
 */
public class _迷宫_解救人质 {
	
	private static int min = Integer.MAX_VALUE; // 路径最小值
	private static int[][] map;  // 迷宫地图
	private static int[][] book; // 记录足迹
	private static int[][] next = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}}; // 下一步的几种方案

	private static void dfs(int x, int y, int step) {  // x,y 目前所在的位置 step, 目前所走的步数
		
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
		System.out.println("Input : 输入m， n表示地图的规格，之后输入m*n个数字（1为墙，0为路，8为人质）表示地图 ：");
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














