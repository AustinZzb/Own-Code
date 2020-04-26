package LintCode;

import java.util.Arrays;
import java.util.Scanner;

public class _9_FizzBuzzŒ Ã‚ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] s = new String[n];
		
		for(int i=1;i<=n;i++) {
			int j =0;
			
			while(i%3 == 0) {
				s[i-1] = "fizz";
				j++;
				break;
			}
			while(i%5 == 0) {
				s[i-1] = "buzz";
				j++;
				break;
			}
			while(i%3==0 && i%5==0) {
				s[i-1] = "fizz buzz";
				j++;
				break;
			}
			if(j == 0)
				s[i-1] = i+"";
			
		}
		
		System.out.print(Arrays.toString(s));

	}

}
