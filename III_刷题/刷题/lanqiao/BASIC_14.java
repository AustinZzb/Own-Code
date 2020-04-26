package lanqiao;

import java.util.Scanner;

public class BASIC_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = 0,n = 0,s = 0;
		int t = scan.nextInt();
		
		if(t == 0) 
			System.out.print("0:0:0");
		else {
			int m_0 = t/60;
			m = m_0/60;
			n = m_0%60;
			s = t%60;
			System.out.print(m+":"+n+":"+s);
		}
		
	}

}
