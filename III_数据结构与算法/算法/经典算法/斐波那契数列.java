package 经典算法;

/**
 * A 比较处理斐波那契的两种方法
 * A 真·代码
 */

import java.util.Scanner;
import 工具类.TimeTool;
import 工具类.TimeTool.Task;;

public class 斐波那契数列 {
	
	/**
	 * A 递归处理斐波那契，代码简洁，耗时，时间复杂度O(2^n)
	 * @param args
	 */
//	public static int fic(int n) {
//		if (n == 1 || n == 2) {
//			return 1;
//		}
//		return fic(n-1)+fic(n-2);
//	}
	
	
	/**
	 * A 简单处理斐波那契，时间复杂度O(n)
	 * @param args
	 */
	public static int fic(int n) {
		
		if (n <= 2) {
			return 1;
		}else {
			
			int fic_1 = 1;
			int fic_2 = 1;
			
			for (int i = 0; i < n-2; i++) {
				
				int t = fic_1;
				fic_1 = fic_2;
				fic_2 += t;
				
			}
			
			return fic_2;
			
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		TimeTool.check("fib_1", new Task() {
			@Override
			public void execute() {
				// TODO Auto-generated method stub
				System.out.println(fic(n));
			}
		});
				
	}

}























