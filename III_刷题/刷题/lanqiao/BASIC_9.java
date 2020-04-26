package lanqiao;

import java.util.Scanner;

public class BASIC_9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		// TODO Auto-generated method stub
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int j2 = 0; j2 < 10; j2++) {
					if((i*2 + j*2 +j2) == n) {
						System.out.println(i+""+j+""+""+j2+""+j+""+i);
					}
				}
			}
		}
		
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int j2 = 0; j2 < 10; j2++) {
					if((i*2 + j*2 +j2*2) == n)
						System.out.println(i+""+j+""+""+j2+""+j2+""+j+""+i);
					}
				}
			}
		}

	

}
