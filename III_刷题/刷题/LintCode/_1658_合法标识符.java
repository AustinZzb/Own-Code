package LintCode;

import java.util.Scanner;
/**
 * 请判断字符串 str 是不是一个合法的标识符。
 * 合法的标识符由字母（A-Z，a-z）、数字（0-9）和下划线组成，并且首字符不能为数字。
 * 样例
 * 样例 1：
 * 输入：str= "LintCode"
 * 输出：true
 * 解释：
 * 因为 "LintCode" 由字母组成。
 * 样例 2：
 * 输入：str = "123_abc"
 * 输出：false
 * 解释：
 * 虽然 "123_abc" 由字母、数字和下划线组成，但是它的首字符为数字。
 * 
 * @author 张致邦
 *
 * 2020年2月11日-下午8:56:33
 */
public class _1658_合法标识符 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		boolean flag_1 = true;
		if(string.equals("")) {
			flag_1 = false;
			System.out.println(false);
		}
		
		if(string.charAt(0) >= '0' && string.charAt(0) <= '9') {
			flag_1 = false;
			System.out.println(false);
		}
			
		
		for (int i = 0; i < string.length(); i++) {
			if(!flag(string.charAt(i))) {
				flag_1 = false;
				System.out.println(false);
			}
				
		}
		
		if (flag_1) {
			System.out.println(true);
		}

	}
	
	private static boolean flag(char c) {
		
		if((c>='a' && c<='z') || (c>='A' && c<='Z') || c == '_' || (c>='1' && c<='9'))
			return true;
		
		return false;
	}

}
