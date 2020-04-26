package zzuliOJ;

import java.util.Scanner;

public class zzulioj_1124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double n = scan.nextInt();
		double m = scan.nextInt();
		
		double sum = 0;
		for(double t = 1;n > 0;t++) {
			if(n > t*m) {
				sum += t;
				n -= t*m;
			}else {
				sum += n;
				break;
			}
			sum += 1;
			
		}
		
		System.out.print((int)sum);

	}

}
