package �����㷨;
/**
 * ����һ��1 * 1�������Σ���һ��1/4Բ���������ǵĵ���֮�� * 4 ��ΪԲ���ʡ�
 * 
 * @author ���°�
 *
 * 2020��2��6��-����10:34:35
 */
public class _���ø�����Բ���� {
	private static final int N = 20000 * 1000;
	private static double X = 0;  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		for (int i = 0; i < N; i++) {
			double x = Math.random();
			double y = Math.random();
			double ans = Math.sqrt(x*x + y*y);
			if(ans <= 1) X++;
		}
		
		System.out.println(X * 4 / N);
		
	}

}
