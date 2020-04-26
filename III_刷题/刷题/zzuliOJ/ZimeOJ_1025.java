package zzuliOJ;
//ºÏ·¨µÄIP

import java.util.Arrays;
import java.util.Scanner;

public class ZimeOJ_1025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			String[] s = scan.next().split("\\.");
			if(s.length != 4) {
				System.out.println("correct");
				break;
			}
				
			else {
				int i;
				for(i=0;i<s.length;i++) {
					if(!(Integer.parseInt(s[i])>=0) || !(Integer.parseInt(s[i])<=255))
						break;
				}
				if(i == s.length) {
					System.out.println("wrong");
				}
					
					
			}
		}
		
	}

}
