package �ݹ�;

import java.util.Scanner;

/**
 * (�㷨�д���ߣ�û��ȥ��)
 * ����һ������n��ʾ�ܽ��
 * ����������һ������m����ʾ������Ŀ��ϸ������
 * �ٽ���������m����������ʾÿ����Ŀ�Ľ��
 * �������©���Ľ����ϣ����մ�С��������
 * 
 * ���룺
 * 6 5 3 2 4 3 1
 * �����
 * 1 3 3
 * 1 2 4
 * 3 4
 * 
 * @author 11586
 *
 */


public class �ݹ�_�д��� {
	public static void f(int n, int[] a, int sum, int k, boolean[] a_1) {
		
		if(sum == n) {
			for (int i = 0; i < a_1.length; i++) {
				if(!a_1[i]) System.out.print(a[i]+" ");
			}
			System.out.println();
		}else if(sum > n){
			return ;
		}
		
		if(k == a.length) return ;
		
		a_1[k] = false;
		f(n, a, sum, k+1, a_1);
		
		a_1[k] = true;
		sum += a[k];
		f(n, a, sum, k+1, a_1);
		
		a_1[k] = false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[m];
		boolean[] arr_1 = new boolean[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		f(n, arr, 0, 0, arr_1);
		
	}

}
