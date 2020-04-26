package zzuliOJ;

import java.util.Scanner;

public class zzulioj_1132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int j = 0;
		while(n>0 ) {
			char[] s = scan.next().toCharArray();
			int sum = 0;
			for(int i=0;i<s.length;i++) {
				if(s[i]>='0' && s[i]<='9')
					sum++;
			}
			System.out.println(sum);
			n--;
		}

	}

}
