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
	private static int fun_1(int[] nums, int from, int to) {
		
		if (from == to) return nums[from];

        int middle = (from+to) / 2;
        int sum_1 = fun_1(nums, from, middle);
        int sum_2 = fun_1(nums, middle+1, to);

        int left = nums[middle], now = 0;
        for (int i = middle; i >= 0; i--) {
            now += nums[i];
            left = Math.max(left, now);
        }

        int right = nums[middle+1], now_1 = 0;
        for (int i = middle+1; i <= to; i++) {
            now_1 += nums[i];
            right = Math.max(right, now_1);
        }

        return Math.max(left+right, Math.max(sum_1, sum_2));
		
	}
	
	
	// 动态规划法
	private static void fun(int[] nums) {
		
		int sum = nums[0], ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (sum <= 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            ans = sum > ans ? sum : ans;
        }

        System.out.println(ans);
		
//		int sum = 0, max = 0, max_1 = a[0];   // max 为结果, max_1 主要考虑数组中全为负数的情况下，求它的最大值
//		boolean flag = true;				  // flag 判断数组是否全为负数
//		for (int i = 0; i < a.length; i++) {
//			if(a[i] > max_1) max_1 = a[i];    // 求数组的最大值
//			if(sum <= 0) {
//				sum = a[i];
//			}else {
//				flag = false;
//				sum += a[i];
//			}
//			max = sum > max ? sum : max;
//		}
//		
//		if (flag) {
//			System.out.println(max_1);
//			return;
//		}
//		
//		System.out.println(max);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {-9,-21,1,-58,58,2};
		fun(a);
		System.out.println(fun_1(a, 0, a.length-1));
	}

}
