package zzuliOJ;

import java.util.Scanner;

public class ZimeOJ_1027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int[] n = new int[2*m-1];
		int sum = 0;
		
		for(int i=0;i<n.length;i++) {
			n[i] = scan.nextInt();
			sum^=n[i];
		}
		
		System.out.print(sum);

	}

}
