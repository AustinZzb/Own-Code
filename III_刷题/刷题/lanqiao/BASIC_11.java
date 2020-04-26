package lanqiao;

import java.util.ArrayList;
import java.util.Scanner;

public class BASIC_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[] c = scan.next().toCharArray();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < c.length; i++) {
			
			String s_11 = null;
			switch (c[i]) {
			case '0' : s_11 = "0000"; break;
			case '1' : s_11 = "0001"; break;
			case '2' : s_11 = "0010"; break;
			case '3' : s_11 = "0011"; break;
			case '4' : s_11 = "0100"; break;
			case '5' : s_11 = "0101"; break;
			case '6' : s_11 = "0110"; break;
			case '7' : s_11 = "0111"; break;
			case '8' : s_11 = "1000"; break;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
			case '9' : s_11 = "1001"; break;
			case 'A' : s_11 = "1010"; break;
			case 'B' : s_11 = "1011"; break;
			case 'C' : s_11 = "1100"; break;
			case 'D' : s_11 = "1101"; break;
			case 'E' : s_11 = "1110"; break;
			case 'F' : s_11 = "1111"; break;
			}
			
			char[] c_1 = s_11.toCharArray();
			for (int j = 0; j < c_1.length; j++) {
				
				list.add(Integer.parseInt(c_1[j]+""));
				
			}
			
		}
		
		long sum = 0;
		for (int i = list.size()-1 , j = 0; i >=0 ; i--, j++) {
			if(list.get(i) == 0)
				sum += 0;
			else {
				sum += Math.pow(2, j);
			}
		}
		
		System.out.print(sum);
		
	}

}
