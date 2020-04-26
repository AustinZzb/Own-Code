package others;

import java.util.Scanner;

/**
 * 给定一个数组，求这个数组中和最接近0的子数组(参考    _最大连续子数组)
 * 
 * @author 张致邦
 *
 * 2020年2月2日-下午2:59:11
 */

public class _零子数组 {
	
	// 
	public static int fun(int[] a) {
		
		int[] sum = new int[a.length];  // 存储a的前n项和
		
		for (int i = 0; i < sum.length; i++) {
			if(i == 0) 
				sum[i] = a[i];
			else 
				sum[i] += a[i];
		}
		
		QuickSort_0(0, sum.length-1, sum);
		
		int min_1 = Math.abs(sum[0]), min_2 = Math.abs(sum[1] - sum[0]);                  // 前n项和中的最小值      和        i....j和的最小值
		for (int i = 1; i < sum.length; i++) {              // 求出sum中绝对值最小的元素，和sum中相邻元素差绝对值最小的值
			if(sum[i] < min_1) min_1 = sum[i];
			if(Math.abs(sum[1] - sum[0]) < min_2) min_2 = Math.abs(sum[1] - sum[0]);
		}
		
		return Math.min(min_1, min_2);
		
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
		
		System.out.println(fun(a));

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
