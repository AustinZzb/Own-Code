package �ݹ�;

import java.util.ArrayList;

/**
 * 1 2 3 4 5 6 7 8 9 = 110
 * �뿴�ϱߵ���ʽ��Ϊ��ʹ��ʽ��������Ҫ�����ּ�����ӺŻ��߼��ţ����Բ�������������������ţ���
 * ֮��û��������ŵ�������ϳ�һ����
 * ���磺12+34+56+7-8+9 ����һ�ֺϸ�����123+4+5+67-89 ����һ�����ܵĴ𰸡�
 * 
 * @author ���°�
 *
 * 2020��2��3��-����10:58:43
 */
public class ��_�ݹ�_��ʽ����� {
	
	private static void fun(int[] a, String s, int k, int sum) {
		if(k == 0) {
			if(sum == a[k])
				System.out.println(a[k]+s);
			return ;
		}
		
		fun(a, "+"+a[k]+s, k-1, sum-a[k]);
		fun(a, "-"+a[k]+s, k-1, sum+a[k]);
		
		int old = a[k-1];
		a[k-1] = Integer.parseInt(""+a[k-1]+a[k]);
		fun(a, s, k-1, sum);
		a[k-1] = old;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		fun(a, "", 8, 110);
	}

}
