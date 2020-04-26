package LintCode;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;
/**
 * ����
 * ����1
 * ����: str="ABCabcA"
 * ���: 2
 * ����:
 * A������2�Σ�B������1�Σ�C������1�Σ�a������1�Σ�b������1�Σ�c������1�Σ�A���ֵĴ�����࣬���Է���2��
 * ����2
 * ����: str="abca"
 * ���: 2
 * ����:
 * a ������2�Σ�b��c��ֻ������1��
 * ���Է��� 2
 * ע������
 * ��ĸ��ֻ���ܻ���ִ�д��ĸ����Сд��ĸ��
 * �ַ������Ȳ�����100000
 * @author ���°�
 *
 * 2020��2��11��-����9:15:22
 */
public class _1654_���������ַ� {
	private static int fun(List<Character> list) {
		int ans = 0;
		
		for (int i = 0; i < list.size(); i++) {
			int sum = 0;
			char old = list.get(i);
			while(list.contains(old)) {			
				sum++;
				list.remove(list.indexOf(old));
			}
			ans = sum > ans ? sum : ans;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[] c = scan.nextLine().toCharArray();
		List<Character> list = new Vector<Character>();
		for (int i = 0; i < c.length; i++) {
			list.add(c[i]);
		}
		System.out.println(fun(list));
	}

}
