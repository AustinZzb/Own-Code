package zzuliOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class zzulioj_1201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] s = new int[n][2];
		for (int i = 0; i < n; i++) {
			s[i][0] = scan.nextInt();
			s[i][1] = 0;
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			
			int j_0;
			if(i == 0) {
				list.add(s[i][0]);
			}else {
				for (j_0 = 0; j_0 < list.size(); j_0++) {
					if(s[i][0] == list.get(j_0))
						break;
				}
				
				if(j_0 == list.size()) {
					list.add(s[i][0]);
					s[i][1]++;
				}else {
					s[j_0][1]++;
				}
			}
			
		}
		
		int max_0 = 0;
		int t = 0;
		for (int i = 0; i < n; i++) {
			if(s[i][1] > max_0) {
				max_0 = s[i][1];
				t = i;
			}
				
		}
		
		int min = s[t][0];
		for (int i = 0; i < n; i++) {
			if(s[i][1] == max_0 && s[i][0] < min) {
				min = s[i][0];
			}
				
		}
		
		System.out.println(min);
		System.out.println(max_0);

	}

}
