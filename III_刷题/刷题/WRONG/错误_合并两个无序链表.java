package WRONG;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;
/**
 * 给定由整数组成的两个无序数组，根据顺序合并成一个数组。
 * 输入包括两行，每行由若干个由->分隔的整数组成，分别表示以最左整数为链表头，单向指向右侧节点的链表,每行输入均以 .结尾。
 * 输出为合并后的单向链表，由->表示其间的指针，最终指向由NULL表示的空值。
 * 在合并过程中，比较两个链表当前待合并的第一个元素，选择其中较小的那个元素放入合并后的数组。
 * 输入格
 * 输入两行字符串，每行字符串由 有符号整数、->和.组成。
 * 输出格式
 * 输出一行字符串，表示合并后的数组。
 * 
 * 样例输入：
 * 1->2->3.
 * 1->0->2.
 * 
 * 输出：
 * 1->1->0->2->2->3->NULL
 * 
 * 错误原因：   未知错误！！！！！！！！！
 * 
 * @author 张致邦
 *
 * 2020年2月3日-下午4:57:15
 */
public class 错误_合并两个无序链表 {

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
