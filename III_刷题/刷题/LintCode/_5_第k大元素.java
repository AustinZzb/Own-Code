package LintCode;

import java.util.Arrays;
import java.util.Scanner;

public class _5_绗琸澶у厓绱� {
	static int[] n = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		String[] s_1 = s.split("\\s+");
		n = new int[s_1.length];
		 
		for(int i=0;i<n.length;i++)
			n[i] = Integer.parseInt(s_1[i]);
		
		int k = scan.nextInt();
		
		digui(0);
		System.out.print(Arrays.toString(n));
		System.out.print(n[k-1]);

	}
	
	static void digui(int cur) {
		if(cur==n.length-1)
			return ;
		int t = 0;
		for(int i=cur+1;i<n.length;i++) {
			if(n[i]>n[cur]) {
				t = n[cur];
				n[cur] = n[i];
				n[i] = t;
			}
		}
		digui(cur+1);
		
	}

}
