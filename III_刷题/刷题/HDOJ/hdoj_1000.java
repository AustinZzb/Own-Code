package HDOJ;

import java.util.Scanner;

public class hdoj_1000 {

	public static void main(String[] args) {
		System.out.println(1);
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int n = scan.nextInt();
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				sum += i;
			}
			System.out.println(sum);
			System.out.println();
		}

	}

}
