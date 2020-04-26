/*
 *	问题描述
　　给定一个单词，请使用凯撒密码将这个单词加密。
　　凯撒密码是一种替换加密的技术，单词中的所有字母都在字母表上向后偏移3位后被替换成密文。即a变为d，b变为e，...，w变为z，x变为a，y变为b，z变为c。
　　例如，lanqiao会变成odqtldr。
输入格式
　　输入一行，包含一个单词，单词中只包含小写英文字母。
输出格式
　　输出一行，表示加密后的密文。
样例输入
lanqiao
样例输出
odqtldr
 */
package lanqiaoTest.two;

import java.util.Scanner;

/**
 * 	@author 张致邦
 *
 * 	2020年4月25日-下午2:19:05
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
