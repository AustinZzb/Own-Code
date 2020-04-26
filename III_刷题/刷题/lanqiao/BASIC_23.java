package lanqiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BASIC_23 {
	
	private static void test(String[] n) {
		int count = 1;
		String ans = n[0];
		for (int i = 1; i < n.length - 1; i++) {
			if(!n[i].equals(n[0])) count--;
			else count++;
			if(count == 0)
				ans = n[i+1];
		}
		count = 0;
		for (int i = 0; i < n.length; i++) {
			if(n[i].equals(ans) && count == 0)
				System.out.print(i+1);
			else if(n[i].equals(ans))
				System.out.print(" " + (i+1));
			count++;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] strings = new String[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < strings.length; j++) {
				strings[i] += scanner.nextInt() + "";
			}
		}
		test(strings);
	}
	
}
