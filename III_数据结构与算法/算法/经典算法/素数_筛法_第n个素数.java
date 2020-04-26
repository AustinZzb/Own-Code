package 经典算法;

import java.util.Scanner;

public class 素数_筛法_第n个素数 {
	/**
	 * 定理： 不大于n的素数的个数为 n/ln（n）
	 * 
	 * 素数打表，速度快
	 */
	private static void fun(int x) {
		
		int n = 1000;
		while((n / Math.log(n)) < x)
			n *= 1.1;
		
		byte[] a = new byte[n];
		
		for (int i = 2; i < n/2; i++) {
			if(a[i] == 1) continue;
			for (int j = 2; j < n/i; j++) {
				if(i * j < n) a[i * j] = 1;
			}
		}
		
		int m = 0;
		for (int i = 2; i < a.length; i++) {
			if(a[i] != 1) m++;
			if(m == x) { 
				System.out.println(i);
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int i = 0, t = 2;
		for (i = 0, t = 2; i < n; i++, t++) {
			if(t == 2) continue;
			boolean  flag = true;
			for (int j = 2; j <= Math.sqrt(t); j++) {
				if(t % j == 0) {
					flag = false;
					break;
				}
			}
			if(!flag)
				i--;
		}
		
		System.out.println(--t);

	}

}
