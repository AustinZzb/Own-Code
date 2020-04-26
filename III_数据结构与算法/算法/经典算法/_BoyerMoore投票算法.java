package �����㷨;

import java.util.Arrays;

/**
 * 给定�?个大小为 n 的数组，找到其中的多数元素�?�多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素�?
 * 你可以假设数组是非空的，并且给定的数组�?�是存在多数元素�?
 * 
 * @author 张致�?
 *
 * 2020�?2�?16�?-下午7:00:36
 */
public class _BoyerMooreͶƱ�㷨 {
	/*
	 * 算法思想�?
	 * 遇到众数则投�?+1；反�?-1；如果sum = 0说明目前�?投的目标并不是正确结�?
	 * 然后将投票目标转到下�?�?
	 * 时间复杂度O（n�?
	 */
	public int majorityElement(int[] nums) {
		int count = 0, sum = 0; // 目前投票的�?��?�人     以及目前票数的�?�和
		 
	    for (int i = 0; i < nums.length; i++) {
			if(nums[count] == nums[i]) sum ++;
			else sum --;
			if(sum == 0) count = i + 1;
		}
	    
	    return nums[count];
	}
}
