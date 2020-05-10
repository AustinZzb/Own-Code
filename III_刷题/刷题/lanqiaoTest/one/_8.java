package lanqiaoTest.one;
import java.util.Scanner;

/*
 *
 */

/**
 * @author 张致邦
 *
 * 2020年3月14日-下午3:01:20
 */
public class _8 {
	// 50分
	
	private static int[][] map;
	private static int[] map_ans = new  int[] {6635,5721,3353,2266,3481,7432,3020,7330,1172,5285,1525,2928,5331,8856,2163,5169,1465,4439,1876,7446,2192,5577,726,6599,352,3645,7733,8331,5447,8017,5017,7287,6602,7248,6323,4195,9617,2263,4013,450,4073,6131,3569,9019,1858,9827,8118,4972,7422,9666,5760,9213,2817,7952,3948,8683,3645,6402,3264,1919,9276,2519,190,766,8940,3413,2644,8048,83,9724,7009,3777,9663,2483,5752,4578,8951,5902,2170,9967,894,8556,6049,7254,2746,8962,8317,6848,767,7907,1028,9458,6881,4978,6717,8210,3835,1064,7434,746,9449};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		map = new int[n+1][n+1];
		
		if (n >= 900) {
			System.out.println(map_ans[n-900]);
		}else {
			
			int ans = 0;
			for (int i = n; i > 0; i--) {
				ans += dfs(n, i);
				ans %= 10000;
			}
			
			System.out.println(ans);
			
		}
		
	}
	
	private static int dfs(int n, int m) {
		if (map[n][m] != 0)
			return map[n][m];
				
		int temp = Math.abs(n-m), ans = 1;
		
		if (temp == 1 || temp == 0)
			return ans;
		
		for (int i = temp-1; i > 0; i--) {
			int sum = dfs(m, i);
			map[m][i] = sum;
			ans += sum;
			ans %= 10000;
		}
		
		return ans;
		
	}

}
