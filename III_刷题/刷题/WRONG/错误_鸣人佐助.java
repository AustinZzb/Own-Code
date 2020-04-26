package WRONG;

import java.util.Scanner;

/**
 * 超时
 * 已知一张地图（以二维矩阵的形式表示）以及佐助和鸣人的位置。地图上的每个位置都可以走到，只不过有些位置上有大蛇丸的手下，需要先打败大蛇丸的手下才能到这些位置。鸣人有一定数量的查克拉，每一个单位的查克拉可以打败一个大蛇丸的手下。假设鸣人可以往上下左右四个方向移动，每移动一个距离需要花费 11 个单位时间，打败大蛇丸的手下不需要时间。如果鸣人查克拉消耗完了，则只可以走到没有大蛇丸手下的位置，不可以再移动到有大蛇丸手下的位置。佐助在此期间不移动，大蛇丸的手下也不移动。请问，鸣人要追上佐助最少需要花费多少时间？
 * 输入格式
 * 输入的第一行包含三个整数：MM，NN，TT。代表 MM 行 NN 列的地图和鸣人初始的查克拉数量 TT。0 < M,N < 2000<M,N<200，0 \le T < 100≤T<10
 * 后面是 MM 行 NN 列的地图，其中 @ 代表鸣人，+ 代表佐助。* 代表通路，# 代表大蛇丸的手下。
 * 输出格式
 * 输出包含一个整数 RR，代表鸣人追上佐助最少需要花费的时间。如果鸣人无法追上佐助，则输出 -1−1。
 * 
 * @author 张致邦
 *
 * 2020年2月11日-下午4:19:45
 */
public class 错误_鸣人佐助 {
	
	private static char[][] map;        // 存储地图
	private static int[][] next = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};        // 下一步
	private static int[][] book;			// 途径记录
	private static int boom = 0;        // 查克拉
	private static int min = 10000;        // 最小路途
	
	private static void found(int x, int y, int step) {
		if(map[x][y] == '#' && boom == 0)
			return;
		
		if (map[x][y] == '#') {
			boom --;
		}
		
		if(map[x][y] == '+' || step > min) {
			min = min < step ? min : step;
			return;
		}
		
		for (int i = 0; i < next.length; i++) {
			int old_1 = x + next[i][0];
			int old_2 = y + next[i][1];
			
			if(test(old_1, old_2)) {
				book[old_1][old_2] = 1;
				found(old_1, old_2, step + 1);
				book[old_1][old_2] = 0;
				if (map[old_1][old_2] == '#') {
					boom ++;
				}
			}
		
		}
		
	}

	private static boolean test(int x, int y) {
		// TODO Auto-generated method stub
		if(x >= 0 && x < map.length && y >= 0 && y < map[x].length) {
			if(book[x][y] == 0 && (map[x][y] == '*' || (map[x][y] == '#' && boom != 0) || map[x][y] == '+'))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		boom = scan.nextInt();
		map = new char[n][m];
		int x = 0, y = 0;
		
		for (int i = 0; i < n; i++) {
			map[i] = scan.next().toCharArray();
		}
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if(map[i][j] == '@') {
					x = i; y = j;
				}
			}
		}
		
		book = new int[n][m];
		book[x][y] = 1;
		
		found(x, y, 0);
		
		if(min == 10000)
			System.out.println(-1);
		else
			System.out.println(min);
	}

}










