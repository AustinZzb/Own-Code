package LintCode;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * ����һ���ַ����������ת�ַ����е�ÿ�����ʡ�
 * 
 * ����  1:
 * ����:  "the sky is blue"
 * ���:  "blue is sky the"
 * ��������: 
 * �������ַ�ת���ַ���.
 * ���� 2:
 * ����:  "hello world"
 * ���:  "world hello"
 * ��������: �������ַ�ת���ַ���.
 * ˵��
 * ���ʵĹ��ɣ��޿ո���ĸ����һ�����ʣ���Щ����ĩβ����б�����
 * �����ַ����Ƿ����ǰ������β��ո񣿿��԰��������Ƿ�ת����ַ����ܰ���
 * ��δ����������ʼ�Ķ���ո��ڷ�ת�ַ����м�ո���ٵ�ֻ��һ��
 * 
 * @author ���°�
 *
 * 2020��2��11��-����8:19:50
 */
public class _53_��ת�ַ����еĵ��� {
	
	private static void rever(List<String> list) {
		for (int i = list.size() - 1; i >= 0; i--) {
			if(i == list.size() - 1)
				System.out.print(list.get(i));
			else 
				System.out.print(" "+list.get(i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[] c = scan.nextLine().toCharArray();
		List<String> list = new Vector<String>();
		int t = 0;
		list.add("");
		for (int i = 0; i < c.length; i++) {
			if(c[i]!=' ') {
				list.set(t, list.get(t)+c[i]);
			}else{
				if(i >= 1 && c[i-1] != ' ') {
					t++;
					list.add("");
				}
			}
		}
		rever(list);
		
	}

}




















