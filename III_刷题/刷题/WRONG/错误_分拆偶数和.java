package WRONG;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * ��һ��ż�����������ͬ�����ĺͣ��м��ֲ��أ�
 * �������һЩ����ż������ֵ���ᳬ��10000���������ᳬ��500������0���������
 * 
 * ����ԭ��   ��ʱ������
 * 
 * @author ���°�
 *
 * 2020��2��3��-����5:01:21
 */
public class ����_�ֲ�ż���� {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 2; i < 10000; i++) {
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				list.add(i);
			}
		}
		
		while(true) {
			int n = scan.nextInt();
			if(n == 0) break;
			int sum = 0;
			for (int i = 2; i < n/2; i++) {
				if(list.contains(n - i) && list.contains(i)) {
					sum ++;
				}
			}
			System.out.println(sum);
		}

	}

}
