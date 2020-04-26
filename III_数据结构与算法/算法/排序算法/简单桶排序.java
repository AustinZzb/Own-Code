package 排序算法;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * a仅仅是简单的桶排序实例    真·代码
 * @author 11586
 *
 */


public class 简单桶排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("对100以内的数进行排序");
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] arr_1 = new int[n];
		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = scan.nextInt();
		}
		
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
		
		for (int i = 0; i < arr_1.length; i++) {
			
			arr[arr_1[i]]++;
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				System.out.print(i+" ");
			}
		}

	}

}
