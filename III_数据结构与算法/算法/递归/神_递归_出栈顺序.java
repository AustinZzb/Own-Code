package �ݹ�;

import java.util.Scanner;

/**
 * ��n����������˳���ջ����ջ����ջ���Խ���
 * 
 * @author ���°�
 *
 * 2020��2��1��-����7:16:19
 */

public class ��_�ݹ�_��ջ˳�� {
	
	// a��ʾջ��ȴ�������b��ʾջ�ڵ���
	public static int fun(int a, int b) {
		if(a == 0) return 1;
		if(b == 0) return fun(a - 1, 1);
		return fun(a - 1, b + 1) + fun(a, b - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 17; i++) {
			System.out.println(fun(i, 0));
		}

	}

}
