/*	LeetCode
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 * 示例 1:
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 * 偷窃到的最高金额 = 1 + 3 = 4 。
 */
package 分析法_动态规划;

/**
 * @author 张致邦
 *
 * 2020年3月19日-上午11:54:08
 */
public class 动态规划_打家劫舍I {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * 核心思想：
	 * Math.max(dp[i-1], dp[i-2]+nums[i])
	 */
	private static int fun(int[] nums){

		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
			
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		dp[1] = Math.max(dp[0], nums[1]);
		
		for (int i = 2; i < nums.length; i++){
			dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
		}
		
		return dp[dp.length - 1];
	    	
	}

}
