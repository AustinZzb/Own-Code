package LeetCode;
/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 
 * @author 张致邦
 *
 * 2020年1月31日-下午8:23:32
 */
public class LeetCode_9 {

 public boolean isPalindrome(int x) {
        
        String arr = x + "";
				boolean flag = true;
				for (int j = arr.length()-1, j2 = 0; j >= 0; j--, j2++) {
					if (arr.charAt(j) != arr.charAt(j2)) {
						flag = false;
						break;
					}
				}
				
				return flag;
	
         
    }
	
}
