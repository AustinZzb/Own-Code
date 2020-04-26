package lanqiao;

import java.util.ArrayList;
import java.util.Scanner;

public class BASIC_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if(n==0)
			System.out.print(0);
			
		while(n!=0){
			
			list.add(0,n%2);
			n /= 2;
		}
		
		
		int m = 4-(list.size()%4);
		for (int i = 0; i < m; i++) {
			list.add(0,0);
		}
		ArrayList<String> list2 = new ArrayList<String>();
		
		for (int i = 0; i < list.size(); i+=4) {
			
			String s = list.get(i)+""+list.get(i+1)+""+list.get(i+2)+""+list.get(i+3)+"";
			String s_11 = "";
			switch (s) {
			case "0000" : s_11 = "0"; break;
			case "0001" : s_11 = "1"; break;
			case "0010" : s_11 = "2"; break;
			case "0011" : s_11 = "3"; break;
			case "0100" : s_11 = "4"; break;
			case "0101" : s_11 = "5"; break;
			case "0110" : s_11 = "6"; break;
			case "0111" : s_11 = "7"; break;
			case "1000" : s_11 = "8"; break;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
			case "1001" : s_11 = "9"; break;
			case "1010" : s_11 = "A"; break;
			case "1011" : s_11 = "B"; break;
			case "1100" : s_11 = "C"; break;
			case "1101" : s_11 = "D"; break;
			case "1110" : s_11 = "E"; break;
			case "1111" : s_11 = "F"; break;
			}
			
			list2.add(s_11);
			
		}
		
		int t = 0;
		for (int i = 0; i < list2.size(); i++) {
			if(list2.get(i).equals("0") && t==0)
				continue;
			else {
				System.out.print(list2.get(i));
				t++;
			}
		}
		
	}

}
