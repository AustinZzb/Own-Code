package 分析法_动态规划;

import java.util.Scanner;

/**
 * 给定一个数组，求出其连续子数组的最大和
 * 
 * @author 张致邦
 *
 * 2020年2月1日-下午7:56:26
 */
public class 动态规划_最大连续子数组 {
	
	//动态规划
	public static int sum_2(int[] a) {
		
		int sum = 0, max = 0, max_1 = a[0];   // max 为结果, max_1 主要考虑数组中全为负数的情况下，求它的最大值
		boolean flag = true;				  // flag 判断数组是否全为负数
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max_1) max_1 = a[i];    // 求数组的最大值
			if(sum <= 0) {					  
				sum = a[i];
			}else {
				flag = false;
				sum += a[i];
			}
			max = sum > max ? sum : max;
		}
		
		if (flag) {
			return max_1;
		}
		
		return max;
			
	}
	
	// 分析法(利用前N和的方式来求解)
	public static int sum_1(int[] a) {
		int[] b = new int[a.length];            // b 数组存放a数组的前N项和
		int max = 0, count = -1, max_1 = a[0];  // max 为最大的qianN项和, max_1 主要考虑数组中全为负数的情况下，求它的最大值
		for (int i = 0; i < b.length; i++) {
			if(a[i] > max_1) max_1 = a[i];      // 求数组的最大值
			if(i == 0) b[i] = a[i];
			else b[i] = b[i-1] + a[i];
			
			if(b[i] >= max) {
				max = b[i];
				count = i;						// 记录前N项和最大值的下标I
			}
			
		}
		
		int min = 0;							// 求在i之前有没有小于0的前N项和，然后利用max - min 求出结果
		for (int i = 0; i < count; i++) {
			if(b[i] < min) min = b[i];
		}
		
		if(count == -1) return max_1;
		
		return max - min;
	}
	
	
	// 分治
	private static int sum_0(int[] a, int from, int to) {
		
		if(from == to)
			return a[from];
		
		int middle = (from + to) / 2;
		int m_1 = sum_0(a, from, middle);
		int m_2 = sum_0(a, middle+1, to);
		
		int left = a[middle], now = a[middle];
		for (int i = middle-1; i >= from; i--) {
			now += a[i];
			left = Math.max(now, left);
		}
		
		int right = a[middle+1];
		now = a[middle+1];
		for (int i = middle+2; i <= to; i++) {
			now += a[i];
			right = Math.max(now, right);
		}
		
		int m_3 = left + right;
		return Math.max(m_1, Math.max(m_2, m_3));
		
	}
	
	
	// 经典暴力法（有错误，情况没有考虑完全）
//	private static void sum(int[] a) {
//		
//		int max = 0, sum = 0;
//		String string = "",string2 = "";
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i; j < a.length; j++) {
//				sum = 0;
//				string = "";
//				for (int j2 = i; j2 <= j; j2++) {
//					sum += a[j2];
//					string += a[j2]+" ";
//				}
//				if(sum > max) {
//					max = sum;
//					string2 = string;
//				}
//			}
//		}
//		
//		System.out.println(max);
//		System.out.println(string2);
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
//		sum(a);
		System.out.println(sum_0(a, 0, a.length-1));
		System.out.println(sum_1(a));
		System.out.println(sum_2(a));
	}

}
