package zzuliOJ;

import java.util.Scanner;

public class zzulioj_1140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n>0 && scan.hasNext()) {
			
			String[] s = scan.next().split("\\.");
			int m = scan.nextInt();
			
			char[] c = s[1].toCharArray();
			if(m < c.length)
				System.out.println(Integer.parseInt(c[m-1]+""));
			else 
				System.out.println(0);
			
			n--;
			
		}

	}

}
