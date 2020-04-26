package LintCode;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * 给定一个字符串，逐个翻转字符串中的每个单词。
 * 
 * 样例  1:
 * 输入:  "the sky is blue"
 * 输出:  "blue is sky the"
 * 样例解释: 
 * 返回逐字反转的字符串.
 * 样例 2:
 * 输入:  "hello world"
 * 输出:  "world hello"
 * 样例解释: 返回逐字反转的字符串.
 * 说明
 * 单词的构成：无空格字母构成一个单词，有些单词末尾会带有标点符号
 * 输入字符串是否包括前导或者尾随空格？可以包括，但是反转后的字符不能包括
 * 如何处理两个单词间的多个空格？在反转字符串中间空格减少到只含一个
 * 
 * @author 张致邦
 *
 * 2020年2月11日-下午8:19:50
 */
public class _53_反转字符串中的单词 {
	
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




















