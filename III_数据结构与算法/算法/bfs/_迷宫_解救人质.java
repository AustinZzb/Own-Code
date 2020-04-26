package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import 排序算法.ing_归并排序;

/**
 * 利用bfs和队列进行实现
 * 
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
 
 * 2020年2月9日-下午3:24:01
 */
public class _迷宫_解救人质 {
	private static int[][] map;  // 迷宫地图
	private static int[][] book; // 记录足迹
	private static int[][] next = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}}; // 下一步的几种方案
	private static Queue<Integer[]> queue = new LinkedList<Integer[]>();

	/**
	 * 思想：
	 * 站在目前位置，将下一步所有的情况全部罗列
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
		System.out.println("Input : 输入m， n表示地图的规格，之后输入m*n个数字（1为墙，0为路，8为人质）表示地图 ：");
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
