package 分治_双指针;

// 填坑法实现快排(参考代码)

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort_1 {

	private static void QuickSort(int[] arr, int startIndex, int endIndex) {
		// TODO Auto-generated method stub
		if(startIndex >= endIndex) {
			return ;
		}
		
		int pivotIndex = QuickSort_1(arr, startIndex, endIndex);
		
		QuickSort(arr, startIndex, pivotIndex-1);
		QuickSort(arr, pivotIndex+1, endIndex);
		
	}

	private static int QuickSort_1(int[] arr, int startIndex, int endIndex) {
		// TODO Auto-generated method stub
		int Index = startIndex;
		int pivo = arr[startIndex];
		
		while(endIndex >= startIndex) {
			
			while(endIndex >= startIndex) {
				
				if(arr[endIndex] < pivo) {
					arr[Index] = arr[endIndex];
					Index = endIndex;
					startIndex++;
					break;
				}
				
				endIndex--;
				
			}
			
			while(endIndex >= startIndex) {
				
				if(arr[startIndex] > pivo) {
					
					arr[Index] = arr[startIndex];
					Index = startIndex;
					endIndex--;
					break;
				}
				
				startIndex++;
				
			}
			
		}
		
		arr[Index] = pivo;
		
		return Index;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] a = null;
		if(scan.hasNext()) {
			String[] s = scan.nextLine().split(" ");
			a = new int[s.length];
			for (int i = 0; i < s.length; i++) {
				a[i] = Integer.parseInt(s[i]);
			}
		}
		
		QuickSort(a, 0, a.length-1);
		
		System.out.print(Arrays.toString(a));

	}

}




















