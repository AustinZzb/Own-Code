package 分治_双指针;

/**
 * (填坑法快排)  真·代码
 */
 
import java.util.Arrays;
import java.util.Scanner;

public class QuickSort_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		QuickSort_0(0,arr.length-1,arr);
		
		System.out.println(Arrays.toString(arr));

	}
	
	public static void QuickSort_0(int StartIntdex, int EndIndex, int[] arr) {
		
		if (StartIntdex >= EndIndex) {
			return ;
		}
		
		int Index = QuickSort_1(StartIntdex,EndIndex,arr);
		
		QuickSort_1(StartIntdex,Index-1,arr);
		QuickSort_1(Index+1, EndIndex, arr);
		
	}
	
	public static int QuickSort_1(int StartIntdex, int EndIndex, int[] arr) {
		
		int Index = StartIntdex;
		int arrIndex = arr[Index];
		int i = StartIntdex;
		int j = EndIndex;
		
		while (i <= j) {
			
			while (i <= j) {
				
				if (arr[j] < arrIndex) {
					
					arr[i] = arr[j];
					Index = j;
					i++;
					break;
					
				}
				
				j--;
				
			}
			
			while (i <= j) {
				
				if (arr[i] > arrIndex) {
					
					arr[j] = arr[i];
					Index = i;
					j--;
					break;
					
				}
				
				i++;
				
			}
			
		}
		
		arr[Index] = arrIndex;
		return Index;
		
	}

}









