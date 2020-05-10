package LeetCode;

import java.util.ArrayList;
/**
 * 给定一个正整数由数组表示，输出+1后的结果，同样用数组表示
 * 
 * @author 张致邦
 *
 * 2020年2月13日-上午10:46:52
 */
public class LeetCode_66 {
	
	// 大佬操作
	public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
			digits[i] = ++digits[i] % 10;
			if(digits[i] != 0) return digits;
		}
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
	
	
	// 傻逼操作
	public int[] plusOne_1(int[] digits) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0, m = 0;
        m = digits[digits.length - 1] + 1;
		if(m < 10) {
			digits[digits.length - 1] = m;
			return digits;
		}
		count = m / 10;
		list.add(0, m % 10);
        for (int i = digits.length - 2; i >= 0 ; i--) {
			digits[i] += count;
			if(digits[i] < 10) {
				count = 0;
			}
			count = digits[i] / 10;
			list.add(0, digits[i] % 10);
		}
        if(count != 0) 
        	list.add(0, count);
        
        int[] ans = new int[list.size()];
        for (int i = 0; i < digits.length; i++) {
			ans[i] = list.get(i);
		}
        return ans;
    }
	
}
