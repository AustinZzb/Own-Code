package dfs;

import java.util.Arrays;

/**
 *    * * *			 0  1  2       
 *   * * * *		3  4  5    6
 *  * * * * *	   7  8  9   10   11  
 *   * * * *		12  13  14  15
 *    * * *			  16  17  18
 * A一共19个数，要求每条直线上的数字相加的和都相同（一共有15条直线） 
 * A开头的两个数字已经填写过了
 * 
 * @author 张致邦
 *
 * 2020年1月31日-上午11:33:03
 * 
 * A dfs+剪枝
 */

public class _六角幻方_剪枝 {
	
	private static int[] a = new int[19];
	
	static boolean dfs_0() {
		int[] b = new int[15];
		b[0] = a[0]+a[1]+a[2];
		b[1] = a[3]+a[4]+a[5]+a[6];
		b[2] = a[7]+a[8]+a[9]+a[10]+a[11];
		b[3] = a[12]+a[13]+a[14]+a[15];
		b[4] = a[16]+a[17]+a[18];
		b[5] = a[0]+a[3]+a[7];
		b[6] = a[1]+a[4]+a[8]+a[12];
		b[7] = a[2]+a[5]+a[9]+a[13]+a[16];
		b[8] = a[6]+a[10]+a[14]+a[17];
		b[9] = a[11]+a[15]+a[18];
		b[10] = a[2]+a[6]+a[11];
		b[11] = a[1]+a[5]+a[10]+a[15];
		b[12] = a[0]+a[4]+a[9]+a[14]+a[18];
		b[13] = a[3]+a[8]+a[13]+a[17];
		b[14] = a[7]+a[12]+a[16];
		
		for (int i = 1; i < b.length; i++) {
			if(b[i] != b[0]) return false;
		}
		
		return true;
	}
	
	static boolean dfs_1(int n) {
		for (int i = 0; i < a.length; i++) {
			if (n == a[i]) {
				return true;
			}
		}
		return false;
	}
	
	static void dfs(int n) {
		
		if(n == a.length) {
			
			if (dfs_0()) {
				for (int i = 7; i < 12; i++) {
					System.out.print(a[i]+" ");
				}
			}
			System.out.println();
			System.out.println(Arrays.toString(a));
			return ;
		}
		
		if(n == 7) {
			if (38 != a[3]+a[4]+a[5]+a[6]) return;
		}
		if(n == 9) {
			if (38 != a[0]+a[3]+a[7]) return;
		}
		if(n == 12) {
			if (38 != a[7]+a[8]+a[9]+a[10]+a[11] || 38 != a[2]+a[6]+a[11]) return;
		}
		if(n == 14) {
			if (38 != a[1]+a[4]+a[8]+a[12]) return;
		}
		if (n == 16) {
			if (38 != a[12]+a[13]+a[14]+a[15] || 38 != a[1]+a[5]+a[10]+a[15]) return;
		}
		if (n == 17) {
			if(38 != a[7]+a[12]+a[16]) return;
		}
		if(n == 18) {
			if (38 != a[6]+a[10]+a[14]+a[17] || 38 != a[3]+a[8]+a[13]+a[17]) return;
		}
		
		for (int i = 1; i <= a.length; i++) {
			if(dfs_1(i))
				continue;
			a[n] = i;
			dfs(n+1);
			a[n] = 0;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a[0] = 15;
		a[1] = 13;
		a[2] = 10;
		dfs(3);

	}

}















