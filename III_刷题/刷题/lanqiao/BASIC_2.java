package lanqiao;

import java.util.ArrayList;

public class BASIC_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0 ; i < 32; i++) {
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			int n = i;
			while(n!=0) {
				
				list.add(0, n%2);
				n /= 2;
				
			}
			
			if(list.size() < 5) {
				for (int j = 0; j < (5-(list.size()%5)); j++) {
					System.out.print("0");
				}
			}
			
			for (int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j));
			}
			
			System.out.println();
			
		}
		
	}

}
