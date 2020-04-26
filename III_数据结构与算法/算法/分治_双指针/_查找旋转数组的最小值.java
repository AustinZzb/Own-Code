package 分治_双指针;

import java.util.Scanner;

public class _查找旋转数组的最小值 {
	
	public static int fun(int[] a, int low, int hight) {
		
		while(low < hight) {
			
			int middle = (low + hight)/2;
			if(a[middle] > a[hight]) {
				low = middle + 1;
			}else{
				hight = middle;
			}
			
		}
		
		return a[low];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sacn = new Scanner(System.in);
		int n = sacn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sacn.nextInt();
		}
		
		System.out.println(fun(a, 0, a.length-1));
	}

}
