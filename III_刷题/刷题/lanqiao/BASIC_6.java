package lanqiao;

 
import java.util.ArrayList;
import java.util.Scanner;

public class BASIC_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = scan.nextInt();
		
		if(n==1)
			System.out.print(1);
		else {
			System.out.println(1);
			System.out.println(1+" "+1);
			list.add(1);
			list.add(1);
		}
		
		while(n>2) {
			
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			
			System.out.print(1);
			list2.add(1);
			for (int i = 0; i < list.size()-1; i++) {
				int m = list.get(i) + list.get(i+1);
				System.out.print(" "+m);
				list2.add(m);
			}
			System.out.println(" "+1);
			list2.add(1);
			for (int i = 0; i < list2.size(); i++) {
				if(i<list.size())
					list.remove(i);
				list.add(i,list2.get(i));
			}
			
			n--;
			
		}

	}

}
