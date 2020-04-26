package lanqiao;

import java.util.ArrayList;
import java.util.Scanner;

public class BASIC_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 26; i++) {
			int t = 'A';
			list.add(t+i);
		}
		
		ArrayList<Integer> list_1 = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			int t = 'A';
			list_1.add(t+i);
			System.out.print((char)(t+i));
		}
		System.out.println();		
		
		ArrayList<Integer> list_2 = new ArrayList<Integer>();
		for (int i = 0; i < list_1.size(); i++) {
			list_2.add(list_1.get(i));
		}
		
		int i = 1;
		for (int p = 1; p < n; p++) {
			
			int t = list.get(i);
			list_2.add(0,t);
			list_2.remove(list_2.size()-1);
			
			for (int j = 0; j < list_2.size(); j++) {
				int t1 = list_2.get(j);
				System.out.print((char)t1);
			}
			System.out.println();
			
			i++;
			
		}
		
	}

}
