package JAVA�ײ���ʵ��;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * ʵ��Java�Ĵ���������  ��������
 * ���÷���ʵ�ֽ���ʵ��
 * 
 * @author ���°�
 *
 * 2020��2��8��-����9:23:43
 */
public class BigInteger_���� {
	
	private static String mult(String a, String b) {
		
		if(a.length() <= 4 && b.length() <= 4) return Integer.parseInt(a) * Integer.parseInt(b) + "";  // ������������ֱȽ�С���Ϳ���ֱ�Ӽ���
		
		if(a.length() > 4) {  
			int k = a.length() / 2;  // ���÷���˼��
			String a1 = a.substring(0,k);
			String a2 = a.substring(k);
			return add(mult(a1, b)+zero(a2.length()), mult(a2, b));
		}
		
		return mult(b, a);  // ���b>4�������ظ����룬ֱ�ӵݹ� ����     ����
		
	}

	private static String zero(int n) {  // ���ó˷������ʣ���һ�����ֳ�������ȡ��������һ��������ô��Ҫ�ڸ�λ��˵ĵط����0
		// TODO Auto-generated method stub
		if(n == 0) return "";            // �÷���ͬ����������õݹ飡��
		if(n == 1) return "0";
		return zero(n/2) + zero(n/2) + zero(n%2);
	}

	private static String add(String a, String b) {  // ͬ�������÷���˼��
		if(a.length() <= 8 && b.length() <= 8) return Integer.parseInt(a) + Integer.parseInt(b) + "";
		
		String a1 = "0";
		String a2 = a;
		if(a.length() > 8) {
			a1 = a.substring(0,a.length()-8);
			a2 = a.substring(a.length()-8);
		}
		
		String b1 = "0";
		String b2 = b;
		if(b.length() > 8) {
			b1 = b.substring(0,b.length()-8);
			b2 = b.substring(b.length()-8);
		}
		
		String temp = add(a2, b2);
		while(temp.length() < 8) temp = "0" + temp;             // �����λ��Ҫ��ǰ�油0
		if(temp.length() <= 8) return add(a1, b1) + temp;
		else return add(add(a1, b1), "1") + temp.substring(1);  // �ѽ�Ϊ��ɾ��
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input a+b || a*b ��");
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			
			String string = scan.nextLine();
			if(string.contains("+")) {
				String[] aStrings = string.split("\\+");
				System.out.println("BigInteger_����     : " + add(aStrings[0], aStrings[1]));
				System.out.println("BigInteger_JAVA : " + new BigInteger(aStrings[0]).add(new BigInteger(aStrings[1])));
			}else if(string.contains("*")) {
				String[] asStrings = string.split("\\*");
				System.out.println("BigInteger_����     �� " + mult(asStrings[0], asStrings[1]));
				System.out.println("BigInteger_JAVA : " + new BigInteger(asStrings[0]).multiply(new BigInteger(asStrings[1])));				
			}else {
				System.out.println("���벻�Ϸ�");
			}
			
		}
	}

}
