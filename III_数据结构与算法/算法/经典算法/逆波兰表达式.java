package 经典算法;

/**
 * A 真·代码   利用arrayslist暴力求解
 */

import java.util.ArrayList;

/**
 * A 真·代码
 * @author 11586
 *
 */

import java.util.Scanner;

public class 逆波兰表达式 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		
		for (int i = 0; i < n; i++) {
			
			String string = scan.next();
			list.add(string);
			
		}
		
		for (int i = 0; i < list.size(); i++) {
			
			String string_1 = list.get(i);
			
			if (string_1.equals("+") || string_1.equals("-") || string_1.equals("*") || string_1.equals("/")) {
				
				if (string_1.equals("+")) {
					int m_0 = Integer.parseInt(list.get(i-1));
					int m_1 = Integer.parseInt(list.get(i-2));
					int m = m_0 + m_1;
					list.remove(i);
					list.remove(i-1);
					list.add(i-1,m+"");
					list.remove(i-2);
				}else if (string_1.equals("-")) {
					int m_0 = Integer.parseInt(list.get(i-1));
					int m_1 = Integer.parseInt(list.get(i-2));
					int m = m_1 - m_0;
					list.remove(i);
					list.remove(i-1);
					list.add(i-1,m+"");
					list.remove(i-2);
				}else if (string_1.equals("*")) {
					int m_0 = Integer.parseInt(list.get(i-1));
					int m_1 = Integer.parseInt(list.get(i-2));
					int m = m_0 * m_1;
					list.remove(i);
					list.remove(i-1);
					list.add(i-1,m+"");
					list.remove(i-2);
				}else if (string_1.equals("/")) {
					int m_0 = Integer.parseInt(list.get(i-1));
					int m_1 = Integer.parseInt(list.get(i-2));
					int m = m_0 / m_1;
					list.remove(i);
					list.remove(i-1);
					list.add(i-1,m+"");
					list.remove(i-2);
				}
			
				if (list.size() == 0) {
					break;
				}else {
					i = 0;
				}
				
			}
			
		}
		
		System.out.println(list.get(0));

	}

}
