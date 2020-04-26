package 递归;

import java.util.Scanner;

/**
 * (算法有待提高，没有去重)
 * 输入一个整数n表示总金额
 * 接下来输入一个整数m，表示输入账目明细的条数
 * 再接下来输入m行整数，表示每笔账目的金额
 * 输出可能漏掉的金额组合，金额按照从小到达排列
 * 
 * 输入：
 * 6 5 3 2 4 3 1
 * 输出：
 * 1 3 3
 * 1 2 4
 * 3 4
 * 
 * @author 11586
 *
 */


public class 递归_有错金额 {
	public static void f(int n, int[] a, int sum, int k, boolean[] a_1) {
		
		if(sum == n) {
			for (int i = 0; i < a_1.length; i++) {
				if(!a_1[i]) System.out.print(a[i]+" ");
			}
			System.out.println();
		}else if(sum > n){
			return ;
		}
		
		if(k == a.length) return ;
		
		a_1[k] = false;
		f(n, a, sum, k+1, a_1);
		
		a_1[k] = true;
		sum += a[k];
		f(n, a, sum, k+1, a_1);
		
		a_1[k] = false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[m];
		boolean[] arr_1 = new boolean[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		f(n, arr, 0, 0, arr_1);
		
	}

}
