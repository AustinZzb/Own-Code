package WRONG;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;
/**
 * ������������ɵ������������飬����˳��ϲ���һ�����顣
 * ����������У�ÿ�������ɸ���->�ָ���������ɣ��ֱ��ʾ����������Ϊ����ͷ������ָ���Ҳ�ڵ������,ÿ��������� .��β��
 * ���Ϊ�ϲ���ĵ���������->��ʾ����ָ�룬����ָ����NULL��ʾ�Ŀ�ֵ��
 * �ںϲ������У��Ƚ���������ǰ���ϲ��ĵ�һ��Ԫ�أ�ѡ�����н�С���Ǹ�Ԫ�ط���ϲ�������顣
 * �����
 * ���������ַ�����ÿ���ַ����� �з���������->��.��ɡ�
 * �����ʽ
 * ���һ���ַ�������ʾ�ϲ�������顣
 * 
 * �������룺
 * 1->2->3.
 * 1->0->2.
 * 
 * �����
 * 1->1->0->2->2->3->NULL
 * 
 * ����ԭ��   δ֪���󣡣���������������
 * 
 * @author ���°�
 *
 * 2020��2��3��-����4:57:15
 */
public class ����_�ϲ������������� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list_1 = new ArrayList<Integer>();
		
		String s_1 = null;
		for (int i = 0; i < 2; i++) {
			s_1 = scan.nextLine();
			if(i == 0) {
				for (int j = 0; j < s_1.length(); j++) {
					if(s_1.charAt(j) == '.')
						break;
					if(s_1.charAt(j) >= '0' && s_1.charAt(j) <= '9')
						list.add(Integer.parseInt(String.valueOf(s_1.charAt(j))));
				}
			}else {
				for (int j = 0; j < s_1.length(); j++) {
					if(s_1.charAt(j) == '.')
						break;
					if(s_1.charAt(j) >= '0' && s_1.charAt(j) <= '9')
						list_1.add(Integer.parseInt(String.valueOf(s_1.charAt(j))));
				}
			}
		}
		
		int len = list.size() > list_1.size() ? list_1.size() : list.size();
		int len_1 = list.size() < list_1.size() ? list_1.size() : list.size();
		
		if(list.size() == 0) {
			for (int i = 0; i < list_1.size(); i++) {
				if(i == list_1.size() - 1) {
					System.out.print(list_1.get(i)+"->NULL");
					break;
				}else {
					System.out.print(list_1.get(i)+"->");
				}
			}
		}
		if(list_1.size() == 0) {
			for (int i = 0; i < list.size(); i++) {
				if(i == list.size() - 1) {
					System.out.print(list.get(i)+"->NULL");
					break;
				}else {
					System.out.print(list.get(i)+"->");
				}
			}
		}
		
		for (int i = 0; i < len; i++) {
			if(i == len - 1 && len == len_1) {
				if(list.get(i) > list_1.get(i)) {
					System.out.print(list_1.get(i)+"->");
					System.out.print(list.get(i)+"->NULL");
				}else {
					System.out.print(list.get(i)+"->");
					System.out.print(list_1.get(i)+"->NULL");
				}
				break;
			}
			if(i == len - 1 && len != len_1){
				
				if(list.get(i) > list_1.get(i)) {        
					System.out.print(list_1.get(i)+"->");
					System.out.print(list.get(i)+"->");
				}else {
					System.out.print(list.get(i)+"->");
					System.out.print(list_1.get(i)+"->");
				}
				for (int j = i+1; j < len_1; j++) {
					if(list.size() == len_1){
						if(j == len_1 - 1) {
							System.out.print(list.get(j)+"->NULL");
							break;
						}
						System.out.print(list.get(j)+"->");
					}
					if(list_1.size() == len_1) {
						if(j == len_1 - 1) {
							 System.out.print(list_1.get(j)+"->NULL");
							 break;
						}
						System.out.print(list_1.get(j)+"->");
					}
				}
				break;
			}
			
			if(list.get(i) > list_1.get(i)) {
				System.out.print(list_1.get(i)+"->");
				System.out.print(list.get(i)+"->");
			}else {
				System.out.print(list.get(i)+"->");
				System.out.print(list_1.get(i)+"->");
			}
		}
		
	}
	
}