package others;

import java.util.Scanner;

/**
 * 现在给你一个自然数 nn，它的位数小于等于一百万，现在你要做的就是求出这个数整除九之后的余数。
 * 输入格式
 * 第一行有一个整数 m(1 \le m \le 8)m(1≤m≤8)，表示有 mm 组测试数据。
 * 随后 mm 行每行有一个自然数 nn。
 * 输出格式
 * 输出 nn 整除九之后的余数，每次输出占一行。
 * 输出时每行末尾的多余空格，不影响答案正确性
 * 
 * 题解： 将每位数相加对9取模，则为原数对9取模
 * 
 * @author 张致邦
 *
 * 2020年2月11日-下午3:40:02
 */
public class _九余数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			String string = scan.next();
			int ans = 0;
			for (int j = 0; j < string.length(); j++) {
				ans += Integer.parseInt(string.valueOf(string.charAt(j))) % 9;
			}
			System.out.println(ans % 9);
		}

	}

}
