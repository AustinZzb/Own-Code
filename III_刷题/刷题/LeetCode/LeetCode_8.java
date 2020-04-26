package LeetCode;
/**
 * 请你来实现一个 atoi 函数，使其能将字符串转换成整数。
 * 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。
 * 当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 * 该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响。
 * 注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换。
 * 在任何情况下，若函数不能进行有效的转换时，请返回 0。
 * 说明：
 * 假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−231,  231 − 1]。如果数值超过这个范围，请返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。
 * 
 * @author 张致邦
 *
 * 2020年1月31日-下午8:23:32
 */
import java.util.Scanner;

public class LeetCode_8 {
	
	  public static int myAtoi(String str) {
	        long ans = 0, index = 0, ans_1 = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') continue;
				else if(index == 0){
					if((str.charAt(i) < '0' || str.charAt(i) > '9') && (str.charAt(i) != '-') && (str.charAt(i) != '+')) {
						return (int) ans;
					}else if (str.charAt(i) == '-') {
						ans_1 = -1;
					}else if (str.charAt(i) == '+') {
						ans_1 = 1;
					}else{
						ans = ans * 10 + Integer.parseInt(String.valueOf(str.charAt(i)));
					}
					index++;
				}else { //2234-ddf25
					if(str.charAt(i) < '0' || str.charAt(i) > '9' || (str.charAt(i) == '0' && ans_1 == 1)) {
						break;
					}
					ans = ans * 10 + Integer.parseInt(String.valueOf(str.charAt(i)));
				}
				
			}
			
			if (ans_1 == 0) {
				ans_1 = 1;
			}
			ans *= ans_1;
			
			if (ans > Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}else if(ans < Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}else {
				return (int) ans;
			}
	    }
		
    
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string  = scan.next();
		System.out.println(myAtoi(string));
	}
	
}
