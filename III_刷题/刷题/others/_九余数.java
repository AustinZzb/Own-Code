package others;

import java.util.Scanner;

/**
 * ���ڸ���һ����Ȼ�� nn������λ��С�ڵ���һ����������Ҫ���ľ�����������������֮���������
 * �����ʽ
 * ��һ����һ������ m(1 \le m \le 8)m(1��m��8)����ʾ�� mm ��������ݡ�
 * ��� mm ��ÿ����һ����Ȼ�� nn��
 * �����ʽ
 * ��� nn ������֮���������ÿ�����ռһ�С�
 * ���ʱÿ��ĩβ�Ķ���ո񣬲�Ӱ�����ȷ��
 * 
 * ��⣺ ��ÿλ����Ӷ�9ȡģ����Ϊԭ����9ȡģ
 * 
 * @author ���°�
 *
 * 2020��2��11��-����3:40:02
 */
public class _������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			String string = scan.next();
			int ans = 0;
			for (int j = 0; j < string.length(); j++) {
				ans += Integer.parseInt(string.valueOf(string.charAt(j))) % 9;
			}
			System.out.println(ans % 9);
		}

	}

}
