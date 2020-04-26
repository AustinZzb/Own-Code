package LintCode;

import java.util.Scanner;

// A+B问题
public class _1_A加B问题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int a = aplusb(n,m);
		System.out.print(a);
	}
	
	public static int aplusb(int a, int b) {        
		// write your code here, try to do it without arithmetic operators.        
		if(a==0) return b;        
		if(b==0) return a;        
		int x1,x2;        
		x1=a^b;        
		x2=(a&b)<<1;        
		return aplusb(x1,x2);    
	
	}
	
}