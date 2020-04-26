package zzuliOJ;

import java.util.Scanner;

public class zzulioj_1215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[] c = scan.next().toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			if(c[i]>='A' && c[i]<'Z') {
				c[i] = (char)(c[i]+33);
			}else if(c[i]>='a' && c[i]<='z') {
				if(c[i] == 'a' || c[i] == 'b' || c[i] == 'c') {
					c[i] = (char)(2+'0');
				}if(c[i] == 'd' || c[i] == 'e' || c[i] == 'f') {
					c[i] = (char)(3+'0');
				}if(c[i] == 'g' || c[i] == 'h' || c[i] == 'i') {
					c[i] = (char)(4+'0');
				}if(c[i] == 'j' || c[i] == 'k' || c[i] == 'l') {
					c[i] = (char)(5+'0');
				}if(c[i] == 'm' || c[i] == 'n' || c[i] == 'o') {
					c[i] = (char)(6+'0');
				}if(c[i] == 'p' || c[i] == 'q' || c[i] == 'r' || c[i] == 's') {
					c[i] = (char)(7+'0');
				}if(c[i] == 't' || c[i] == 'u' || c[i] == 'v') {
					c[i] = (char)(8+'0');
				}if(c[i] == 'w' || c[i] == 'x' || c[i] == 'y' || c[i] == 'z') {
					c[i] = (char)(9+'0');
				}
			}else if(c[i] == 'Z') {
				c[i] = 'a';
			}
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		
	}

}
