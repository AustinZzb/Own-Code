package ��������;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. �ֵ�ĳ�����ʱ��ֻ����ĳ���ո�������L��O
 * 2. ˭������ĸ����ˡ�LOL����������˭��ʤ��
 * 3. ������и��Ӷ������ˣ����޷����LOL����ƽ�֡�
 * �����ʽ��
 * ��һ�У�����n��n<10������ʾ������n����ʼ���档
 * ��������n�У�ÿ��һ��������ʾ��ʼ�ľ��档
 * ���磺��******��, ��ʾ��6���ո񡣡�L****��, ��ʾ�����һ����ĸL�������ұ���4���ո�
 * 
 * �����ʽ��
 * Ҫ�����n�����֣���ʾ��ÿ�����棬���С�������K��ʦ��������ǿ�ŷ���ʱ��С������ý����
 * 1 ��ʾ��Ӯ	 -1 ��ʾ����	0 ��ʾ���Ա�ƽ
 * 
 * @author ���°�
 *
 * 2020��2��5��-����5:00:03
 */
public class ��_����ĸ��Ϸ {
	
	private static int fun(char[] c) {
		
		String string = String.valueOf(c);
		if(string.contains("LOL")) return -1;
		if(!string.contains("*")) return 0;
		
		boolean flag = false;
		
		for (int i = 0; i < c.length; i++) {
			if(c[i] == '*') {
				try {
					c[i] = 'L';
					switch (fun(c)) {
						case -1: return 1;
						case 0: flag = true;
					}
					c[i] = 'O';
					switch (fun(c)) {
						case -1: return 1;
						case 0: flag = true;
					}
				}finally {
					c[i] = '*';
				}
			}
		}
		
		if(flag) return 0;
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String string = scan.next();
		System.out.println(fun(string.toCharArray()));
	}

}
