package zzuliOJ;
//答案错误

import java.util.Scanner;

public class zzulioj_1138 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[] s = scan.nextLine().toCharArray();
		int i = 0;
		for (i = 0; i < s.length; i++) {
			if(i==0 && !((s[i]>='a' && s[i]<='z') || (s[i]>='A' && s[i]<='Z') || s[i] == '_' )) {
				System.out.print("no");
				break;
			}else if(!((s[i]>='a' && s[i]<='z') || (s[i]>='A' && s[i]<='Z') || s[i] == '_' || (s[i]>='0' && s[i]<='9'))){
				
				System.out.println(i);System.out.print("no");
				break;
			}
		}
		
		if(i == s.length)
			System.out.print("yes");

	}

}
