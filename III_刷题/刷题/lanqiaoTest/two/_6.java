/*
 *	��������
��������һ�����ʣ���ʹ�ÿ������뽫������ʼ��ܡ�
��������������һ���滻���ܵļ����������е�������ĸ������ĸ�������ƫ��3λ���滻�����ġ���a��Ϊd��b��Ϊe��...��w��Ϊz��x��Ϊa��y��Ϊb��z��Ϊc��
�������磬lanqiao����odqtldr��
�����ʽ
��������һ�У�����һ�����ʣ�������ֻ����СдӢ����ĸ��
�����ʽ
�������һ�У���ʾ���ܺ�����ġ�
��������
lanqiao
�������
odqtldr
 */
package lanqiaoTest.two;

import java.util.Scanner;

/**
 * 	@author ���°�
 *
 * 	2020��4��25��-����2:19:05
 */
public class _6 {

	/**@method
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		
		fun(s);
		in.close();
	}

	public static void fun(String s) {
		char[] temp = s.toCharArray();
		
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] >= 'a' && temp[i] < 'x') {
				temp[i] += 3;
			} else if (temp[i] == 'x') {
				temp[i] = 'a';
			} else if (temp[i] == 'y') {
				temp[i] = 'b';
			} else {
				temp[i] = 'c';
			}
		}
		
		System.out.println(String.valueOf(temp));
	}
}
