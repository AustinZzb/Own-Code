package 经典算法;

import java.util.Scanner;

public class 辗转相除法 {

	public static int gcd(int n, int m) {
		if(n == 0) return m;
		return gcd(m%n, n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		while (true) {
			if(m == 0) {
				System.out.println(n);
				break;
			}
			int temp_0 = m;
			m = n % m;
			n = temp_0;
		}
		
		System.out.println("递归解法："+gcd(n, m));
		
	}

}
