package others;

import java.util.Arrays;

/**
 * ����һ���ַ�������������Nλ��Ҫ�� ʱ�临�Ӷ�O��n�����ռ临�Ӷ�O��1��
 * 
 * @author ���°�
 *
 * 2020��2��15��-����3:07:18
 */
public class _�ַ�������Nλ {
	// �㷨˼�룬"abcdef" --> "bafedc" --> "cdefab"   ���ȷֱ�ת�����Ӵ���Ȼ��ת�ܴ�
	private static void rever(char[] s,int from, int to) {
		
		while(from < to) {
			char c = s[from];
			s[from++] = s[to];
			s[to--] = c;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] string = "abcdef".toCharArray();
		int n = 2;
		rever(string, 0, n-1);
		rever(string, n, string.length-1);
		rever(string, 0, string.length-1);
		System.out.println(Arrays.toString(string));
	}

}
