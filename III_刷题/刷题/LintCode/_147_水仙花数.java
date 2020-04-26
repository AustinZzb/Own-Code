package LintCode;

import java.util.ArrayList;
import java.util.Scanner;

public class _147_Ë®ÏÉ»¨Êý {
	
	static int n = 0;

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> a = new  ArrayList<Integer>();
		n = scan.nextInt();
		
		if(n==1) {
			for(int i=0;i<10;i++)
				a.add(i);
			System.out.print(a);
		}else if(n==2)
			System.out.print(a);
		else {
			
			
			for(int i = (int) Math.pow(10, n-1) ;i< Math.pow(10, n);i++) {

				if(fanhui(i))
					a.add(i);
					
			}
			
			System.out.print(a);
		}
		
	}
	
	public static boolean fanhui(int s) {
		int sum =0;
		char[] cs = (s+"").toCharArray();
		
		for(int j=0;j<cs.length;j++) {
			sum += Math.pow(Integer.parseInt(cs[j]+""), n);
		}
		
		if(sum == s)
		   return true;
		return false;
	}

}









