package lanqiao;

import java.util.Scanner;

public class BASIC_22 {
	private static String AN = "";
	
	private static void An(int n, int m, String an) {
		AN = an + (char)('A'+m)+"" +an;
		if(m == n-1)
			return ;
		An(n, m+1, AN);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		An(n, 0, "");
		System.out.println(AN);
	}
	
}
