package LeetCode;
/**
 * 给定一个由空格和字母组成的字符串，求出最后一个单词的长度
 * 
 * @author 张致邦
 *
 * 2020年2月13日-上午10:25:57
 */
public class LeetCode_58 {

	public int lengthOfLastWord(String s) {
		if(s.length() == 0) return 0;
		
		int ans = 0;
		boolean flag = false;
		for (int i = s.length()-1; i >= 0 ; i--) {
			if(s.charAt(i) != ' ') {
				flag = true;
				ans++;
			}
			if(flag && s.charAt(i) == ' ')
				break;
		}
		
		return ans;
		
    }
	
}
