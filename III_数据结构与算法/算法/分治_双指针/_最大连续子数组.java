package ����_˫ָ��;

import java.util.Scanner;

/**
 * ����һ�����飬��������������������
 * 
 * @author ���°�
 *
 * 2020��2��1��-����7:56:26
 */
public class _������������� {
	
	// ����
	private static int sum_0(int[] a, int from, int to) {
		
		if(from == to)
			return a[from];
		
		int middle = (from + to) / 2;
		int m_1 = sum_0(a, from, middle);
		int m_2 = sum_0(a, middle+1, to);
		
		int left = a[middle], now = a[middle];
		for (int i = middle-1; i >= from; i--) {
			now += a[i];
			left = Math.max(now, left);
		}
		
		int right = a[middle+1];
		now = a[middle+1];
		for (int i = middle+2; i <= to; i++) {
			now += a[i];
			right = Math.max(now, right);
		}
		
		int m_3 = left + right;
		return Math.max(m_1, Math.max(m_2, m_3));
		
	}
	
	
	// ���䱩�������д������û�п�����ȫ��
//		private static void sum(int[] a) {
//			
//			int max = 0, sum = 0;
//			String string = "",string2 = "";
//			for (int i = 0; i < a.length; i++) {
//				for (int j = i; j < a.length; j++) {
//					sum = 0;
//					string = "";
//					for (int j2 = i; j2 <= j; j2++) {
//						sum += a[j2];
//						string += a[j2]+" ";
//					}
//					if(sum > max) {
//						max = sum;
//						string2 = string;
//					}
//				}
//			}
//			
//			System.out.println(max);
//			System.out.println(string2);
//			
//		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
//		sum(a);
		System.out.println(sum_0(a, 0, a.length-1));
	}

}
