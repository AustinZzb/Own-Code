package 最短路径; 

import java.util.Arrays;
import java.util.Scanner;

/**
 * Floyd_Warshall算法（多源最短路径）  即任意两点之间的最短路径
 *  
 * 此算法代码简洁，时间复杂度高，为O（n^3）
 * 现有N个城市，城市之间共有M条公路，求各个城市之间的最短路径
 * 
 * 例如：(4个城市，8条公路)
 * 1-->2(2)   1-->3(4)  1-->4(4)
 * 2-->3(3)
 * 3-->1(7)   3-->4(1)
 * 4-->3(12)  4-->1(5)
 * 
 * @author 张致邦
 *
 * 2020年2月10日-下午3:48:18
 */
public class _Floyd_Warshall {
	private static int[][] map;         // 利用图来存储公路信息
	
	private static void floyd() {
		
		for (int k = 1; k < map.length; k++) {
			for (int i = 1; i < map.length; i++) {
				for (int j = 1; j < map[i].length; j++) {
					if((map[i][k] + map[k][j]) < map[i][j])         // 如果绕路（i-->k-->j的路径小于i-->j，那么直接将两个城市之间的路径转换）
						map[i][j] = map[i][k] + map[k][j];
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input : 输入两个整数，N(城市个数)，M(城市之间的公路数目),接下来输入M行数据，表示从A-->B的路程");
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















