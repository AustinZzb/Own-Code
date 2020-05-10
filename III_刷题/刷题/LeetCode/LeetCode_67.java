package LeetCode;

import java.util.Arrays;
/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * 输入为非空字符串且只包含数字 1 和 0。
 * 
 * @author 张致邦
 *
 * 2020年2月13日-下午1:59:16
 */
public class LeetCode_67 {
	public static String addBinary(String a, String b) {
        
		int count = 0;
		StringBuilder ans = new StringBuilder();
		for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
			int sum = count;
			sum += i >= 0 ? a.charAt(i) - '0' : 0;
			sum += j >= 0 ? b.charAt(j) - '0' : 0;
			ans = ans.insert(0, sum%2);
			count = sum/2;
		}
		
		if(count != 0)
			ans.insert(0, 1);
		return ans.toString();
		
    }
	
	public static void main(String[] args) {
		System.out.println(addBinary("1110110101", "1110111011"));
	}
}
