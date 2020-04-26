package lanqiao;

import java.util.Scanner;

public class BASIC_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < list.length; i++) {
			list[i] = scan.nextInt();
		}
		
		int sum = -1;
		int m = scan.nextInt();
		for (int i = 0; i < list.length; i++) {
			if(list[i] == m) {
				sum = i;
				break;
			}
				
		}
		
		if(sum == -1)
			System.out.print(sum);
		else {
			System.out.print(sum+1);
			
		}

	}

}
