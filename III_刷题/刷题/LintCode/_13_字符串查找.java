package LintCode;

import java.util.Scanner;
/**
 * ����һ�������� source �ַ�����һ�� target �ַ���
 * ��Ӧ���� source �ַ������ҳ� target �ַ������ֵĵ�һ��λ��(��0��ʼ)����������ڣ��򷵻� -1��
 * @author ���°�
 *
 * 2020��2��28��-����4:39:33
 */
public class _13_�ַ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s_1 = scan.next();
		String s_2 = scan.next();
		
		char[] arr_1 = s_1.toCharArray();
		char[] arr_2 = s_2.toCharArray();
		
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < arr_1.length-arr_2.length+1; i++) {
			flag = true;
			for (int j = 0; j < arr_2.length; j++) {
				if (arr_1[i+j]!=arr_2[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				count = i;
				break;
			}
		}
		
		if (flag) {
			System.out.print(count);
		}else {
			System.out.print(-1);
		}
		
	}

}
