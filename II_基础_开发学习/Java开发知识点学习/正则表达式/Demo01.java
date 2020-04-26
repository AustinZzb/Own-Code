/*
 *	正则表达式基本使用
 */
package 正则表达式;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 	@author 张致邦
 *
 * 	2020年3月23日-上午9:30:24
 */
public class Demo01 {

	public static void main(String[] args) {
//		find();
//		replace();
		split();
	}
	
	/**
	 * @method 简单的正则匹配
	 */
	private static void find() {
		// @note  pattern是正则模型
		Pattern pattern = Pattern.compile("(\\d+)([a-z]+)");
		// @note  利用正则模型匹配字符串
		Matcher matcher = pattern.matcher("123jcjc5201obob314lala");
		
		// @note  matcher.matches()匹配整个字符串，返回Boolean
		System.out.println(matcher.matches());  
		
		// @note  find() 方法是查找下一个子序列 返回Boolean
		while (matcher.find()) {
			// @note group()|| group(1) 都是代表整个匹配字符串
			System.out.println(matcher.group());
			// @note group(n) 代表第n捕获组
			System.out.println(matcher.group() + " " + matcher.group(1) + " " + matcher.group(2));
		}
	}
	
	/**
	 * @method 简单的正则查找替换
	 */
	private static void replace() {
		Pattern pattern = Pattern.compile("\\d");
		Matcher matcher = pattern.matcher("123jcjc5201obob314lala");
		String newstirng = matcher.replaceAll("0&");
		System.out.println(newstirng);
	}
	
	/**
	 * @method 字符串切割
	 */
	private static void split() {
		String[] strings = "   kjh sadf   afs  f e fa      fad f fa ".trim().split("\\s+");
		System.out.println(Arrays.toString(strings));
	}

}



























 