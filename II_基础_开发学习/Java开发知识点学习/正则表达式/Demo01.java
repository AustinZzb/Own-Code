/*
 *	������ʽ����ʹ��
 */
package ������ʽ;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 	@author ���°�
 *
 * 	2020��3��23��-����9:30:24
 */
public class Demo01 {

	public static void main(String[] args) {
//		find();
//		replace();
		split();
	}
	
	/**
	 * @method �򵥵�����ƥ��
	 */
	private static void find() {
		// @note  pattern������ģ��
		Pattern pattern = Pattern.compile("(\\d+)([a-z]+)");
		// @note  ��������ģ��ƥ���ַ���
		Matcher matcher = pattern.matcher("123jcjc5201obob314lala");
		
		// @note  matcher.matches()ƥ�������ַ���������Boolean
		System.out.println(matcher.matches());  
		
		// @note  find() �����ǲ�����һ�������� ����Boolean
		while (matcher.find()) {
			// @note group()|| group(1) ���Ǵ�������ƥ���ַ���
			System.out.println(matcher.group());
			// @note group(n) �����n������
			System.out.println(matcher.group() + " " + matcher.group(1) + " " + matcher.group(2));
		}
	}
	
	/**
	 * @method �򵥵���������滻
	 */
	private static void replace() {
		Pattern pattern = Pattern.compile("\\d");
		Matcher matcher = pattern.matcher("123jcjc5201obob314lala");
		String newstirng = matcher.replaceAll("0&");
		System.out.println(newstirng);
	}
	
	/**
	 * @method �ַ����и�
	 */
	private static void split() {
		String[] strings = "   kjh sadf   afs  f e fa      fad f fa ".trim().split("\\s+");
		System.out.println(Arrays.toString(strings));
	}

}



























 