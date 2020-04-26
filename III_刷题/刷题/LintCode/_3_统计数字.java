package LintCode;

import java.util.Scanner;

public class _3_Í³¼ÆÊý×Ö {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int n = scan.nextInt();
		int sum = 0;
		
		for(int i=1;i<=n;i++) {
			String s = i+"";
			char[] s_1 = s.toCharArray();
			
			for(int j=0;j<s_1.length;j++) {
				if(Integer.parseInt(s_1[j]+"")==k) {
					sum++;
				}
			}
		}
		
		System.out.print(sum);

	}

}
