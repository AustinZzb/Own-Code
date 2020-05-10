package others;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 给定两个数m，n；找出m和n无法组成的最大的数
 * @author 11586
 *
 */

public class _买不到的数 {
	private static final int N = 999 * 99;
	public static int[] a = new int[N];
	
	public static int f_0(int[] arr, int n) {
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			 if (arr[i] >= 1) {
				sum++;
				if(sum == n)
					return i-n;
			}else {
				sum = 0;
			}
		}
		
		return -1;
		
	}
	
	public static int f_1(int n, int m) {
		
		for (int i = 0; i < N/n; i++) {
			for (int j = 0; j < (N - i * n) / m; j++) {
				if((i*n + j*m) < N) a[i*n + j*m]++;
			}
		}
		
		return f_0(a, Math.min(n, m));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		System.out.println(f_1(n, m));

	}

}
