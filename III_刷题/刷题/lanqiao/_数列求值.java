package lanqiao;

import java.math.BigInteger;

/**
 * ������������
 * �������� 1, 1, 1, 3, 5, 9, 17, �����ӵ� 4 �ʼ��ÿ���ǰ 3 ��ĺ͡��� �� 20190324 ������ 4 λ���֡�
 * @author ���°�
 *
 * 2020��2��2��-����9:29:09
 */
public class _������ֵ {
	public static void fun() {
		
		int[] a = new int[20190324];
		a[0] = a[1] = a[2] = 1;
		int ans = 0;
		for(int i = 3;i <20190324; i++) {
			a[i] = (a[i-1] + a[i-2] + a[i-3]) % 1000000;
		}
		System.out.println(a[20190323]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun();
	}

}
