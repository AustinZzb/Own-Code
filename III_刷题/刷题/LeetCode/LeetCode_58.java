package LeetCode;
/**
 * ����һ���ɿո����ĸ��ɵ��ַ�����������һ�����ʵĳ���
 * 
 * @author ���°�
 *
 * 2020��2��13��-����10:25:57
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
