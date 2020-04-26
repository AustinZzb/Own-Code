package lanqiao;

import java.util.Scanner;

/**
 * �����ӵ��ٶ�v1����ʾÿ����������v1�ף����ڹ���ٶ�v2���Լ����Ӷ�Ӧ��t��sֵ���Լ������ĳ���l��������Ԥ��������Ľ����
 * ����дһ�����򣬶��������һ������������v1��v2��t��s��l��Ԥ��ó������Ľ����
 * ���ӷ����Լ�����t�׻����ϣ����Ǿͻ�ͣ������Ϣs�롣���ڲ�ͬ�����ӣ�t��s����ֵ�ǲ�ͬ�ģ�
 * �������е��ڹ�ȴ��һ�¡������ǲ����յ����ֹͣ��
 * @author ���°�
 *10 5 5 2 20
 * 2020��2��15��-����10:54:38
 */
public class BASIC_24 {
	private static void fun(int v1, int v2, int t, int s, int l) {
		int ans = 0, sum = 0;
		
		for (int i = 1; i <= l/v2; i++) {
			ans ++;
			sum += v1;		
			if(sum >= l) break;
			if((sum - v2 * i) >= t) {
				ans += s;
				i += s;
			}
			
		}
		
		if(ans == l/v2 && sum >= l) {
			System.out.println("D");
			System.out.println(ans);
		}else if(ans < l/v2) {
			System.out.println("R");
			System.out.println(ans);
		}else {
			System.out.println("T");
			System.out.println(l/v2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] n = new int[5];
		for (int i = 0; i < n.length; i++) {
			n[i] = scan.nextInt();
		}
		fun(n[0], n[1], n[2], n[3], n[4]);
	}

}
