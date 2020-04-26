package zzuliOJ;

import java.util.Arrays;
import java.util.Scanner;

public class zzulioj_1218 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n>0) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			char[] t = (a+"").toCharArray();
			char[] t_1 = (b+"").toCharArray();
			String string = "";
			String string2 = "";
			
			for (int i = t.length-1; i >= 0; i--) {
				string += String.valueOf(t[i]);
			}
			for (int i = t_1.length-1; i >= 0; i--) {
				string2 += String.valueOf(t_1[i]);
			}
			a = Integer.parseInt(string);
			b = Integer.parseInt(string2);
			
			System.out.println(a+b);
			n--;
		}

	}

}
