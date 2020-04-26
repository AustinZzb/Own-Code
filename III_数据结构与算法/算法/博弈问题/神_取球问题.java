package 博弈问题;

/**
 * A 两个人轮流取n个球，每次只能取1，3，7，8，取到最后一颗球的人失败（本题求解先取的人是否会获胜）
 * A 只用递归太耗时
 * 
 * @author 张致邦
 *
 * 2020年1月31日-下午7:31:29
 */

import java.util.ArrayList;
import java.util.Scanner;

public class 神_取球问题 {
	private static void fun_1(int n) {
		
		int[] ans = new int[10001];
		ans[1] = 0;
		ans[2] = 1;
		ans[3] = 0;
		ans[4] = 1;
		ans[5] = 0;
		ans[6] = 1;
		ans[7] = 0;
		ans[8] = 1;
		ans[9] = 1;
		for (int i = 10; i <= 10000; i++) {
			ans[i] = 0;
			if(ans[i - 1] == 0) ans[i] = 1;
			if(ans[i - 3] == 0) ans[i] = 1;
			if(ans[i - 7] == 0) ans[i] = 1;
			if(ans[i - 8] == 0) ans[i] = 1;
		}
		
		if(ans[n] == 1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}
	
	
	// 递归法，太差
	public static boolean fun(int n) {
		if(n == 0) return true;
		
		if(n >= 1 && fun(n-1)  == false) return true; 
		if(n >= 3 && fun(n-3)  == false) return true; 
		if(n >= 7 && fun(n-7)  == false) return true; 
		if(n >= 8 && fun(n-8)  == false) return true; 
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = new Scanner(System.in).nextInt();
//		System.out.println(fun(n));
		fun_1(n);
	}

}
