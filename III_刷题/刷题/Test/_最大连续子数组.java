package Test;
/**
 * 给定一个数组，求出这个数组中最大的子串(注意全是负数的情况)
 * 
 * @author 张致邦
 *
 * 2020年2月7日-下午3:43:07
 */
public class _最大连续子数组 {
	
	//二分法
	private static int fun_1(int[] a, int from, int end) {
		
		if(from == end) return a[from];      // 左右指针会合，递归结束
		
		int middle = (from + end) / 2;		 // 求出中间的下标
		int m_1 = fun_1(a, from, middle); 	 // 对左边的数组求最大值
		int m_2 = fun_1(a, middle+1, end);   // 对右边的数组求最大值
		
		// 对中间的数组求最大值
		int left = a[middle], now = 0;
		for (int i = middle; i >= from; i--) {
			now += a[i];
			left = Math.max(now, left);
		}
		
		int right = a[middle+1], now_1 = 0;
		for (int i = middle+1; i < end; i++) {
			now_1 += a[i];
			right = Math.max(now, right);
		}
		
		return Math.max(left+right, Math.max(m_1, m_2));		
		
	}
	
	
	// 动态规划法
	private static void fun(int[] a) {
		
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
			System.out.println(max_1);
			return;
		}
		
		System.out.println(max);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {-9,-21,1,-58,58,2};
		fun(a);
		System.out.println(fun_1(a, 0, a.length-1));
	}

}
