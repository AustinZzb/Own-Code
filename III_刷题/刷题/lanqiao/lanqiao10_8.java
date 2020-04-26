package lanqiao;

import java.util.Scanner;

// ’€œﬂ÷–µ„

public class lanqiao10_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] n_1 = new int[n][2];
		
		for(int i=0;i<n;i++) {
			for(int j=0; j<2;j++) {
				n_1[i][j] = scan.nextInt();
			}
		}
		
		float a = n_1[n-1][0]/2;
		float b = 0;
		int x = 0, x_1 = 0, y = 0, y_1 = 0;
		
		
		for(int i=0;i<n_1[i].length;i++) {
			
			if(n_1[i][0] >a) {
				x = n_1[i-1][0];
				x_1 = n_1[i][0];
				y = n_1[i-1][1];
				y_1 = n_1[i][1];
				break;
			}
			
		}
		
		int k = (y_1-y)/(x_1-x);
		int b_1 = y-k*x;
		b = k*a+b_1;
		
		System.out.printf("%.1f, %.1f",a,b);
	}

}
