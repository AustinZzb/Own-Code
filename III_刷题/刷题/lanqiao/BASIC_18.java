package lanqiao;

import java.util.Scanner;

public class BASIC_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double[][] arr = new double[4][2];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				arr[i][j] = scan.nextDouble();
				
			}
			
		}
		
		if (arr[0][0] < arr[1][0] && arr[0][1] > arr[1][1]) {
			double t = 0;
			t = arr[1][0];
			arr[1][0] = arr[0][0];
			arr[0][0] = t;
		}else if (arr[1][0] < arr[0][0] && arr[1][1] > arr[0][1]) {
			double t = 0;
			t = arr[1][0];
			arr[1][0] = arr[0][0];
			arr[0][0] = t;
		}
		
		if (arr[2][0] < arr[3][0] && arr[2][1] > arr[3][1]) {
			double t = 0;
			t = arr[3][0];
			arr[3][0] = arr[2][0];
			arr[2][0] = t;
		}else if (arr[3][0] < arr[2][0] && arr[3][1] > arr[2][1]) {
			double t = 0;
			t = arr[3][0];
			arr[3][0] = arr[2][0];
			arr[2][0] = t;
		}
		
		int max_0 = 0,max_1 = 0,min_0 = 0,min_1 = 0;
		
		if(arr[0][0] > arr[1][0]) {
			max_0 = 0;
			min_0 = 1;
		}else {
			max_0 = 1;
			min_0 = 0;
		}
		
		if(arr[0][0] > arr[1][0]) {
			max_1 = 2;
			min_1 = 3;
		}else {
			max_1 = 3;
			min_1 = 2;
		}
		
		if (arr[max_0][1]>arr[min_1][1] && arr[min_1][1]>arr[min_0][1] && arr[max_0][1] < arr[max_1][1] && arr[max_0][0] > arr[min_1][0]) {
			
			double h = Math.abs(arr[max_0][1] - arr[min_1][1]);
			double x = Math.abs(arr[min_1][0] - arr[max_0][0]);
			double s = h*x;
			System.out.printf("%.2f",s);
			
		}else if (arr[max_1][1]>arr[min_0][1] && arr[min_0][1]>arr[min_1][1] && arr[max_1][1] < arr[max_0][1] && arr[max_1][0] > arr[min_0][0]) {
			
			double h = Math.abs(arr[max_1][1] - arr[min_0][1]);
			double x = Math.abs(arr[min_0][0] - arr[max_1][0]);
			double s = h*x;
			System.out.printf("%.2f",s);
			
		}else if (arr[max_1][1]<=arr[max_0][1] && arr[min_1][1]>=arr[min_0][1]) {
			
			double h = Math.abs(arr[max_1][1] - arr[min_1][1]);
			double x = Math.abs(arr[min_1][0] - arr[max_1][0]);
			double s = h*x;
			System.out.printf("%.2f",s);
			
		}else if (arr[max_0][1]<=arr[max_1][1] && arr[min_0][1]>=arr[min_1][1]) {
			
			double h = Math.abs(arr[max_0][1] - arr[min_0][1]);
			double x = Math.abs(arr[min_0][0] - arr[max_0][0]);
			double s = h*x;
			System.out.printf("%.2f",s);
			
		}else {
			
			System.out.printf("0.00");
			
		}
		
		
//		if (arr[max_0][1] >= arr[max_1][1]) {
//			
//			if (arr[min_0][1] <= arr[min_1][1]) {
//				double h = Math.abs(arr[max_1][1] - arr[min_1][1]);
//				double x = Math.abs(arr[min_1][0] - arr[max_1][0]);
//				double s = h*x;
//				System.out.printf("%.2f",s);
//			}else if (arr[min_0][1] >= arr[max_1][1]) {
//				System.out.printf("0.00");
//			}else {
//				double h = Math.abs(arr[max_1][1] - arr[min_0][1]);
//				double x = Math.abs(arr[min_0][0] - arr[max_1][0]);
//				double s = h*x;
//				System.out.printf("%.2f",s);
//			}
//				
//		}else if(arr[max_0][1] <= arr[max_1][1]){
//			
//			if (arr[min_0][1] >= arr[min_1][1]) {
//				double h = Math.abs(arr[max_0][1] - arr[min_0][1]);
//				double x = Math.abs(arr[min_0][0] - arr[max_0][0]);
//				double s = h*x;
//				System.out.printf("%.2f",s);
//			}else if (arr[max_0][1] <= arr[min_1][1]) {
//				System.out.printf("0.00");
//			}else {
//				double h = Math.abs(arr[max_0][1] - arr[min_1][1]);
//				double x = Math.abs(arr[min_1][0] - arr[max_0][0]);
//				double s = h*x;
//				System.out.printf("%.2f",s);
//			}
//							
//		}else {
//			System.out.printf("0.00");
//		}

	}

}
