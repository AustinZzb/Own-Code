package lanqiao;

import java.util.Scanner;
/**
 * ����һ�����飬��������龭�����ٲ��任����������Ԫ����ͬ
 * �任��ָ������һ�������䣬��������һ
 * @author ���°�
 *
 * 2020��2��2��-����9:09:48
 */

public class _��ͬ��ԣ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] n_1 = new int[n];
		for(int i=0;i<n;i++) {
			n_1[i] = scan.nextInt();
		}
		
		int j = 0;
		while(true) {
			int max = n_1[0];
			for(int i=1;i<n;i++) {
				if(n_1[i]>max)
					max = n_1[i];
			}
			
			for(int i=0,j_1=0;i<n;i++) {
				if(n_1[i]==max&&j_1==0) {
					j_1++;
					continue;
				}
				n_1[i]++;
			}
			
			j++;
			
			int i_1;
			for(i_1=1;i_1<n;i_1++) {
				if(n_1[i_1]!=n_1[0])
					break;
			}
			
			if(i_1==n)
				break;
			
		}
		
		System.out.println(j);

	}

}
