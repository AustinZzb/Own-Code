package ��������;

/**
 * A ����������ȡn����ÿ��ֻ��ȡ1��3��7��8��ȡ�����һ�������ʧ�ܣ����������ȡ�����Ƿ���ʤ��
 * A ֻ�õݹ�̫��ʱ
 * 
 * @author ���°�
 *
 * 2020��1��31��-����7:31:29
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ��_ȡ������ {
	private static void fun_1(int n) {
		
		int[] ans = new int[10001];
		ans[1] = 0;
		ans[2] = 1;
		ans[3] = 0;
		ans[4] = 1;
		ans[5] = 0;
		ans[6] = 1;
		ans[7] = 0;
		ans[8] = 1;
		ans[9] = 1;
		for (int i = 10; i <= 10000; i++) {
			ans[i] = 0;
			if(ans[i - 1] == 0) ans[i] = 1;
			if(ans[i - 3] == 0) ans[i] = 1;
			if(ans[i - 7] == 0) ans[i] = 1;
			if(ans[i - 8] == 0) ans[i] = 1;
		}
		
		if(ans[n] == 1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}
	
	
	// �ݹ鷨��̫��
	public static boolean fun(int n) {
		if(n == 0) return true;
		
		if(n >= 1 && fun(n-1)  == false) return true; 
		if(n >= 3 && fun(n-3)  == false) return true; 
		if(n >= 7 && fun(n-7)  == false) return true; 
		if(n >= 8 && fun(n-8)  == false) return true; 
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = new Scanner(System.in).nextInt();
//		System.out.println(fun(n));
		fun_1(n);
	}

}
