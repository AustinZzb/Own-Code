package WRONG;

import java.util.Scanner;

/**
 * Tom�������ڸ��о�������һ�Ź��ڻ���Ŀγ̣���һ������������Ϊͷ�ۣ�һ��Ⱦɫ�����г�ǧ���������ԣ����Ǵ�0��ʼ��ţ��������򣬼�ǧ���������ڡ�
 * ����˵���ڶ�ѧ�������1234567009��λ���ϵļ��ʱ���⿴�������Ǻ���׼ȷ��������ġ�
 * ���ԣ������е���Ҫһ��ϵͳ��Ȼ��������12 3456 7009ʱ���������Ӧ�����
 * ʮ������ǧ�İ���ʮ������ǧ���
 * �ú���ƴ����ʾΪ
 * shi er yi san qian si bai wu shi liu wan qi qian ling jiu
 * ������ֻ��Ҫ������Ϳ����ˡ�
 * ��������ǰ����������һ��ϵͳ������һ�����������ִ���������������Ķ�д�Ĺ淶תΪ����ƴ���ִ������ڵ�����������һ���ո���񿪡�
 * ע������ϸ��չ淶������˵��10010��������yi wan ling yi shi�������ǡ�yi wan ling shi��
 * 						��100000��������shi wan�������ǡ�yi shi wan������2000��������er qian�������ǡ�liang qian����
 * 
 * @author ���°�
 *
 * 2020��2��5��-����10:04:06
 */
public class WRONG_BASIC_20 {
	private static final int A = 100000000;
	private static final int B = 10000;
	private static String a[] = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu", "shi"};
	
	private static String fun(int n) {
		String s = "";
		
		if(n > A) {
			int m = n / A;
			if(m <= 10)
				s += a[m] + " yi ";
			else
				s += "shi " + a[m%10] + " yi ";
			n %= A;
		}
		
		int m_1 = n / B;
		int m_2 = n % B;
		if(n > B) {
			if(n % B < 1000)
				return s + fun_1(m_1) + "wan ling " + fun_1(m_2);
			return s + fun_1(m_1) + "wan " + fun_1(m_2);
		}else {
			return s + fun_1(m_2);
		}
		
	}
	
	private static String fun_1(int n) {
		
		String string = "";
		if(n > 1000) {
			int m = n / 1000;
			if(m != 0)string += a[m] + " qian ";
			if(n % 1000 == 0) return string;
		}
		
		int m_1 = 0;
		if(n >= 100) {
			m_1 = n % 1000 / 100;
			if(m_1 == 0) string += a[m_1] + " ";
			if(m_1 != 0) string += a[m_1] +" bai ";
			if(n % 100 == 0) return string;
		}
		
		if(n >= 10) {
			int m_2 = n % 100 / 10;
			if(m_2 == 0 && m_1 != 0)  string += a[m_1] + " ";
			if(m_2 != 0 && m_2 != 1) string += a[m_2] + " shi ";
			if(m_2 != 0 && m_2 == 1) string += "shi ";
			if(n % 10 == 0) return string;
		}
		
		if(n < 10) {
			return a[n] + " ";
		}
		
		return string + a[n % 10] + " ";
				
	}
	
	public static void main(String[] args) {
		Scanner sacn = new Scanner(System.in);
		System.out.println("����0����");
		while (true) {
			int n = sacn.nextInt();
			if(n == 0)
				break;
			System.out.println(fun(n));
		}
	}
}
