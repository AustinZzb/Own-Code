package lanqiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ���FJΪ������ţ�ǿ�������ѧ�����Σ�FJ֪����Ҫѧ�����ſΣ�������һ���õ����Ǻ�����������������׼������ţ����һ����Sine֮�衱����Ϸ��Ԣ�����֣������ţ�ǵļ���������
 * ������
 * An=sin(1�Csin(2+sin(3�Csin(4+...sin(n))...)
 * Sn=(...(A1+n)A2+n-1)A3+...+2)An+1
 * FJ������ţ�Ǽ���Sn��ֵ���������FJ��ӡ��Sn���������ʽ���Է�����ţ�����⡣
 * 
 * @author ���°�
 *
 * 2020��3��2��-����11:21:29
 */
public class BASIC_21 {
	private static List<String> list = new ArrayList<String>();
	
	private static String Sn_sum(int n) {
		An_sum(n, 1, "");
		String sn = "";
		for (String an : list) {
			sn += "(" + an + "+" + n-- + "" + ")";
		}
		return sn;
	}
	
	private static void An_sum(int n, int m, String An) {
		String an = "";
		if(m > n)
			return ;
		if(m == 1) {
			an = "sin(1)";
			list.add(an);
			An_sum(n, m+1, an);
		}else {
			an = An.substring(0, An.length() - m + 1) + "-" + "sin(" + m + ")" + An.substring(An.length() - m + 1);
			list.add(an);
			An_sum(n, m+1, an);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String string = Sn_sum(n);
		System.out.println(string.substring(1, string.length() - 1));
	}
	
}
