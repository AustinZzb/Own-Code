package lanqiao;

import java.util.Scanner;
/**
 * 杈撳叆涓�涓暟缁勶紝姹傝繖涓暟缁勭粡杩囧灏戞鍙樻崲鍙互璁╂墍鏈夊厓绱犵浉鍚�
 * 鍙樻崲锛氭寚瀹氬叾涓竴涓暟涓嶅彉锛屽叾浣欐暟鍔犱竴
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�2鏃�-涓嬪崍9:09:48
 */

public class _鍏卞悓瀵岃 {

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
