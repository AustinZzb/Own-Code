package ≈≈–ÚÀ„∑®;

import java.util.Arrays;
import java.util.Scanner;

public class ≤Â»Î≈≈–Ú {
	
	private static void sort_0(int[] a) {
		
		for (int i = 1; i < a.length; i++) {
			int key = a[i], j = i;
			while(j > 0 && key < a[j-1]) {
				a[j] = a[j-1];
				j--;
			}
			if(j != i) a[j] = key;			
		}
		
	}
	
	private static void sort(int[] a) {
		
		for (int i = 1; i < a.length; i++) {
			int key = a[i], count = i;
			for (int j = i; j > 0; j--) {
				if(key < a[j-1]) {
					a[j] = a[j-1];
					count -- ;
				}
			}
			a[count] = key;			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
