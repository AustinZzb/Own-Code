package ��������;
/**
 * ��Ŀ��
 * ��3��Ӳ�ң��ֱ���3,4,5
 * ��������ȡӲ�ҡ�
 * ÿ��ÿ��ֻ�ܴ�ĳһ����ȡ����������
 * ������Ȩ��
 * ȡ�����һöӲ�ҵ�ΪӮ�ҡ�
 * ����ȡӲ��һ�����ޱ�ʤ���з���
 * 
 * ��⣺ ���������⣬���ʣ��������Ŀ�������ans��Ϊ0����ô����
 * 	          ����������ans����Ϊ0����ô��ansȥ��������ʣ������е�һ�����õ��Ľ������������ô����
 * 
 * @author ���°�
 *
 * 2020��2��4��-����8:17:15
 */
public class _��ķ�� {
	
	private static void fun(int[] a) {
		
		int ans = 0;
		for (int i = 0; i < a.length; i++) {
			ans ^= a[i];
		}
		if(ans == 0) System.out.println("����");
		for (int i = 0; i < a.length; i++) {
			int x = ans ^ a[i];
			if(x < a[i]) System.out.println("����������� ��" + a[i] + "-->" + x);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 12, 5, 14};
		fun(a);
	}

}
