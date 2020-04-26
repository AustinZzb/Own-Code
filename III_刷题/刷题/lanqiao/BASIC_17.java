package lanqiao;

import java.util.Arrays;
import java.util.Scanner;

public class BASIC_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[][] arr_1 = new int[n][n];
		int[][] arr_2 = new int[n][n];
		int[][] arr_3 = new int[n][n];
		
		for (int i = 0; i < arr_3.length; i++) {
			for (int j = 0; j < arr_3.length; j++) {
				arr_1[i][j] = scan.nextInt();
				arr_3[i][j] = arr_1[i][j];
			}
		}
		
		if (m == 0) {
			for (int i = 0; i < arr_3.length; i++) {
				for (int j = 0; j < arr_3.length; j++) {
					
					if(j == 0 && i ==0)
						System.out.print(1);
					else if (j ==0 && i!=0) 
						System.out.print(0);
					else if (i == j)
						System.out.print(" "+1);
					else {
						System.out.print(" "+0);
					}
					
				}
				
				System.out.println();
			}
		}else {
			
			for (int i1 = 0; i1 < m-1; i1++) {
				
				for (int i = 0; i < arr_3.length; i++) {
					for (int j = 0; j < arr_3.length; j++) {
						
						int sum = 0;
						for (int k = 0; k < arr_3.length; k++) {
							sum += arr_3[i][k] * arr_1[k][j];
						}
						
						arr_2[i][j] = sum;
						
					}
				}
				
				for (int i = 0; i < arr_3.length; i++) {
					arr_3[i] = Arrays.copyOf(arr_2[i],arr_2[i].length);
				}
				
			}
			
			for (int i = 0; i < arr_3.length; i++) {
				for (int j = 0; j < arr_3.length; j++) {
					
					if(j == 0)
						System.out.print(arr_3[i][j]);
					else {
						System.out.print(" "+arr_3[i][j]);
					}
					
				}
				
				System.out.println();
			}
			
		}

	}

}
