package lanqiao;

/**
 * �ο���others �������� Set_���ظ�Ԫ��_��������ȡn��Ԫ��
 * X����Ҫ�ɳ�һ��5����ɵĹ۲���ǰ��W�ǡ�
 * ���У�
 * A���������ɳ�4�ˡ�B���������ɳ�2�ˡ�
 * C���������ɳ�2�ˡ�D���������ɳ�1�ˡ�
 * E���������ɳ�1�ˡ�F���������ɳ�3�ˡ�
 * ��ô��������W�ǵĹ۲��Ż��ж����ֹ���Ĳ�ͬ����أ�
 * 
 * @author ���°�
 *
 * 2020��2��4��-����4:22:20
 */
public class _�����ų��� {
	private static int sum = 0;
	
	private static void fun(int[] a, int[] b, int n, int m) {
		
		if(n == b.length) {
			if(m == 0) {
				sum++;
				for (int i = 0; i < b.length; i++) {
					for(int j = 0; j < b[i]; j++)
						System.out.print((char)('A'+i));
				}
				System.out.println();
			}
			return ;
		}
		
		for (int i = 0; i <= Math.min(a[n], m) ; i++) {
			b[n] = i;
			fun(a, b, n+1, m-i);
		}
		b[n] = 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4, 2, 2, 1, 1, 3};
		int[] b = new int[6];
		fun(a, b, 0, 5);
		System.out.println(sum);
	}

}
