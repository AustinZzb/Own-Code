package others;

import java.util.Scanner;

/**
 * 子序列（不是连续的）
 * 
 * @author 张致邦
 *
 * 2020年2月2日-下午4:02:58
 */

public class _最大子序列 {
	
	public static int fun(String s, String s1) {
		
		if(s.length() == 0 || s1.length() == 0) return 0;
		
		if(s.charAt(0) == s1.charAt(0))
			return fun(s.substring(1), s1.substring(1)) + 1;
		else {
			return Math.max(fun(s, s1.substring(1)), fun(s.substring(1), s1));
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String string = scan.next();
		String string2 = scan.next();
		System.out.println(fun(string, string2));
	}

}
