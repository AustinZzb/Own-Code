package LintCode;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;
/**
 * ����һ���ַ������ҳ���һ��ֻ����һ�ε��ַ���
 * ����
 * ���� 1:
 * ����: "abaccdeff"
 * ���:  'b'
 * ����:
 * 'b' �ǵ�һ������һ�ε��ַ�
 * ���� 2:
 * ����: "aabccd"
 * ���:  'b'
 * ����:
 * 'b' �ǵ�һ������һ�ε��ַ�
 * 
 * @author ���°�
 *
 * 2020��2��11��-����8:44:24
 */
public class _209_��һ�γ���һ�ε��ַ� {
	private static char first(List<Character> list) {
		
		for (int i = 0; i < list.size(); i++) {
			char old = list.get(i);
			list.remove(i);
			if(!list.contains(old))
				return old;
			list.add(i, old);
		}
		
		return ' ';
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[] c = scan.nextLine().toCharArray();
		List<Character> list = new Vector<Character>();
		for (int i = 0; i < c.length; i++) {
			list.add(c[i]);
		}
		System.out.println(first(list));
	}

}
