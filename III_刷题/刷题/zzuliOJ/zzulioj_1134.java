package zzuliOJ;

import java.util.Scanner;

public class zzulioj_1134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[] s = scan.nextLine().toCharArray();
		String s_1 = "";
		
		for(int i=0;i<s.length;i++) {
			if(s[i]>='0' && s[i]<='9')
				s_1 += s[i];
		}
		
		if(s_1.equals("")) {
			System.out.print(0);
		}else {
			System.out.print(Integer.parseInt(s_1)*2);
		}

	}

}
