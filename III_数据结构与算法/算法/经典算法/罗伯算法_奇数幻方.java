/*
 *	罗伯算法 ---> 求解奇数幻方
 *	i. 把1放到二维数组的中间一列
 *	ii.i+1 放到 i 的↙↖↘↗（四选一即可）
 *	       超出下边界平移至上边界，超出右边界平移至左边界，其余两种情况同理
 *	       如果 i+1 预放置位置已经有数据，那么就把 i+1 放到 i 的正上方或者正下方（与大体移动方向相反）
 */
package 经典算法;

import java.util.Scanner;

/**
 * 	@author 张致邦
 *
 * 	2020年3月22日-下午5:33:17
 */
public class 罗伯算法_奇数幻方 {

	public static void main(String[] args) {
		System.out.println("输入奇数做幻方， 输入偶数退出程序");
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		
		while (m%2 != 0) {
			Lobo(m);
			m = scan.nextInt();
		}
	}
	
	private static void Lobo(int n) {
		int x = 0, y = n/2, old_x = x, old_y = y, count = 1, len = (n*n+"").length();
		int[][] map = new int[n][];
		
		while (count <= n*n) {
			old_x = x; old_y = y;
			map[x--][y++] = count++;
			
			if (x < 0) {
				x = n-1;
			}
			if (y > n-1) {
				y = 0;
			}
			if (map[x][y] != 0) {
				x = old_x - 1;
				y = old_y;
			}
		}
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (j == 0)
					System.out.printf("%"+len+"d", map[i][j]);
				else
					System.out.printf(" %"+len+"d", map[i][j]);
			}
			System.out.println();
		}	
	}

}
