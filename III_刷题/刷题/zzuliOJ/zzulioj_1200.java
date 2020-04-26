package zzuliOJ;

import java.util.Scanner;

public class zzulioj_1200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] n_1 = new int[n];
		int[] m_1 = new int[m];
		for (int i = 0; i < n_1.length; i++) {
			n_1[i] = scan.nextInt();
		}
		for (int i = 0; i < m_1.length; i++) {
			m_1[i] = scan.nextInt();
		}
		
		int min = Math.abs(n_1[0]-m_1[0]);
		for (int i = 0; i < n_1.length; i++) {
			for (int j = 0; j < m_1.length; j++) {
				int t = Math.abs(n_1[i]-m_1[j]);
				if(t<min)
					min = t;
			}
		}
		System.out.print(min);

	}

}
