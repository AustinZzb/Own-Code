package Test;
/**
 * ����һ�����飬�����������������Ӵ�(ע��ȫ�Ǹ��������)
 * 
 * @author ���°�
 *
 * 2020��2��7��-����3:43:07
 */
public class _������������� {
	
	//���ַ�
	private static int fun_1(int[] a, int from, int end) {
		
		if(from == end) return a[from];      // ����ָ���ϣ��ݹ����
		
		int middle = (from + end) / 2;		 // ����м���±�
		int m_1 = fun_1(a, from, middle); 	 // ����ߵ����������ֵ
		int m_2 = fun_1(a, middle+1, end);   // ���ұߵ����������ֵ
		
		// ���м�����������ֵ
		int left = a[middle], now = 0;
		for (int i = middle; i >= from; i--) {
			now += a[i];
			left = Math.max(now, left);
		}
		
		int right = a[middle+1], now_1 = 0;
		for (int i = middle+1; i < end; i++) {
			now_1 += a[i];
			right = Math.max(now, right);
		}
		
		return Math.max(left+right, Math.max(m_1, m_2));		
		
	}
	
	
	// ��̬�滮��
	private static void fun(int[] a) {
		
		int sum = 0, max = 0, max_1 = a[0];   // max Ϊ���, max_1 ��Ҫ����������ȫΪ����������£����������ֵ
		boolean flag = true;				  // flag �ж������Ƿ�ȫΪ����
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max_1) max_1 = a[i];    // ����������ֵ
			if(sum <= 0) {
				sum = a[i];
			}else {
				flag = false;
				sum += a[i];
			}
			max = sum > max ? sum : max;
		}
		
		if (flag) {
			System.out.println(max_1);
			return;
		}
		
		System.out.println(max);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {-9,-21,1,-58,58,2};
		fun(a);
		System.out.println(fun_1(a, 0, a.length-1));
	}

}
