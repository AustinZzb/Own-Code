package Test;

import java.util.Scanner;

/**
 * ������һ��С�������������������ȡ1 || 3 || 7 || 8��С��ȡ�����һ��С�������
 * ����ȡ�����Ƿ���Ի�ʤ
 * 
 * @author ���°�
 *
 * 2020��2��8��-����10:28:19
 */
public class _ȡ���� {
	
	private static void fun(int n) {
		int[] arr = new int[10000];
		arr[1] = 0;
		arr[2] = 1;
		arr[3] = 0;
		arr[4] = 1;
		arr[5] = 0;
		arr[6] = 1;
		arr[7] = 0;
		arr[8] = 0;
		arr[9] = 1;
		
		for (int i = 9; i < n+1; i++) {
			if(arr[i-1] == 0) arr[i]= 1;
			else if(arr[i-3] == 0) arr[i] = 1;
			else if(arr[i-7] == 0) arr[i] = 1;
			else if(arr[i-8] == 0) arr[i] = 1;
		}
		
		if(arr[n] == 0) System.out.println("�����ˣ�");
		else System.out.println("YOU ARE WIN !");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ĸ��� �� ");
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			fun(scan.nextInt());			
		}
	}

}
