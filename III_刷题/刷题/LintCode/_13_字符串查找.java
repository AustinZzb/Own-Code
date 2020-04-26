package LintCode;

import java.util.Scanner;
/**
 * 对于一个给定的 source 字符串和一个 target 字符串
 * 你应该在 source 字符串中找出 target 字符串出现的第一个位置(从0开始)。如果不存在，则返回 -1。
 * @author 张致邦
 *
 * 2020年2月28日-下午4:39:33
 */
public class _13_字符串查找 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s_1 = scan.next();
		String s_2 = scan.next();
		
		char[] arr_1 = s_1.toCharArray();
		char[] arr_2 = s_2.toCharArray();
		
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < arr_1.length-arr_2.length+1; i++) {
			flag = true;
			for (int j = 0; j < arr_2.length; j++) {
				if (arr_1[i+j]!=arr_2[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				count = i;
				break;
			}
		}
		
		if (flag) {
			System.out.print(count);
		}else {
			System.out.print(-1);
		}
		
	}

}
