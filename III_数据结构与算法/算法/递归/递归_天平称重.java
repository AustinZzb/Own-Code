package �ݹ�;
/**
 * ����ƽ����ʱ������ϣ���þ������ٵ�������ϳƳ������ܶ��������
 * ���ֻ��5�����룬�����ֱ���1��3��9��27��81
 * �����ǿ�����ϳƳ�1��121֮��������������������������������������У���
 * ����ĿҪ����ʵ�֣����û�����������������������Ϸ���
 * ���磺
 * �û����룺5		���������9-3-1			�û����룺19	���������27-9+1
 * Ҫ����������������Ǵ�����ǰС���ں�
 * ���Լ����û�����������ַ��Ϸ�Χ1~121��
 * @author ���°�
 *
 * 2020��2��4��-����4:45:21
 */
public class �ݹ�_��ƽ���� {
	
	private static String fun(int n) {
		
		int a = 1;
		while(a < n) a *= 3;
		
		if(a == n) return ""+a;
		if(n <= a/2) return a/3 + "+" + fun(n - a/3);
		return a + reve(fun(a - n));
		
	}

	private static String reve(String s) {
		// TODO Auto-generated method stub
		s.replace('+', '#');
		s.replace('-', '+');
		s.replace('#', '-');
		return "-"+s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 121 ; i++) {
			System.out.println(i+":"+fun(i));
		}
	}

}
