package lanqiao;

import java.util.Scanner;

// ú����Ŀ
public class lanqiao16_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				sum += j;
			}
		}
		
		System.out.println(sum);

	}

}
