package LeetCode;
/**
 * ������������¥�ݡ���Ҫ n ������ܵ���¥����
 * ÿ��������� 1 �� 2 ��̨�ס����ж����ֲ�ͬ�ķ�����������¥���أ�
 * 
 * @author ���°�
 *
 * 2020��2��14��-����10:15:22
 */
public class LeetCode_70 {
	// ����Ľⷨ������쳲����������˼��
	public int climbStairs(int n) {
        
		if(n < 3) return n;
		int i = 1, m = 2;
		while(n - 2 > 0) {
			int temp = m;
			m = temp + i;
			i = temp;
			n--;
		}
		return m;
    }
	
}
