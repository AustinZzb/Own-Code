package 递归;

import java.util.Scanner;

/**
 * 整数划分问题
 * 对于正整数n = 6，可以划分为：
 * 6
 * 5+1
 * 4+2 4+1+1
 * ............
 * 1+1+1+1+1+1
 * @author 11586
 *
 */

public class 递归_整数划分 {
	
	public static void f(int m, int[] a, int n) {
		if (m == 0) {
			for (int i = 0; i < n; i++) {
				if (i == 0) 
					System.out.print(a[i]);
				else
					System.out.print("+"+a[i]);
			}
			System.out.println();
			return;
		}
		
		for (int i = m; i > 0; i--) {
			if(n > 0 && i > a[n-1]) continue;
			
			a[n] = i;
			
			f(m-i, a, n+1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int[] a = new int[m];
		f(m,a,0);

	}

}
