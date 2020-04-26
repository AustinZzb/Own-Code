package lanqiao;

import java.util.Scanner;

public class BASIC_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}
		
		if(n == 1) {
			System.out.println(num[0]);
			System.out.println(num[0]);
			System.out.println(num[0]);
		}else {
			int max = num[0];
			int min = num[0];
			int sum = num[0];
			for (int i = 1; i < num.length; i++) {
				if(num[i]>max)
					max = num[i];
				sum += num[i];
			}
			
			for (int i = 1; i < num.length; i++) {
				if(num[i]<min)
					min = num[i];
			}
			
			System.out.println(max);
			System.out.println(min);
			System.out.println(sum);
			
		}

	}

}
