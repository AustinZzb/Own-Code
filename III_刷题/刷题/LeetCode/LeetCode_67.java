package LeetCode;

import java.util.Arrays;
/**
 * ���������������ַ������������ǵĺͣ��ö����Ʊ�ʾ����
 * ����Ϊ�ǿ��ַ�����ֻ�������� 1 �� 0��
 * 
 * @author ���°�
 *
 * 2020��2��13��-����1:59:16
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
