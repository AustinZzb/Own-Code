package 最短路径;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Dijkstra算法（单源最短路径）  即一个点到其他任意一点的最短路径
 *  
 * 此代码效率高，简单的实现为O（n^2）
 * 现有N个城市，城市之间共有M条公路，求各个城市之间的最短路径
 * 
 * 例如：(6个城市，9条公路)
 * 1-->2(1)   1-->3(12)  
 * 2-->3(9)	  2-->4(3)
 * 3-->5(5)   
 * 4-->3(4)  4-->5(13)  4-->6(15)
 * 5-->6(4)
 * 
 * @author 张致邦
 *
 * 2020年2月10日-下午4:25:38
 */
public class _Dijkstra {
	private static int[][] map;         // 利用图来存储公路信息
	private static int[] dis;           // 记录单源最短路径的所有值
	private static int[] book;			// 记录已经访问过的点
	
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
		
		book = new int[map.length];
		dis = new int[map.length];
		for (int i = 1; i < map.length; i++) {
			dis[i] = map[1][i];
		}
		
		Dijkstra();
		
		System.out.println(Arrays.toString(dis));
	}

}
