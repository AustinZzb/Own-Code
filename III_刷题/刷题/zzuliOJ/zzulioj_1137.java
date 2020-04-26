package zzuliOJ;

import java.util.Scanner;

public class zzulioj_1137 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[] s = scan.nextLine().toCharArray();
		
		char c = s[0];
		for (int i = 1; i < s.length; i++) {
			if(s[i]>c)
				c = s[i];
		}
		
		for (int i = 0; i < s.length; i++) {
			if(s[i]==c)
				System.out.print(s[i]+"(max)");
			else {
				System.out.print(s[i]);
			}
		}

	}

}
