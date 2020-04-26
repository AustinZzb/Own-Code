package LeetCode;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 
 * @author 张致邦
 *
 * 2020年2月12日-上午9:51:31
 */
public class LeetCode_14 {
	// 官方题解：水平扫描法   LCP
	public String longestCommonPrefix(String[] strs) {
        
		String string = strs[0];
		
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(string) != 0) {
				string = string.substring(0,string.length() - 1);
				if(string.equals("")) return "";
			}
		}
		
		return string;
		
    }

	
	// 普通暴力法
	public String longestCommonPrefix_1(String[] strs) {
        
		String string = "";
		boolean flag = true;
		
		for (int i = 0; i < strs[0].length(); i++) {
		
			char c = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if(i >= strs[j].length() || strs[j].charAt(i) != c) {
					flag = false;
					break;
				}
			}
			if(!flag) break;
			string += c;
			
		}
		
		return string;
		
    }
	
}
