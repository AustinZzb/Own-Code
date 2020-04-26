package 递归;

/**
 * 利用递归解决一些比较常规的问题
 * 
 * 1、使用递归打印从 n-0
 * 2、递归实现求解数组的和_0、递归实现求解数组的和_1
 * 3、递归实现两个字符串的比较_0
 * 4、递归实现从n个球中取出m个球一共有多少种解法（超级经典！！！）
 * 5、递归实现n个元素的全排列(超级经典！！！有利用回溯！！！)
 * 6、递归实现求两个字符串最长子序列的长度 （超级经典！！！）
 * 7、递归实现字符串反转
 * 8、递归实现求出杨辉三角第m层第n个系数的值
 * 9、递归实现计算m个A，n个B共有多少种排列方式
 * 
 */

import java.util.Arrays;

import java.util.Scanner;

public class 递归_实例集合 {
	
	
	// 使用递归打印从 n-0
//	public static void f(int n) {
//		System.out.println(n);
//		if (n==0) {
//			return ;
//		}
//		f(--n);
//	}
	
	 
	// 递归实现求解数组的和_0
//	public static void f(int[] arr, int i, int sum) {
//		if (i == arr.length) {
//			System.out.println(sum);
//			return ;
//		}
//		sum += arr[i];
//		f(arr, i+1, sum); 
//	}
	// 递归实现求解数组的和_1
//	public static int f(int[] arr,int i) {	
//		if(i == arr.length) return 0;
//		return arr[i] + f(arr, i+1) ;
//	}
	
	
	// 递归实现两个字符串的比较_0
//	public static boolean f(String string_0, String  string_1) {
//		if(string_0.length() != string_1.length()) return false;
//		if(string_0.length() == 0) return true;
//		if(string_0.charAt(0) != string_1.charAt(0)) return false;
//		return f(string_0.substring(1), string_1.substring(1));
//	}
	
	
	//递归实现从n个球中取出m个球一共有多少种解法
	/**
	 * 在此递归中的解题思想是：对一个球去进行考虑，无非两种情况：取 || 不取  从而进行递归
	 * @param args
	 */
//	public static int f(int n, int m) {
//		if(n < m) return 0;
//		if(n == m || m == 0) return 1;
//		return f(n-1, m-1) + f(n-1, m);
//	}
	
	
	//递归实现n个元素的全排列_0
//	public static void f(char[] arr, int t) {
//		if (arr.length-1 == t) {
//			System.out.println(Arrays.toString(arr));
//		}
//		char temp;
//		for (int i = t; i < arr.length; i++) {
//			temp = arr[t];
//			arr[t] = arr[i];
//			arr[i] = temp;
//			f(arr, t+1);
//			temp = arr[t];
//			arr[t] = arr[i];
//			arr[i] = temp;
//		}		
//	}
	
	
	//递归实现求两个字符串最长子序列的长度 
//	public static int f(String s1, String s2) {
//		if (s1.length() == 0 || s2.length() == 0) return 0;
//		if(s1.charAt(0) == s2.charAt(0)) 
//			return f(s1.substring(1), s2.substring(1))+1;
//		else 
//			return Math.max(f(s1.substring(1), s2), f(s1, s2.substring(1)));
//	}
	
	
	//递归实现字符串反转
//	public static String f(String s) {
//		if (s == null || s.length() < 2) return s;
//		return f(s.substring(1)) + s.charAt(0);
//	}
	
	
	//归实现求出杨辉三角第m层第n个系数的值
//	public static int f(int m, int n) {
//		if(m == 0) return 1;
//		if(n == 0 || n == m) return 1;
//		return f(m-1, n-1) + f(m-1, n);
//	}
	
	
    //递归实现计算m个A，n个B共有多少种排列方式
//	public static int f(int m, int n) {
//		if(m == 0 || n == 0) return 1;
//		return  f(m-1, n) + f(m, n-1);
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		// 使用递归打印从 n-0
//		f(20);
		
		
		// 递归实现求解数组的和_0
//		int n = scan.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = scan.nextInt();
//		}
//		f(arr, 0, 0);
		// 递归实现求解数组的和_1
//		System.out.println(f(arr, 0));
	
	
		// 递归实现字符串比较_0
//		String string = scan.next();
//		String string2 = scan.next();
//		System.out.println(f(string, string2));
		
		
		//递归实现从n个球中取出m个球一共有多少种解法
//		int n = scan.nextInt();
//		int m = scan.nextInt();
//		System.out.println(f(n, m));
		
		
		//递归实现n个元素的全排列_0
//		String string = scan.next();
//		f(string.toCharArray(), 0);
		
		
		//递归实现求两个字符串最长子序列的长度 
//		String string = scan.next();
//		String string1  = scan.next();
//		System.out.println(f(string, string1));
		
		
		//递归实现字符串反转
//		String string = scan.next();
//		System.out.println(f(string));
		
		
		//归实现求出杨辉三角第m层第n个系数的值
//		int m = scan.nextInt();
//		int n = scan.nextInt();
//		System.out.println(f(m, n));
		
		
		//递归实现计算m个A，n个B共有多少种排列方式
//		int m = scan.nextInt();
//		int n = scan.nextInt();
//		System.out.println(f(m, n));
		
		
	}
}





















