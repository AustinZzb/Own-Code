package WRONG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * 一个长度为N的整数序列，编号0 - N - 1。进行Q次查询，查询编号i至j的所有数中，第K大的数是多少。
 * 例如: 1 7 6 3 1。i = 1, j = 3，k = 2，对应的数为7 6 3，第2大的数为6。
 * 
 * 第1行：1个数N，表示序列的长度。(2 <= N <= 50000) 第2 - N + 1行：每行1个数，对应序列中的元素。(0 <= Si <= 10^9) 
 * 第N + 2行：1个数Q，表示查询的数量。(2 <= Q <= 50000) 
 * 第N + 3 - N + Q + 2行：每行3个数，对应查询的起始编号i和结束编号j，以及k。(0 <= i <= j <= N - 1,1 <= k <= j - i + 1)
 * 
 * 错误原因 ：  未知错误！！！！！！！
 * 
 * @author 张致邦
 *
 * 2020年2月3日-下午4:59:46
 */
public class 错误_第K大的数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		int m = scan.nextInt();
		int[][] b = new int[m][3];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = scan.nextInt();
			}
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < b.length; i++) {
			int start = b[i][0], end = b[i][1], K = b[i][2];
			for (int j = start; j <= end; j++) {
				list.add(a[j]);
			}
			Collections.sort(list);
			System.out.println(list.get(list.size() - K));
			list.removeAll(list);
		}
		
	}

}
