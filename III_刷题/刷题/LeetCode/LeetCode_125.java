package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * 示例 1:
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 注意： 如果按照ASCII值取比较是否相同，需要注意特殊情况"0P"，他俩狗玩意也相差32
 * 
 * @author 张致邦
 *
 * 2020年2月16日-上午10:59:43
 */
public class LeetCode_125 {
	
	
	// 双指针
	public static boolean isPalindrome(String s) {
		
		int i = 0, j = s.length() - 1;
		while(i < j) {
			char a = s.charAt(i);
			char b = s.charAt(j);
			if(!test(a)) {
				i++;
			}
			if(!test(b)) {
				j--;
			}
			if(test(b) && test(a)){
				if(a != b) {
					if(a >= 'A' && b >= 'A') {
						int n = Math.abs((int)a - (int)b);
						if(n != 32)
							return false;
					}else 
						return false;
				}
				i++;
	            j--;
			}
			
		}
		return true;
		
    }
	
	private static boolean test(char c) {
		if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}
	
}
