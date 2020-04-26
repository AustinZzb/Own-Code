package lanqiao;

import java.util.Scanner;

public class BASIC_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s_1 = scan.next();
		String s_2 = scan.next();
		
		if(s_1.length()!=s_2.length())
			System.out.print(1);
		else if(s_1.equals(s_2)){
			System.out.print(2);
		}else if((s_1.toLowerCase()).equals(s_2.toLowerCase())){
			System.out.print(3);
		}else {
			System.out.print(4);
		}
		
	}

}
