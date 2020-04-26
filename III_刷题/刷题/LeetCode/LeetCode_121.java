package LeetCode;
/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * 注意你不能在买入股票前卖出股票。
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 * 
 * @author 张致邦
 *
 * 2020年2月16日-上午9:37:45
 */
public class LeetCode_121 {
	//暴力法
	public int maxProfit_1(int[] prices) {
		
		int max = 0;
		for(int i = prices.length - 1; i >= 0; i--){
			for(int j = i - 1; j >= 0; j--){
				if(prices[i] - prices[j] > max)
					max = prices[i] - prices[j];
			}
		}
		
		return max;
		        
	}

	// 动态规划
	public int maxProfit(int[] prices) {
		
		int max = 0, min = prices[0];
		for(int i = 1; i < prices.length; i++){
			max = Math.max(prices[i] - min, max);
			min = Math.min(prices[i], min);
		}
		return max;      
	}
}
