package others;
/**
 * С�����ϲ�������ֻ�ľ��
 * һ����10���ľ��ÿ����ľ����һ�����֣�0~9��
 * ���ľ����
 * ÿ����ľ�ŵ�����������ľ�����棬����һ���������������ľ����С��
 * �����4��Ľ������Σ������������еĻ�ľ��
 * ���������ֺϸ�Ĵ��
 *    0				0
 *   1 2		   3 1
 *  3 4 5		  7 5 2
 * 6 7 8 9		 9 8 6 4
 * 
 * @author ���°�
 *
 * 2020��2��3��-����9:08:53
 */
public class _���ľ {
	static int sum = 0;
	
	public static void fun(int[] a, int k) {
		
		if(k == a.length - 1) {
			if(fun_1(a)) sum++;
			return ;
		}
		
		for (int i = k; i < a.length; i++) {
			int t = a[k]; a[k] = a[i]; a[i] = t;
			fun(a, k+1);
			t = a[k]; a[k] = a[i]; a[i] = t;
		}
		
	}

	private static boolean fun_1(int[] a) {
		// TODO Auto-generated method stub
		boolean[] flag = new boolean[5];
		flag[0] = a[1] < a[3] && a[1] < a[4];
		flag[1] = a[2] < a[4] && a[2] < a[5];
		flag[2] = a[3] < a[6] && a[3] < a[7];
		flag[3] = a[4] < a[7] && a[4] < a[8];
		flag[4] = a[5] < a[8] && a[5] < a[9];
		for (int i = 0; i < flag.length; i++) {
			if(!flag[i]) return false; 
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		fun(a, 1);
		System.out.println(sum);
	}

}
