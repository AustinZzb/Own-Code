package �ݹ�;

/**
 * ���õݹ���һЩ�Ƚϳ��������
 * 
 * 1��ʹ�õݹ��ӡ�� n-0
 * 2���ݹ�ʵ���������ĺ�_0���ݹ�ʵ���������ĺ�_1
 * 3���ݹ�ʵ�������ַ����ıȽ�_0
 * 4���ݹ�ʵ�ִ�n������ȡ��m����һ���ж����ֽⷨ���������䣡������
 * 5���ݹ�ʵ��n��Ԫ�ص�ȫ����(�������䣡���������û��ݣ�����)
 * 6���ݹ�ʵ���������ַ���������еĳ��� ���������䣡������
 * 7���ݹ�ʵ���ַ�����ת
 * 8���ݹ�ʵ�����������ǵ�m���n��ϵ����ֵ
 * 9���ݹ�ʵ�ּ���m��A��n��B���ж��������з�ʽ
 * 
 */

import java.util.Arrays;

import java.util.Scanner;

public class �ݹ�_ʵ������ {
	
	
	// ʹ�õݹ��ӡ�� n-0
//	public static void f(int n) {
//		System.out.println(n);
//		if (n==0) {
//			return ;
//		}
//		f(--n);
//	}
	
	 
	// �ݹ�ʵ���������ĺ�_0
//	public static void f(int[] arr, int i, int sum) {
//		if (i == arr.length) {
//			System.out.println(sum);
//			return ;
//		}
//		sum += arr[i];
//		f(arr, i+1, sum); 
//	}
	// �ݹ�ʵ���������ĺ�_1
//	public static int f(int[] arr,int i) {	
//		if(i == arr.length) return 0;
//		return arr[i] + f(arr, i+1) ;
//	}
	
	
	// �ݹ�ʵ�������ַ����ıȽ�_0
//	public static boolean f(String string_0, String  string_1) {
//		if(string_0.length() != string_1.length()) return false;
//		if(string_0.length() == 0) return true;
//		if(string_0.charAt(0) != string_1.charAt(0)) return false;
//		return f(string_0.substring(1), string_1.substring(1));
//	}
	
	
	//�ݹ�ʵ�ִ�n������ȡ��m����һ���ж����ֽⷨ
	/**
	 * �ڴ˵ݹ��еĽ���˼���ǣ���һ����ȥ���п��ǣ��޷����������ȡ || ��ȡ  �Ӷ����еݹ�
	 * @param args
	 */
//	public static int f(int n, int m) {
//		if(n < m) return 0;
//		if(n == m || m == 0) return 1;
//		return f(n-1, m-1) + f(n-1, m);
//	}
	
	
	//�ݹ�ʵ��n��Ԫ�ص�ȫ����_0
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
	
	
	//�ݹ�ʵ���������ַ���������еĳ��� 
//	public static int f(String s1, String s2) {
//		if (s1.length() == 0 || s2.length() == 0) return 0;
//		if(s1.charAt(0) == s2.charAt(0)) 
//			return f(s1.substring(1), s2.substring(1))+1;
//		else 
//			return Math.max(f(s1.substring(1), s2), f(s1, s2.substring(1)));
//	}
	
	
	//�ݹ�ʵ���ַ�����ת
//	public static String f(String s) {
//		if (s == null || s.length() < 2) return s;
//		return f(s.substring(1)) + s.charAt(0);
//	}
	
	
	//��ʵ�����������ǵ�m���n��ϵ����ֵ
//	public static int f(int m, int n) {
//		if(m == 0) return 1;
//		if(n == 0 || n == m) return 1;
//		return f(m-1, n-1) + f(m-1, n);
//	}
	
	
    //�ݹ�ʵ�ּ���m��A��n��B���ж��������з�ʽ
//	public static int f(int m, int n) {
//		if(m == 0 || n == 0) return 1;
//		return  f(m-1, n) + f(m, n-1);
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		// ʹ�õݹ��ӡ�� n-0
//		f(20);
		
		
		// �ݹ�ʵ���������ĺ�_0
//		int n = scan.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = scan.nextInt();
//		}
//		f(arr, 0, 0);
		// �ݹ�ʵ���������ĺ�_1
//		System.out.println(f(arr, 0));
	
	
		// �ݹ�ʵ���ַ����Ƚ�_0
//		String string = scan.next();
//		String string2 = scan.next();
//		System.out.println(f(string, string2));
		
		
		//�ݹ�ʵ�ִ�n������ȡ��m����һ���ж����ֽⷨ
//		int n = scan.nextInt();
//		int m = scan.nextInt();
//		System.out.println(f(n, m));
		
		
		//�ݹ�ʵ��n��Ԫ�ص�ȫ����_0
//		String string = scan.next();
//		f(string.toCharArray(), 0);
		
		
		//�ݹ�ʵ���������ַ���������еĳ��� 
//		String string = scan.next();
//		String string1  = scan.next();
//		System.out.println(f(string, string1));
		
		
		//�ݹ�ʵ���ַ�����ת
//		String string = scan.next();
//		System.out.println(f(string));
		
		
		//��ʵ�����������ǵ�m���n��ϵ����ֵ
//		int m = scan.nextInt();
//		int n = scan.nextInt();
//		System.out.println(f(m, n));
		
		
		//�ݹ�ʵ�ּ���m��A��n��B���ж��������з�ʽ
//		int m = scan.nextInt();
//		int n = scan.nextInt();
//		System.out.println(f(m, n));
		
		
	}
}





















