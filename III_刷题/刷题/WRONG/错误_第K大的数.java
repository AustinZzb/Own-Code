package WRONG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * һ������ΪN���������У����0 - N - 1������Q�β�ѯ����ѯ���i��j���������У���K������Ƕ��١�
 * ����: 1 7 6 3 1��i = 1, j = 3��k = 2����Ӧ����Ϊ7 6 3����2�����Ϊ6��
 * 
 * ��1�У�1����N����ʾ���еĳ��ȡ�(2 <= N <= 50000) ��2 - N + 1�У�ÿ��1��������Ӧ�����е�Ԫ�ء�(0 <= Si <= 10^9) 
 * ��N + 2�У�1����Q����ʾ��ѯ��������(2 <= Q <= 50000) 
 * ��N + 3 - N + Q + 2�У�ÿ��3��������Ӧ��ѯ����ʼ���i�ͽ������j���Լ�k��(0 <= i <= j <= N - 1,1 <= k <= j - i + 1)
 * 
 * ����ԭ�� ��  δ֪���󣡣�����������
 * 
 * @author ���°�
 *
 * 2020��2��3��-����4:59:46
 */
public class ����_��K����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		int m = scan.nextInt();
		int[][] b = new int[m][3];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = scan.nextInt();
			}
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < b.length; i++) {
			int start = b[i][0], end = b[i][1], K = b[i][2];
			for (int j = start; j <= end; j++) {
				list.add(a[j]);
			}
			Collections.sort(list);
			System.out.println(list.get(list.size() - K));
			list.removeAll(list);
		}
		
	}

}
