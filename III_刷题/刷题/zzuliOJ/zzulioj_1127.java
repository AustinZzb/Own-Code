package zzuliOJ;

import java.util.Scanner;

public class zzulioj_1127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		while(true) {
			int n = scan.nextInt();
			if(n == 0)
				break;
			int m = (int) Math.ceil(Math.pow(n, (double)1/3));
			if(Math.pow(m, 3) == n)
				sum ++;
		}
		System.out.print(sum);

	}

}
