package 排序算法;

/**
 * A 真·代码
 */

import java.util.Arrays;
import java.util.Scanner;

public class 选择排序法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			int count = i;
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[count]>arr[j]) {
					count = j;
				}
				
			}
			
			temp = arr[i];
			arr[i] = arr[count];
			arr[count] = temp;
		}
		
		System.out.print(Arrays.toString(arr));

	}

}
