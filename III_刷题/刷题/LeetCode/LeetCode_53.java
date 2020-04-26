package LeetCode;
/**
 * ��������������ֵ
 * 
 * @author ���°�
 *
 * 2020��2��13��-����10:18:48
 */
public class LeetCode_53 {
	
	public int maxSubArray(int[] nums) {
        return fun_2(nums);
    }
	
	
	// ��̬�滮
	private static int fun_2(int[] nums) {
		int ans = nums[0], sum = nums[0], max = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			if(nums[i] > max)
				max = nums[i];
            
			if(sum < 0)
				sum = nums[i];
			else 
                sum += nums[i];
			ans = ans > sum ? ans : sum;
		}
		if(max > ans)
			return max;
		return ans;
	}
	
	
	
	//���η�
	private static int fun_1(int[] nums, int from, int to) {
		// TODO Auto-generated method stub
		if(from == to) return nums[from];
		
		int middle = (from + to) / 2;
		int m_1 = fun_1(nums, from, middle);
		int m_2 = fun_1(nums, middle+1, to);
		
		int left = nums[middle], now = nums[middle];
		for (int i = middle-1; i >= 0 ; i--) {
			now += nums[i];
			left = Math.max(left, now);
		}
		
		int right = nums[middle+1];
		now = nums[middle+1];
		for (int i = middle+2; i < nums.length ; i++) {
			now += nums[i];
			right = Math.max(right, now);
		}
		
		return Math.max(m_1, Math.max(m_2, left+right));
	}
	
}
