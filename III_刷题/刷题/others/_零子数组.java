package others;

import java.util.Scanner;

/**
 * ����һ�����飬����������к���ӽ�0��������(�ο�    _�������������)
 * 
 * @author ���°�
 *
 * 2020��2��2��-����2:59:11
 */

public class _�������� {
	
	// 
	public static int fun(int[] a) {
		
		int[] sum = new int[a.length];  // �洢a��ǰn���
		
		for (int i = 0; i < sum.length; i++) {
			if(i == 0) 
				sum[i] = a[i];
			else 
				sum[i] += a[i];
		}
		
		QuickSort_0(0, sum.length-1, sum);
		
		int min_1 = Math.abs(sum[0]), min_2 = Math.abs(sum[1] - sum[0]);                  // ǰn����е���Сֵ      ��        i....j�͵���Сֵ
		for (int i = 1; i < sum.length; i++) {              // ���sum�о���ֵ��С��Ԫ�أ���sum������Ԫ�ز����ֵ��С��ֵ
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
