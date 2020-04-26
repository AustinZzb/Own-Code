package others;

import java.util.Arrays;

/**
 * 给定一个字符串，将其左移N位，要求 时间复杂度O（n），空间复杂度O（1）
 * 
 * @author 张致邦
 *
 * 2020年2月15日-下午3:07:18
 */
public class _字符串左移N位 {
	// 算法思想，"abcdef" --> "bafedc" --> "cdefab"   首先分别反转两个子串，然后反转总串
	private static void rever(char[] s,int from, int to) {
		
		while(from < to) {
			char c = s[from];
			s[from++] = s[to];
			s[to--] = c;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] string = "abcdef".toCharArray();
		int n = 2;
		rever(string, 0, n-1);
		rever(string, n, string.length-1);
		rever(string, 0, string.length-1);
		System.out.println(Arrays.toString(string));
	}

}
