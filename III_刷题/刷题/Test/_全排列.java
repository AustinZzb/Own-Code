package Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

/**
 * ����һ������������ȫ����
 * 
 * @author ���°�
 *
 * 2020��2��8��-����4:20:03
 */
public class _ȫ���� {
	
	private static Set<String> list_1 = new HashSet<String>();
	
	// ���õݹ���ݵķ�ʽ���������������һ������k��ʾλ��ָ��
	// ��k��ָ��Ԫ��������k֮���Ԫ�ؽ��н����������ݹ����ǵû���
	private static void fun_1(char[] c, int k) {
		
		if(k == c.length - 1) {
			list_1.add(String.valueOf(c));
			return ;
		}
		
		for (int i = k; i < c.length; i++) {
			char cc = c[i]; c[i] = c[k] ; c[k] = cc;
			fun_1(c,k+1);
			cc = c[i]; c[i] = c[k] ; c[k] = cc;
		}
		
	}
	
	
	
	// ���õݹ�ķ�����������������ַ������е�����ÿ��ȡ��һ��Ԫ�طŵ��ַ�����ͷ��
	// Ȼ���ʣ�µ��Ӵ�����ȫ����
	private static List<String> fun(String s) {
		
		List<String> list = new Vector<String>();
		
		if(s.length() == 1) {
			list.add(""+s.charAt(0));
			return list;
		}
		
		for (int i = 0; i < s.length(); i++) {
			char old = s.charAt(i);
			List<String> list2 = fun(s.substring(0,i)+s.substring(i+1));
			for (int j = 0; j < list2.size(); j++) {
				list.add("" + old + list2.get(j));
			}
		}
		
		return list;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����һ���ַ����������ȫ�������");
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String string = scan.nextLine();
			System.out.println("answer ONE : " + fun(string));
			fun_1(string.toCharArray(), 0);
			System.out.println("answer TWO : " + list_1);
			list_1.removeAll(list_1);
		}
	}

}
