package 哈希表;

import java.util.HashMap;
/**
 * 给定�?个大小为 n 的数组，找到其中的多数元素�?�多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素�?
 * 你可以假设数组是非空的，并且给定的数组�?�是存在多数元素�?
 * 
 * @author 张致�?
 *
 * 2020�?2�?16�?-下午7:00:36
 */
public class 寻找数组中的多数元素 {
	public int majorityElement(int[] nums) {
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    int len = nums.length / 2;
	    for(int num: nums) {
	    	int n = map.getOrDefault(num, 0) + 1;  // 如果map中存在key，那么就用key对应的value，反之用默认0
	    	if(n > len) return num; 	
	    	map.put(num, n);
	    }
	    return -1;
    }
}
