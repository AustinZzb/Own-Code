package ��������;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ��ƫ���Ķ����ת��Ϊ��ķ�����⡣��ʾ����С����������ӣ����м��̨������Ϊ��ķ����
 * 
 * A ���뼸��С���е�λ�ã���λ��ɮָ��ĳһ��С������ǰ��������루������������С���У���ֱ��һλ��ɮָ��ʱ����·�������䡣
 * 
 * @author ���°�
 *
 * 2020��1��31��-����7:59:26
 */
public class ��_��ƫ����_��ɮ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] string = scan.nextLine().split("\\ ");
		int[] a = new int[string.length];
		for (int i = 0; i < string.length; i++) {
			a[i] = Integer.parseInt(string[i]);
		}
		fun(a);
	}

	private static void fun(int[] a) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = a[i]+1; j < a[i+1]; j++) {
				
				int old = a[i];
				try {
					a[i] = j;
					if(ans(a) == false) {
						System.out.println(old+"-->"+j);
						return;
					}
				} finally {
					a[i] = old;
				}
				
			}
		}
		
	}
	
	private static boolean ans(int[] a) {
		
		int sum = 0;
		for (int i = 0; i < a.length-1; i+=2) {
			sum ^= a[i+1] - a[i] - 1;
		}
		
		return sum != 0;
		
	}

}
















