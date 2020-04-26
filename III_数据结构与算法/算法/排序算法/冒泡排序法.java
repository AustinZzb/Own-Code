package ÅÅĞòËã·¨;

/**
 * aÕæ¡¤´úÂë
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ã°ÅİÅÅĞò·¨ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i; j++) {
				if (arr[j]>arr[j+1]) {
					arr[j] ^= arr[j+1];
					arr[j+1] ^= arr[j];
					arr[j] ^= arr[j+1];
				}
			}
		}
		
		System.out.print(Arrays.toString(arr));

	}

}
