package zzuliOJ;

import java.util.Scanner;

public class zzulioj_1203 {
	static int[][] m;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
			int n = scan.nextInt();
			m = new int[n][n];
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m.length; j++) {
					m[i][j] = 0;
				}
			}
			if(n == 0)
				break;
			dfs(0,n);
		}

	}

	private static void dfs(int i, int n) {
		if(i == 25 && dfs_1()) {
			
			for (int j = 0; j < m.length; j++) {
				for (int j2 = 0; j2 < m.length; j2++) {
					if(n<4) {
						if(i == 0)
							System.out.print(m[j][j2]);
						else 
							System.out.print(" "+m[j][j2]);
					}else if(n>=4 && n<10) {
						if(i == 0)
							System.out.printf("%10d",m[j][j2]);
						else 
							System.out.printf(" %10d",m[j][j2]);
					}else if(n>=10) {
						if(i == 0)
							System.out.printf("%100d",m[j][j2]);
						else 
							System.out.printf(" %100d",m[j][j2]);
					}
						
				}
			}
			
			return ;
			
		}
		
		int t = 0;
		for(int j = 0;j<m.length;j++) {
			for (int j2 = 0; j2 < m.length ; j2++, t++) {
				
				t++;
				if(m[j][j2] == 0 && dfs_0(t)) {
					m[j][j2] = t;
					dfs(++i, n);
					m[j][j2] = 0;
				}
				
			}
		}
		
		
	}
	
	private static boolean dfs_0(int n) {
		int i;
		for (i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if(m[i][j] == n) {
					break;
				}
					
			}
		}
		
		if(i == m.length)
			return true;
		
		return false;
	}

	private static boolean dfs_1() {
		int[] sum = new int[m[0].length*2 + 2];
		
		for (int i = 0; i < sum.length; i++) {
			sum[i] = 0;
		}
		
		for (int j = 0; j < m[0].length; j++) {
			for (int i = 0; i < m[0].length; i++) {
				sum[j] += m[j][i];
			}
		}
		
		for (int j = m[0].length, j_0 = 0; j < m[0].length*2; j++, j_0++) {
			for (int i = 0 ; i < m[0].length; i++) {
				sum[j] += m[i][j_0];
			}
		}
		
		for (int i = 0; i < m[0].length; i++) {
			sum[m[0].length*2] += m[i][i];
		}
	
		for (int i = 0, i_1 = m[0].length-1; i < m[0].length; i++,i_1--) {
			sum[m[0].length*2+1] = m[i][i_1];
		}
		
		int t;
		
		for (t = 1; t < sum.length; t++) {
			if(sum[t] != sum[0])
				break;
		}
		
		if(t == sum.length)
			return true;
		
		return false;
	}
	
	

}
