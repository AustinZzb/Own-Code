package LeetCode;
/**
 * 实现 int sqrt(int x) 函数。
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * 
 * @author 张致邦
 *
 * 2020年2月13日-下午4:59:06
 */
public class LeetCode_68 {
	
	// 利用pow（）内置函数
	private static int mySqrt(int x) {
		if(x < 2) return x;
		
		int left = (int) Math.pow(Math.E, 0.5 * Math.log(x));
		int right = left + 1;
		return (long)(right * right) > x ? left : right; 
	}
	
	
	// 效率低
	public static int mySqrt_1(int x) {
		if(x == 0) return 0;
		long ans = 1;
        for (long i = 1; i <= x/2; i++) {
        	ans = i;
			if(i * i > x) return (int)i - 1;
			if(i * i == x ) return (int)i;
		}
        return (int)ans;
    }
	
	public static void main(String[] args) {
		System.out.println(mySqrt(2147483647));
	}
	
}
