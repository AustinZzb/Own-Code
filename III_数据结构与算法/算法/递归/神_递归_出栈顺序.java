package 递归;

import java.util.Scanner;

/**
 * 有n个数，按照顺序进栈，出栈和离栈可以交错
 * 
 * @author 张致邦
 *
 * 2020年2月1日-下午7:16:19
 */

public class 神_递归_出栈顺序 {
	
	// a表示栈外等待的数，b表示栈内的数
	public static int fun(int a, int b) {
		if(a == 0) return 1;
		if(b == 0) return fun(a - 1, 1);
		return fun(a - 1, b + 1) + fun(a, b - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 17; i++) {
			System.out.println(fun(i, 0));
		}

	}

}
