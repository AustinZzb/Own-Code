package �����㷨;

import java.util.Scanner;

public class _��ŵ����Ϸ {
	
	private static int sum = 1;
	private static void fun(int n, String x, String y, String z) {
		sum++;
		
		if(n == 1) 
			System.out.println(x + "-->" + z);
		else {
			fun(n-1, x, z, y);
			System.out.println(x + "-->" + z);
			fun(n-1, y, x, z);
		}
			
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������Ϸ��ǰ�����������");
		while (scan.hasNext()) {
			int n = scan.nextInt();
			fun(n, "x", "y", "z");
			System.out.println(sum);
		}
	}
	
}
