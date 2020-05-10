package zzuliOJ;
//格式错误
import java.util.Scanner;

public class zzulioj_1136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] sum = scan.nextLine().split("\\s+");
		for (int i = 0; i < sum.length; i++) {
			if(sum[i].equals(""))
				continue;
			char[] s = sum[i].toCharArray();
			
			if(s[0]>='a' && s[0]<='z')
				s[0] -= 32;
			
			String s_1 = "";
			for (int j = 0; j < s.length; j++) {
				s_1 += s[j];
			}
			
			sum[i] = s_1;
			
		}
		
		for (int i = 0; i < sum.length; i++) {
			if(sum[i].equals(""))
				continue;
			if(i==sum.length-1)
				System.out.print(sum[i]);
			else {
				System.out.print(sum[i]+" ");
			}
		}
	}

}
