package zzuliOJ;

import java.util.Scanner;

public class zzulioj_1216 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String string = "";
		while(scan.hasNext()) {
			string = scan.nextLine();
			if((string.toLowerCase()).equals("end"))
				break;
			
			char[] c = string.toCharArray();
			
			for (int i = 0; i < c.length; i++) {
				char t_1 = String.valueOf(c[i]).toUpperCase().charAt(0);
				if(t_1 == 'A' || t_1 == 'W' || t_1 == 'F') {
					c[i] = 'I';
				}else if(t_1 == 'D' || t_1 == 'P' || t_1 == 'G' || t_1 == 'B') {
					c[i] = 'e';
				}else if(t_1 == 'C') {
					c[i] = 'L';
				}else if(t_1 == 'M') {
					c[i] = 'o';
				}else if(t_1 == 'S') {
					c[i] = 'v';
				}else if(t_1 == 'L') {
					c[i] = 'Y';
				}else if(t_1 == 'X') {
					c[i] = 'u';
				}
			}
			
			for (int i = 0; i < c.length; i++) {
				System.out.print(c[i]);
			}
			
			
			System.out.println();
		}
		

	}

}
