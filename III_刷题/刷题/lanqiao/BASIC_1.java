package lanqiao;

import java.util.Scanner;

public class BASIC_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n%4 == 0) {
			if(n%100 != 0) {
				System.out.print("yes");
			}else if(n%400 == 0) {
				System.out.print("yes");
			}else {
				System.out.print("no");
			}
		}else {
			System.out.print("no");
		}

	}

}
