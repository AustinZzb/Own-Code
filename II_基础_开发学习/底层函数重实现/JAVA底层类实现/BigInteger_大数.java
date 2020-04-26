package JAVA底层类实现;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 实现Java的大数相乘相加  （整数）
 * 利用分治实现进行实现
 * 
 * @author 张致邦
 *
 * 2020年2月8日-上午9:23:43
 */
public class BigInteger_大数 {
	
	private static String mult(String a, String b) {
		
		if(a.length() <= 4 && b.length() <= 4) return Integer.parseInt(a) * Integer.parseInt(b) + "";  // 如果传进的数字比较小，就可以直接计算
		
		if(a.length() > 4) {  
			int k = a.length() / 2;  // 利用分治思想
			String a1 = a.substring(0,k);
			String a2 = a.substring(k);
			return add(mult(a1, b)+zero(a2.length()), mult(a2, b));
		}
		
		return mult(b, a);  // 如果b>4，避免重复代码，直接递归 ！！     巧妙
		
	}

	private static String zero(int n) {  // 利用乘法的性质，把一个数分成两个数取乘以另外一个数，那么需要在高位相乘的地方向后补0
		// TODO Auto-generated method stub
		if(n == 0) return "";            // 该方法同样巧妙的利用递归！！
		if(n == 1) return "0";
		return zero(n/2) + zero(n/2) + zero(n%2);
	}

	private static String add(String a, String b) {  // 同样是利用分治思想
		if(a.length() <= 8 && b.length() <= 8) return Integer.parseInt(a) + Integer.parseInt(b) + "";
		
		String a1 = "0";
		String a2 = a;
		if(a.length() > 8) {
			a1 = a.substring(0,a.length()-8);
			a2 = a.substring(a.length()-8);
		}
		
		String b1 = "0";
		String b2 = b;
		if(b.length() > 8) {
			b1 = b.substring(0,b.length()-8);
			b2 = b.substring(b.length()-8);
		}
		
		String temp = add(a2, b2);
		while(temp.length() < 8) temp = "0" + temp;             // 不足八位需要向前面补0
		if(temp.length() <= 8) return add(a1, b1) + temp;
		else return add(add(a1, b1), "1") + temp.substring(1);  // 把仅为给删掉
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input a+b || a*b ：");
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			
			String string = scan.nextLine();
			if(string.contains("+")) {
				String[] aStrings = string.split("\\+");
				System.out.println("BigInteger_大数     : " + add(aStrings[0], aStrings[1]));
				System.out.println("BigInteger_JAVA : " + new BigInteger(aStrings[0]).add(new BigInteger(aStrings[1])));
			}else if(string.contains("*")) {
				String[] asStrings = string.split("\\*");
				System.out.println("BigInteger_大数     ： " + mult(asStrings[0], asStrings[1]));
				System.out.println("BigInteger_JAVA : " + new BigInteger(asStrings[0]).multiply(new BigInteger(asStrings[1])));				
			}else {
				System.out.println("输入不合法");
			}
			
		}
	}

}
