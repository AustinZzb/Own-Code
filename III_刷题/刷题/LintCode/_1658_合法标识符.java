package LintCode;

import java.util.Scanner;
/**
 * ���ж��ַ��� str �ǲ���һ���Ϸ��ı�ʶ����
 * �Ϸ��ı�ʶ������ĸ��A-Z��a-z�������֣�0-9�����»�����ɣ��������ַ�����Ϊ���֡�
 * ����
 * ���� 1��
 * ���룺str= "LintCode"
 * �����true
 * ���ͣ�
 * ��Ϊ "LintCode" ����ĸ��ɡ�
 * ���� 2��
 * ���룺str = "123_abc"
 * �����false
 * ���ͣ�
 * ��Ȼ "123_abc" ����ĸ�����ֺ��»�����ɣ������������ַ�Ϊ���֡�
 * 
 * @author ���°�
 *
 * 2020��2��11��-����8:56:33
 */
public class _1658_�Ϸ���ʶ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		boolean flag_1 = true;
		if(string.equals("")) {
			flag_1 = false;
			System.out.println(false);
		}
		
		if(string.charAt(0) >= '0' && string.charAt(0) <= '9') {
			flag_1 = false;
			System.out.println(false);
		}
			
		
		for (int i = 0; i < string.length(); i++) {
			if(!flag(string.charAt(i))) {
				flag_1 = false;
				System.out.println(false);
			}
				
		}
		
		if (flag_1) {
			System.out.println(true);
		}

	}
	
	private static boolean flag(char c) {
		
		if((c>='a' && c<='z') || (c>='A' && c<='Z') || c == '_' || (c>='1' && c<='9'))
			return true;
		
		return false;
	}

}
