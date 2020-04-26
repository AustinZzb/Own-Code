package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/**
 * ����һ���ַ�������֤���Ƿ��ǻ��Ĵ���ֻ������ĸ�������ַ������Ժ�����ĸ�Ĵ�Сд��
 * ˵���������У����ǽ����ַ�������Ϊ��Ч�Ļ��Ĵ���
 * ʾ�� 1:
 * ����: "A man, a plan, a canal: Panama"
 * ���: true
 * ע�⣺ �������ASCIIֵȡ�Ƚ��Ƿ���ͬ����Ҫע���������"0P"������������Ҳ���32
 * 
 * @author ���°�
 *
 * 2020��2��16��-����10:59:43
 */
public class LeetCode_125 {
	
	
	// ˫ָ��
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
