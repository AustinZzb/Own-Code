package zzuliOJ;

import java.util.Scanner;

public class zzulioj_1139 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String string = null;
		int max = 0;
		while(n>0) {
			if(max == 0) {
				String string2 = scan.nextLine();
				char[] s = string2.toCharArray();
				max = s.length;
				string = string2;
			}else {
				String string2 = scan.nextLine();
				char[] s = string2.toCharArray();
				if(s.length < max) {
					string = string2;
					max = s.length;
				}
					
			}
			n--;
		}
		
		System.out.print(string);

	}

}
