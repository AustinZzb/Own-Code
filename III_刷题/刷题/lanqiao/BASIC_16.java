package lanqiao;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class BASIC_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 2; i < 10000; i++) {
			
			int j;
			for (j = 2; j < Math.sqrt(i); j++) {
				if(i%j == 0)
					break;
			}
			
			if (j>=Math.sqrt(i)) 
				list.add(i);
			
		}
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = n; i <= m; i++) {
			int t = i;
			list2.removeAll(list2);
			
			while (t!=0) {
				
				int h = 0;
				for (int j = 0; j < list.size(); j++) {
					h = list.get(j);
					if(t%h == 0) {
						list2.add(h);
						break;
					}	
				}
				t /= h;
				
			}
			
			System.out.print(i+"=");
			
			for (int j = 0; j < list2.size(); j++) {
				
				if(j == 0)
					System.out.print(list2.get(j));
				else {
					System.out.print("*"+list2.get(j));
				}
				
			}
			
			System.out.println();
			
		}

	}

}
