package 图;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 本次图的实现，使用的是邻接矩阵存储法
 * 遍历使用的方法是dfs和bfs
 * 
 * 输入案例：
 * 5
 * 1 2		2 4		1 3		1 5		3 5
 * 
 * @author 张致邦
 *
 * 2020年2月10日-上午9:41:21
 */
public class 图的实现与遍历_邻接矩阵 {
	
	private static int[][] arr;         // 存储图
	private static int[] book;          // 图节点的标记数组
	private static int sum = 0; 		// 访问顶点总数
	
	private static void bfs(int n) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(n);
		book[n] = 1;
		
		for (int i = 0; i < queue.size(); i++) {
			for (int j = 1; j < arr.length; j++) {
				if(arr[queue.element()][j] == 1 && book[j] == 0) {
					queue.offer(j);
					book[j] = 1;
				}
					
			}
			System.out.print(queue.poll()+" ");
			i = -1;
		}
		
		
	}
	
	private static void dfs(int n) {
		
		book[n] = 1;
		System.out.print(n+" ");
		sum ++;
		if(sum == arr.length-1) return ;
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[n][i] == 1 && book[i] == 0) {   // 两顶点必须有边，并且该顶点并未被访问
				book[i] = 1;
				dfs(i);
			}
		}
		
		return ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Input ： 输入两个整数N,M，接下来在输入M对整数表示图中的关系");
		int m = scan.nextInt();
		int n = scan.nextInt();
		arr = new int[m+1][m+1];
		book = new int[m+1];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i == j) arr[i][j] = 0;
				else arr[i][j] = 8;
			}
		}
		
		for (int t = 0; t < n; t++) {   // 无向图所以是互相的
			int i = scan.nextInt();
			int j = scan.nextInt();
			arr[i][j] = 1;
			arr[j][i] = 1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
//		dfs(1);
		bfs(1);

	}

}










