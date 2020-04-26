package zzuliOJ;
// ´ð°¸´íÎó
import java.util.Scanner;

public class zzulioj_1089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double sum = 1;
		for(int i=1;i<=n;i++) {
			
			sum *= i;
			while(sum>=10) 
				sum /= 10;
			System.out.printf("%.0f\n",sum);
			
		}
		System.out.printf("%.0f",sum);

	}

}
