package lanqiaoTest.one;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 *
 */

/**
 * @author 张致邦
 *
 * 2020年3月14日-下午3:33:03
 */
public class _9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		char[][] map = new char[n][m];
		for (int i = 0; i < n; i++) {
			String temp = scan.next();
			map[i] = temp.toCharArray();
			
		}
		int k = scan.nextInt();
		
		dfs(map, k);
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	private static void dfs(char[][] map, int n) {
		
		if (n == 0)
			return ;
		
		Queue<int[]> queue = new LinkedList<int[]>();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 'g') {
					if (i+1 < map.length) queue.offer(new int[] {i+1, j});
					if (i > 0) queue.offer(new int[] {i-1, j});
					if (j > 0) queue.offer(new int[] {i, j-1});
					if (j+1 < map[i].length) queue.offer(new int[] {i, j+1});
				}
			}
		}
		
		while(!queue.isEmpty()) {
			int[] count = queue.poll();
			map[count[0]][count[1]] = 'g';
		}
		
		dfs(map, n-1);
		
	}

}




























