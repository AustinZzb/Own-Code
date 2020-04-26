/*
 *	问题描述
　　对于一个 n 行 m 列的表格，我们可以使用螺旋的方式给表格依次填上正整数，我们称填好的表格为一个螺旋矩阵。
　　例如，一个 4 行 5 列的螺旋矩阵如下：
　　1 2 3 4 5
　　14 15 16 17 6
　　13 20 19 18 7
　　12 11 10 9 8
输入格式
　　输入的第一行包含两个整数 n, m，分别表示螺旋矩阵的行数和列数。
　　第二行包含两个整数 r, c，表示要求的行号和列号。
输出格式
　　输出一个整数，表示螺旋矩阵中第 r 行第 c 列的元素的值。
样例输入
4 5
2 2
样例输出
15
 */
package lanqiaoTest.two;

import java.util.Scanner;

/**
 * 	@author 张致邦
 *
 * 	2020年4月25日-下午3:57:50
 */
public class _8 {

	/**@method
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt(), n = in.nextInt(), r = in.nextInt(), c = in.nextInt();
		fun(m, n, r, c);
		in.close();
	}
	
	public static void fun(int m, int n, int r, int c) {
		int sum = m*n, i = 0, j = 0, flag = 1;
		int[][] map = new int[m][n];
		
		for (int t = 1; t <= sum; t++) {
			map[i][j] = t;
			if (i+1 == r && j+1 == c) 
				break;
			
			if (flag == 1 && j < n-1 && map[i][j+1] == 0) {
				j++;
			} else if (flag == 2 && i < m-1 && map[i+1][j] == 0) {
				i++;
			} else if (flag == 3 && j > 0 && map[i][j-1] == 0) {
				j--;
			} else if (flag == 4 && i > 0 && map[i-1][j] == 0) {
				i--;
			} else {
				if (j < n-1 && map[i][j+1] == 0) { // 向右走
					j++;
					flag = 1;
				} else if (i < m-1 && map[i+1][j] == 0) { // 向下走
					i++;
					flag = 2;
				} else if (j > 0 && map[i][j-1] == 0) {	// 向左走
					j--;
					flag = 3;
				} else {
					i--;
					flag = 4;
				}
			}
		}
		
		System.out.println(map[i][j]);
	}
}
